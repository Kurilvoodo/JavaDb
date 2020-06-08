import DAO.GameCodeDAO;
import DAO.GamesDAO;
import DAO.UsersDAO;
import DAO.IGameCodeDAO;
import DAO.IGamesDAO;
import DAO.IUsersDAO;
import Entities.GameCode;
import Entities.Games;
import Entities.Users;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.text.ParseException;
import java.util.Scanner;

public class main{
    public static void main(Stringp[] args) throw JsonProcessingException, ParseException{
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to GameKeyCasino:");
        System.out.println("Press 1 - Sign in");
        System.out.println("Press 2 - Sign up");
        System.out.println("Press 3 - Sign out");
        IUsersDAO user = new UsersDAO();
        try {
            switch (input.nextInt()) {
                case 1: {
                    user.Authentification();
                    break;
                }
                case 2: {
                    user.Register();
                    break;
                }
                case 3: {
                    System.exit(0);
                }
            }
        }catch (InputMimatchException e) {
            System.out.println("Wrong param");
        }



        }
    }
}