package com.tdd.bowlinggame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// ugly comment in test.
class BowlingGameTest {
    private final BowlingGame game = new BowlingGame();

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++)
            game.roll(pins);
    }

    @Test
    public void testGutterGame() throws Exception {
        rollMany(20, 0);
        assertEquals(0, game.score());
    }

    @Test
    public void testAllOnes() throws Exception {
        rollMany(20,1);
        assertEquals(20, game.score());
    }

    @Test
    public void testOneSpare() throws Exception {
        game.roll(5);
        game.roll(5); // spare
        game.roll(3);
        rollMany(17,0);
        assertEquals(16, game.score());
    }
}
