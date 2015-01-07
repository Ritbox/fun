package co.ritbox.model.dto;

import java.util.Date;

public class ListaDto {
    public ListaDto() {
        super();
    }
    
    private Long _id;
    private ListaDto _padre;
    private String _codigo;
    private String _nombre;
    private Date _fechaCreacion;
    private String _usuarioCreacion;
    private Date _fechaActualizacion;
    private String _usuarioActualizacion;

    public Long getId() {
        return _id;
    }

    public void setId(Long id) {
        _id = id;
    }

    public ListaDto getPadre() {
        return _padre;
    }

    public void setPadre(ListaDto padre) {
        _padre = padre;
    }

    public String getCodigo() {
        return _codigo;
    }

    public void setCodigo(String codigo) {
        _codigo = codigo;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String nombre) {
        _nombre = nombre;
    }

    public Date getFechaCreacion() {
        return _fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        _fechaCreacion = fechaCreacion;
    }

    public String getUsuarioCreacion() {
        return _usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        _usuarioCreacion = usuarioCreacion;
    }

    public Date getFechaActualizacion() {
        return _fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        _fechaActualizacion = fechaActualizacion;
    }

    public String getUsuarioActualizacion() {
        return _usuarioActualizacion;
    }

    public void setUsuarioActualizacion(String usuarioActualizacion) {
        _usuarioActualizacion = usuarioActualizacion;
    }
}
