package ru.itis.inf400.lab16;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        String loginAdmin = "Login123Abcdef_@ghi.jklm-nop";
        String loginUser = "MyLogin456_abc@def.ghi-jklmn";
        String loginWrong = "12345";
        String passwordAdmin = "Passw123{}!";
        String passwordUser = "Secure[456];?";
        String passwordWrong = "1234";


        User user1 = new User(loginAdmin, passwordAdmin, UserRole.ADMIN);
        User user2 = new User(loginUser, passwordUser, UserRole.USER);

        User[] users = {user1, user2};

        System.out.println("Введите логин: ");
        String login = inputLine(true);
        System.out.println("Введите пароль: ");
        String password = inputLine(false);

        boolean wasFindUser = false;
        for (User user : users) {
            if (user.userCheck(login, password)) {
                user.printMenu();
                wasFindUser = true;
            }
        }

        if (!wasFindUser) {
            System.out.println("Неверный логин или пароль");
        }
    }

    public static String inputLine(boolean checkLogin) {
        boolean notCorrect = true;
        String line = null;
        while (notCorrect) {
            try {
                Scanner scanner = new Scanner(System.in);
                line = scanner.nextLine();
                if (line.equals("exit")) {
                    throw new exitException();
                }
                if (checkLogin) {
                    if (Login.checkCorrect(line)) {
                        return line;
                    }
                } else {
                    if (Password.checkPassword(line)) {
                        return line;
                    }
                }
            } catch (WrongLoginException | WrongPasswordException e) {
                System.out.println(e.getMessage());
            }
        }
        return line;
    }
}
