package cn.mldn.shop.dao;

import cn.mldn.shop.vo.Member;


import java.util.List;
import java.util.Set;

public interface IDAO<K,V> {
    public boolean doCreate(Member vo) throws  Exception;
    public  boolean doRemove(Member vo) throws  Exception;
    public boolean doUpdate(Member vo) throws  Exception;
    public  boolean doRemoveBatch(Set<String > ids ) throws  Exception;
    public  Member findById(String id) throws  Exception;
    public List<Member> findAll() throws  Exception;
   /**数据的分页显示处理
      @param currentPage 当前所在页
      @param lineSize 每页显示的数据行数
      @return 会返回多个Member对象，将以List的集合形式返回。
      如果表中没有数据则返回的List集合长度为0（size() == 0）
      @throws Exception 数据库未连接，或者数据库操作错误
     */
   public List<Member> findAllSplit(Integer currentPage,Integer lineSize) throws Exception ;
    /**
     * 数据的分页查询显示处理
     * @param column 需要进行查询的数据列
     * @param keyWord 要查询的关键字，如果关键字为空字符串表示查询全部
     * @param currentPage 当前所在页
     * @param lineSize 每页显示的数据行数
     * @return 会返回多个Member对象，将以List的集合形式返回。
     * 如果表中没有数据则返回的List集合长度为0（size() == 0）
     * @throws Exception 数据库未连接，或者数据库操作错误
     */
    public List<Member> findAllSplit(Integer currentPage,Integer lineSize,String colum,String keyWord) throws  Exception ;
    public Integer getAllCount() throws Exception ;
    public Integer getAllCount(String colum,String keyWord) throws  Exception;
}
