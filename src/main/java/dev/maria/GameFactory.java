package dev.maria;

import java.util.Random;

public class GameFactory {
    private static final String[] OPTIONS = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};

    public static GameChoice createChoice(String name) {
        switch (name) {
            case "Piedra":
                return new Piedra();
            case "Papel":
                return new Papel();
            case "Tijera":
                return new Tijera();
            case "Lagarto":
                return new Lagarto();
            case "Spock":
                return new Spock();
            default:
                throw new IllegalArgumentException("Opción inválida: " + name);
        }
    }

    public static GameChoice randomChoice() {
        Random random = new Random();
        String randomName = OPTIONS[random.nextInt(OPTIONS.length)];
        return createChoice(randomName);
    }
}
