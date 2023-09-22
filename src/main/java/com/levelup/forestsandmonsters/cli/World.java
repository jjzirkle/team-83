package com.levelup.forestsandmonsters.cli;
import java.util.*;
import java.awt.Point;


public class World {
    public Map<Point,Tile> tiles;

    public World(){
        tiles = new HashMap<>();
        for (int x =0;x<10;x++){
            for (int y=0; y<10;y++){
               tiles.put(new Point(x, y), new Tile()); 
            }
        }
        // assign random key
    }

    public void printWorld(){

    }

    public boolean isValid(Point p){
        Tile tile = tiles.get(p);
        return tile != null ? true : false;
    }

    public boolean isKey(Point p){
        Tile tile = tiles.get(p);
        return tile.isKey ? true : false;
    }
}
