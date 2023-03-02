package web.dao;

import web.Model.Car;

import java.util.List;

public interface CarDaoInterface {
    List<Car> getCarsList(int count);
}
