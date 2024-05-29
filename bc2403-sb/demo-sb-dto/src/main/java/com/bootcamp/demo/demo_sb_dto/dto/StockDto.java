package com.bootcamp.demo.demo_sb_dto.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class StockDTO {
 // DTO stands for Data Tansfer Object
private int stockNo;
private int quantity;
}
