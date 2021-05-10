package modelo;

public class Comentario {
    private String contenido;
    private String nicknameComentador;

    public Comentario(String contenido, String nicknameComentador) {
        this.contenido = contenido;
        this.nicknameComentador = nicknameComentador;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getNicknameComentador() {
        return nicknameComentador;
    }

    public void setNicknameComentador(String nicknameComentador) {
        this.nicknameComentador = nicknameComentador;
    }
}
