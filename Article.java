/**
 * 
 * @author Pedro Pablo Guzman Mayen
 * @version 1.0.0
 *
 */
public class Article extends Document{
    private String referee;
    /**
     * Este metodo se encarga de poner un valor inicial al tipo de documento
     * @param type representa el tipo de documento indicado por el usuario
     */
    public Article(String type){
        super(type);
    }
    /**
     * Este metodo se encarga de obtener el nombre del arbitro del articulo
     * @return el nombre del arbitro del articulo
     */
    public String getReferee() {
        return referee;
    }
    /**
     * Este metodo permite modificar el nombre del arbitro del articulo
     * @param referee representa el nombre del arbitro indicado por el usuario
     */
    public void setReferee(String referee) {
        this.referee = referee;
    }

}