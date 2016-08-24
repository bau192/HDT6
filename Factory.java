import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Factory {

	public Factory() {
		// TODO Auto-generated constructor stub
	}

	public Set crearObj(int numero){
		
		switch(numero){
		
			case 1:
					return new HashSet();
			
			
			case 2: 
					return new TreeSet();
			
			
			case 3:
				return new LinkedHashSet();
		}
		return null;
		
	} 
}
