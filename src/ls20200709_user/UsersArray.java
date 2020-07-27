package ls20200709_user;

/**
 * JavaAdvanced 09.07.2020
 */
public class UsersArray {
    User[] users;

    public UsersArray(User[] users) {
        this.users = users;
    }

    //переопределить метод equals в User! до этого - сравнивает адреса в пямяти, после - объекты
    public boolean findDoubleUsers() {
        for (int i = 0; i < users.length; i++) {
            for (int j = i + 1; j < users.length; j++) {
                if (users[i].equals(users[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    //сравнение по полям:
    public void helloUser(String login, String pass) {
        for (int i = 0; i < users.length; i++) {
            String uLogin = users[i].getLogin(); //доп переменная, где сохранения логин i-того юзера
            String uPass = users[i].getPass();
            if (uLogin.equals(login) && uPass.equals(pass)) {
                System.out.println("Hello " + users[i].getName());
                return; //если юзер нашелся, метод закончился
            }
        }
        System.out.println("No such user");
    }
}
