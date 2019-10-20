import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User storeUser = new User("ALex", "12345", "Alex", User.Responsobl.MENEGER);
        User storeUser1 = new User("Mom", "1232", "Momes", User.Responsobl.DIRECTOR);
        User storeUser2 = new User("JimBo", "12343", "Jim", User.Responsobl.CLIENT);
        User storeUser3 = new User("JackSe", "123445", "Jack", User.Responsobl.ADMINISTRATOR);
        User storeUser4 = new User("JepsPer", "12341235", "Jaf", User.Responsobl.ANONYMUS);
        Store store = new Store("ATB", "all", new User[]{storeUser, storeUser1, storeUser2, storeUser3, storeUser4});
        tryLogin(store);
    }

    public static void tryLogin(Store store) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter login");
        String login = in.nextLine();
        System.out.println("Enter password");
        String password = in.nextLine();

        if (store.login(login, password) == true) {
            store.getCurrentUserRights();
            store.logOut();
        } else {
            System.out.println("Incorrect login or/and password");
        }
    }
}
