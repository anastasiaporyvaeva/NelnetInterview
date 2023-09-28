package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //create obj
    //make it private so we  are limiting access to the obj
    // static is to make sure its createdand loaded before everything else
    private static Properties properties = new Properties();


    static{


        try {
            //open file
            FileInputStream file = new FileInputStream("configuration.properties");
            //load properties
            properties.load(file);

            //close the file in the memory
            file.close();
        } catch (IOException e) {
            System.out.println("File not found in given path!");
            e.printStackTrace();

        }
    }
    // create utility method to use the object to read
    //use properties

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
}
