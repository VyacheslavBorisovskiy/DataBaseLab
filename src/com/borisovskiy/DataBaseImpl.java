package com.borisovskiy;

import com.borisovskiy.hierarhy.Employee;

import java.util.*;

public class DataBaseImpl implements DataBase<Integer, Employee> {
    private Map<Integer, Employee> map;
    private Map.Entry<Integer, Employee> mapEntry;

    public DataBaseImpl(Map<Integer, Employee> map) {
        this.map = map;
    }

    public Map<Integer, Employee> getMap() {
        return map;
    }

    @Override
    public void put(Integer key, Employee value) {
        map.put(key, value);
    }

    @Override
    public void remove(Integer key) {
        map.remove(key);
    }

    @Override
    public void replace(Integer key, Employee value) {
        map.replace(key, value);
    }

    public void printMap() {
        for (Map.Entry<Integer, Employee> entry : map.entrySet())
            System.out.println(entry);
    }

    public Map<Integer, Employee> sort(Map<Integer, Employee> map) {
        List<Map.Entry<Integer, Employee>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, Comparator.comparingDouble(o -> o.getValue().getSalary()));
        Map<Integer, Employee> tmp = new LinkedHashMap<>();
        for (Map.Entry<Integer, Employee> entry : list) {
            tmp.put(entry.getKey(), entry.getValue());
        }
        return tmp;
    }
}
