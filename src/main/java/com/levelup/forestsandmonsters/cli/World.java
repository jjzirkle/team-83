package com.levelup.forestsandmonsters.cli;
import java.util.*;
import java.awt.Point;


public class World {
    public Map<Point,Tile> tiles;
    int currentPosition = 0;
    public World(){
        tiles = new HashMap<>();
        for (int x =0;x<10;x++){
            for (int y=0; y<10;y++){
               tiles.put(new Point(x, y), new Tile()); 
            }
        }
        tiles.put(new Point(1, 1), new Tile(true));
        tiles.put(new Point(2, 2), new Tile(true));
        tiles.put(new Point(3, 3), new Tile(true));
        Tile t = tiles.get(new Point(1, 1));
        System.out.println("key??"+t.isKey);
        printWorld(0,0);
    }

    public void printWorld(int playerX, int playerY){
        for (int y =9;y>=0;y--){
            System.out.println("");
            for (int x =0; x<10;x++){
                Tile tile = tiles.get(new Point(x,y));
                if(tile != null && tile.isKey){
                    if (playerX == x && playerY == y){
                        tile.isKey = false;
                      System.out.print("P");
                    }else {
                     System.out.print("X");
                    }
                }
                else if(x == playerX && y == playerY){
                    System.out.print("P");
                }
                else {
                    System.out.print("0");
                }
            }
        }   
         System.out.println("");

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
