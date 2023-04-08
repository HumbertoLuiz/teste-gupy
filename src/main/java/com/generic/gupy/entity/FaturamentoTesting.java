package com.generic.gupy.entity;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FaturamentoTesting {

    public static void main(String[] args) throws InterruptedException {

        JSONParser jsonParser= new JSONParser();

        try (FileReader reader= new FileReader("./src/main/resources/static/data.json")) {

            System.out.println("Faturamento: \n");

            Object obj= jsonParser.parse(reader);
            JSONArray faturamentoArray= (JSONArray) obj;

            faturamentoArray.forEach(faturamento -> parserFaturamento((JSONObject) faturamento));

            double sum= 0.0;
            double menor= 0.0, maior= 0.0;

            for (Object object : faturamentoArray) {

                sum+= faturamentoArray.indexOf(object);

                if (faturamentoArray.indexOf(object) < faturamentoArray.indexOf(object) + 1 &&
                    faturamentoArray.indexOf(object) < faturamentoArray.indexOf(object) + 2) {
                    menor= faturamentoArray.indexOf(object);
                }

                else if (faturamentoArray.indexOf(object) + 1 < faturamentoArray.indexOf(object) +
                    2) {
                        menor= faturamentoArray.indexOf(object);
                    }

                else {
                    menor= faturamentoArray.indexOf(object);
                }

                if (faturamentoArray.indexOf(object) > faturamentoArray.indexOf(object) + 1 &&
                    faturamentoArray.indexOf(object) > faturamentoArray.indexOf(object) + 2) {
                    maior= faturamentoArray.indexOf(object);
                }

                else if (faturamentoArray.indexOf(object) + 1 > faturamentoArray.indexOf(object) +
                    2) {
                        maior= faturamentoArray.indexOf(object);
                    }

                else {
                    maior= faturamentoArray.indexOf(object);
                }
            }
            double avg= sum / faturamentoArray.size();
            System.out.printf("Média: %2f%n", avg);

            System.out.printf("Menor: %2f%n", menor);
            System.out.printf("Menor: %2f%n", maior);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    public static void parserFaturamento(JSONObject pFaturamento) {

        System.out.println("dia: " + (Integer.parseInt(pFaturamento.get("dia").toString())));
        System.out.println("valor: " + (Double.parseDouble(pFaturamento.get("valor").toString())));

        System.out.println("\n--------------------------");

    }
}
