package Utilits;

import net.bytebuddy.implementation.bytecode.Throw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {

    private static Properties prop;

    public static Properties readProperty(String fileName) {

         prop = new Properties();
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(fileName));
            try {
                prop.load(br);
            } catch (IOException e) {
                throw new RuntimeException("failed to load properties file: " + fileName);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found: " + fileName);
        }

        return prop;
    }

}