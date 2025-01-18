package ru.itis.inf400.lab16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public static boolean checkPassword(String password) throws WrongPasswordException {
        if (password == null || password.isEmpty()) {
            throw new WrongPasswordException();
        }
        Pattern pattern = Pattern.compile("[a-zA-Z0-9{}(),.;&?!_+\\[\\]-]{8,}");
        Matcher matcher = pattern.matcher(password);
        if (!matcher.matches()) {
            throw new WrongPasswordException();
        }
        return true;
    }
}
