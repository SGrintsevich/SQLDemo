package sql.demo.repository;

import java.sql.SQLException;

public class ShareRatesRepository extends BaseTable implements TableOperation {

    public ShareRatesRepository() throws SQLException {
        super("shareRates");
    }

    @Override
    public void createTable() throws SQLException {
        super.executeSqlStatement("Create Table if not exists share_rates(" +
                "id BigInt AUTO_INCREMENT PRIMARY KEY, " +
                "operDate datetime not null, " +
                "shareId bigint not null, " +
                "rate DECIMAL(15,2) NOT NULL);", "Создана таблица " + getTableName());
    }

    @Override
    public void createForignKeys() throws SQLException {
        super.executeSqlStatement("ALTER TABLE share_rates ADD FOREIGN KEY(shareId) REFERENCES shares(id);", "Создан FOREIGN KEY для таблицы " + getTableName());
    }
}
