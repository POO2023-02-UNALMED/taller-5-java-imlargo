package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private List<Zona> zonas = new ArrayList<>();


    public Zoologico(){}

	public Zoologico(String nombre, String ubicacion){
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	//....
	public void agregarZonas(Zona zona){
		this.zonas.add(zona);
		zona.setZoo(this);
	}

	public String getNombre() {
		return this.nombre;
	}
    
    public ArrayList<Zona> getZona() {
        return zonas;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

	public int cantidadTotalAnimales(){
		int i = 0; 
		for (Zona zona : zonas) {
			i += zona.cantidadAnimales();
		}
		return i;
	}

}
