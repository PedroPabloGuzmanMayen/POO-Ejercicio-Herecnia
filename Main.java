import java.util.Random;
import java.util.Scanner;

public class Main {
    static Boolean condition = true; 
    static Methods_ExInheritance metIn = new Methods_ExInheritance();
    static Library library = new Library();
    static User user = new User();
    static Document document;
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();
    
    public static void main(String[] args){
        while(condition = true){
            System.out.println("*** BIBLIOTECA***");
            System.out.println("");
            System.out.println("");
            System.out.println("En este programa usted podra pedir prestado un libro, devolver los libros que tenga y mucho mas ");
            System.out.println("");
            System.out.println("Seleccione lo que quiere hacer");
            System.out.println("OPCION 1: Agregar un documento a la libreria");
            System.out.println("OPCION 2: Pedir prestado un documento");
            int opcion = in.nextInt();
            if (opcion == 1){
                metIn.addObjectToLibrary(document, library, in);

            }
            if (opcion == 2){
                metIn.addUser(library, user, in, random);

            }
            

        }
      
        



    }
}
