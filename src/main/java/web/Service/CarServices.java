package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.Model.Car;
import web.dao.CarDaoInterface;

import java.util.List;

@Component
public class CarServices implements ServiceInterface {
    CarDaoInterface carDaoInterface;

    @Autowired
    public CarServices(CarDaoInterface carDaoInterface) {
        this.carDaoInterface = carDaoInterface;
    }


    @Override
    public List<Car> getCarsList(int count) {
        return carDaoInterface.getCarsList(count);
    }
}
