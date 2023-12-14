package web;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<Car> carList = new ArrayList<>();
    public CarService(){
        carList.add(new Car("Toyota", "Camry", 2020));
        carList.add(new Car("Honda", "Accord", 2021));
        carList.add(new Car("Ford", "Focus", 2015));
        carList.add(new Car("BMW", "X5", 2023));
        carList.add(new Car("Mercedes", "Benz", 2012));
    }
    public List<Car> getCars(int count){
        if(count >= carList.size()){
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }
    public int getCarListSize(){
        return carList.size();
    }
}
