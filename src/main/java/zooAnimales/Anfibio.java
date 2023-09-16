package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Anfibio extends Animal {
   private static List<Anfibio> listado = new ArrayList();
   public static int ranas;
   public static int salamandras;
   private String colorPiel;
   private boolean venenoso;

   public Anfibio() {
   }

   public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
      super(nombre, edad, habitat, genero);
      this.colorPiel = colorPiel;
      this.venenoso = venenoso;
      listado.add(this);
   }

   public int cantidadAnbifibos() {
      return listado.size();
   }

   public static Anfibio crearRana(String nombre, int edad, String genero) {
      Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
      ranas++;
      return rana;
   }

   public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
      Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
      salamandras++;
      return salamandra;
   }

   //Metodos get
   public String getColorPiel() {
      return this.colorPiel;
   }

   public boolean isVenenoso() {
      return this.venenoso;
   }

   public String movimiento() {
      return "saltar";
   }
}
