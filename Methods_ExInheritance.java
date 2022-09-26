import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
/**
 * 
 * @author Pedro Pablo Guzman Mayen
 * @version 1.0.0
 *
 */

public class Methods_ExInheritance{
	/**
	 * Este metodo permite que el usuario agregue un nuevo documento a la biblioteca
	 * @param d representa una variable de tipo Document la cual permitira modificar las caracteristicas de un documento dado por el usuario
	 * @param L representa una variable de tipo Library la cual permitira agregar los nuevos documentos a la biblioteca
	 * @param s representa una variable de tipo Scanner la cual permite que se ingresen nuevos datos al programa
	 */
    public void addObjectToLibrary(Document d, Library L, Scanner s){
        System.out.println("De que tipo es el documento que quiere agregar?");
        s.nextLine();
        String docType = s.nextLine();
        docType = docType.toLowerCase();
        while (!docType.equals("libro") && !docType.equals("revista") && !docType.equals("articulo") ){
            System.out.println("Valor invalido, solamente puede ingresar los strings libro, revista o articulo. Intente de nuevo");
            docType = s.nextLine();
            docType = docType.toLowerCase();

        }
        switch(docType) {
            case "libro":
                d = new Book(docType);
                System.out.println("Ingrese el titulo del libro");
                d.setTitle(s.nextLine());
                System.out.println("Ingrese el ID del libro");
                d.setId(s.nextLong());
                s.nextLine();
                System.out.println("Autor del libro:");
                d.setAutor(s.nextLine());
                System.out.println("Editorial del libro:");
                d.setEditorial(s.nextLine());
                System.out.println("Cantidad de ejemplares:"); 
                d.setQuantity(s.nextInt());
                s.nextLine();
                System.out.println("Materia del libro:");
                d.setSubject(s.nextLine());
                L.getDocument_types().add(d.getSubject());


                L.getTotal_objects().add(d);

                break;

            case "revista":
                d = new Magazine(docType);
                System.out.println("Ingrese el titulo de la revista");
                d.setTitle(s.nextLine());
                System.out.println("Ingrese el ID de la revista");
                d.setId(s.nextLong());
                s.nextLine();
                System.out.println("Cantidad de ejemplares:"); 
                d.setQuantity(s.nextInt());
                s.nextLine();
                System.out.println("Materia de la revista");
                d.setSubject(s.nextLine());
                L.getDocument_types().add(d.getSubject());
                L.getMagazine_types().add(d.getSubject());
                System.out.println("Fecha de publicacion de la revista:");
                ((Magazine)d).setYear(s.nextInt());
                s.nextLine();
                System.out.println("Numero de la revista:");
                ((Magazine)d).setNumber(s.nextInt());
                s.nextLine();



                L.getTotal_objects().add(d);

                break;

            case "articulo": 
                d = new Article(docType);
                d = new Book(docType);
                System.out.println("Ingrese el titulo del articulo");
                d.setTitle(s.nextLine());
                System.out.println("Ingrese el ID del articulo");
                d.setId(s.nextLong());
                s.nextLine();
                System.out.println("Autor del articulo:");
                d.setAutor(s.nextLine());
                System.out.println("Cantidad de ejemplares:"); 
                d.setQuantity(s.nextInt());
                s.nextLine();
                System.out.println("Materia del artículo:");
                d.setSubject(s.nextLine());
                L.getDocument_types().add(d.getSubject());


                L.getTotal_objects().add(d);
                
        }

    }
    /**
     * Este metodo permite ingresar un nuevo usuario de la biblioteca
     * @param L representa una variable de tipo Library la cual se encarga de agregar a los nuevos usuarios a la lista de clientes de la biblioteca
     * @param u representa una variable de tipo user la cual permite modificar las caracterisitcas de los usuarios de la biblioteca
     * @param s representa una variable de tipo Scanner la cual permite que se ingresen nuevos datos al programa  
     * @param r representa una variable de tipo random la cual permite asignarle un valor aleatorio al ID del usuario
     */
    public void addUser(Library L, User u, Scanner s, Random r){
        u = new User();
        System.out.println("Agregue un nuevo cliente");
        System.out.println("");
        System.out.println("Ingrese el nombre del cliente");
        s.nextLine();
        u.setName(s.nextLine());
        u.setUserID(r.nextLong(900000)+100000);
        System.out.println("El ID del cliente es el siguiente: " + u.getUserID());
        System.out.println("Ingrese la residencia del cliente");
        u.setLocation(s.nextLine());
        L.getCustomers().add(u);
        System.out.println("Usuario agregado");

    }
    /**
     * Este metodo permite que el usuario pide prestado un objeto de la biblioteca
     * @param L representa una variable de tipo library la cual cambia algunos valores de los documentos disponibles en la biblioteca, tambien sirve para mostrar los documentos disponibles en la biblioteca
     * @param u representa una variable de tipo user la cual permite agregar documentos a la lista de documentos de los usuarios
     * @param s  representa una variable de tipo Scanner la cual permite que se ingresen nuevos datos al programa
     */
    public void BorrowAnObject(Library L, User u, Scanner s){
        System.out.println("Estos son los documentos disponibles en la biblioteca: ");
        for (int i = 0; i<L.getTotal_objects().size(); i++){
            System.out.println(L.getTotal_objects().get(i).getTitle() + " el Id de este titulo es: " +  L.getTotal_objects().get(i).getId() );

        }
        System.out.println("Cual de estos titulos desea pedir prestado. (Indiquelo mediante el ID del titulo)");
        Long answer = s.nextLong();
        for (int i = 0; i<L.getTotal_objects().size(); i++){
            if (L.getTotal_objects().get(i).getId() == answer){
                if(L.getTotal_objects().get(i).getQuantity() == 0){
                    System.out.println("No quedan mas documentos con este Id, otra persona los tomo prestados, vuelva otro dia");
                }
                else{
                    L.getTotal_objects().get(i).setQuantity(L.getTotal_objects().get(i).getQuantity() -1);
                    System.out.println("Ahora que ha seleccionado lo que quiere pedir prestado, indiquenos su ID de usuario");
                    Long answer2 = s.nextLong();
                    for (int j = 0; j<L.getCustomers().size(); i++){
                        if (L.getCustomers().get(j).getUserID() == answer2 && L.getCustomers().get(j).getDocuments().size() < 5 ){
                            L.getCustomers().get(j).getDocuments().add(answer);
                            break;
    
    
                        }
                        else{
                            System.out.println("No tiene mas espacio, devuelva algun otro libro ");
                            break;
                        }
                    }
               
                }
            }
        }
        

    }
    /**
     * Este metodo permite buscar un documento mediante su ID
     * @param L representa una variable de tipo library la cual sirve para buscar los elementos mediante la lista de documentos disponibles en la biblioteca
     * @param s representa una variable de tipo Scanner la cual permite que se ingresen nuevos datos al programa
     */
    public void searchById(Library L, Scanner s){
        System.out.println("Ingrese el ID de la publicacion que quiere encontrar: ");
        long answerID = s.nextLong();
        for (int i = 0; i<L.getTotal_objects().size(); i++){
            if (L.getTotal_objects().get(i).getId() == answerID){
                System.out.println(L.getTotal_objects().get(i).getTitle());
            }

        }

    }
    /**
     * Este metodo permite mostrar la disponibilidad de un objeto en la biblioteca
     * @param L representa una variable de tipo library la cual sirve para buscar los elementos en la biblioteca dado su ID y obtener su disponibilidad
     * @param S representa una variable de tipo Scanner la cual permite que se ingresen nuevos datos al programa
     */
    public void getAviability(Library L, Scanner S){
        System.out.println("Seleccione el Id del libro de cual quiere verificar su disponibilidad:");
        for (int i =0; i<L.getTotal_objects().size(); i++){
            System.out.println(L.getTotal_objects().get(i).getTitle() + " el Id de este titulo es: " + L.getTotal_objects().get(i).getId() );
        }
        System.out.println("Seleccione el libro deseado: ");
        long answer3 = S.nextLong();
        for (int i =0; i<L.getTotal_objects().size(); i++){
            if(L.getTotal_objects().get(i).getId() == answer3){
                System.out.println("Quedan: " + L.getTotal_objects().get(i).getQuantity() + " ejemplares de este titulo");
            }
        }

    }
    /**
     * Este metodo permite mostrar los documentos que tiene un usuario 
     * @param S representa una variable de tipo Scanner la cual permite que se ingresen nuevos datos al programa
     * @param L representa una variable de tipo Library la cual permite obtener a los clientes que cumplan con el ID brindado y obtener el numero de documentos que posee
     */
    public void docsByUser(Scanner S, Library L) {
        System.out.println("Ingrese el ID del cliente del cual quiere saber la cantidad de documentos que posee: ");
        long answer4 = S.nextLong();
        for (int i =0; i<L.getCustomers().size(); i++){
            if(L.getCustomers().get(i).getUserID() == answer4){
                System.out.println("Este usuario tiene: " + L.getCustomers().get(i).getDocuments().size() + " documentos");
            }
        }
    }
    /**
     * Este metodo sirve para que se devuelva un objeto a la biblioteca
     * @param s representa una variable de tipo Scanner la cual permite que se ingresen nuevos datos al programa
     * @param u representa una variable de tipo User la cual permite identificar los documentos que posee un usuario dado su ID
     * @param L representa una variable de tipo Library la cual se encarga de agregar nuevamente el objeto devuelto por el usuario
     */
    public void returnABook(Scanner s, User u, Library L){
        System.out.println("Ingrese su ID: ");
        long answer5 = s.nextLong();
        for (int i =0; i<L.getCustomers().size(); i++){
            if (L.getCustomers().get(i).getUserID() == answer5){
                System.out.println("Los ID de sus documentos son los siguientes, cual quiere regresar (ingrese su ID): ");
                for (int j =0; j<L.getCustomers().get(i).getDocuments().size(); j++){
                    System.out.println(L.getCustomers().get(i).getDocuments().get(j));
                }
                long answer6 = s.nextLong();
                L.getCustomers().get(i).getDocuments().remove(answer6);
                for (int k =0; k<L.getTotal_objects().size(); k++){
                    if(L.getTotal_objects().get(k).getId() == answer6){
                        L.getTotal_objects().get(k).setQuantity(L.getTotal_objects().get(k).getQuantity() +1);
                    }
                }

            }
        }

        
    }
    /**
     * Este metodo permite contar todos los documentos de una materia en especifico disponible en la biblioteca
     * @param L representa una variable de tipo Library la cual se encarga de obtener las ArrayList que contienen las materias de todos los documentos
     * @param s representa una variable de tipo Scanner la cual permite que se ingresen nuevos datos al programa
     */
    public void docsandMagazinesByType(Library L, String s){
        if (s.equals("documentos")){
            docCounter(L.getDocument_types());
        }
        if (s.equals("revista")){
            docCounter(L.getMagazine_types());
        }
       
    }
    /**
     * Este metodo se encarga de contar todas las apariciones de una materia en una lista que contiene los generos y materias de todos los documentos y revistas de la biblioteca
     * @param ar representa el arrayList que contiene los generos y materias de las revistas y documentos
     */
    public void docCounter(ArrayList<String> ar){
        Set<String> docsTypes = new HashSet<String>(ar);
            for(String i: docsTypes){
                System.out.println(i + ": " + Collections.frequency(ar, i));
            }
    }



}