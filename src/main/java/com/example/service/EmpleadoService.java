package com.example.service;

import com.example.model.Empleado;
import com.example.util.JPAUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class EmpleadoService {
    private EntityManager em = JPAUtil.getEntityManager();

    public List<Empleado> findAll() {
        return em.createQuery("SELECT e FROM Empleado e", Empleado.class).getResultList();
    }

    public void create(Empleado empleado) {
        em.getTransaction().begin();
        em.persist(empleado);
        em.getTransaction().commit();
    }

    public void update(Empleado empleado) {
        em.getTransaction().begin();
        em.merge(empleado);
        em.getTransaction().commit();
    }

    public void delete(Long id) {
        Empleado empleado = em.find(Empleado.class, id);
        if (empleado != null) {
            em.getTransaction().begin();
            em.remove(empleado);
            em.getTransaction().commit();
        }
    }
}
