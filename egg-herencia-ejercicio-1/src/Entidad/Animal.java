package Entidad;

import Personas.IRascarse;

public class Animal implements IRascarse{
	
	protected  String nombre;
	protected String alimento;
	protected int edad;
	protected String raza;
	public Animal(String nombre, String alimento, int edad, String raza) {
		super();
		this.nombre = nombre;
		this.alimento = alimento;
		this.edad = edad;
		this.raza = raza;
	}
	
	
	public void alimentarse() {
		System.out.println("Soy un" + raza+ "Me alimento con "+ alimento);
	}


	@Override
	public void rascarse() {
		System.out.println("Me rasco con una pata");
		
	}
	

}
