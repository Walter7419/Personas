import java.util.Random;

public class MainPersonas {

	public static void main(String[] args) {
		Random random= new Random();
		int randomInt = random.nextInt(10);
		Boolean randomBoolean = random.nextBoolean();

		AtributosPersonas[] nombres = new AtributosPersonas[10];
		nombres [randomInt]= new AtributosPersonas( randomBoolean, "Patricio");
		nombres [randomInt]= new AtributosPersonas( randomBoolean, "Bob Esponja");

	
		for(int n=0;n<10;n++) {
			System.out.println(nombres[n].getNombre()+" ");
		}

	}
	

}
