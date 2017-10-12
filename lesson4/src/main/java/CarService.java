import model.Car;

public class CarService {
    public void GetCars(){
        Car car = Car.builder().carId("001").carName("卡迪拉克").build();
        System.out.println("car id" + car.getCarId() + ";car name:" + car.getCarName());
    }
}
