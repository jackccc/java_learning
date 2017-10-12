public class DoubleCheckLockingInstanceCreator {
    private  volatile CarService instance = null;
    public  CarService getInstance(){
            CarService carService = instance;
            if (carService == null){
                synchronized (this){
                    carService = instance;
                    if (carService == null){
                        instance = carService = new CarService();
                    }
                }
            }
        return carService;
    }
}
