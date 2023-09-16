package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Mamifero extends Animal {
   private static List<Mamifero> listado = new ArrayList();
   public static int caballos;
   public static int leones;
   private boolean pelaje;
   private int patas;

   public Mamifero() {
   }

   public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
      super(nombre, edad, habitat, genero);
      this.pelaje = pelaje;
      this.patas = patas;
      listado.add(this);
   }

   public int cantidadMamiferos() {
      return listado.size();
   }

   //Crear
   public static Mamifero crearCaballo(String nombre, int edad, String genero) {
      Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
      caballos++;
      return caballo;
   }

   public static Mamifero crearLeon(String nombre, int edad, String genero) {
      Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
      leones++;
      return leon;
   }

   //Metodos get
   public boolean isPelaje() {
      return this.pelaje;
   }

   public int getPatas() {
      return this.patas;
   }
}
