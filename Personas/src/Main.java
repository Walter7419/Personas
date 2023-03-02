import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    	int atributo1=0;
    	int atributo2=0;
    	int atributo3=0;
    	int atributo4=0;

        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Alice", "Bob", "Jose", "David", "Emily", "Frank", "Grace", "Henry", "Isa", "James"));

        ArrayList<Persona1> personas = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int index = new Random().nextInt(nombres.size());
            String nombre = nombres.get(index);
            personas.add(new Persona1(nombre));
            nombres.remove(index);
        }

        for (Persona1 persona : personas) {
        	if(persona.tieneAtributo1()) {
        		atributo1++;
        	}
        	if(persona.tieneAtributo2()) {
        		atributo2++;
        	}
        	if(persona.tieneAtributo3()) {
        		atributo3++;
        	}
        	if(persona.tieneAtributo4()) {
        		atributo4++;
        	}
            System.out.println(persona.getNombre() + ": \tTiene cabello:" +persona.tieneAtributo1() + ". \tTiene  Barba: " + persona.tieneAtributo2()+ ". \tSe baña: " + persona.tieneAtributo3()+ ". \tTiene Ojos Verdes:" + persona.tieneAtributo4()+"\n");
        }
        System.out.println(atributo1+" Tienen Pelo");
        System.out.println(atributo2+" Tienen Barba");
        System.out.println(atributo3+" Se bañan");
        System.out.println(atributo4+" Tienen los ojos Verdes");

    }
}