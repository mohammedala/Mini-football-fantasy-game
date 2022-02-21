package Game_info;

import java.sql.*;

public class Database {
    private final String week = "week";
    Connection con;
    public static int nweek = 1;
     
     
    public Database() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "1234");

    }

    public void read(Goalkeeper list[], Goalkeeper obj) throws SQLException {

        Statement st = con.createStatement();
        ResultSet rs;

            rs = st.executeQuery("SELECT * FROM "+ week.concat(String.valueOf(nweek)) +" where position = 'GK';");
            Goalkeeper.counter = 0;
            while (rs.next()) {
                obj.set(rs.getString("name"), rs.getString("club"), rs.getString("position"), rs.getInt("goals"), rs.getInt("assist"), rs.getInt("cleansheet"));
                if (Goalkeeper.counter < 7){
                    list[Goalkeeper.counter].set(obj.getName(), obj.getClub(), obj.getPosition(), obj.getGoals(), obj.getAssist(), obj.getCleansheet());
                }
                Goalkeeper.counter++;
            }

        

    }

    public void read(Defender list[], Defender obj) throws SQLException {

        Statement st = con.createStatement();
        ResultSet rs;

            rs = st.executeQuery("SELECT * FROM "+ week.concat(String.valueOf(nweek)) +" where position = 'DF';");
            Defender.counter = 0;
            while (rs.next()) {
                obj.set(rs.getString("name"), rs.getString("club"), rs.getString("position"), rs.getInt("goals"), rs.getInt("assist"), rs.getInt("cleansheet"));
                if (Defender.counter < 7) {
                    list[Defender.counter].set(obj.getName(), obj.getClub(), obj.getPosition(), obj.getGoals(), obj.getAssist(), obj.getCleansheet());
                }

                Defender.counter++;
            }

        

    }

    public void read(Midfielder list[], Midfielder obj) throws SQLException {

        Statement st = con.createStatement();
        ResultSet rs;

            rs = st.executeQuery("SELECT * FROM "+ week.concat(String.valueOf(nweek)) +" where position = 'MID';");
            Midfielder.counter = 0;
            while (rs.next()) {
                obj.set(rs.getString("name"), rs.getString("club"), rs.getString("position"), rs.getInt("goals"), rs.getInt("assist"), rs.getInt("cleansheet"));
                if (Midfielder.counter < 7) {
                    list[Midfielder.counter].set(obj.getName(), obj.getClub(), obj.getPosition(), obj.getGoals(), obj.getAssist(), obj.getCleansheet());
                }
                Midfielder.counter++;
            }

        

    }

    public void read(Striker list[], Striker obj) throws SQLException {

        Statement st = con.createStatement();
        ResultSet rs;

            rs = st.executeQuery("SELECT * FROM "+ week.concat(String.valueOf(nweek)) +" where position = 'FW';");
            Striker.counter = 0;
            while (rs.next()) {
                obj.set(rs.getString("name"), rs.getString("club"), rs.getString("position"), rs.getInt("goals"), rs.getInt("assist"), rs.getInt("cleansheet"));
                if (Striker.counter < 7) {
                    list[Striker.counter].set(obj.getName(), obj.getClub(), obj.getPosition(), obj.getGoals(), obj.getAssist(), obj.getCleansheet());
                }
                Striker.counter++;
            }

        

    }
    

}

