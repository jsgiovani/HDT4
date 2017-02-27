

/**
 *Hoja de trabajo #4 
 * @author User
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       String tipoStack = null;
      Calculadora calculadora = new Calculadora();
      String cadenaPostFix;
      int tamanoVector=0;
      int opccion=0; // contiene el numero de opccion del usuario 
      String direccion; // COntiene la direccion del .txt 
      Scanner teclado = new Scanner(System.in);
      LeerTxt leer = new LeerTxt();
      int contador=1; 
    
      //Pedimos la direccion del  archivo
      System.out.println("Ingrese la dirección del archivo:");
      System.out.println("Ejemplo:\n    C:\\Users\\User\\Desktop\\Estrucura de Datos\\Hoja de trabajo\\HD4_CalculadoraPostFix\\src\\datos.txt");
     System.out.print("Dieccion de .txt:");
     
      direccion=teclado.nextLine();
     // System.out.println(direccC:\Users\User\Desktop\Estrucura de Datos\Hoja de trabajo\HD4_CalculadoraPostFix\src\datos.txt);
      System.out.println("");
      //Variable que contiene la expresión  a resolver 
      cadenaPostFix=leer.leerTxt(direccion);
      
      
      
      System.out.println("");
      
      
      
      
      
      
      
      //System.out.println(opccion);
        //COndicional para la opccion que ingreso el usuario
        
        while(true){
             System.out.println("\n\nIngrese el el numero de opccion de como desea realizar la op. post fix\n");
      System.out.println("1)Stack ArrayLis \n2)Stack Vector\n3)Stack Lista\n4)salir");
      opccion = teclado.nextInt();
        
        switch (opccion) {
            case 1:
                tipoStack="PilaArrayLista";
                System.out.println("----------------------------------------------------Resuelto con Stack ARRAYlIST------------------------------------------------");
                break;
            case 2:
                tipoStack="PilaVector";
                System.out.println("Ingrese el tamano del vector\nDebe ser mayor a la cantidad de caracteres de su expresion");
                tamanoVector=teclado.nextInt();
               System.out.println("----------------------------------------------------------Resuelto con Stack VECTOR---------------------------------------------------");
               // System.out.println(tamanoVector);
                break;
            case 3:
                tipoStack="PilaLista";
                System.out.println("-----------Resuelto con Stack LISTA--------------");
                break;
                
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Ingrese una opccion correcta");
                break;        
        }
        
           
         System.out.println(tipoStack);
        System.out.println(tamanoVector);
        //Metodo que introduce la cadena de postFix en el atributo
        calculadora.setCadenaPostFix(cadenaPostFix);
        //Parametros: tipo de stack a utilizar 
        //se defe definir el tamaano del vector
        calculadora.setTamVector(tamanoVector);
        calculadora.calcularPostFix(tipoStack);
        System.out.println("----------------------Fin de la ejecución N.:" + contador + "----------------------------------------------------------");
        contador++;
        
    
      
        }//fin del while       

     
        

    
    
    
        
        
        
    }
    
}
