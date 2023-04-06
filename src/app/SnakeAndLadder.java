package app;

import app.models.Data;
import app.service.CreateGameService;
import app.service.PlayGameService;

import java.util.HashMap;
import java.util.Random;

public class SnakeAndLadder {
    public void snakeAndLadder() {

        CreateGameService createGameService = new CreateGameService();
        createGameService.createGame();

        PlayGameService playGameService = new PlayGameService();
        playGameService.playGame();
    }

}
