public class Magazine extends Document {
   private int year;
   private int number;
   /**
    * Este metodo se encarga de poner un valor inicial al tipo de documento
    * @param type representa el tipo de documento indicado por el usuario
    */
   public Magazine(String type){
    super(type);
   }
 /**
  * Este metodo se encarga de obtener la fecha de publicacion de la revista
  * @return la fecha de publicacion de la revista
  */
   
public int getYear() {
    return year;
}
/**
 * Este metodo permite modificar o agregar una nueva fecha de publicacion a la revista
 * @param year representa la fecha de publicacion de la revista indicada por el usuario
 */
public void setYear(int year) {
    this.year = year;
}
/**
 * Este metodo se encarga de obtener el numero de la revista
 * @return el numero de la revista
 */
public int getNumber() {
    return number;
}
/**
 * Este metodo permite al usuario modificar a agregar un nuevo numero a la revista
 * @param number el numero de la revista indicado por el usuario
 */
public void setNumber(int number) {
    this.number = number;
}


}
