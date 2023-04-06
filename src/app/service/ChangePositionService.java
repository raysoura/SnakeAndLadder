package app.service;

import app.models.Data;

public class ChangePositionService {

    private int validateSnakeAndLadder(int newPosition) {

        //CheckSnake
        if (Data.snakePosition.containsKey(newPosition)) {
            newPosition = Data.snakePosition.get(newPosition);
        }
        //CheckLadder
        if (Data.ladderPosition.containsKey(newPosition)) {
            newPosition = Data.ladderPosition.get(newPosition);
        }
        return newPosition;
    }

    public int changePosition(int player, int diceValue) {
        int oldPosition = Data.playerPosition.get(player);
        int newPosition = oldPosition+diceValue;
        if (newPosition>Data.totalSteps) {
            return oldPosition;
        }
        int finalPosition = validateSnakeAndLadder(newPosition);
        Data.playerPosition.put(player, finalPosition);
        return finalPosition;
    }
}
