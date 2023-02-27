
public class AtributosPersonas {
	
	private String name;
	private boolean hair;
	

	public AtributosPersonas(boolean hair, String name) {
	this.hair=hair;
	this.name=name;
	}
	public String getNombre() {
		return name;
		}
	public void getHair() {
		if(hair) {
		System.out.println("Tiene cabello");
		}
		else {
			System.out.println("No tiene cabello");
		}
		
}

	
	


}
