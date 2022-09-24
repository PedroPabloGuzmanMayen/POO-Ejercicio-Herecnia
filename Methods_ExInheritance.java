import java.util.Random;
import java.util.Scanner;


public class Methods_ExInheritance{

    public void addObjectToLibrary(Document d, Library L, Scanner s){
        System.out.println("De que tipo es el documento que quiere agregar?");
        String docType = s.nextLine();
        docType.toLowerCase();
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
                d.setStatus(true);

                L.getTotal_objects().add(d);
                
        }

    }
    public void addUser(Library L, User u, Scanner s, Random r){
        System.out.println("Agregue un nuevo cliente");
        System.out.println("");
        System.out.println("Ingrese el nombre del cliente");
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
            System.out.println(L.getTotal_objects().get(i).getTitle() + "el Id de este titulo es: " +  L.getTotal_objects().get(i).getId() );

        }
        System.out.println("Cual de estos titulos desea pedir prestado. (Indiquelo medianta el ID del titulo)");
        Long answer = s.nextLong();
        for (int i = 0; i<L.getTotal_objects().size(); i++){
            if (L.getTotal_objects().get(i).getId() == answer){
                L.getTotal_objects().get(i).setQuantity(L.getTotal_objects().get(i).getQuantity() -1);
                System.out.println("Ahora que ha seleccionado lo que quiere pedir prestado, indiquenos su ID de usuario");
                Long answer2 = s.nextLong();
                for (int j = 0; j<L.getCustomers().size(); i++){
                    if (L.getCustomers().get(j).getUserID() == answer2 && L.getCustomers().get(j).getDocuments().size() < 5 ){
                        L.getCustomers().get(j).getDocuments().add(answer2);


                    }
                    else{
                        System.out.println("No tiene mas espacio, devuelva algun otro libro ");
                    }
                }
            }
        }
        

    }


}