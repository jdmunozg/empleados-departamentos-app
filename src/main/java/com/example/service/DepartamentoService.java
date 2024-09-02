package com.example.service;

import com.example.model.Departamento;
import com.example.util.JPAUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class DepartamentoService {
    private EntityManager em = JPAUtil.getEntityManager();

    public List<Departamento> findAll() {
        return em.createQuery("SELECT d FROM Departamento d", Departamento.class).getResultList();
    }

    public void create(Departamento departamento) {
        em.getTransaction().begin();
        em.persist(departamento);
        em.getTransaction().commit();
    }

    public void update(Departamento departamento) {
        em.getTransaction().begin();
        em.merge(departamento);
        em.getTransaction().commit();
    }

    public void delete(Long id) {
        Departamento departamento = em.find(Departamento.class, id);
        if (departamento != null) {
            em.getTransaction().begin();
            em.remove(departamento);
            em.getTransaction().commit();
        }
    }
}
