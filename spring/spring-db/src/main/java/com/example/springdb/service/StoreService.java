package com.example.springdb.service;

import com.example.springdb.domain.entity.Store;

import java.util.List;

public interface StoreService {

    // post api/v1/stores
    Store save(Store store);
    // put api/v1/stores/{id}
    Store update(Long id, Store store);
    // get api/v1/stores/{id}
    Store getById(Long id);
    // get api/v1/stores?name=?
    List<Store> getByContainName(String name);
    // get api/v1/stores
    List<Store> getAll();
    // delete api/v1/stores/{id}
    void deleteById(Long id);
}
