package sql.demo.repository;

import java.sql.SQLException;

public class TraiderShareActionRepository  extends BaseTable implements TableOperation{

    public TraiderShareActionRepository() throws SQLException {
        super("TraiderShareAction");
    }

    @Override
    public void createTable() throws SQLException {
        super.executeSqlStatement("Create Table if not exists TraiderShareAction(" +
                "id BigInt AUTO_INCREMENT PRIMARY KEY, " +
                "operation INTEGER  NOT NULL, "+
                "traider_id INTEGER NOT NULL, " +
                "share_rate_id INTEGER NOT NULL, " +
                "amount DECIMAL(15,2)  NOT NULL);", "Создана таблица " + getTableName());
    }

    @Override
    public void createForignKeys() throws SQLException {

    }
}
