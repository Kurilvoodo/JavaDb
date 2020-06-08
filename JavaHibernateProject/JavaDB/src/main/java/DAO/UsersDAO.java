package DAO;

import Entities.*;
import Entities.Process;
import SessionFactory.SessionFactoryUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class UsersDAO implements IUsersDAO{
    private SessionFactory sessionFactory;
    public UsersDAO(){
        IGamesDAO gamesDAO = new GamesDAO();
        IGameCodeDAO gameCodeDAO = new GamesCodeDAO();
    }
    public void Authentification() throws JsonProcessingException, ParseException{
        private Scanner input = new Scanner(System.in);
        System.out.prinln("Login");
        String login = in.nextLine();
        System.out.println("Password");
        int passwordHashCode = in.nextLine().hashCode();
        if(this.existUsers(login,passwordHashcode).size()>0) {
        this.menu()
        }else {
        System.out.println("Wrong login/pass");
        this.Authentification();
        }
        }
    public void menu()throws JsonProcessingException, ParseException{
        System.out.println("Enter number to choose fucntion");
        System.out.println("1 Show all games");
        System.out.println("2 Spin the roulette");
        System.out.println("3 buy certain game");
        System.out.println("4 back to login screen");
        Scanner input = new Scanner(System.in);
        try{
            switch(in.nextInt()){
                case 1: {
                    List<Games> gamesList = gamesDao.GetAllGames();
                    for(Games game : gamesList){
                        String json = new ObjectMapper().writerWithDefaultPrettyPrinter().writevalueAsString(game);
                        System.out.println(json);
                    }
                    this.menu();
                    System.out.println("Game Name");
                    in.
                    break;
                }
                case 2: {
                    this.RemoveMoney(this.GetIdUser(),200);
                    String json =  new ObjectMapper().writerWithDefaultPrettyPrinter().writevalueAsString(gamesDAO.SpinTheRoulette());
                    System.out.println(json);
                    break;
                }
                case 3:{
                    System.out.println("Choose Id of the game you'd like to buy");
                    int entered = input.nextInt();
                    gamesDAO.BuyGameById(entered);
                    GameCodeDAO.unable(entered);

                    Games game = gamesDAO.GetGameById(entered);
                    String json = new ObjectMapper().writerWithDefaultPrettyPrinter().writevalueAsString(GameCodeDAO.BuyGameById(game.GetIdGame()));
                    System.out.println(json);
                    break;

                }
                case 4:{

                    break;
                }
            }
        }

    }
    public void AddMoney(int userid, double money){
        //session factory for increment bill of user byt user's id
    }
    public void RemoveMoney(int userid, double money){
        //Session factory for decrement money from user by id
    }
    public List<Users> existUsers(String login, int password){
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Users.class).add(Restrictions.eq("login",login));
        criteria.add(Restrictions.eq("password",password));
        List<Users> usersList = criteria.list();
        return  usersList;
    }
    public void Register(){
        private Scanner input = new Scanner(System.in);
        System.out.printlm("Write your username:");
        String login = input.nextLine();
        Syste.out.println("Write your password:");
        int passwordHashCode = input.nextLine().hashCode();
        Sessin session = sessionFactory.openSession();
        Transaction trans = session.beginTransaction();
        session.save(new Users(login,passwordHashCode));
        transaction.commit();
        session.close();
        this.menu();
    }
    public void AddUser(User user){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }
}