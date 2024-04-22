package com.Abdul.looseCoupling;

interface Gamingconsole {
	void up();

	void down();

	void left();

	void right();
}

class Mario implements Gamingconsole {

	@Override
	public void up() {
		System.out.println("Mario up");

	}

	@Override
	public void down() {
		System.out.println("Mario down");

	}

	@Override
	public void left() {
		System.out.println("Mario left");

	}

	@Override
	public void right() {
		System.out.println("Mario right");

	}
}

class TempleRun implements Gamingconsole {

	@Override
	public void up() {
		System.out.println("TempleRun Up");

	}

	@Override
	public void down() {
		System.out.println("TempleRun down");

	}

	@Override
	public void left() {
		System.out.println("TempleRun left");

	}

	@Override
	public void right() {
		System.out.println("TempleRun right");

	}
}

class GameRunner {
	public GameRunner(Gamingconsole g) {
		this.g = g;
	}

	Gamingconsole g;

	void run() {
		g.up();
		g.down();
		g.left();
		g.right();

	}

}

public class RunningApplication {
	public static void main(String[] args) {
		Mario m = new Mario();
		TempleRun t = new TempleRun();
		GameRunner obj = new GameRunner(t);
		obj.run();

	}

}
