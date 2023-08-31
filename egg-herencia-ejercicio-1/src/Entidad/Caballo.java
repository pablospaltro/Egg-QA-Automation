package Entidad;

public class Caballo extends Animal {

	public Caballo(String nombre, String alimento, int edad, String raza) {
		super(nombre, alimento, edad, raza);
		
	}

	@Override
	public void alimentarse() {
		
		super.alimentarse();
		System.out.println("Y ademas como cabaña de azucar");
	}
	
	
	
	

}
