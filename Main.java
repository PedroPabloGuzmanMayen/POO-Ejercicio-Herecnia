import java.util.Random;
import java.util.Scanner;

public class Main {
    static Boolean condition = true; 
    static Methods_ExInheritance metIn = new Methods_ExInheritance();
    static Library library = new Library();
    static User user;
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
            System.out.println("OPCION 2: Agregar usuario");
            System.out.println("OPCION 3: Pedir prestado un documento");
            System.out.println("OPCION 4: Buscar libro por ID");
            System.out.println("OPCION 5: Verificar la disponibilidad de un documento");
            System.out.println("OPCION 6: Cantidad de objetos de un usuario");
            System.out.println("OPCION 7: Devolver un documento");
            System.out.println("OPCION 8: Cantidad de documentos por materia");
            int opcion = in.nextInt();
            if (opcion == 1){
                metIn.addObjectToLibrary(document, library, in);

            }
            if (opcion == 2){
                metIn.addUser(library, user, in, random);

            }
            if (opcion ==3){
                metIn.BorrowAnObject(library, user, in);
            }
            if (opcion == 4){
                metIn.searchById(library, in);
            }
            if (opcion == 5){
                metIn.getAviability(library, in);

            }
            if (opcion == 6){
                metIn.docsByUser(in, library);
            }
            if (opcion == 7){
                metIn.returnABook(in, user, library);
            }
            if (opcion == 8){
                metIn.docsandMagazinesByType(library, "documentos");
            }
            if( opcion == 9){
                metIn.docsandMagazinesByType(library, "revista");
            }

        }
      
        



    }
}
