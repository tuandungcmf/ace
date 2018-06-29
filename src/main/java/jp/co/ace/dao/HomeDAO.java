package jp.co.ace.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jp.co.ace.entities.Home;

@Repository(value = "homeDAO")
@Transactional(rollbackFor = Exception.class)
public class HomeDAO {
	
	@PersistenceContext
    private EntityManager entityManager;
	
	@Autowired
	private SessionFactory sessionFactory;

	public void save(final Home home) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(home);
	}

	public void update(final Home home) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(home);
	}
	
	public void persist(final Home home) {
	    entityManager.persist(home);
	 }
	
	public Home findById(final int id) {
	    return entityManager.find(Home.class, id);
	}
	public void delete(final Home home) {
	    entityManager.remove(home);
	}
	public List<Home> findAll() {
	    return entityManager.createQuery("FROM house_detail", Home.class).getResultList();
	}
	
	
}
