package mainPaquete;
import java.util.*;

import Entidad.Animal;
import Entidad.Perro;
import Personas.IRascarse;
import Personas.Persona;

public class MainAppAnimales {

	public static void main(String[] args) {
		
		ArrayList<IRascarse> racables = new ArrayList<>();
		ArrayList<Animal> animales = new ArrayList<>();
		
		racables.add(new Perro("Teo", "Concentardi", 8, "Golden"));
		racables.add(new Persona());
		
		animales.add(new Perro("Teo", "Concentardi", 8, "Golden"));
		
		for (IRascarse iRascarse : racables) {
			iRascarse.rascarse();
		}
		
		for (Animal animal : animales) {
			System.out.println(animales.toString());
		}
		
		

	}

}
