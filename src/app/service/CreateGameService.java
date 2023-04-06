package app.service;

import app.models.Data;

public class CreateGameService {

    public void createGame() {
        Data.noOfPlayers = 2;
        Data.totalSteps = 100;
        Data.playerTurn = 0;
        for(int i=0;i<Data.noOfPlayers;i++) {
            Data.playerPosition.put(i, 0);
        }
        Data.ladderPosition.put(6, 25);
        Data.ladderPosition.put(11, 40);
        Data.ladderPosition.put(60, 85);
        Data.ladderPosition.put(46, 90);
        Data.ladderPosition.put(17, 69);

        Data.snakePosition.put(99, 54);
        Data.snakePosition.put(70, 55);
        Data.snakePosition.put(52, 42);
        Data.snakePosition.put(25, 2);
        Data.snakePosition.put(95, 72);
    }
}
