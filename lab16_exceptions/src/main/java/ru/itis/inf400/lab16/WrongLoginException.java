package ru.itis.inf400.lab16;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException(String message) {
        super(message);
    }

  public WrongLoginException () {
    super("Некорректный логин");
  }
}
