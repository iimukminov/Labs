package ru.itis.inf400.lab16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login {
    public static boolean checkCorrect(String login) throws WrongLoginException {
        if (login == null || login.isEmpty()) {
            throw new WrongLoginException();
        }
        Pattern pattern = Pattern.compile("[a-zA-Z0-9@._-]{20,}");
        Matcher matcher = pattern.matcher(login);
        if (!matcher.matches()) {
            throw new WrongLoginException();
        }
        return true;
    }
}
