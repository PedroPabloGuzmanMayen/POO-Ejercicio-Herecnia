public class Article extends Document{
    private String referee;
    public Article(String type){
        super(type);
    }
    public String getReferee() {
        return referee;
    }
    public void setReferee(String referee) {
        this.referee = referee;
    }

}