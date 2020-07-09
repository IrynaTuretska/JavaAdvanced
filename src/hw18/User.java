package hw18;

/**
 * JavaAdvanced 08.07.2020
 */
public class User {
    private String name;
    private String login;
    private String pass;

    public User(String name, String login, String pass) {
        this.name = name;
        this.login = login;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "name: " + name + " (login: " + login + ", pass: " + pass + ")";
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }
}
