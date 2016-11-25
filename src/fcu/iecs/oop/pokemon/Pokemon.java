package fcu.iecs.oop.pokemon;

public class Pokemon {
	private final String name;
	private int cp;
	
	public Pokemon(String name,int cp){
		this.name = name;
		this.cp = cp;
	}
	
	public static Pokemon Winner(Pokemon p){
		System.out.println(p.name);
		p.cp=p.cp+500;
		System.out.println(p.cp);
		return p;
	}
	
	public static void getName(Pokemon p){
		System.out.println(p.name);
	}
	
	public static void getCp(Pokemon p){
		System.out.println(p.cp);
	}
	
}
