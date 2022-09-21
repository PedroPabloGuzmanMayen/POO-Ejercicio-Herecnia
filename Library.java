import java.util.ArrayList;

public class Library {
    public ArrayList<Document> Total_objects;

    public Library(){
        Total_objects = new ArrayList<Document>();
    }
    public ArrayList<Document> getTotal_objects() {
        return Total_objects;
    }

    public void setTotal_objects(ArrayList<Document> total_objects) {
        Total_objects = total_objects;
    } 

    
}
