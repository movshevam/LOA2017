/*
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * @author Cay Horstmann
 */
import info.gridworld.actor.Actor;
import info.gridworld.grid.UnboundedGrid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import java.awt.Color;
import java.util.Random;


/**
 * This class runs a world that contains a bug and a rock, added at random
 * locations. Click on empty locations to add additional actors. Click on
 * populated locations to invoke methods on their occupants. <br />
 * To build your own worlds, define your own actors and a runner class. See the
 * BoxBugRunner (in the boxBug folder) for an example. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class BugRunner2
{
    public static void main(String[] args)
    {
        //UnboundedGrid ug = new UnboundedGrid<Actor>();
        //ActorWorld world = new ActorWorld(ug);
        //BoundedGrid bg = new BoundedGrid(20,20);
        ActorWorld world = new ActorWorld();
        Bug redBug = new Bug();
        world.add(redBug);
        world.add(new Rock());
        world.show();
        System.out.println(redBug.getLocation()); //prints out locaiton of the first bug
        System.out.println(redBug.canMove()); //can the bug move?
        //redBug.move(); //move once
        moveBug(redBug, 4);
        randomBug(redBug, 10);
        //redBug.turn(); //turn once
        Color purple = new Color(148, 0, 211);
        Bug purpleBug = new Bug(purple);
        world.add(purpleBug);
        Color uni = new Color(247,166,247);
        Bug unicorn= new Bug(uni);
        world.add(unicorn);

        //randomBug(purpleBug, 13);
        colorBug(redBug);
        //moveBug(redBug, 3);
        //makeBugs(world,5);
        System.out.println(purpleBug.getLocation().getCol());
        System.out.println(purpleBug.getLocation().getRow());

    }
    //move if possible, turn if not
    public static void moveBug(Bug bug, int n){
      if(bug.canMove() == true){ for(int i = 0; i<n; i++){ bug.move();}
      }else{ bug.turn();}
    }
    //turns in random Nmod90=0 direction
    public static void randomBug(Bug bug, int n){
      //Color orig = bug.getColor();
      for(int k=0; k< n; k++){
        double x = Math.random();
        if(x>= 0.0 && x < 0.25){ for(int i=0; i< 8; i++){ bug.turn(); }}
        if(x >= 0.25 && x < 0.5){ for(int i=0; i < 2; i++){ bug.turn(); }}
        if(x >=0.5 && x < 0.75){ for(int i=0; i < 4; i++){ bug.turn(); }}
        if(x >= 0.75 && x < 1.0){  for(int i=0; i < 6; i++){ bug.turn(); }}
      if(bug.canMove() == true){ bug.move(); /*bug.setColor(orig);*/}
      //else{ return; }/*bug.setColor(Color.yellow);*/
      }
    }

    //set bug to a random color
    public static void colorBug(Bug bug){
      int x = bug.getLocation().getCol();
      int y = bug.getLocation().getRow();
      Random rand = new Random();
      int r = rand.nextInt(256);
      int g = rand.nextInt(256);
      int b = rand.nextInt(256);
      Color random = new Color(r, g, b);
      bug.setColor(random);
    }

    public static void makeBugs(ActorWorld world, int n){
      Bug[] insect = new Bug[n];
      for(int i=0; i<n; i++){
        insect[i] = new Bug();
        world.add(insect[i]);//Adds an occupant at a random empty location
        int x = Math.abs(insect[i].getLocation().getCol());
        int y = Math.abs(insect[i].getLocation().getRow());
        Color bugColor = new Color(y, 0, x);
        insect[i].setColor(bugColor);
      }
    }
}
