package com.borisovskiy;

import java.util.Map;

public interface DataBase<K, V> {
    void put(K key, V value);
    void remove(K key);
    void replace(K key, V value);
    Map<K, V> sort(Map<K, V> map);
}
