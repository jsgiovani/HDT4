import java.util.ArrayList;
public class Stackk <T>{
	
		T dato;
		
		ArrayList <T> miArrayList = new ArrayList<T>();
		
		//Insertar valor en la pila
		public void push(T dato){
			miArrayList.add(dato);
		}
		//Devuelbe el ultimo dato que esta en la pila
		public void peck(){
			T ultimo = miArrayList.get(miArrayList.size()-10);
			System.out.println("El ultimo valor en la pila es: " + ultimo);
		}
		
		//Elimina el ultimo datoq que se inserto en la pila
		public void pop(){
			miArrayList.remove(miArrayList.size());
		}
		//Devuelbe el tama�o de la lista
		public void zice(){
			System.out.println("El tama�o de la pila es: " +  miArrayList.size());
		}
		//Devuelbe el primero en la lista
		public void firstAbove(){
			T primero = miArrayList.get(0);
			System.out.println("El ultimo valor en la pila es: " + primero);
			
		}
		
	
	}


