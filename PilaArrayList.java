import java.util.ArrayList;
public class PilaArrayList <T>{
	
		T dato;
		
		ArrayList <T> miArrayList = new ArrayList<T>();
		
		//Insertar valor en la pila
		public void empujar(T dato){
			miArrayList.add(dato);
		}
		//Devuelbe el ultimo dato que esta en la pila
		public void cima(){
			T ultimo = miArrayList.get(miArrayList.size()-1);
			System.out.println("El primer valor en la pila es: " + ultimo);
		}
		
		//Elimina el ultimo datoq que se inserto en la pila
		public void sacar(){
			miArrayList.remove(miArrayList.size()-1);
		}
		//Devuelbe el tamaño de la lista
		public void tamanoPila(){
			System.out.println("El tamaño de la pila es: " +  miArrayList.size());
		}
		//Devuelbe el primero en la lista
		public void ultimo(){
			T primero = miArrayList.get(0);
			System.out.println("El ultimo valor en la pila es: " + primero);
			
		}
		
	
	}
