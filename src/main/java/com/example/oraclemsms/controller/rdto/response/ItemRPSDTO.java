package com.example.oraclemsms.controller.rdto.response;

import com.example.oraclemsms.repository.ItemDTO;
import com.example.oraclemsms.service.dto.Item;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ItemRPSDTO {

    List<Item> data;
}
