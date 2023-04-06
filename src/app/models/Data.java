package app.models;

import java.util.HashMap;

public class Data {
    public static int totalSteps;
    public static int noOfPlayers;
    public static int playerTurn=0;
    public static HashMap<Integer, Integer> playerPosition = new HashMap<>();
    public static HashMap<Integer, Integer> snakePosition = new HashMap<>();
    public static HashMap<Integer, Integer> ladderPosition = new HashMap<>();
}
