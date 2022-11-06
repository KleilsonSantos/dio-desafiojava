package br.com.dio.desafiojava.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Classe que personaliza o formato da data.
 * @author Kleilson dos Santos
 * @version 1.0
 */
public class DateConvert {

    public static String returnDate(LocalDate localDate){
        return localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
