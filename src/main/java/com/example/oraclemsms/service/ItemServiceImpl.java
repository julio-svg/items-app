package com.example.oraclemsms.service;


import com.example.oraclemsms.controller.SortEnum;
import com.example.oraclemsms.repository.ItemDTO;
import com.example.oraclemsms.repository.ItemRepository;
import com.example.oraclemsms.service.dto.Item;
import com.example.oraclemsms.service.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    ItemMapper itemMapper;

    @Override
    @Transactional(readOnly = true)
    public List<Item> getAllItems(String page,String orderBy, String sortBy) {
        Sort sort = null;
        if(sortBy.equals(SortEnum.DESCENT.toString())){
            sort = Sort.by(orderBy).descending();
        }else {
            sort = Sort.by(orderBy).ascending();
        }

        Pageable pageable =  PageRequest.of(Integer.parseInt(page),5,sort);
        List<ItemDTO> items =  itemRepository.findAll(pageable).getContent();
        return items.stream().map(a -> itemMapper.toItem(a)).collect(Collectors.toList());
    }
}
