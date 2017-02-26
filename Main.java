/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     //   StackFactory  nFactory = new StackFactory();
        
       // iStack stack = nFactory.getStack("PilaVector",5);
        
       StackVector  stackVector = new StackVector(5);
       
       stackVector.empujar(4);
       stackVector.empujar(10);
       stackVector.empujar(20);
       stackVector.empujar(30);
       stackVector.empujar(40);
       stackVector.empujar(100);
       
      System.out.println(stackVector.sacar());
      System.out.println(stackVector.sacar());
      System.out.println(stackVector.sacar());
      System.out.println(stackVector.sacar());
      System.out.println(stackVector.sacar());
      System.out.println(stackVector.sacar());
      
       
       
       
       
       
       
     
        
        
        
        
        
    }
    
}
