package ru.itis.inf400.lab16;

public class exitException extends RuntimeException {
    public exitException(String message) {
        super(message);
    }
    public exitException() {
        super("Вы вышли из программы");
    }
}
