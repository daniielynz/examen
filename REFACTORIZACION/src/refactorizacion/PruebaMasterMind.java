package refactorizacion;

import java.io.IOException;

public class PruebaMasterMind {

	public static void main (String[] args) throws IOException {

		MasterMind mm1 = new MasterMind();
		MasterMind mm2 = new MasterMind();
		
		System.out.println("hola");
		System.out.println("subimos a github");
		System.out.println("se ha subido correctamente");
		
		mm1.verCombinacion();
		mm1.jugar();
		
		mm2.verCombinacion();
		mm2.jugar();	
	}
}
