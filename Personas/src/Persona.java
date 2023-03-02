import java.util.ArrayList;
import java.util.Random;

abstract class Persona {
    private String nombre;
    private boolean atributo1;
    private boolean atributo2;
    private boolean atributo3;
    private boolean atributo4;

    public Persona(String nombre, boolean atributo1, boolean atributo2, boolean atributo3, boolean atributo4) {
        this.nombre = nombre;
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
        this.atributo4 = atributo4;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean tieneAtributo1() {
        return atributo1;
    }

    public boolean tieneAtributo2() {
        return atributo2;
    }
    public boolean tieneAtributo3() {
        return atributo3;
    }

    public boolean tieneAtributo4() {
        return atributo4;
    }
}