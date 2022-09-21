public class Magazine extends Document {
   private int year;
   private int number;
   public Magazine(String type){
    super(type);
   }
public int getYear() {
    return year;
}
public void setYear(int year) {
    this.year = year;
}
public int getNumber() {
    return number;
}
public void setNumber(int number) {
    this.number = number;
}
}
