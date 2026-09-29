

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();

        // Agregamos 2 perros y 2 patos
        animales.add(new Perro("Cookieberto", 3));
        animales.add(new Perro("Cosette", 4));
        animales.add(new Pato("Walter", 7));
        animales.add(new Pato("Rocketa", 11));

        System.out.println("El zoológico tiene " + animales.size() + " animales:\n");

        for (Animal animal : animales) {
            System.out.println(animal.getNombre() + " (" + animal.getEdad() + " años)");
            animal.comer();
            animal.hacerSonido();

            // Selección de la acción específica según el nombre y la interfaz correspondiente
            if (animal.getNombre().equals("Cookieberto") && animal instanceof Nadador) {
                ((Nadador) animal).nadar();
            } else if (animal.getNombre().equals("Cosette") && animal instanceof Corredor) {
                ((Corredor) animal).correr();
            } else if (animal.getNombre().equals("Walter") && animal instanceof Nadador) {
                ((Nadador) animal).nadar();
            } else if (animal.getNombre().equals("Rocketa") && animal instanceof Volador) {
                ((Volador) animal).volar();
            }

            System.out.println();
        }
    }
}


