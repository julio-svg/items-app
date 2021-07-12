package com.example.oraclemsms.service.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Item {
    private Long id;
    private String description;
    private Long price;
}
