package zooAnimales;

import gestion.Zona;

public class Animal {
    private static int totalAnimales = 0;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal() {
    }

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    // ---
    public int getTotalAnimales() {
        return totalAnimales;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getGenero() {
        return this.genero;
    }

    public String getHabitat() {
        return this.habitat;
    }

    public void setTotalAnimales(int totalAnimals) {
        totalAnimales = totalAnimals;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public static String totalPorTipo() {
        return "Mamiferos: " + Mamifero.cantidadMamiferos() + "\nAves: " + Ave.cantidadAves() + "\nReptiles: "
                + Reptil.cantidadReptiles() + "\nPeces: " + Pez.cantidadPeces() + "\nAnfibios: "
                + Anfibio.cantidadAnfibios();
    }

    public String toString() {
        if (zona != null) {
            return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat
                    + " y mi genero es " + this.genero + ", la zona en la que me ubico es " + this.zona.getNombre()
                    + ", en el " + ((this.zona).getZoo());
        } else {
            return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat
                    + " y mi genero es " + this.genero;
        }
    }

    public String movimiento() {
        return "desplazarse";
    }
}
