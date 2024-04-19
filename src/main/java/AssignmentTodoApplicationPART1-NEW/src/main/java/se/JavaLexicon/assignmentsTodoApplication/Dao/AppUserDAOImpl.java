package se.JavaLexicon.assignmentsTodoApplication.Dao;

import se.JavaLexicon.assignmentsTodoApplication.AppUser;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AppUserDAOImpl implements AppUserDAO {

    private Map<String, AppUser> users = new HashMap<> ();

    @Override
    public AppUser persist(AppUser appUser) {
        users.put(appUser.getUsername(), appUser);
        return appUser;
    }

    @Override
    public AppUser findByUsername(String username) {
        return users.get(username);
    }

    @Override
    public Collection<AppUser> findAll() {
        return users.values();
    }

    @Override
    public void remove(String username) {
        users.remove(username);
    }
}
