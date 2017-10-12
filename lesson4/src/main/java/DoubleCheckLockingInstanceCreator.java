public class DoubleCheckLockingInstanceCreator {
    private static CarService instance;
    public static CarService getInstance(){
        if (instance == null){
            synchronized (CarService.class){
                CarService carService = instance;
                if (carService == null){
                    synchronized (CarService.class){
                        carService = new CarService();
                    }
                    instance = carService;
                }
            }
        }

        return instance;
    }
}
