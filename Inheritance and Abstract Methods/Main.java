public class Main {
	
	public Main() {
		Tortoise tortoise = new Tortoise();
		Turtle turtle = new Turtle();
		Snake snake = new Snake();
		Otter otter = new Otter();
		Gorilla gorilla = new Gorilla();
		Bat bat = new Bat();
    
		tortoise.getInfo(true, true, true, true);
		turtle.getInfo(true, true, true, true);
		snake.getInfo(true, true, true, true);
		otter.getInfo(true, true, true, false);
		gorilla.getInfo(true, true, true, false);
		bat.getInfo(true, true, true, true);
		Console.readLine();
    }
    
    public static void main(String[] args) {
        new Main();
    }
}