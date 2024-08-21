package a.Game;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Character c = new Character("고양이", 3, 100);
		Sword s = new Sword("단검", 2, 100, 50, 70);
		Sword l = new Sword("장검", 3, 150, 100, 70);

		ArrayList<GameObj> gs = new ArrayList<>();
		gs.add(c);
		gs.add(s);
		gs.add(l);

		for (GameObj o : gs) {

			So.ln(o.name);
		}

	}

}
