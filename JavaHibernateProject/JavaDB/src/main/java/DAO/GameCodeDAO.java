package DAO;
import Entities.Games;
import Entities.GameCode;
import Entities.Users;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import SessionFactory.SessionFactoryUtil;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

public class GameCodeDAO implements IGameCodeDAO{
    private static SessionFactory sessionFactory;
    public GameCodeDAO(){
        sessionFactory = SessionFactoryUtil.getSessionFactory();

    }
    public GameCode BuyGameById(int id){
        Session sesion =sessionFactory.openSession();
        Criteria criteria = sesion.createCriteria(GameCode.class).add((Restrictions.idEq(id));
        GameCode object = criteria.list();
        return  object;
    }
    public void unable(int id){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        GameCode gameCode = session.get(GameCode.class,id);
        session.delete(gameCode);
        transaction.commit();
        session.close();
    }
}