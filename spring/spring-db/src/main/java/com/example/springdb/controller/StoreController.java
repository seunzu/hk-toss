package com.example.springdb.controller;

import ch.qos.logback.core.util.StringUtil;
import com.example.springdb.domain.entity.Store;
import com.example.springdb.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/stores")
@RequiredArgsConstructor
public class StoreController {

    private final StoreService storeService;

    @PostMapping
    public void saveStore(@RequestBody Store store) {
        storeService.save(store);
    }

    @PutMapping("{id}")
    public void updateStore(@RequestParam Long id, @RequestBody Store store) {
        storeService.update(id, store);
    }

    @GetMapping
    public List<Store> getAllStores(@RequestParam(name = "name", required = false) String name) {
        if (StringUtil.isNullOrEmpty(name)) return null;
        return storeService.getAll();
    }

    @GetMapping("{id}")
    public Store getById(@RequestParam Long id) {
        return storeService.getById(id);
    }

//    @GetMapping
//    public List<Store> getByContainName(@RequestParam String name) {
//        return storeService.getByContainName(name);
//    }

    @DeleteMapping
    public void deleteById(@RequestParam Long id) {
        storeService.deleteById(id);
    }
}
