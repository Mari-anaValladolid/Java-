
public abstract class TestGranja {

	public abstract  void desplazarse ();
	public abstract  void hacerSonidos();
	
}
//Tarea de Felipe 
//Primer animal
class Gallina extends TestGranja {

	@Override
	public void desplazarse() {
		System.out.println("Me muevo como una gallina");
		
	}

	@Override
	public void hacerSonidos() {
		System.out.println("Pio Pio");
		
	
		
	}//
	
}//
//Segundo animal
class Oveja extends TestGranja {

	@Override
	public void desplazarse() {
		System.out.println("Corro como oveja");
	}

	@Override
	public void hacerSonidos() {
		System.out.println("Beeeeee");
		
	}

}

//Tercer animal
class Vaca extends TestGranja{

	@Override
	public void desplazarse() {
		System.out.println("Camino como vaca");
		
	}

	@Override
	public void hacerSonidos() {
		System.out.println("Muuuuuu");
		
	}
	
}
//Cuarto animal
class Perro extends TestGranja{

	@Override
	public void desplazarse() {
		System.out.println("Corro como perro");
		
	}

	@Override
	public void hacerSonidos() {
		System.out.println("Guauuu");
		
	}
	
}
// Quinto animal
class Pato extends TestGranja{

	@Override
	public void desplazarse() {
		System.out.println("Nada como pato");
		
	}

	@Override
	public void hacerSonidos() {
		System.out.println("Cuack Cuack");
		
	}
	
}