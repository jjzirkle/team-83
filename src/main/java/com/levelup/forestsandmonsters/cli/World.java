package com.levelup.forestsandmonsters.cli;
import java.util.*;
import java.awt.Point;


public class World {
    Map<Point,Tile> tiles;

    public World(){
        tiles = new HashMap<>();
        for (int x =0;x<10;x++){
            for (int y=0; y<10;y++){
               tiles.put(new Point(x, y), new Tile()); 
            }
        }
    }

    public void printWorld(){

    }

    public boolean isValid(){

        return false;
    }

    public boolean isKey(){

        return false;
    }
}
