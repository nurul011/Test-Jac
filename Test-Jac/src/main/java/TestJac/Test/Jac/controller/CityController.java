package TestJac.Test.Jac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import TestJac.Test.Jac.CityImpl.CitySer;
import TestJac.Test.Jac.entity.City;


@RestController
public class CityController {
	
	
	@Autowired
    private CitySer cityService;

    @GetMapping("/cities")
    public List<City> getCities() {

        return cityService.getCities();
    }
}


