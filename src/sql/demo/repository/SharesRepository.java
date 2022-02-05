package sql.demo.repository;

import java.sql.SQLException;

public class SharesRepository extends BaseTable implements TableOperation {

    public SharesRepository() throws SQLException {
        super("shares");
    }

    @Override
    public void createTable() throws SQLException {
        super.executeSqlStatement("Create Table if not exists shares(" +
                "id BigInt AUTO_INCREMENT PRIMARY KEY, " +
                "name VARCHAR(255) NOT NULL, " +
                "startPrice DECIMAL(8,2), " +
                "changeProbability INTEGER NOT NULL, " +
                "delta INTEGER NOT NULL);", "Создана таблица " + getTableName());
    }

    @Override
    public void createForignKeys() throws SQLException {

    }
}
