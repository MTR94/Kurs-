package ControlaPrac;

import Kt.DBConnect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Controller {
    DBConnect dbConnect = new DBConnect();
    Scanner scanner = new Scanner(System.in);
    public void p() throws SQLException {
        String sql = "Select * from pracownicy;";
        Statement statement = dbConnect.getCon().createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            System.out.println("ID : "+ resultSet.getInt("idPracownicy") +
                    " Imię : "+ resultSet.getString("Imię") +
                    " Nazwisko : "+ resultSet.getString("Nazwisko") +
                    " Brutto  : " + resultSet.getInt("Brutto") +
                    " Netto : " + resultSet.getDouble("Netto")) ;
        }

    }

    public void d(String name, String lastName, int payment) throws SQLException {
        double netto = (payment*0.77);
        String sql = "Insert into pracownicy (Imię , Nazwisko , Brutto , Netto) Values(? , ? , ? , ?)";
        PreparedStatement preparedStatement = dbConnect.getCon().prepareStatement(sql);
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,lastName);
        preparedStatement.setInt(3,payment);
        preparedStatement.setDouble(4,netto);
        preparedStatement.execute();
        preparedStatement.close();
        System.out.println("Dodać do bazy danych ? T/N ");
        String choose = scanner.nextLine();
        if (choose.equalsIgnoreCase("t")){
            dbConnect.getCon().commit();
        } else if (choose.equalsIgnoreCase("n")) {
            dbConnect.getCon().rollback();
        }else {
            System.out.println("Zła komenda");
        }
    }

    public void d(int lp) throws SQLException {
        String sql = "Delete from pracownicy where idPracownicy = "+lp;
        PreparedStatement preparedStatement = dbConnect.getCon().prepareStatement(sql);
        preparedStatement.execute();
        preparedStatement.close();
    }

    public void e(int lp) {
    }
}
