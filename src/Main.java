import static javax.swing.JOptionPane.showInputDialog;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        User username = new User(showInputDialog("Bitte geben Sie Ihren Username ein: "),
                showInputDialog("Bitte geben Sie Ihre Emailadresse ein:"),
                showInputDialog("Bitte geben Sie Ihr Passwort ein:"));

        System.out.println("Benutzename: " + username.username +
                "\nEmail: " +username.email +
                "\nPassswort: " + username.password);
    }
}