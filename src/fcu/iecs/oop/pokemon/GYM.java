package fcu.iecs.oop.pokemon;
import fcu.iecs.oop.pokemon.Pokemon;
import java.util.Random;

public class GYM {
	public static void fight(Pokemon p1, Pokemon p2){
		Random ran = new Random();
		int choose;
		choose=ran.nextInt(2);
		if(choose==1){
			Pokemon.Winner(p1);
		}
		else{
			Pokemon.Winner(p2);
			
		}
	}
}
