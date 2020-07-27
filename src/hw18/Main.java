package hw18;

/**
 * JavaAdvanced 08.07.2020
 */
public class Main {
    public static void main(String[] args) {
        User user1 = new User("Alex Schmidt", "Alex-123", "XsT-321");
        User user2 = new User("Alex Schmidt", "Alex-123", "nZq-321");
        User user3 = new User("Paul Muller", "Paul-456", "ddA-456");
        User user4 = new User("John Johnson", "John-789", "rhN-789");
        User user5 = new User("Anna Grey", "Anna-234", "lsF-234");

        User[] users = new User[]{user1, user2, user3, user4, user5};

        System.out.println("Find double users. Result: " + findDoubleUser(users));
        System.out.println("- - - - - -");
        System.out.println("The user " + user3 + " has index: " + findUser(users, user3));
        System.out.println("- - - - - -");
        sayHello(users, "John-789", "rhN-789");
        sayHello(users, "John-89", "rhN-789"); // не получилось записать условие в случае несовпадения логина или пароля

    }

    public static boolean findDoubleUser(User[] users) {
        for (int i = 0; i < users.length; i++) {
            for (int j = i; j < users.length; j++) {
                if (users[i].equals(users[j]) && i != j)
                    return true;
            }
        }
        return false;
    }

    public static int findUser(User[] users, User user) {
        int index = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(user)) {
                index = i;
            }
        }
        return index;
    }

    public static void sayHello(User[] users, String login, String pass) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getLogin().equals(login) && users[i].getPass().equals(pass)) {
                System.out.println("Hello, " + users[i].getName());
            }
        }
    }
}
