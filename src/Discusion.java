import java.util.ArrayList;

public class Discusion {
    private String nombre;
    private ArrayList<String> comentarios;
    private ArrayList<String> tags;
    private int cantComentarios;

    public Discusion(String nombre, ArrayList<String> comentarios, ArrayList<String> tags, int cantComentarios) {
        this.nombre = nombre;
        this.comentarios = comentarios;
        this.tags = tags;
        this.cantComentarios = cantComentarios;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public int getCantComentarios() {
        return cantComentarios;
    }

    public void setCantComentarios(int cantComentarios) {
        this.cantComentarios = cantComentarios;
    }

    //TODO
    // se puede responder a un comentario
    // se puede hacer un comentario nuevo
}

