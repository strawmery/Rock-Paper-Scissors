package dev.maria;

import java.util.Random;

public class Game {
    public static String randomElection (){
                String [] opciones = {"Piedra", "Papel","Tijera","Lagarto","Spock"};
                Random random = new Random();
                return opciones[random.nextInt(opciones.length)];
            }
    public static String winnerDetermination(String user, String computer){
        if(user.equalsIgnoreCase(computer)){
            return "Empate";            
        }else{
                switch(user){
                    case "Piedra":
                        if(computer.equalsIgnoreCase("Tijera") || computer.equalsIgnoreCase("Lagarto")){
                            return "Winner";
                        }else{
                            return "Game Over";
                        }
                    case "Papel": 
                        if(computer.equalsIgnoreCase("Piedra") || computer.equalsIgnoreCase("Spock")){
                            return "Winner";
                        }else{
                            return "Game Over";
                        }
                    case "Tijera":
                        if(computer.equalsIgnoreCase("Papel") || computer.equalsIgnoreCase("Lagarto")){
                            return "Winner";
                        }else{
                            return "Game Over";
                        }
                    case "Lagarto":
                        if(computer.equalsIgnoreCase("Papel") || computer.equalsIgnoreCase("Spock")){
                            return "Winner";
                        }else{
                            return "Game Over";
                        }
                    case "Spock":
                        if(computer.equalsIgnoreCase("Tijera") || computer.equalsIgnoreCase("Piedra")){
                            return "Winner";
                        } else{
                            return "Game Over";
                        }
                    default:
                        throw new IllegalArgumentException("Elección inválida");
            }
        }
    }

}
