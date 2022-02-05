package sql.demo;

import sql.demo.repository.ShareRatesRepository;
import sql.demo.repository.SharesRepository;
import sql.demo.repository.TraiderShareActionRepository;
import sql.demo.repository.TraidersRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StockExchange {

//    public static final String DB_URL = "jdbc:h2:./db/stockExchange";
//    public static final String DB_DRIVER = "org.h2.Driver";
//    public static final String user = "";
//    public static final String password = "";

    public static final String DB_URL = "jdbc:mysql://localhost:3306/university";
    public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String user = "root";
    public static final String password = "inetinet";

    private SharesRepository sharesRepository;
    private ShareRatesRepository shareRatesRepository;
    private TraidersRepository traidersRepository;
    private TraiderShareActionRepository traiderShareActionRepository;

    public StockExchange() throws ClassNotFoundException, SQLException {
        Class.forName(DB_DRIVER);

        this.sharesRepository = new SharesRepository();
        this.shareRatesRepository = new ShareRatesRepository();
        this.traidersRepository = new TraidersRepository();
        this.traiderShareActionRepository = new TraiderShareActionRepository();
    }

    public static void main(String[] args) {
        try {
            StockExchange stockExchange = new StockExchange();
            stockExchange.createTables();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("JDBC драйвер для СУБД не найден!");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("Ошибка SQL !");
        }
    }

    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(DB_URL,user,password);
        System.out.println("Соединение с СУБД выполнено.");

        return connection;
    }

    private void createTables() throws SQLException {
        sharesRepository.createTable();
        shareRatesRepository.createTable();
        shareRatesRepository.createForignKeys();
        traidersRepository.createTable();
        traiderShareActionRepository.createTable();
    }
}