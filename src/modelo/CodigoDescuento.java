package modelo;

public class CodigoDescuento extends Publicacion{
    private String codigo;

    public CodigoDescuento(String titulo, String descripcion, String fechaInicio, String fechaFin, int puntuacion, EstadoPublicacion estado, String codigo, Categoria categoria) {
        super(titulo, descripcion, fechaInicio, fechaFin, puntuacion, estado, categoria);
        this.codigo = codigo;
    }
}
