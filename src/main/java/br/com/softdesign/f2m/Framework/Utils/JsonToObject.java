package br.com.softdesign.f2m.Framework.Utils;

import java.io.File;
import java.util.List;
import java.util.Arrays;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class JsonToObject {

    public static <T> List<T> datapoolMapping(String jsonFilePath, Class<T> clazz){

        try {
            ObjectMapper mapper = new ObjectMapper();
            Class<T[]> listaRetorno = (Class<T[]>) Class.forName("[L" + clazz.getName() + ";");
            T[] objects = mapper.readValue(new File(jsonFilePath), listaRetorno);
            return Arrays.asList(objects);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.getMessage();
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}