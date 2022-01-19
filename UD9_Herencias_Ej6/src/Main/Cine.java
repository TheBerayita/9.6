package Main;

public class Cine {
	
	private Pelicula pelicula;
	private double precioEntrada;
	
	public Cine(Pelicula pelicula, double precioEntrada) 
	{
		this.pelicula = pelicula;
		this.precioEntrada = precioEntrada;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}
	
	

}
