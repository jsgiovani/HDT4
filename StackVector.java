

/**
 *
 * @author User
 */
//Hereda a la clas Stack 
public class StackVector extends Stack {
     
     int pila[];
     int tamanoPila;
     int contadorEmpujar;  
     int contadorSacar;
     
     
     //La ultima posición del vector es la cima de la pila
     // La posición 0 del vector es el fondo de la pila 
    
    public StackVector(int tamanoPila){  //constructor, recibe como parametro el tamano de la pila
       this.tamanoPila=tamanoPila ;
       contadorEmpujar=0;
       contadorSacar=tamanoPila;
       pila=new int[tamanoPila];
    }
    

    @Override
    public void empujar(int dato) {
            if (contadorEmpujar!=tamanoPila){   //Sí el  contador es diferente a 10, entonces sí puede meter datos 
                pila[contadorEmpujar]=dato;  // guarda el valor en el arreglo
                
                
                contadorEmpujar++; 
                System.out.println(contadorEmpujar);
            }
            else{
                System.out.println("se lleno la pila");
            }
           
    }    

    @Override
    public int sacar() {
        //Saca la cima de la pila 
        int valor;
        if(contadorEmpujar!=0){ //Sí es diferente que cero significa que sí hay datos 
            valor=pila[contadorEmpujar-1];
            contadorEmpujar--;
            return valor; 
        }
        else {//sí devuelve -1 significa que ya no hay datos 
            return -1;
        }
        
        
        
      
   
    }
    
    
    /*

    @Override
    public int cima() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int tamanoPila() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
    
}
