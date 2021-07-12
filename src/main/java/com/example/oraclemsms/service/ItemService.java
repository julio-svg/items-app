package com.example.oraclemsms.service;

import com.example.oraclemsms.repository.ItemDTO;
import com.example.oraclemsms.service.dto.Item;

import java.util.List;

public interface ItemService {
    List<Item> getAllItems(String page,String orderBy, String SortBy);
}
