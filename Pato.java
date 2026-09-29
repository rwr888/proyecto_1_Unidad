

interface Nadador {
    void nadar();
}

interface Volador {
    void volar();
}

public class Pato extends Animal implements Nadador, Volador {

    public Pato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Quack!");
    }

    @Override
    public void nadar() {
        System.out.println(getNombre() + " está nadando.");
    }

    @Override
    public void volar() {
        System.out.println(getNombre() + " está volando.");
    }
}

