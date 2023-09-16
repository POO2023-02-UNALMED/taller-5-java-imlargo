package zooAnimales;

import java.util.ArrayList;
import java.util.List;

class Pez extends Animal {
   private static List<Pez> listado = new ArrayList();
   public static int salmones;
   public static int bacalaos;
   private String colorEscamas;
   private int cantidadAletas;

   public Pez() {
   }

   public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
      super(nombre, edad, habitat, genero);
      this.colorEscamas = colorEscamas;
      this.cantidadAletas = cantidadAletas;
      listado.add(this);
   }

   public int cantidadPeces() {
      return listado.size();
   }

   //Crear
   public Pez crearSalmon(String nombre, int edad, String genero) {
      Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
      salmones++;
      return salmon;
   }

   public Pez crearBacalao(String nombre, int edad, String genero) {
      Pez bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
      bacalaos++;
      return bacalao;
   }

   //Metodos get
   public String getColorEscamas() {
      return this.colorEscamas;
   }

   public int getCantidadAletas() {
      return this.cantidadAletas;
   }

   public String movimiento() {
      return "nadar";
   }
}
