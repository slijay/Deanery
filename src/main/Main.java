package main;

import dao.MySQLDAO;

/**
 * Created by alex on 2/13/17.
 */
public class Main {
    public static void main(String[] args) {
        MySQLDAO mySQLDAO = new MySQLDAO();
//        mySQLDAO.getConnection();
        mySQLDAO.readAuds();
    }
}
