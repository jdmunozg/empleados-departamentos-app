package com.example.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String departamentoCodigo;
    private String departamentoNombre;
    
    @Column(name = "fecha_hora_crea")
    private LocalDateTime fechaHoraCrea;
    
    @Column(name = "fecha_hora_modifica")
    private LocalDateTime fechaHoraModifica;

    @OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL)
    private List<Empleado> empleados;

    // Constructor vacío
    public Departamento() {}

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartamentoCodigo() {
        return departamentoCodigo;
    }

    public void setDepartamentoCodigo(String departamentoCodigo) {
        this.departamentoCodigo = departamentoCodigo;
    }

    public String getDepartamentoNombre() {
        return departamentoNombre;
    }

    public void setDepartamentoNombre(String departamentoNombre) {
        this.departamentoNombre = departamentoNombre;
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
