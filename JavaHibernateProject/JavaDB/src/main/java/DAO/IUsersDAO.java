package DAO;

import Entities.Users;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;
import java.text.ParseException;

public interface  IUsersDAO{
    void Add(Users user);
    void AddMoney(int idUser, double money);
    void RemoveMoney(int idUser, double money);
    void Authentification()throws JsonProcessingException, ParseException;
    void Register();
    void menu();
}