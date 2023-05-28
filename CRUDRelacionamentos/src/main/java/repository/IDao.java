package repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public interface IDao<T> {

    public String getInsertSQL();

    public String getUpdateSQL();

    public String getSelectAllSQL();

    public String getSelectByIdSQL();

    public void createInsertOrUpdateSQL(PreparedStatement pstmt, T e);

    public Long saveOrUpdate(T e);

    public T selectById(Long id);

    public List<T> selectAll();

    public T extractObject(ResultSet resultSet);

    public List<T> extractObjects(ResultSet resultSets);
}
