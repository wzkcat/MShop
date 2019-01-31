package cn.mldn.util.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.Set;

public abstract class AbstractDAOImpl {
    protected Connection conn;
    protected PreparedStatement pstm;

    public AbstractDAOImpl(Connection conn) {
        this.conn = conn;
    }

    //实现数据的批量删除，属于彻底删除
    //table 表名称
    public boolean removeHandle(String table, String colum, Set<?> ids) throws Exception {
        if (ids.size() == 0) {//表示现在没有任何数据
            return false;
        }
        StringBuffer buffer = new StringBuffer();
        buffer.append("DELETE FROM ").append(table).append(" WHERE ").append(colum).append(" IN ( ");
        Iterator<?> iter = ids.iterator();
        while (iter.hasNext()) {
            buffer.append(iter.next()).append(" , ");
        }
        buffer.delete(buffer.length() - 1, buffer.length()).append(" ) ");
        this.pstm = this.conn.prepareCall(buffer.toString());

        return this.pstm.executeUpdate() == ids.size();
    }

    //负责统计数据量，模糊查询，返回指定表的数据量
    public Integer countHandle(String table, String colum, String keyword) throws Exception {
        StringBuffer sql = new StringBuffer();
        sql.append("SELECT COUNT(*) FROM ").append(table).append(" WHERE ").append(colum).append(" LIKE ? ");
        this.pstm = this.conn.prepareStatement(sql.toString());
        this.pstm.setString(1, "%" + keyword + "%");
        ResultSet rs = this.pstm.executeQuery();
        if (rs.next()) {
            return rs.getInt(1);
        }
        return 0;
    }
}
