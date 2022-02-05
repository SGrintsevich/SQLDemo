package sql.demo.repository;

import java.sql.SQLException;

public class TraidersRepository extends BaseTable implements TableOperation {


    public TraidersRepository() throws SQLException {
        super("traiders");
    }

    @Override
    public void createTable() throws SQLException {
        super.executeSqlStatement("Create Table if not exists traiders(" +
                "id BigInt AUTO_INCREMENT PRIMARY KEY, " +
                "name VARCHAR(255) NOT NULL, " +
                "freqTick INTEGER  NOT NULL, "+
                "cash DECIMAL(15,2)  NOT NULL DEFAULT 1000, " +
                "tradingMethod INTEGER NOT NULL, " +
                "changeProbability INTEGER NOT NULL DEFAULT 50, " +
                "about VARCHAR(255) NULL);", "Создана таблица " + getTableName());

        //super.executeSqlStatement("ALTER TABLE traiders ADD CONSTRAIN check_traiders_tradingMethod CHECK(tradingMethod IN (1,2,3));", "Создан CONSTRAIN для поля tradingMethod таблицы " + getTableName());
        //super.executeSqlStatement("ALTER TABLE traiders ADD CONSTRAIN check_traiders_changeProbability CHECK(changeProbability>0 and changeProbability<100);", "Создан CONSTRAIN для поля changeProbability таблицы " + getTableName());
    }

    @Override
    public void createForignKeys() throws SQLException {

    }
}
