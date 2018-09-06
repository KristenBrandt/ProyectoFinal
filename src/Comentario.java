public class Comentario {

    private String texto;
    private String fecha;
    private float puntaje;
    private String usuario;
    private Boolean esRespuesta;

    public Comentario(String texto, String fecha,  String usuario, Boolean esRespuesta) {

        this.texto = texto;
        this.fecha = fecha;
        this.puntaje = 0;
        this.usuario = usuario;
        this.esRespuesta = esRespuesta;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getFecha() {
        return fecha;
    }


    public float getPuntaje() {
        return puntaje;
    }


    public String getUsuario() {
        return usuario;
    }


    public Boolean getEsRespuesta() {
        return esRespuesta;
    }


    public void like(){
        puntaje++;
    }

    public void dislike(){
        puntaje--;
        if(puntaje < 0){
            puntaje = 0;
        }
    }
}
