import java.util.Random;

public abstract class AtributosPersonas {	
	
	private String[] names= {"Bob", "Patricio", "Calamardo", "Karen", "Perlita", "Plankton", "Don Cangrejo", "Calamarino", "Gary"};
	private String nombre;
	private boolean hasHair;
	private boolean hasGlasses;
	private boolean hasBlueEyes;
	private boolean hasGreenEyes;
	int[] stack = new int[10];
	
	Random random= new Random();
	int randomInt = random.nextInt(10);
	Boolean randomBooleanHair = random.nextBoolean();
	Boolean randomBooleanGlasses = random.nextBoolean();
	Boolean randomBooleanBlueEyes = random.nextBoolean();
	Boolean randomBooleanGreenEyes = random.nextBoolean();
	
	private int repetidos() {
		for(int n=0;n<10;n++){
			
			for(int i=0;n<10;i++) {
				if(randomInt!=stack[i]) {
					continue;
				}
				if(randomInt==stack[i]) {
					randomInt++;
					continue;
				}
			}
			randomInt=stack[n];
		}
		return randomInt;
	}
	public AtributosPersonas() {
		for(int l=0; l<10;l++) {
			this.nombre=names[stack[l]];

		}
		this.hasGlasses=randomBooleanGlasses;
		this.hasBlueEyes=randomBooleanBlueEyes;
		this.hasGreenEyes=randomBooleanGreenEyes;
		this.hasHair=randomBooleanHair;
	}


	public String getNombre() {
		return nombre;
		}
	public Boolean getCabello() {
		return hasHair;
	}
	public Boolean getLentes() {
		return hasGlasses;
	}
	public Boolean getOjosAzules() {
		return hasBlueEyes;
	}
	public Boolean getOjosVerdes() {
		return hasGreenEyes;
	}		
	
}

	
	



