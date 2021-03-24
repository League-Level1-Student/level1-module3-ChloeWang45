package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {

	public static void main(String[] args) {
		
		World world = new World();
		world.show();
		Bug b1 = new Bug();
		Location l1 = new Location(5, 5);
		world.add(l1, b1);
		Bug b2 = new Bug();
		b2.setColor(Color.blue);
		b2.turn();
		b2.turn();
		Random rand = new Random();
		int a = rand.nextInt(10);
		int b = rand.nextInt(10);
		Location l2 = new Location(a,b);
		world.add(l2, b2);
		int x = 0;
		int y = 0;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				Flower f1 = new Flower();
				Location loc = new Location(x, y);
				world.add(loc, f1);
				x = x + 1;
			}
			x = 0;
			y = y + 1;
		}
	}
}
