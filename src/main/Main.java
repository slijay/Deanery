package main;

import dao.MySQLDAO;
import ui.Menu;

import javax.swing.*;

/**
 * Created by alex on 2/13/17.
 */
public class Main {
    public static void main(String[] args) {
        new Menu();
        MySQLDAO mySQLDAO = new MySQLDAO();
//        mySQLDAO.getConnection();
        mySQLDAO.readAuds();
    }
}
