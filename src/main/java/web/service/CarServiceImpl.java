package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> allCars = Arrays.asList(
            new Car("Tesla Model 3", "Red", 2021),
            new Car("Toyota Camry", "Blue", 2020),
            new Car("Mitsubishi", "Black", 2019),
            new Car("Honda Accord", "Silver", 2019),
            new Car("BMW", "White", 1998)
    );

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= 5) {
            return allCars;
        } else {
            return allCars.subList(0, count);
        }
    }
}


