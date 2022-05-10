package TestJac.Test.Jac.CityImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import TestJac.Test.Jac.entity.City;


@Service
public class CitySer {

	public List<City> getCities() {

        List<City> cities = new ArrayList<>();

        cities.add(new City(1L, "Bratislava", 432000,"25,680","50"));
        cities.add(new City(2L, "Budapest", 1759000,"10000","40"));
        cities.add(new City(3L, "Prague", 1280000,"5000","30"));
        cities.add(new City(4L, "Warsaw", 1748000,"15000","20"));
        cities.add(new City(5L, "Los Angeles", 3971000,"90000","02"));
        cities.add(new City(6L, "New York", 8550000,"8087","01"));
        cities.add(new City(7L, "Edinburgh", 464000,"5432","25"));
        cities.add(new City(8L, "Berlin", 3671000,"8090","21"));

        return cities;
    }
}
