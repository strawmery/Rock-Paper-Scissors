package dev.maria;

public class Game {
    public static String randomElection() {
        return GameFactory.randomChoice().getName();
    }

    public static String winnerDetermination(String user, String computer) {
        if (user.equalsIgnoreCase(computer)) {
            return "Empate";
        } else {
            GameChoice userChoice = GameFactory.createChoice(user);
            GameChoice computerChoice = GameFactory.createChoice(computer);

            switch (userChoice.getName()) {
                case "Piedra":
                    return (computer.equalsIgnoreCase("Tijera") || computer.equalsIgnoreCase("Lagarto")) ? "Winner" : "Game Over";
                case "Papel":
                    return (computer.equalsIgnoreCase("Piedra") || computer.equalsIgnoreCase("Spock")) ? "Winner" : "Game Over";
                case "Tijera":
                    return (computer.equalsIgnoreCase("Papel") || computer.equalsIgnoreCase("Lagarto")) ? "Winner" : "Game Over";
                case "Lagarto":
                    return (computer.equalsIgnoreCase("Papel") || computer.equalsIgnoreCase("Spock")) ? "Winner" : "Game Over";
                case "Spock":
                    return (computer.equalsIgnoreCase("Tijera") || computer.equalsIgnoreCase("Piedra")) ? "Winner" : "Game Over";
                default:
                    throw new IllegalArgumentException("Elección inválida");
            }
        }
    }
}

