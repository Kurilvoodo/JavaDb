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

public class GamesDAO implements IGamesDAO {
    private static SessionFactory sessionFactory;

    public GamesDAO() {
        sessionFactory = SessionFactoryUtil.getSessionFactory();
    }

    public void addGame(Games games) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(games);
        transaction.commit();
        session.close();
    }

    public List<Games> getAllGames(){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.begintransaction();
        List <Games> gamesList = new ArrayList<Games>(
                session.createQuery("from Games").List());
        session.getTransaction.commit();
        return gamesList;
    }

    Games GetGameById(int idGame);
    GamesCode BuyGameById(Games game, int idUser){

    }
    List<Games> GetGameByType(int type);
    public GameCode SpinTheRoulette(){
        IGameCodeDAO gameCodeDAO = new GameCodeDAO();
        final Random random = new Random();
        return gameCodeDAO.BuyGameById(random.nextInt(20));

    }


}