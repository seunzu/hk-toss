package com.example.kiosk.store.controller;

import com.example.kiosk.store.*;
import com.example.kiosk.store.service.StoreService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stores")
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping
    public List<Store> getAllStores() {
        return storeService.getAllStores();
    }

    // localhost:8080/id
    // 주소 path/ 변수 variable
    @GetMapping("/{store-id}")
    public Store getStoreById(@PathVariable(value = "store-id") int id) {
        return storeService.getStoreById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
//    Store -> ResponseEntity<Store>
    public Store saveStore(@RequestBody StoreRequest storeRequest) {
        return storeService.addStore(storeRequest);
//        return ResponseEntity.status(201).body(store);
    }

    @DeleteMapping("/{store-id}")
    public void deleteStore(@PathVariable(value = "store-id") int id) {
        storeService.deleteStore(id);
    }

    @PutMapping("/{store-id}")
    public Store updateStore(@PathVariable(value = "store-id") int id, @RequestBody StoreRequest storeRequest) {
        return storeService.updateStore(id, storeRequest);
    }


//    public static void main(String[] args) {
//        Store store1 = new Store("매머드", "서울", (short) 7, (short) 21);
//        Store store2 = new Store("깐부치킨", "서울", (short) 11, (short) 1);
//
//        Utils.stores.add(store1);
//        Utils.stores.add(store2);
//        List<Store> allStores = new StoreController().getAllStores();
//        for (int i = 0; i < allStores.size(); i++) {
//            if (!Utils.stores.get(i).equals(allStores.get(i))) {
//                throw new RuntimeException();
//            }
//        }
//    }
}
