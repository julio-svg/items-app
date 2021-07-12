package com.example.oraclemsms.service.mapper;

import com.example.oraclemsms.repository.ItemDTO;
import com.example.oraclemsms.service.dto.Item;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    Item toItem(ItemDTO p);
}



