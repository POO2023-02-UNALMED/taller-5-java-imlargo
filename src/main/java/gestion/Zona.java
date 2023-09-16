package gestion;
import zooAnimales.*;
import java.util.*;

public class Zona {

	private String nombre;
	private Zoologico zoo;
	private List<Animal> animales = new ArrayList<>();


    public Zona(){}
    
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}

	//....
	public String getNombre() {
		return this.nombre;
	}

	public Zoologico getZoo() {
		return this.zoo;
	}
	
	//....
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	
	public void agregarAnimales(Animal animal){
		this.animales.add(animal);
		animal.setZona(this);
	}
	
	public int cantidadAnimales(){
		 return animales.size();
	}

}
