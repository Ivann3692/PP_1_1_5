package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Васян", "Иванов", (byte) 37);
        userService.saveUser("Колян", "Петров", (byte) 34);
        userService.saveUser("Иван", "Семенов", (byte) 27);
        userService.saveUser("Толян", "Сидоров", (byte) 32);

        userService.removeUserById(3);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
