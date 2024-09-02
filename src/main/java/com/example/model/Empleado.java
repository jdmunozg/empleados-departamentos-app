package com.example.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String documentoTipo;
    private String documentoNumero;
    private String nombres;
    private String apellidos;
    private String ciudad;
    private String direccion;
    private String correoElectronico;
    private String telefono;
    
    @Column(name = "fecha_hora_crea")
    private LocalDateTime fechaHoraCrea;
    
    @Column(name = "fecha_hora_modifica")
    private LocalDateTime fechaHoraModifica;

    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private Departamento departamento;

    // Constructor vacío
    public Empleado() {}

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocumentoTipo() {
        return documentoTipo;
    }

    public void setDocumentoTipo(String documentoTipo) {
        this.documentoTipo = documentoTipo;
    }

    public String getDocumentoNumero() {
        return documentoNumero;
    }

    public void setDocumentoNumero(String documentoNumero) {
        this.documentoNumero = documentoNumero;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDateTime getFechaHoraCrea() {
        return fechaHoraCrea;
    }

    public void setFechaHoraCrea(LocalDateTime fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
    }

    public LocalDateTime getFechaHoraModifica() {
        return fechaHoraModifica;
    }

    public void setFechaHoraModifica(LocalDateTime fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
    }
    
}
