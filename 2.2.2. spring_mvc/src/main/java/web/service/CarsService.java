package web.service;

import org.springframework.stereotype.Component;
import web.model.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarsService{

    private List<Cars> cars = new ArrayList<>();
    {
        cars.add(new Cars("Logan", "2016",160));
        cars.add(new Cars("Kaptur", "2020",180));
        cars.add(new Cars("Daster", "2018",180));
        cars.add(new Cars("Arkana", "2019",210));
        cars.add(new Cars("BA3 2106", "1986",130));
    }

    public List<Cars> getAllCars(){
        return cars;
    }

    public List<Cars> getCars(String count) {
        if (count == null) {
            return getAllCars();
        } else {
            int i = Integer.parseInt(count);
            if (i >= 5 || i < 1) {
                return getAllCars();
            } else {
                return getAllCars().stream().limit(i).collect(Collectors.toList());
            }
        }
    }
}
