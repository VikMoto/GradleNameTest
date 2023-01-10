package org.example;

import com.google.gson.Gson;

import java.util.Map;

public class App {
    public static void main(String[] args) {
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