/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package santos_carcamo_daniel_david_estructura;
 import java.util.Scanner;
/**
 *
 * @author David
 */
public class Santos_Carcamo_Daniel_David_Estructura {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int Opcion;
        
        Scanner lea= new Scanner(System.in);
        lea.useDelimiter("\n");
        
        do {            
            System.out.println("-----------------------------");
            System.out.println("|       Menu Principal      |");
            System.out.println("-----------------------------");
            System.out.println("|Opciones disponibles:      |");
            System.out.println("| 1. Cifrado Cesar          |");
            System.out.println("| 2. Filtrado de Palabras   |");
            System.out.println("| 3. Codigo Enigma          |");
            System.out.println("-----------------------------");
            System.out.println("\r                                                                          ");
            System.out.print("Bienvenido al menu principal, ingrese una opcion para poder hacer: ");
            Opcion = lea.nextInt();
            System.out.println("\r                                                                          ");
            
            switch(Opcion) {
                case 1:
                    //Parte de Cifrado Cesar
                    System.out.println("cifrado cesar");
                case 2:
                    //Parte de Filtrado de Palabras
                    System.out.println("Ingrese una frase: ");
                    String Frase = lea.next();
                    
                    System.out.println("Ingrese un limite de caracteres: ");
                    int Limite = lea.nextInt();
                    
                    if (Limite < 0) {
                        System.out.println("El limite de caracteres tiene que ser mayor a 0, ingrese un limite mayor a 0");
                        break;
                    }
                    
                    Frase = Frase + " "; //aqui solo se le suma un espacio a la frase para que se lea bien la ultima palabra
                    int Inicio = 0; //inicio de la frase
                    int Longitud = Frase.length();
                    
                    System.out.println("Lista de Palabras: ");
                    for (int i = 0; i < Longitud; i++) {
                        if (Frase.charAt(i) == ' ') {
                            String Palabra = Frase.substring(Inicio, i);
                            String Palabralimpia = Palabra.replaceAll("\\p{Punct}", "");
                            System.out.println(" " + Palabralimpia);
                            Inicio = i + 1;
                        }
                    }
                    
                    //for para recorrer la frase una y otra vez para encontrar palabras que sean mayores al limite ingresado
                    System.out.println("Palabras con caracteres mayor al limite: " + Limite);
                    Inicio = 0;
                    
                    for (int i = 0; i < Longitud; i++) {
                        if (Frase.charAt(i) == ' ') {
                            String Palabra = Frase.substring(Inicio, i);
                            String Palabralimpia = Palabra.replaceAll("\\p{Punct}", ""); //aqui se elimina cualquier pleca, coma, punto, signo de pregunta/exlamacion 
                            if (Palabralimpia.length() >= Limite) {
                                System.out.println(" " + Palabralimpia);
                            }
                            Inicio = i + 1;
                        }
                    }
                    
                    break;
                    
                case 3:
                    //Parte de Codigo Enigma
                    System.out.println("codigo enigma");
                    
                    break;
                    
                default:
                    System.out.println("Esa opcion no es valida, por favor ingrese una opcion que sea valida.");
                    break;
            }
                
        } while (Opcion >= 3);
    
    }
    
}
