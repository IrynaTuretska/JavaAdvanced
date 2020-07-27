package ls20200709_user;

/**
 * JavaAdvanced 09.07.2020
 */
public class Main {
    public static void main(String[] args) {
        User[] users = { //массив локальный в классе main
                new User("Name1", "Login1", "Pass1"),
                new User("Name2", "Login2", "Pass2"),
                new User("Name3", "Login3", "Pass3"),
                new User("Name4", "Login4", "Pass4"),
                new User("Name5", "Login5", "Pass5"),
                new User("Name1", "Login1", "Pass1")
        };

        UsersArray usersArray = new UsersArray(users);
        System.out.println(usersArray.findDoubleUsers());
        usersArray.helloUser("Login", "Pass2");

    }
}
