package cn.mldn.shop.service.font;

import cn.mldn.shop.vo.Member;

public interface IMemberServiceFont {
    //调用IMemberDAO.findByID
    //调用IMemberDAO.doCreate
    //注册成功返回true,否则返回false
    public boolean regist(Member vo ) throws  Exception;
}
