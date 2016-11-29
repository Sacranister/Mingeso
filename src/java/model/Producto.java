package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Collection;

/**
 *
 * Clase de persistencia para producto.
 * 
 **/

@Entity
@Table(name="producto")
@NamedQuery(name="Producto.findAll", query="SELECT a FROM Producto a")
public class Producto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="id", unique=true, nullable=false)
    private int id;

    @Column(name="nombre_producto", nullable=false, length=255)
    private String nombreProducto;

    @Column(name="descripcion", nullable=false, length=255)
    private String descripcion;

    @Column(name="ciudad")
    private String ciudad;

    @Column(name="telefono_anunciante")
    private String telefono;

    @Column(name="nombre_anunciante")
    private String nombreAnunciante;

    @Column(name="codigo_producto")
    private String codigoProducto;

    public Producto() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return this.nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombreAnunciante() {
        return this.nombreAnunciante;
    }

    public void setNombreAnunciante(String nombreAnunciante) {
        this.nombreAnunciante = nombreAnunciante;
    }

    public String getCodigoProducto() {
        return this.codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

}