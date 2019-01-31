package cn.mldn.shop.dao;

import cn.mldn.shop.vo.Member;
//public interface IMemberDAO extends  IDAO<String , Member> {
public interface IMemberDAO extends IDAO<String,Member>{
public Member findByMid() throws  Exception;
}
