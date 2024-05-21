/**
 * Speichert die Daten eines Nutzers
 */

public class User {
    String username;
    String email;
    String password;
    int alter; //ist eine freiwillige Angabe

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User(String username, String email, String password, int alter) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.alter = alter;
    }
}

