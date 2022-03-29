package com.tdd.bowlinggame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlingGameTest {
    @Test
    public void testGutterGame() throws Exception {
        BowlingGame game = new BowlingGame();
        for (int i=0; i<20; i++)
            game.roll(0);
        assertEquals(0, game.score());
    }
}