public class Usuario {

    private String nombre;
    private String password;
    private Float puntaje;
    private Integer comentario;

    public Usuario(String nombre, String password, Float puntaje, Integer comentario) {
        this.nombre = nombre;
        this.password = password;
        this.puntaje = puntaje;
        this.comentario = comentario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Float getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Float puntaje) {
        this.puntaje = puntaje;
    }

    public Integer getComentario() {
        return comentario;
    }

    public void setComentario(Integer comentario) {
        this.comentario = comentario;
    }
    // TODO
    // el usuario puede crear una discusion

    // el usuario puede cambiar su contraseña
}
