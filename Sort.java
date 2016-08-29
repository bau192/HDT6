import java.util.*;

public class Sort{

	private Set <String>[] desarrollador= new Set[4];
	private String nombre;
	private int numero,numero2;
	
	
	public Sort()  {
		// TODO Auto-generated constructor stub				
	}
	
	public void SortInfo(Factory conjunto){
		
		
		for (int i = 0; i != desarrollador.length; i++) 
		{
			desarrollador[i] = conjunto.create(numero-1);
		}
		
		desarrollador[numero2-1].add(nombre);
		
	}
	
	
	public void printJava(){
	
	}
	
	public void printWeb(){
		
	}
	
	public void printMovil(){
		
	}
	
	public void printJavaWebMovil(){
		
	}
	
	public void printJavaMovil(){
		
	}
	
	public void printWebMovil(){
		
	}
	

	
	
	public String getNombre(String nombre){
		return nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	public int getNumero(){
		return numero;
	}

	public void setNumero2(int numeroH){
		this.numero2 = numero2;
	}
	public int getNumero2(){
		return numero2;
	}
}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	public int getNumero(){
		return numero;
	}
	
}
