

/**
 *
 * @author User
 */
//Hereda a la clas Stack 
// Esta pila utiliza vectores  para almacenar los datos 
public class StackVector  extends Stack{
     
    int pila[];
    // int tamanoPila;
     int contadorAux;  // lleva laposición del último numero de push o pop 
   //  int contadorSacar;
    int tamanoPila;
     
     
     //La ultima posición del vector es la cima de la pila
     // La posición 0 del vector es el fondo de la pila 
    
   
     public StackVector(int tamanoPila){  //constructor, recibe como parametro el tamano de la pila
       this.tamanoPila=tamanoPila ;
       contadorAux=0;
       pila = new int[tamanoPila];
    }


    @Override
    public void empujar(int dato) {  
        
            if (contadorAux!=tamanoPila){   //Sí el  contador es diferente a 10, entonces sí puede meter datos 
                pila[contadorAux]=dato;  // guarda el valor en el arreglo
                
                
                contadorAux++; 
              //  System.out.println(contadorAux);
            }
            else{
                System.out.println("se lleno la pila");
            }
        
    
    }    

    
    
    @Override
    public int sacar() {
        //Saca la cima de la pila 
        int valor;
        if(contadorAux!=0){ //Sí es diferente que cero significa que sí hay datos 
            valor=pila[contadorAux-1];
            contadorAux--;
            return valor; 
        }
        else {//sí devuelve -1 significa que ya no hay datos 
            return -1;
        }
    }
    
    
 
    @Override
    public int cima() {
     int datoCima;
     datoCima=pila[contadorAux];
     return datoCima;     
    }

    
    @Override
    public int tamanoPila() {
      return contadorAux; 
    }

    
}
