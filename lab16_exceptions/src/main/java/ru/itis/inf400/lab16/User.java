package ru.itis.inf400.lab16;

public class User {
    private String login;
    private String password;
    private UserRole userRole;

    public User(String login, String password, UserRole userRole) {
        this.login = login;
        this.password = password;
        this.userRole = userRole;
    }

    public boolean userCheck(String login, String password) {
        return this.login.equals(login) && this.password.equals(password);
    }


    public void printMenu() {
        if (userRole.equals(UserRole.ADMIN)) {
            System.out.println("ADMIN:\n" +
                    "1. File\n" +
                    "2. Create new user\n" +
                    "3. exit\n");
        } else {
            System.out.println("USER:\n" +
                    "1. File\n" +
                    "2. Get play list\n" +
                    "3. exit\n");
        }
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public UserRole getUserRole() {
        return userRole;
    }
}
