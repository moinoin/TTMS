package cn.edu.xupt.idao;

import cn.edu.xupt.dao.EmployeeDAO;
import cn.edu.xupt.dao.UserDAO;

public class DAOFactory
{
    public static IEmployee creatEmployeeDAO()
    {
        return new EmployeeDAO();
    }

    public static IUser creatUserDAO()
    {
        return new UserDAO();
    }
}