package common.dataHandling;

import globalConfig.Constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {


    public static String getValue(String key){
        String value="";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(Constants.CONFIG_PATH+"config.properties"));
            value = prop.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }

    static Properties prop = new Properties();
    public static Properties loadProperty(){
        if(prop==null){
            try {
                prop.load(new FileInputStream(Constants.CONFIG_PATH+"config.properties"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return prop;
    }

    public static String get(String key){
       return loadProperty().getProperty(key);
    }



    /**
     * path - where config file present
     * intialise property class
     * load proeprty
     * read property based on key
     */
}
