import java.util.ArrayList;

public class Library {
    public ArrayList<Document> Total_objects;
    public ArrayList<User> Customers; 
    public ArrayList<String> document_types;
    public ArrayList<String> magazine_types;

    public Library(){
        Total_objects = new ArrayList<Document>();
        Customers = new ArrayList<User>();
        document_types = new ArrayList<String>();
        magazine_types = new ArrayList<String>();
    }
    public ArrayList<Document> getTotal_objects() {
        return Total_objects;
    }

    public void setTotal_objects(ArrayList<Document> total_objects) {
        Total_objects = total_objects;
    }
    public ArrayList<User> getCustomers() {
        return Customers;
    }
    public void setCustomers(ArrayList<User> customers) {
        Customers = customers;
    }
    public ArrayList<String> getDocument_types() {
        return document_types;
    }
    public void setDocument_types(ArrayList<String> document_types) {
        this.document_types = document_types;
    }
    public ArrayList<String> getMagazine_types() {
        return magazine_types;
    }
    public void setMagazine_types(ArrayList<String> magazine_types) {
        this.magazine_types = magazine_types;
    } 
    
    
    
}
