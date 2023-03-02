package web.Service;

import web.Model.Car;

import java.util.List;

public interface ServiceInterface {
    List<Car> getCarsList(int count);
}
