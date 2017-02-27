/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class StackFactory {
    
    //Recibe como parametro el objeto que se desea crea
    
    public iStack getStack(String tipoStack,int tamPila){
      
        switch(tipoStack){
            
            case "PilaVector":
                return new StackVector(tamPila);
             case "PilaLista":
                return new StackLista();
                
            case "PilaArrayLista":
                return new StackArrayLista();
                
     
                
                
            default:
                return null; 
        }
               
       
    }
    
    
}
