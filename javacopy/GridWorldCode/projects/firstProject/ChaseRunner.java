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

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import java.awt.Color;

/**
 * This class runs a world that contains a bug and a rock, added at random
 * locations. Click on empty locations to add additional actors. Click on
 * populated locations to invoke methods on their occupants. <br />
 * To build your own worlds, define your own actors and a runner class. See the
 * BoxBugRunner (in the boxBug folder) for an example. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class ChaseRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        Bug red = new Bug();
        Bug blue = new Bug(Color.blue);
        world.add(red);
        world.add(blue);
        world.add(new Rock());
        world.show();
        System.out.println(distance(red, blue));
        turnToward(red, blue);

    }
    public static double distance(Bug red, Bug blue){
      int xred = red.getLocation().getCol();
      int yred = red.getLocation().getRow();
      int xblue = blue.getLocation().getCol();
      int yblue = blue.getLocation().getRow();
      double sqrx = Math.pow(xred - xblue, 2);
      double sqry = Math.pow(yred - yblue, 2);
      double dist = sqrx + sqry;
      return Math.sqrt(dist);
    }
    public static void turnToward(Bug red, Bug blue){
      int xred = red.getLocation().getCol();
      int xblue = blue.getLocation().getCol();
      double xdist = Math.abs(xred-xblue);
      int yred = red.getLocation().getRow();
      int yblue = blue.getLocation().getRow();
      double ydist = Math.abs(yred-yblue);
      double rad = Math.atan2(ydist, xdist);
      double deg = rad * 180 /Math.PI;
      int  turns = (int)(deg / 45);
      for(int i=0; i < turns; i++){
        red.turn();
      }

    }
}
