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
        
        Scanner lea= new Scanner(System.in);
        lea.useDelimiter("\n");
        
        
        //Parte de cifrado ceasar
        
        
        //Recurso de referencia
        String abecedarioUp= "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String abecedarioLow= "abcdefghijklmnñopqrstuvwxyz";
        
        String texto_cifrado=" ";
        
       
        //Ingreso de frase inicial
        System.out.println("Ingrese una frase: ");
        String frase=lea.next();
       
        
        //Ingreso de indice de salto
        System.out.println("Ingrese el indice de salto: ");
        int indexSalto= lea.nextInt();
        
        int fraselength=frase.length();
        
        //Ciclo recorredor de frase
        int i;
        for(i=0; i<=(fraselength-1); i++){
            char letra=frase.charAt(i);
            
            //Letra en mayuscula para poder comparar con abecedario de referencia
            char letraUP= Character.toUpperCase(letra);
         
            //Variable que referencia la posicion en el abecedario
            int pos= abecedarioUp.indexOf(letraUP);
            
            //pos==-1 en caso que no coincida con ninguna de las letras del abecedario
            if(pos==-1){
                texto_cifrado+=letra;
            }else{
                //Pruebas ifs para comprobar si la letra es mayuscula o minuscula
                if(letra==letraUP){
                    texto_cifrado+=abecedarioUp.charAt((pos+indexSalto)%27);
                }else{
                    texto_cifrado+=abecedarioLow.charAt((pos+indexSalto)%27);
                }
                
            }
            
        }//fin for
        System.out.println("Texto Cifrado: "+texto_cifrado);
        
        
        //Codigo enigma
       
 
        String mitadpar="";
        String mitadimpar="";
        int lengthImpar=0;
        int lengthPar=0;
        boolean continuar=false;
        
        while(continuar!=true){
          System.out.println("***Menu de Opciones***");
          System.out.println("1.Encriptar texto"+"\n2.Desencriptar texto"+"\n3.Regresar");
          
          int opcion=lea.nextInt();

          switch(opcion){
              
             case 1:
              System.out.println("Ingrese el texto que desea encriptar: ");
              String texto=lea.next();
              
              int textolength=texto.length();
              
          
             //Contadores de posiciones
             int poseven;
             int posodd;
             
             
             
             //Ciclo para mitad en posiciones pares
              for(poseven=0; poseven<=(textolength-1); poseven+=2){
                 char letra= texto.charAt(poseven);
                 if(letra==' '){
                     //No ocurre nada
                 }else{
                     mitadpar+=letra;
                     lengthPar++;
                 }
                 
              }
             
              System.out.println(mitadpar);
              //Ciclo para mitad en posiciones impares
              for(posodd=1; posodd<=(textolength-1); posodd+=2){
                  char letra= texto.charAt(posodd);
                  if(letra==' '){
                      //No ocurre nada
                  }else{
                     mitadimpar+=letra; 
                     lengthImpar++;
                  }
                  
              }
              System.out.println(mitadimpar);
              
              String texto_enigma=mitadpar+mitadimpar;
              
              System.out.println("El texto codificado es: "+texto_enigma);
              break;
              
           case 2:
              System.out.println("Se ha ingresado el proceso para desencriptar");
              int j;
              //LengthMayor evalua cual grupo tiene la mayor cantidad de caracteres
              int lengthMayor=0;
              if(lengthPar>lengthImpar){
                  lengthMayor=lengthPar;
              }else{
                  lengthMayor=lengthImpar;
              }
        
             
              String mensajedecoded=" ";
               
              for(j=0; j<lengthImpar; j++){
                  
                  char letrapar= mitadpar.charAt(j);
                  mensajedecoded+=letrapar;
                  char letraimpar=mitadimpar.charAt(j);
                  mensajedecoded+=letraimpar;
                  
              }
              System.out.println("Palabra decodificada: " +mensajedecoded);
              
              break;
              
           case 3:
               System.out.println("Sale de la parte encriptar");
               continuar=true;
              break;
              
          }
          
          
        }
        
        
        
        
    }
}
    

