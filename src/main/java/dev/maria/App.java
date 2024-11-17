package dev.maria;

import static dev.maria.Game.randomElection;
import static dev.maria.Game.winnerDetermination;

public class App 
{
    public static void main( String[] args )
    {
        String userChoice = "Piedra"; // Cambia según el caso
        String computerChoice = randomElection();
    
        System.out.println("Tu elección: " + userChoice);
        System.out.println("Elección de la computadora: " + computerChoice);
    
        String result = winnerDetermination(userChoice, computerChoice);
        System.out.println("Resultado: " + result);
    }
}
