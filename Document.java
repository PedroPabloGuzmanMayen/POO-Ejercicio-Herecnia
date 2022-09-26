/**
 * 
 * @author Pedro Pablo Guzman Mayen
 * @version 1.0.0
 *
 */
abstract class Document {
    protected long id;
    protected String autor;
    protected String title;
    protected String editorial;

    protected int quantity;
    protected String subject;
    protected String type;
/**
 * Este metodo se encarga de cambiar el tipo de documento
 * @param type representa un string el cual debe de indicar el tipo de documento
 */
    public Document(String type){
        this.setType(type);

    }
    /**
     * Este metodo se encarga de obtener el Id del documento
     * @return el id del documento
     */
    public long getId() {
        return id;
    }
    /**
     * Este metodo permite al usuario cambiar el Id de uno de los documentos
     * @param id representa un numero de tipo long el cual debera ser ingresado por el usuario
     */
    public void setId(long id) {
        this.id = id;
    }
    /**
     * Este metodo se encarga de obtener el nombre del autor del documento
     * @return el nombre del autor del documento
     */
    public String getAutor() {
        return autor;
    }
    /**
     * Este metodo le permite al usuario cambiar el nombre del autor del documento
     * @param autor el nombre del autor indicado por el usuario
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    /**
     * Este metodo se encarga de obtener el titulo de un documento
     * @return el titulo del documento
     */
    public String getTitle() {
        return title;
    }
    /**
     * Este metodo permite modificar el titulo de un documento
     * @param title representa el titulo del documento indicado por el usuario
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /** 
     * Este metodo se encarga de obtener el nombre de la editorial de un documento
     * @return el nombre de la editorial del documento
     */
    public String getEditorial() {
        return editorial;
    }
    /**
     * Este metodo permite modificar el nombre de la editorial de un documento
     * @param editorial representa el nombre de la editorial indicado por el usuario
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    /**
     * Este metodo se encarga de obtener la cantidad de documentos de un tipo disponibles en la biblioteca
     * @return el numero de documento de un tipo disponibles 
     */
 
    public int getQuantity() {
        return quantity;
    }
  /**
   * Este metodo permite modificar el la cantidad de documentos disponibles de un tipo en especifico 
   * @param quantity representa la cantidad de documentos disponibles indicados por el usuario
   */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    /**
     * Este metodo se encarga de obtener el genero o materia de un documento
     * @return el genero o materia del documento
     */
    public String getSubject() {
        return subject;
    }
    /**
     * Este metodo permite cambiar el genero o materia de un documento
     * @param subject representa la materia o genero del documento indicada por el usuario
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
    /**
     * Este metodo permite obtener el tipo de un documento
     * @return el tipo de documento
     */
    public String getType() {
        return type;
    }
    /**
     * Este metodo permite modificar el tipo de un documento
     * @param type representa el tipo de documento indicado por el usuario
     */
    public void setType(String type) {
        this.type = type;
    } 


}
