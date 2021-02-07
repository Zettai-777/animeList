package filmography.dao;

import filmography.models.Title;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/*
    Класс, реализующий DAO интерфейс
 */

@Repository
public class TitleDAOImpl implements TitleDAO{

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    @Override
    @SuppressWarnings("unchecked")
    public List<Title> allTitles() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Title").list();
    }

    @Override
    public void add(Title title) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(title);
    }

    @Override
    public void delete(Title title) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(title);
    }

    @Override
    public void edit(Title title) {
        Session session = sessionFactory.getCurrentSession();
        session.update(title);
    }

    @Override
    public Title getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Title.class, id);
    }
}
