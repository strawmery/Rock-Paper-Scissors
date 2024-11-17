package dev.maria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import sun.awt.Win32GraphicsEnvironment;

public class GameTest {
    @Test
    public void testRandomElection(){
        String result = Game.randomElection();

        assertTrue(result.equals("Piedra") || result.equals("Papel") || result.equals("Tijera"));
    }

    @Test
    public void testEmpate() {
        assertEquals("Empate", Game.winnerDetermination("Piedra", "Piedra"));
        assertEquals("Empate", Game.winnerDetermination("Papel", "Papel"));
        assertEquals("Empate", Game.winnerDetermination("Tijera", "Tijera"));
    }

    @Test
    public void testWinner() {
        assertEquals("Winner", Game.winnerDetermination("Piedra", "Tijera"));
        assertEquals("Winner", Game.winnerDetermination("Papel", "Piedra"));
        assertEquals("Winner", Game.winnerDetermination("Tijera", "Papel"));
    }

    @Test
    public void testGameOver() {
        assertEquals("Game Over", Game.winnerDetermination("Piedra", "Papel"));
        assertEquals("Game Over", Game.winnerDetermination("Papel", "Tijera"));
        assertEquals("Game Over", Game.winnerDetermination("Tijera", "Piedra"));
    }

    @Test
    public void testException() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> Game.winnerDetermination("Invalido", "Piedra")
        );
        assertEquals("Elección inválida", exception.getMessage());
    }
}
