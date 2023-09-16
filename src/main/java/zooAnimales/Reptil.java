package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Reptil extends Animal {
   private static List<Reptil> listado = new ArrayList();
   public static int iguanas;
   public static int serpientes;
   private String colorEscamas;
   private int largoCola;

   public Reptil() {
   }

   public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
      super(nombre, edad, habitat, genero);
      this.colorEscamas = colorEscamas;
      this.largoCola = largoCola;
      listado.add(this);
   }

   public int cantidadReptiles() {
      return listado.size();
   }

   //Crear
   public static Reptil crearIguana(String nombre, int edad, String genero) {
      Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
      iguanas++;
      return iguana;
   }

   public static Reptil crearSerpiente(String nombre, int edad, String genero) {
      Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
      serpientes++;
      return serpiente;
   }

   //Metodos get
   public String getColorEscamas() {
      return this.colorEscamas;
   }

   public int getLargoCola() {
      return this.largoCola;
   }

   public String movimiento() {
      return "reptar";
   }
}
