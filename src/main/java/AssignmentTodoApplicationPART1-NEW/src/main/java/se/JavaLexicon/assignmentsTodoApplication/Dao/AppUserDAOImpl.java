package se.JavaLexicon.assignmentsTodoApplication.Dao;

import se.JavaLexicon.assignmentsTodoApplication.AppUser;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AppUserDAOImpl implements AppUserDAO{

    private final Map<Integer, AppUser> appUsers = new HashMap<> ();

    @Override
    public void persist(AppUser appUser) {
        appUsers.put(appUser.getId(), appUser);

    }
    public AppUser findByUsername(String username) {
        for (AppUser appUser : appUsers.values()) {
            if (appUser.getUsername().equals(username)) {
                return appUser;
            }
        }
        return null;
    }
    public Collection<AppUser> findAll() {
        return appUsers.values();

    }
    public void remove(AppUser appUser) {
        appUsers.remove(appUser.getId());
    }


}
