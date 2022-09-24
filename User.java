import java.util.ArrayList;

public class User {
    private long userID;
    private String location;
    private String name;
    private ArrayList<Long> documents; 
    public User(){
        documents = new ArrayList<Long>();
    }
    public long getUserID() {
        return userID;
    }
    public void setUserID(long userID) {
        this.userID = userID;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Long> getDocuments() {
        return documents;
    }
    public void setDocuments(ArrayList<Long> documents) {
        this.documents = documents;
    }


    
    
}
