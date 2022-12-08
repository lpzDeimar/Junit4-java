package com.platzi.javaTests.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void loosesWhenDiceNumberIsTooLow(){
        // Emulan do la clase
        Dice dice = Mockito.mock(Dice.class);

        //Forzando el resultado
        Mockito.when(dice.roll()).thenReturn(2);

        Player jugador = new Player(dice,5);
        assertFalse(jugador.play());
    }
}