package ls20200709_user;

import java.util.Objects;

/**
 * JavaAdvanced 09.07.2020
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
    public boolean equals(Object o) {
        if (this == o) return true; //проверка равенства адресов
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o; //сравнение по полям
        return Objects.equals(name, user.name) && Objects.equals(login, user.login) && Objects.equals(pass, user.pass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, login, pass);
    }

    @Override
    public String toString() {
        return "User name = " + name + ", login = " + login + ", pass ='" + pass;
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
