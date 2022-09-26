
import java.util.ArrayList;
/**
 * 
 * @author Pedro Pablo Guzman Mayen
 * @version 1.0.0
 */

public class Library {
    public ArrayList<Document> Total_objects;
    public ArrayList<User> Customers; 
    public ArrayList<String> document_types;
    public ArrayList<String> magazine_types;
    /**
     * Este metodo se encarga de crear nuevos objetos de los arrayList pertenecientes a la clase
     */
    public Library(){
        Total_objects = new ArrayList<Document>();
        Customers = new ArrayList<User>();
        document_types = new ArrayList<String>();
        magazine_types = new ArrayList<String>();
    }
    /**
     * Este metodo se encarga de obtener el arrayList que almacena todos los documentos de la biblioteca
     * @return el arrayList con los documentos disponibles en la biblioteca
     */
    public ArrayList<Document> getTotal_objects() {
        return Total_objects;
    }
    /**
     * Este metodo permite modificar el arrayList con los documentos de la biblioteca
     * @param total_objects representa el arrayList modificado por el usuario
     */

    public void setTotal_objects(ArrayList<Document> total_objects) {
        Total_objects = total_objects;
    }
    /**
     * Este metodo se encarga de obtener el arrayList que contiene a todos los clientes de la biblioteca
     * @return el arrayList que contiene a todos los clientes de la biblioteca
     */
    public ArrayList<User> getCustomers() {
        return Customers;
    }
    /**
     * Este metodo permite modificar el ArrayList de los clientes de la biblioteca 
     * @param customers representa el ArrayList de los clientes que debe modificarse
     */
    public void setCustomers(ArrayList<User> customers) {
        Customers = customers;
    }
    /**
     * Este metodo se encarga de obtener la lista que contiene todos los generos y materias de los documentos de la biblioteca
     * @return la lista que contiene todos los generos y materias de los documentos de la biblioteca
     */
    public ArrayList<String> getDocument_types() {
        return document_types;
    }
    /**
     * Este metodo permite modificar el ArrayList de los tipos de documentos existentes en la biblioteca 
     * @param document_types representa el ArrayList que debe ser modificado
     */
    public void setDocument_types(ArrayList<String> document_types) {
        this.document_types = document_types;
    }
    /**
     * Este metodo obtiene el ArrayList que contiene todos los generos y materias de las revistas disponibles en la biblioteca
     * @return el ArrayList que contiene todos los generos y materias de las revistas disponibles en la biblioteca
     */
    public ArrayList<String> getMagazine_types() {
        return magazine_types;
    }
    /**
     * Este metodo ppermite modificar el ArrayList de los tipos de revistas existentes en la biblioteca 
     * @param magazine_types representa el ArrayList que debe ser modificado
     */
    public void setMagazine_types(ArrayList<String> magazine_types) {
        this.magazine_types = magazine_types;
    } 
    
    
    
}
