import java.util.ArrayList;
public class StackArrayLista extends Stack{
	
		int dato;
		
		ArrayList <Integer> miArrayList = new ArrayList<>();
		
		//Insertar valor en la pila
                @Override
		public void empujar(int dato){
			miArrayList.add(dato);
		}
		//Devuelbe el ultimo dato que esta en la pila
                @Override
		public int  cima(){
			int ultimo = miArrayList.get(miArrayList.size()-1);
			//System.out.println("El primer valor en la pila es: " + ultimo);
                        return ultimo; 
		}
		
		//Elimina el ultimo datoq que se inserto en la pila
                @Override
		public int sacar(){
			int dato=miArrayList.remove(miArrayList.size()-1);
                        return dato;
		}
		//Devuelve el tamaño de la lista
                @Override
		public int tamanoPila(){
                    return miArrayList.size();
			
		}
		
		
	
	}