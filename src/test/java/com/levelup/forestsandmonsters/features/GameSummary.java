package com.levelup.forestsandmonsters.features;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.Point;

import com.levelup.forestsandmonsters.GameController;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GameSummary {

    int totalPositions = 0;

    GameSummary testObj = new GameSummary();
    
    @Given("the total number of moves is {int}")
    public void givenTotalMoves(int totalPositions) {
        this.totalPositions = totalPositions;
    }

    
}
