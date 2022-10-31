package com.axonactive;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@ApplicationScoped
public class BillDAOImpl {
    @PersistenceContext(name = "k8s")
    EntityManager em;

    public List<BillEntity> getAll(){
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<BillEntity> query= cb.createQuery(BillEntity.class);
        Root<BillEntity> bill = query.from(BillEntity.class);

        return em.createQuery(query.select(bill)).getResultList();
    }

    public BillEntity findById (Integer id){
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<BillEntity> query= cb.createQuery(BillEntity.class);
        Root<BillEntity> bill = query.from(BillEntity.class);

        return em.createQuery(query.select(bill).where(cb.equal(bill.get("id"),id))).getSingleResult();
    }
}
