package ru.itis.inf400.lab16;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException() {
        super("Некорректный пароль");
    }
}
