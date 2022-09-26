import java.util.ArrayList;
/**
 * 
 * @author Pedro Pablo Guzman Mayen
 *
 */
public class User {
    private long userID;
    private String location;
    private String name;
    private ArrayList<Long> documents; 
    /**
     * Este metodo se encarga de crear un nuevo objeto del ArrayList que contiene los documentos de cada usuario cada vez que la clase sea invocada
     */
    public User(){
        documents = new ArrayList<Long>();
    }
    /**
     * Este metodo se encarga de obtener el ID del usuario
     * @return el ID del usuario
     */
    public long getUserID() {
        return userID;
    }
    /**
     * Este metodo permite modificar el ID del usuario
     * @param userID representa el ID modificado
     */
    public void setUserID(long userID) {
        this.userID = userID;
    }
    /**
     * Este metodo permite obtener la direccion del usuario
     * @return la direccion del usuario
     */
    public String getLocation() {
        return location;
    }
    /**
     * Este metodo permite asignarle un nuevo valor a la variable que contiene la direccion del usuario
     * @param location representa la direccion modificada
     */
    public void setLocation(String location) {
        this.location = location;
    }
    /**
     * Este metodo permite obtener el nombre del usuario
     * @return el nombre del usario
     */
    public String getName() {
        return name;
    }
    /**
     * Este metodo permite asignarle un nuevo valor a la variable que contiene el nombre del usuario
     * @param name representa el nombre del usuario modificado
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Este metodo obtiene el ArrayList que contiene los documentos que posee el usuario
     * @return el ArrayList que contiene los documentos que posee el usuario
     */
    public ArrayList<Long> getDocuments() {
        return documents;
    }
    /**
     * Este metodo permite asignarle un nuevo valor el ArrayList que contiene los documentos del usuario indicado 
     * @param documents representa el ArrayList de los documentos del usuario modificado
     */
    public void setDocuments(ArrayList<Long> documents) {
        this.documents = documents;
    }


    
    
}
