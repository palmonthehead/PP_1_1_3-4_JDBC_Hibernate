package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Стив", "Джобс", (byte)11);
        userService.saveUser("Капитан", "Джек_Воробей", (byte)20);
        userService.saveUser("Райан", "Гослинг", (byte)4);
        userService.saveUser("Молния", "Маквин", (byte)40);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
