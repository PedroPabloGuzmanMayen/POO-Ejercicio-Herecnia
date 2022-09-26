import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;


public class Methods_ExInheritance{

    public void addObjectToLibrary(Document d, Library L, Scanner s){
        System.out.println("De que tipo es el documento que quiere agregar?");
        s.nextLine();
        String docType = s.nextLine();
        docType = docType.toLowerCase();
        while (!docType.equals("libro") && !docType.equals("revista") && !docType.equals("articulo") ){
            System.out.println("Valor invalido, solamente puede ingresar los strings libro, revista o articulo. Intente de nuevo");
            docType = s.nextLine();
            docType.toLowerCase();

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
                d.setStatus(true);

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

                d.setStatus(true);

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
                d.setStatus(true);

                L.getTotal_objects().add(d);
                
        }

    }
    public void addUser(Library L, User u, Scanner s, Random r){
        u = new User();
        System.out.println("Agregue un nuevo cliente");
        System.out.println("");
        System.out.println("Ingrese el nombre del cliente");
        s.nextLine();
        u.setName(s.nextLine());
        u.setUserID(r.nextLong(900000)+100000);
        System.out.println("El ID del cliente es el siguiente: " + u.getUserID());
        System.out.println("Ingrese la dirección del cliente");
        u.setLocation(s.nextLine());
        L.getCustomers().add(u);
        System.out.println("Usuario agregado");

    }

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
                            L.getCustomers().get(j).getDocuments().add(answer2);
                            break;
    
    
                        }
                        else{
                            System.out.println("No tiene mas espacio, devuelva algun otro libro ");
                            continue;
                        }
                    }
               
                }
            }
        }
        

    }
    public void searchById(Library L, Scanner s){
        System.out.println("Ingrese el ID de la publicacion que quiere encontrar: ");
        long answerID = s.nextLong();
        for (int i = 0; i<L.getTotal_objects().size(); i++){
            if (L.getTotal_objects().get(i).getId() == answerID){
                System.out.println(L.getTotal_objects().get(i).getTitle());
            }
            //else{
                //System.out.println("No hay documentos que tengan ese ID");
            //}
        }

    }
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
    public void docsByUser(Scanner S, Library L) {
        System.out.println("Ingrese el ID del cliente del cuál quiere saber la cantidad de documentos que posee: ");
        long answer4 = S.nextLong();
        for (int i =0; i<L.getCustomers().size(); i++){
            if(L.getCustomers().get(i).getUserID() == answer4){
                System.out.println("Este usuario tiene: " + L.getCustomers().get(i).getDocuments().size() + " documentos");
            }
        }
    }
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
    public void docsByType(Library L){
        Set<String> docsTypes = new HashSet<String>(L.getDocument_types());
        for(String i: docsTypes){
            System.out.println(i + ": " + Collections.frequency(L.getDocument_types(), i));
        }

    }
    public void magazinesBySubject (Library L){
        Set<String> docsTypes = new HashSet<String>(L.getMagazine_types());
        for(String i: docsTypes){
            System.out.println(i + ": " + Collections.frequency(L.getMagazine_types(), i));
        }

    }

}