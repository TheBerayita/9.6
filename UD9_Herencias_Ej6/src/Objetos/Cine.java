package Objetos;
/*
 * Autores: 
 * Pau Robuste
 * Jordi Ribellas
 * Albert Perez
 */
public class Cine {
	
	//Variables
	private Pelicula pelicula;
	private double precioEntrada;
	
	//Constructor
	public Cine(Pelicula pelicula, double precioEntrada) 
	{
		this.pelicula = pelicula;
		this.precioEntrada = precioEntrada;
	}
	
	//Getters & Setters
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
	
} //Fin del codigo
