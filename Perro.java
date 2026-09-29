
interface Corredor {
    void correr();
}

public class Perro extends Animal implements Nadador, Corredor {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Guau!");
    }

    @Override
    public void nadar() {
        System.out.println(getNombre() + " está nadando.");
    }

    @Override
    public void correr() {
        System.out.println(getNombre() + " esta corriendo");
    }
}



