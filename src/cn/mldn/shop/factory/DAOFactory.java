package cn.mldn.shop.factory;

import cn.mldn.shop.dao.IMemberDAO;
import cn.mldn.shop.dao.impl.MemberDAOImpl;

import java.sql.Connection;

public class DAOFactory {
    public static IMemberDAO getIMemberDAOInstance(Connection conn){
        return  new MemberDAOImpl(conn);
    }
}
