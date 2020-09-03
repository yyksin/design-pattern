package facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {
    public static void main(String[] args) {
        getProperties("maildata");
    }
    private Database(){
    }

    public static Properties getProperties(String dbname){
        String filename = dbname+".txt";
        Properties prop = new Properties();

        try {
            prop.load(new FileInputStream("/Users/yyk/IdeaProjects/design-pattern/src/facade/"+filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
}
