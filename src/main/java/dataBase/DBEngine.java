package dataBase;

import models.Character;
import models.CharacterClass;
import models.Race;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DBEngine {

    private Connection connection;


    public DBEngine() {
        connection = connect();
    }

    public boolean isConnected() {
        return (connection != null);
    }

    private Connection connect() {
        String url = "jdbc:mysql://localhost:3306/rpgDB?" +
                "useUnicode=yes&characterEncoding=UTF-8";

        Properties properties = new Properties();
        properties.put("user", System.getenv("DB_USER")); // username legyen root ez a név
        properties.put("password", System.getenv("DB_PASSWORD"));

        try {
            return DriverManager.getConnection(url, properties);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Character> listAllCharachter() {
        String query = "SELECT * FROM " + DBHelper.TABLE_PLAYABLE_CHARACTER;
        List<Character> characters = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {

                long chachterId = resultSet.getLong(DBHelper.CHARACTER_ID);
                String name = resultSet.getString(DBHelper.CHARACTER_NAME);
                String classFromDB = resultSet.getString(DBHelper.CHARACTER_CLASS).toUpperCase();
                CharacterClass characterClass = CharacterClass.valueOf(classFromDB);
                String raceFromDB = resultSet.getString(DBHelper.CHARACTER_RACE).toUpperCase();
                Race race = Race.valueOf(raceFromDB);
              //  String skill = resultSet.getString(DBHelper.CHARACTER_SKILL1);

                Character character = new Character(chachterId,name,characterClass,race," Hit Hard");
                System.out.println(character);
                characters.add(character);


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

return characters;
    }

}
