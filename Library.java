import java.util.ArrayList;

public class Library {
    public ArrayList<Document> Total_objects;
    public ArrayList<User> Customers; 

    public Library(){
        Total_objects = new ArrayList<Document>();
        Customers = new ArrayList<User>();
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
    
    
}
