package cn.edu.xupt.service;

import java.util.ArrayList;
import java.util.List;

import cn.edu.xupt.idao.DAOFactory;
import cn.edu.xupt.idao.IUser;
import cn.edu.xupt.model.User;

public class UserSrv
{
    private IUser userDAO = DAOFactory.creatUserDAO();

    public boolean add(User user)
    {
        return userDAO.insert(user);
    }

    public boolean update(User user)
    {
        return userDAO.update(user);
    }

    public boolean delete(int ID)
    {
        return userDAO.delete(ID);
    }

    public List<User> FetchAll()
    {
        return userDAO.findUserAll();
    }

    public ArrayList<User> findUserByNo(String no)
    {
        return userDAO.findUserByNo(no);
    }

    public User findUserByType(int type)
    {
        return userDAO.findUserByType(type);
    }

}
