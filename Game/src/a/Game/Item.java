package a.Game;

public class Item extends GameObj {

	int weight;
	int life;

	Item(String name, int grade, int weight, int life) {

		super(name, grade);
		this.weight = weight;
		this.life = life;
	}

}
