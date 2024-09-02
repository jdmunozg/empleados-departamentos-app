package com.example.bean;

import com.example.model.Empleado;
import com.example.service.EmpleadoService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ManagedBean
@ViewScoped
public class EmpleadoBean {
    private List<Empleado> empleados;
    private Empleado empleado = new Empleado();
    private EmpleadoService empleadoService = new EmpleadoService();

    public List<Empleado> getEmpleados() {
        if (empleados == null) {
            empleados = empleadoService.findAll();
        }
        return empleados;
    }

    public void guardar() {
        if (empleado.getId() == null) {
            empleadoService.create(empleado);
        } else {
            empleadoService.update(empleado);
        }
        empleado = new Empleado();
        empleados = empleadoService.findAll();
    }

    public void eliminar(Empleado empleado) {
        empleadoService.delete(empleado.getId());
        empleados = empleadoService.findAll();
    }

    public void editar(Empleado empleado) {
        this.empleado = empleado;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
