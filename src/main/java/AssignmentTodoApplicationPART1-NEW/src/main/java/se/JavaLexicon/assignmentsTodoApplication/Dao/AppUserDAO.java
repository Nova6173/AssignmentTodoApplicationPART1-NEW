package se.JavaLexicon.assignmentsTodoApplication.Dao;
import se.JavaLexicon.assignmentsTodoApplication.AppUser;

public interface AppUserDAO {

    void persist(AppUser appUser);

    AppUser findByUsername(String username);

    AppUser findAll();

    void remove(AppUser appUser);
}
