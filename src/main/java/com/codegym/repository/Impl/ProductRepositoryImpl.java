package com.codegym.repository.Impl;

import com.codegym.model.Product;
import com.codegym.repository.ProductRepository;
import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class ProductRepositoryImpl implements ProductRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Product> findAll() {
        //TypedQuery<Product> query = em.createQuery("select p from Product p", Product.class);
        Query<Product> query = (Query<Product>) em.createNamedQuery("findAllProducts");
        return query.getResultList();
    }

    @Override
    public Product findById(Long id) {
        TypedQuery<Product> query = em.createQuery("SELECT p FROM Product p WHERE p.id like?1", Product.class);
        query.setParameter(1, id);
        try {
            return query.getSingleResult();
        }catch (NoResultException e){
            return null;
        }
    }

    @Override
    public void save(Product model) {

        if(model.getId() != null){
            em.merge(model);
        } else {
            em.persist(model);
        }
    }

    @Override
    public void remove(Long id) {
        Product product = findById(id);
        if(product != null){
            em.remove(product);
        }
    }
}
