package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Ave extends Animal {
   private static List<Ave> listado = new ArrayList();
   public static int halcones;
   public static int aguilas;
   private String colorPlumas;

   public Ave() {
   }

   public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
      super(nombre, edad, habitat, genero);
      this.colorPlumas = colorPlumas;
      listado.add(this);
   }

   public static int cantidadAves() {
      return listado.size();
   }

   //Crear
   public static Ave crearHalcon(String nombre, int edad, String genero) {
      Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
      halcones++;
      return halcon;
   }

   public static Ave crearAguila(String nombre, int edad, String genero) {
      Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
      aguilas++;
      return aguila;
   }

   //Metodos get
   public String movimiento() {
      return "volar";
   }

   public String getColorPlumas() {
      return this.colorPlumas;
   }
}
