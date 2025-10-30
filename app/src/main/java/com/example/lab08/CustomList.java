package com.example.lab08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    public void deleteCity(City city){
        if(cities.contains(city))
            cities.remove(city);
        else throw new IllegalArgumentException();
    }

    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    public int countCity(){
        return cities.size();
    }
}
