package proyecto_cvs;

public class propiedad {
	private String nombre;
	private int alquiler;
	private int posicion;
	public propiedad(String nombre, int alquiler, int posicion) {
		super();
		this.nombre = nombre;
		this.alquiler = alquiler;
		this.posicion = posicion;
	}
	
	public propiedad() {
		super();
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAlquiler() {
		return alquiler;
	}
	public void setAlquiler(int alquiler) {
		this.alquiler = alquiler;
	}
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	public int alquiler() {
		int alquiler=0;
		return alquiler;
	}
}
