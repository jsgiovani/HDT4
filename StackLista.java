//Hereda a la clas Stack  y stack  usa la interfaz iStack que define los métodos; 
// Esta pila utiliza Lista simple   para almacenar los datos 
public class StackLista extends Stack{
    private NodoPila cima; //encapsulamos puntero de NodoPila
    int tamanoPila;
    //constructor
    public StackLista(){
        cima=null;
        tamanoPila=0;
    }
    
    //metodo para saber si la pila esta vacia
    public boolean estaVacia(){
        return cima==null;
    }
    //Método push: para insertar/empujar un elemento en la Pila
    @Override
    public void empujar(int elemento){
        NodoPila nuevo=new NodoPila(elemento);//creamos puntero de tipo NodoPila
        nuevo.siguiente=cima;
        cima=nuevo;
        tamanoPila++;       
    }
    // Metodo pop: Para sacar un elemento de la pila
    @Override
    public  int sacar(){
        int aux=cima.dato;
        cima=cima.siguiente;
        tamanoPila--;
        return aux;
        
        
    }
    //Método cima para saber quien esta en la cima de la Pila
    @Override
    public int cima(){
        return cima.dato;
    }
    //Método tamanoPila para saber el tamano de la pila
    @Override
    public int tamanoPila(){
        return tamanoPila;
    }
    //metodo limpiar pila:para limpiar(vaciar) la pila
    public void limpiarPila(){
        while(!estaVacia()){ //Mienstras la pila no este vacia 
            sacar();
        }
    }
    

    
}
