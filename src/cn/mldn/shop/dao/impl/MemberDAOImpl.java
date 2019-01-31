package cn.mldn.shop.dao.impl;

import cn.mldn.shop.dao.IMemberDAO;
import cn.mldn.shop.vo.Member;
import cn.mldn.util.dao.AbstractDAOImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

public class MemberDAOImpl extends AbstractDAOImpl implements IMemberDAO {
    public MemberDAOImpl(Connection conn) {
        super(conn);
    }

    @Override
    public Member findByMid() throws Exception {
        return null;
    }

    @Override
    public boolean doCreate(Member vo) throws Exception {
        String sql = "insert into member(mid,password,code,regdate,status) value(?,?,?,?,?)";
        super.pstm = super.conn.prepareStatement(sql);
        super.pstm.setString(1, vo.getMid());
        super.pstm.setString(2, vo.getPassword());
        super.pstm.setString(3, vo.getCode());
        super.pstm.setTimestamp(4, new Timestamp(vo.getRegdate().getTime()));
        super.pstm.setInt(5, vo.getStatus());
        return super.pstm.executeUpdate() > 0;
    }

    @Override
    public boolean doRemove(Member vo) throws Exception {
        return false;
    }

    @Override
    public boolean doUpdate(Member vo) throws Exception {
        return false;
    }

    @Override
    public boolean doRemoveBatch(Set<String> ids) throws Exception {
        return false;
    }

    @Override
    public Member findById(String id) throws Exception {
        Member vo = null;
        String sql = "select mid,password,name,phone,address,code,status,regdate,photo FROM member where mid=? ";
        super.pstm = super.conn.prepareStatement(sql);
        super.pstm.setString(1, id);
        ResultSet rs = super.pstm.executeQuery();
        if (rs.next()) {
            vo = new Member();
            vo.setMid(rs.getString(1));
            vo.setPassword(rs.getString(2));
            vo.setName(rs.getString(3));
            vo.setPhone(rs.getString(4));
            vo.setAdderss(rs.getString(5));
            vo.setCode(rs.getString(6));
            vo.setStatus(rs.getInt(7));
            vo.setRegdate(rs.getTimestamp(8));
            vo.setPhone(rs.getString(9));

        }
        return vo;
    }

    @Override
    public List<Member> findAll() throws Exception {
        return null;
    }

    @Override
    public List<Member> findAllSplit(Integer currentPage, Integer lineSize) throws Exception {
        return null;
    }

    @Override
    public List<Member> findAllSplit(Integer currentPage, Integer lineSize, String colum, String keyWord) throws Exception {
        return null;
    }

    @Override
    public Integer getAllCount() throws Exception {
        return null;
    }


    public List<Member> findAllSplit(Integer currentPage, Integer lineSize, String colum) throws Exception {
        return null;
    }

    @Override
    public Integer getAllCount(String colum, String keyWord) throws Exception {
        return null;
    }
}
