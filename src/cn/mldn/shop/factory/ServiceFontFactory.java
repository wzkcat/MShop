package cn.mldn.shop.factory;

import cn.mldn.shop.service.font.IMemberServiceFont;
import cn.mldn.shop.service.font.impl.MemberServiceFontImpl;

public class ServiceFontFactory {
    public static IMemberServiceFont getIMemberServiceFontInstance(){
      return  new MemberServiceFontImpl();
    }
}
