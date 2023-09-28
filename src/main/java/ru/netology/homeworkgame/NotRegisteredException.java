package ru.netology.homeworkgame;

public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException(String massage) {
        super(massage);
    }
}