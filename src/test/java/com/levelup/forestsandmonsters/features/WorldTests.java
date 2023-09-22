package com.levelup.forestsandmonsters.features;
    
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.Point;

import com.levelup.forestsandmonsters.GameController;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.*;
import com.levelup.forestsandmonsters.cli.Tile;
import com.levelup.forestsandmonsters.cli.World;
 

public class WorldTests {

    World world = new World();
    int moveX, moveY;
    Point nextPosition;
    Map<Point,Tile> tiles;
    String isValid;
    
    @Given("I have a list of valid tiles")
    public void initTiles() {
        nextPosition = new Point(0, 1);
        world.tiles.put(nextPosition, new Tile());
    }

    @Given("next X player position {int}")
    public void setNextX(int moveX) {
        this.moveX = moveX;
    }

    @Given("next Y player position {int}") 
    public void setNextY(int moveY) {
        this.moveY = moveY;
    }

    @When("the player validates his movement")
    public void theCharacterMoves() {
        nextPosition = new Point(moveX, moveY);
        isValid = world.isValid(nextPosition)+"";
    }

    @Then("map should return {word}")
    public void isValidMovement(String expected) {
        assertEquals(expected, isValid);
    }



}
