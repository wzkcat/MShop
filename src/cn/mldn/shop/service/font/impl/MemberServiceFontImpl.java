package cn.mldn.shop.service.font.impl;

import cn.mldn.shop.dbc.DatabaseConnection;
import cn.mldn.shop.factory.DAOFactory;
import cn.mldn.shop.service.font.IMemberServiceFont;
import cn.mldn.shop.vo.Member;

import java.sql.SQLException;

public class MemberServiceFontImpl implements IMemberServiceFont {
    private DatabaseConnection dbc=new DatabaseConnection();

    @Override
    public boolean regist(Member vo) throws Exception {
       try{
           if(DAOFactory.getIMemberDAOInstance(this.dbc.getConnection()).findById(vo.getMid())==null){
           return DAOFactory.getIMemberDAOInstance(this.dbc.getConnection()).doCreate(vo);
           }
           return false;
       }catch (Exception e){
           throw e;
       }finally {
           this.dbc.close();
       }
    }
}
