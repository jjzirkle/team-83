package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameController {

    static final String DEFAULT_CHARACTER_NAME = "Character";

    public class GameStatus {
        // TODO: Add other status data
        public String characterName = DEFAULT_CHARACTER_NAME;
        public Point currentPosition = null;
        public int startX = 0;
        public int startY = 0;
        public int endX = 0;
        public int endY = 0;
        // TODO: Write a failing unit test that will force you to set this to the right number
        public int moveCount = 0;
    }

    GameStatus status;

    public GameController() {
        status = new GameStatus();
    }

    // TODO: Ensure this AND CLI commands match domain model
    public static enum DIRECTION {
        NORTH, SOUTH, EAST, WEST
    }

    // Pre-implemented to demonstrate ATDD
    // TODO: Update this if it does not match your design
    public void createCharacter(String name) {
        if (name != null && !name.equals("")) {
            status.characterName = name;
        } else {
            status.characterName = DEFAULT_CHARACTER_NAME;
        }
    }

    public void startGame() {
        // TODO: Implement startGame - Should probably create tiles and put the character
        // on them?
        // TODO: Should also update the game results?
        status.currentPosition = new Point(status.startX,status.startY);
    }

    public GameStatus getStatus() {
        return this.status;
    }

    public void move(DIRECTION directionToMove) {
        // TODO: Implement move - should call something on another class
        // TODO: Should probably also update the game results
            System.out.println("HERE!!!!!!!!!!!!!!!!!!!");
        if (directionToMove.toString() == "NORTH") {
            System.out.println("ENTERED!!!!!!!!!!!!!!!!!!!");
            status.currentPosition.y = status.currentPosition.y + 1;
        }
        if (directionToMove.toString() == "SOUTH") {
            status.currentPosition.y = status.currentPosition.y - 1;
        }
        if (directionToMove.toString() == "WEST") {
            status.currentPosition.x = status.currentPosition.x - 1;
        }
        if (directionToMove.toString() == "EAST") {
            status.currentPosition.x = status.currentPosition.x + 1;
        }
        status.moveCount += 1;
    }

    public void setCharacterPosition(Point coordinates) {
        status.currentPosition = coordinates;
    }

    public void setCurrentMoveCount(int moveCount) {
        // TODO: IMPLEMENT THIS TO SET CURRENT MOVE COUNT -- exists to be testable
            status.moveCount = moveCount;
    }

    public int getTotalPositions() {
        // TODO: IMPLEMENT THIS TO GET THE TOTAL POSITIONS FROM THE MAP -- exists to be
        // testable
        return 100;
    }

}
