package it.alex.first;

public class Saluto {

	String greeting="Ciao ciao";
	
	
	public static void main(String[] args) {
		Saluto s1=new Saluto();
		Saluto s2=new Saluto("alex");

	}
	
	public Saluto() {
		System.out.println(greeting);
	}
	
	public Saluto(String name) {
		System.out.println(greeting + " " + name);
	}
	

}