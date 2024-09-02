package com.example.bean;

import com.example.model.Departamento;
import com.example.service.DepartamentoService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ManagedBean
@ViewScoped
public class DepartamentoBean {
    private List<Departamento> departamentos;
    private Departamento departamento = new Departamento();
    private DepartamentoService departamentoService = new DepartamentoService();

    public List<Departamento> getDepartamentos() {
        if (departamentos == null) {
            departamentos = departamentoService.findAll();
        }
        return departamentos;
    }

    public void guardar() {
        if (departamento.getId() == null) {
            departamentoService.create(departamento);
        } else {
            departamentoService.update(departamento);
        }
        departamento = new Departamento();
        departamentos = departamentoService.findAll();
    }

    public void eliminar(Departamento departamento) {
        departamentoService.delete(departamento.getId());
        departamentos = departamentoService.findAll();
    }

    public void editar(Departamento departamento) {
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
