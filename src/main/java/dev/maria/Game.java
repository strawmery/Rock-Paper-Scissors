package dev.maria;

import java.util.Random;

public class Game {

    public static String randomElection (){
    String [] opciones = {"Piedra", "Papel","Tijera"};
    Random random = new Random();
    return opciones[random.nextInt(opciones.length)];
    }

    public static String winnerDetermination(String user, String computer){
        if(user.equalsIgnoreCase(computer)){
           return "Empate";
        }else{
            switch(user){
                case "Piedra":
                    return computer.equalsIgnoreCase("Tijera")? "Winner" : "Game Over";
                case "Papel": 
                    return computer.equalsIgnoreCase("Piedra")? "Winner" : "Game Over";
                case "Tijera":
                    return computer.equalsIgnoreCase("Papel")? "Winner" : "Game Over";
                default:
                    throw new IllegalArgumentException("Elección inválida: " + user);
            }
                
        }
    }


}
