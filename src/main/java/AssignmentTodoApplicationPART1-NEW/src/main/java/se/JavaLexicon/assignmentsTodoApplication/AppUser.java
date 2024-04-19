package se.JavaLexicon.assignmentsTodoApplication;

import java.util.Objects;

public class AppUser {
    private String username; //acts as id
    private String password;
    private AppRole role;

    public AppUser(String username, String password, AppRole role) {
            if (username == null || username.isEmpty()) {
                throw new IllegalArgumentException("Username cannot empty");
            }
            if (password == null || password.isEmpty()) {
                throw new IllegalArgumentException("Password cannot be empty");
            }
            if (role == null) {
                throw new IllegalArgumentException("Role cannot be null");
            }
            this.username = username;
            this.password = password;
            this.role = role;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            if (username == null || username.isEmpty()) {
                throw new IllegalArgumentException("Username cannot be null or empty");
            }
            this.username = username;
        }

        public String getPassword() {

            return password;
        }

        public void setPassword(String password) {
            if (password == null || password.isEmpty()) {
                throw new IllegalArgumentException("Password cannot be empty");
            }
            this.password = password;
        }

        public AppRole getRole() {

            return role;
        }

        public void setRole(AppRole role) {
            if (role == null) {
                throw new IllegalArgumentException("Role cannot be null");
            }
            this.role = role;
        }

        @Override
        public String toString() {
            return "AppUser [username=" + username + ", role=" + role + "]";  // Exclude password for security
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            AppUser appUser = (AppUser) o;
            return username.equals(appUser.username) && role == appUser.role;
        }

        @Override
        public int hashCode() {
            return Objects.hash(username, role);
        }

    public Integer getId () {
        return username.hashCode();
    }
}
