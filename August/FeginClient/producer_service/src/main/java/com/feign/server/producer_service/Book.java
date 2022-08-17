package com.feign.server.producer_service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor 
public class Book {

     private Integer bookId;
     private String bookName;
     private Double bookCost;
}
