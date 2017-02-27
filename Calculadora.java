/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Calculadora {
    String cadenaPostFix;
    int tamVector=0;
      
    //Metodo que calcula la expresión postifx
    //Recibe como parametro  el tipo de Stack que se desea usar .
    public void calcularPostFix(String tipoStack){
        String expPostFix=cadenaPostFix; // contiene la expresión postfix
        int longExp = expPostFix.length();     //Variable que contiene la longitud de el postFix
        int cima; //contiene el valor de la cima de la stack 
        String cadenaPila="";       //varable que obtiene los valores de stack, despues que cuentre unoperador aritmetico 
        int cuenta=0;
        
        
    
        
        //**************************************************************************************************************************************************************************
        //--------------FACTORY-------------------------------------------------------------------------------------------------------------------------------------------------
        //**************************************************************************************************************************************************************************
        
        
         StackFactory  nFactory = new StackFactory();
         iStack stack = nFactory.getStack(tipoStack,tamVector);  //crea un objeto de stacklista, stackarraylist. O stack vector. 
         
         
         
         
         
         
         //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
       
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         Lista<String> lista =  new Lista<String>();// creamos lista de tipo lista , haciendo uso de generic de tipo String 
        
      
        char charPostFix;      
        int i=0;
        //Evaluamos todos los carateres de la expresion postfix
        while(i<longExp){
          // System.out.print(expPostFix.charAt(i));
           charPostFix=expPostFix.charAt(i);        //Guarda el carcater del index i en variable tipo char 
            //Verificamos que no sea un número, para luego convertirlo  string a número
            switch (charPostFix) {
                case '+':
                    //Sí es suma
                    //System.out.println("Más");
                    
                    int k=0;
                    int tamPilaAc=stack.tamanoPila(); //COntieen el tamano de la stack
                    int suma=0;
              
                    k=0;
                    while(k<(tamPilaAc)){
                        
                        //Guardamos los numeros que tiene la stack en un string
                        cadenaPila=Integer.toString(stack.cima()) +"," + cadenaPila; 
                        //Realizamos la suma 
                        suma=suma+ stack.sacar();
                        k++;
                    }
                    lista.agregarAlFinal(cadenaPila);  //agregamos a  la lista la cadena de la stack 
                    //cuenta =0;
                    cadenaPila="";
                    //Guardamos el resutlado de la suma en la stack
                    stack.empujar(suma);
                    lista.agregarAlFinal(Integer.toString(stack.cima())); //guardamos el valor de la stack actual a la fila 
                    
                    //System.out.println("\nLa suma es:" + suma );
                    
                  
                    break;
                    
                case '-':
                    //Sí es resta
                    //System.out.println("Operador menos");
                    k=0;
                    tamPilaAc=stack.tamanoPila(); //COntieen el tamano de la stack
                    int resta=0;
                    
                    while(k<(tamPilaAc)){
                       
                        resta=stack.sacar() - resta;
                        k++;
                    }
                    //Guardamos el resutlado de la suma en la stack
                    stack.empujar(resta);
                    //System.out.println("\nLa resta es:" + resta );
                    break;
                    
                case '*':
                    //Si es multiplicación
                    //System.out.println("Operador multiplicar");
                    k=0;
                    tamPilaAc=stack.tamanoPila(); //COntieen el tamano de la stack
                    int mul=1;
                    while(k<(tamPilaAc)){
                        //Guardamos los numeros que tiene la stack en un string
                        cadenaPila=Integer.toString(stack.cima()) +"," + cadenaPila;
                        mul=mul*stack.sacar();
                        k++;
                    }
                     lista.agregarAlFinal(cadenaPila);  //agregamos a  la lista la cadena de la stack 
                    //cuenta =0;
                    cadenaPila="";
                    //Guardamos el resutlado de la suma en la stack
                    stack.empujar(mul);
                    lista.agregarAlFinal(Integer.toString(stack.cima())); //guardamos el valor de la stack actual a la fila 
                    

                    //System.out.println("\nLa multiplicación es:" + mul );
                    break;
                    
                    
                case '/':
                    //SI es division
                   // System.out.println("Operador dividir");
                    int denominador = stack.sacar();
                    int numerador=stack.sacar();
                    int div= numerador/denominador;
                    //GUuardamos el resultado de la división a la stack
                    stack.empujar(div);
                    //System.out.println("\nLa división es:" + div);
                    break;
                    
                    
                case ' ':
                    //Si es espacio en blanco
                   // System.out.println("Espacio en blanco");
                    break;
                    
                default:
                    //De lo contrario significa que es un número ]
                    //System.out.println("Es un número ");
                    
                    //COnvertimos de numero char a int,para poder operar 
                    char numeroChar=charPostFix;            //numero caracter  a convertir
                    String stringNumero=Character.toString(numeroChar);
                    int numero=Integer.parseInt(stringNumero);
                    
                    
                    //Introducimos numero a la stack
                    stack.empujar(numero);
                    
                    
                    if (cuenta==0){
                        lista.agregarAlFinal(Integer.toString(stack.cima())); 
                        cuenta=1;
                    }
                    //
                    
                    
                    break;
                    
                    
                    
            }//Fin del switch
           i++;             //Aumentamos el contador
           }//Fin del while 
         
        //Mostramos los datos de la pila
        System.out.print("Resultado:");
        int j=0;
        int tamanoPila=stack.tamanoPila();
         while(j<tamanoPila){
            System.out.print(stack.sacar());
            j++;
        }
         
         
        // System.out.println("\nLa cadena es:" + cadenaPila);
         //Mostrar lista
         System.out.println("\nPILA:");
         lista.mostrarLista();
         
    }
 

    
    
    public void setCadenaPostFix(String cadena){
        this.cadenaPostFix=cadena; 
    }
      public void setTamVector(int tamVector){
        this.tamVector=tamVector; 
    }
}
