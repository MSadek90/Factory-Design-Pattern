package Utilits;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class JacksonLIB {


    public static <T> T deserializeJson(String fileName, Class<T> clazz) throws IOException {

        InputStream file = JacksonLIB.class.getClassLoader().getResourceAsStream(fileName);

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(file,clazz);
    }
}
