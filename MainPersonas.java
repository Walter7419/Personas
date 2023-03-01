public class MainPersonas {
	public static void main(String[] args) {
		AtributosPersonas[] persona = new AtributosPersonas[10];
			persona[0]=new AtributosPersonas() {};
			persona[1]=new AtributosPersonas() {};
			persona[2]=new AtributosPersonas() {};
			persona[3]=new AtributosPersonas() {};
			persona[4]=new AtributosPersonas() {};
			persona[5]=new AtributosPersonas() {};
			persona[6]=new AtributosPersonas() {};
			persona[7]=new AtributosPersonas() {};
			persona[8]=new AtributosPersonas() {};
			persona[9]=new AtributosPersonas() {};


		

	
		for(AtributosPersonas personas : persona) {
			System.out.println(" "+personas.getNombre()+", "+personas.getCabello()+", "+personas.getLentes());
		}

	}
	

}
