public class User {
    private long userID;
    private String location;
    private String name;
    private Document[] user_document ;
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
    public Document[] getUser_document() {
        return user_document;
    }
    public void setUser_document(Document[] user_document) {
        this.user_document = user_document;
    }

    
    
}
