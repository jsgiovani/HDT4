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
    
    //Recibe como parametro el objeto que se desea crear
    public iStack getStack(String tipoStack,int tamanoVector){
        
        switch("tipoStack"){
            case "PilaVector":
                return new StackVector(tamanoVector);
                
                
            default:
                return null; 
        
        
        }
        
        
              
    }
    
}
