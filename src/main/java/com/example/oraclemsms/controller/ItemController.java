package com.example.oraclemsms.controller;

import com.example.oraclemsms.controller.rdto.response.ItemRPSDTO;
import com.example.oraclemsms.service.ItemService;
import com.example.oraclemsms.service.dto.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping("/items")
    public ResponseEntity<ItemRPSDTO> getItems(@RequestParam String pageNumber,@RequestParam OrderByEnum orderBy,@RequestParam SortEnum sortBy){
        List<Item> itemlist = itemService.getAllItems(pageNumber,orderBy.toString(), sortBy.toString());
        ResponseEntity<ItemRPSDTO> responseEntity = new ResponseEntity(itemlist, HttpStatus.OK);
        return responseEntity;
    }

}
