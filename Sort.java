import java.util.*;

public class Sort{

	private Set <String>[] desarrollador= new Set[4];
	private Set <String>[] impDesarrollador = new Set[1];
	private String nombre;
	private int numero,numero2;
	
	
	public Sort()  {
		// TODO Auto-generated constructor stub				
	}
	
	public void SortInfo(Factory conjunto){
		
		
		for (int i = 0; i != desarrollador.length; i++) 
		{
			desarrollador[i]=conjunto.crearObj(i);
			//desarrollador[i] = conjunto.create(numero-1);
		}
		
		
		desarrollador[numero2].add(nombre);
		
	}
	
	
	public void printJava(){
		System.out.println("Desarrolladores Java:"+ desarrollador[0].toString());
	}
	
	public void printWeb(){
		System.out.println("Desarrolladores Web:"+ desarrollador[1].toString());
	}
	
	public void printMovil(){
		System.out.println("Desarrolladores Moviles:"+ desarrollador[2].toString());
	}
	
	public void printJavaWebMovil(){
		impDesarrollador[1].addAll(desarrollador[0]);
		impDesarrollador[1].addAll(desarrollador[1]);
		impDesarrollador[1].addAll(desarrollador[2]);
		
		System.out.println("Desarrolladores Java,Web y Moviles:"+ impDesarrollador[1].toString());
	}
	
	public void printJavaNoWeb(){
		impDesarrollador[1].clear();
		impDesarrollador[1].addAll(desarrollador[0]);
		impDesarrollador[1].addAll(desarrollador[1]);
		impDesarrollador[1].removeAll(desarrollador[1]);
		
		System.out.println("Desarrolladores Java y no Web:"+ impDesarrollador[1].toString());
	}
	
	public void printWebMovil(){
		impDesarrollador[1].clear();
		impDesarrollador[1].addAll(desarrollador[0]);
		impDesarrollador[1].addAll(desarrollador[1]);
		impDesarrollador[1].addAll(desarrollador[2]);
		impDesarrollador[1].removeAll(desarrollador[0]);
		
		System.out.println("Desarrolladores Web y Moviles pero no Java:"+ impDesarrollador[1].toString());
	}
	
	
	public void printSubconjunto(){
		if (desarrollador[1].contains(desarrollador[0])==true){
			System.out.println("El conjunto de Desarrolladores Java es un subconjunto de los Desarroladores Web");
		}
		else {
			System.out.println("El conjunto de Desarrolladores Java no es un subconjunto de los Desarroladores Web");
		}
	}
	
	public void conjuntoMayor(){
		if(desarrollador[0].size()>desarrollador[1].size() && desarrollador[1].size()>desarrollador[2].size()){
			System.out.println("El conjunto Java es el mayor."+desarrollador[0].toString());
		}
		if(desarrollador[1].size()>desarrollador[0].size() && desarrollador[0].size()>desarrollador[2].size()){
			System.out.println("El conjunto Web es el mayor."+desarrollador[1].toString());
		}
		if(desarrollador[2].size()>desarrollador[0].size() && desarrollador[0].size()>desarrollador[1].size()){
			System.out.println("El conjunto Movil es el mayor."+desarrollador[2].toString());
		}
	}
	
	public void conjuntoMenor(){
		if(desarrollador[0].size()<desarrollador[1].size() && desarrollador[1].size()<desarrollador[2].size()){
			System.out.println("El conjunto Java es el menor."+desarrollador[0].toString());
		}
		if(desarrollador[1].size()<desarrollador[0].size() && desarrollador[0].size()<desarrollador[2].size()){
			System.out.println("El conjunto Web es el menor."+desarrollador[1].toString());
		}
		if(desarrollador[2].size()<desarrollador[0].size() && desarrollador[0].size()<desarrollador[1].size()){
			System.out.println("El conjunto Movil es el menor."+desarrollador[2].toString());
		}
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

	public void setNumero2(int numero2){
		this.numero2 = numero2;
	}
	public int getNumero2(){
		return numero2;
	}
}
