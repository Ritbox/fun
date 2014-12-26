package co.ritbox.model.entities;

import java.io.Serializable;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
  @NamedQuery(name = "FunLista.findAll", query = "select o from FunLista o")
})
@Table(name = "FUN_LISTA")
public class FunLista implements Serializable {
    @Column(nullable = false, length = 20)
    private String codigo;
    @Column(name="FECHA_ACTUALIZACION")
    private Timestamp fechaActualizacion;
    @Column(name="FECHA_CREACION", nullable = false)
    private Timestamp fechaCreacion;
    @Id
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false, length = 50)
    private String nombre;
    @Column(name="USUARIO_ACTUALIZACION", length = 20)
    private String usuarioActualizacion;
    @Column(name="USUARIO_CREACION", nullable = false, length = 20)
    private String usuarioCreacion;

    public FunLista() {
    }

    public FunLista(String codigo, Timestamp fechaActualizacion,
                    Timestamp fechaCreacion, Long id, String nombre,
                    String usuarioActualizacion, String usuarioCreacion) {
        this.codigo = codigo;
        this.fechaActualizacion = fechaActualizacion;
        this.fechaCreacion = fechaCreacion;
        this.id = id;
        this.nombre = nombre;
        this.usuarioActualizacion = usuarioActualizacion;
        this.usuarioCreacion = usuarioCreacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Timestamp getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Timestamp fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuarioActualizacion() {
        return usuarioActualizacion;
    }

    public void setUsuarioActualizacion(String usuarioActualizacion) {
        this.usuarioActualizacion = usuarioActualizacion;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }
}
