package org.example;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, String> human = Map.of(
                "name",
                "Viktor",
                "lastName",
                "Motovilov"
        );

        Gson gson = new Gson();
        final String json = gson.toJson(human);
        System.out.println(json);
    }


}