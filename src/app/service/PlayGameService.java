package app.service;

import app.models.Data;

public class PlayGameService {
    private ChangePositionService changePositionService;
    private RollDiceService rollDiceService;

    public PlayGameService() {
         this.changePositionService = new ChangePositionService();
         this.rollDiceService = new RollDiceService();
    }

    public void playGame() {
        int currentPlayerPosition = 0;
        System.out.println("Game Begins");
        while(currentPlayerPosition< Data.totalSteps) {
            int currentPlayer = Data.playerTurn;
            System.out.println("Turn belongs to Player: "+currentPlayer);
            int diceValue = rollDiceService.rollDice();
            System.out.println("Rolling the dice. Recieved value: "+diceValue);
            int newPosition = changePositionService.changePosition(currentPlayer, diceValue);
            System.out.println("The player has moved to position: "+newPosition);
            if (newPosition==Data.totalSteps) {
                System.out.println("Game has been won by player: "+currentPlayer);
                break;
            }
            Data.playerTurn++;
            Data.playerTurn %=Data.noOfPlayers;
            System.out.println();
        }
    }
}
