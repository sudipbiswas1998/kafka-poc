package com.sudip.kafkapoc.records;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
public class MessageRequest {
    String message;
}


