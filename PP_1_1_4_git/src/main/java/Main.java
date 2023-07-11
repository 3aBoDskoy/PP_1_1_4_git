
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;


public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Sanya", "Zeleniy", (byte) 32);
        userService.saveUser("Oleg", "Cherniy", (byte) 23);
        userService.saveUser("Misha", "Rozoviy", (byte) 45);
        userService.saveUser("Alex", "Belyi", (byte) 65);

        userService.removeUserById(2);

        userService.getAllUsers();

//        userService.cleanUsersTable();
//
//        userService.dropUsersTable();
        Util.closeSessionFactory();
    }
}

