package com.example.cacheservice.service;


import com.example.cacheservice.entity.MyEntity;

public interface CacheService {

    void add(MyEntity e1);

    void remove(MyEntity e1);

    void removeAll();

    MyEntity get(MyEntity e1);

    void clear();
}
