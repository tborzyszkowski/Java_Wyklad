package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DodatkoweFunkcje {

    public LocalDateTime StringToData(String data) {
        DateTimeFormatter formatdaty = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime skonwertowana_data = LocalDateTime.parse(data, formatdaty);
        return skonwertowana_data;
    }
}
