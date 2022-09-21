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
        }

    }


}