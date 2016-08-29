import java.util.*;

public class Factory {

	public Factory() {
		// TODO Auto-generated constructor stub
	}

	public Set<String> crearObj(int numero){
		switch(numero){
		
			case 1:
					return new HashSet<String>();
			case 2: 
					return new TreeSet<String>();
			case 3:
					return new LinkedHashSet<String>();
			default:
					return new HashSet<String>();
		}	
	} 
}

