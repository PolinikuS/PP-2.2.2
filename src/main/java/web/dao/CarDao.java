package web.dao;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDao implements CarDaoInterface {

    public List<Car> createCarList() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMV", "Red", "Automatic"));
        carList.add(new Car("Lada", "Green", "Manual"));
        carList.add(new Car("Chery", "White", "Automatic"));
        carList.add(new Car("Niva", "Grey", "Manual"));
        carList.add(new Car("Toyota", "Black", "Automatic"));
        return carList;
    }

    @Override
    public List<Car> getCarsList(int count) {
        List<Car> countCarList = createCarList();
        if (count <= 5) {
            countCarList = createCarList().stream().limit(count).collect(Collectors.toCollection(ArrayList::new));
        }
        return countCarList;
    }
}
