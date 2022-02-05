package sql.demo.repository;

import java.sql.SQLException;

public interface TableOperation {
    void createTable() throws SQLException;

    void createForignKeys() throws SQLException;


}
