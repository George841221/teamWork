import dataBase.DBEngine;

public class Main {
    public static void main(String[] args) {
        DBEngine engine = new DBEngine();
        if (engine.isConnected()) {

            engine.listAllCharachter();
        }
    }
}
