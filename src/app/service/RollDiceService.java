package app.service;

import java.util.Random;

public class RollDiceService {

    public int rollDice() {
        Random r = new Random();
        int diceValue = r.nextInt(6);
        if (diceValue==0) {
            diceValue = 6;
        }
        return diceValue;
    }
}
