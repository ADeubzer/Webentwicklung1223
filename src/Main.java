import javax.swing.*;
import java.sql.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {

//        User username = new User(showInputDialog("Bitte geben Sie Ihren Username ein: "),
//                showInputDialog("Bitte geben Sie Ihre Emailadresse ein:"),
//                showInputDialog("Bitte geben Sie Ihr Passwort ein:"));
//
//        System.out.println("Benutzename: " + username.username +
//                "\nEmail: " +username.email +
//                "\nPassswort: " + username.password);
//
        Connection conn = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/userdb", "root", "rootpassword");

        String sqlAbfrage = "SELECT * FROM userdata WHERE username = ? and password = ?";
        PreparedStatement statement = conn.prepareStatement(sqlAbfrage);
        statement.setString(1,showInputDialog("Bitte Benutzername eingeben"));
        statement.setString(2, showInputDialog("Bitte Passwort eingeben"));
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            showMessageDialog(null,"gefunden");
        } else {
            JOptionPane.showMessageDialog(null,"nicht gefunden");
        }
        conn.close();
    }

}