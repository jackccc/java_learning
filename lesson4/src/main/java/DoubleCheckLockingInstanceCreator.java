public class DoubleCheckLockingInstanceCreator {
    private  volatile DoubleCheckLockingInstanceCreator instance = null;

    private CarBuilder carBuilder;
    public CarBuilder getCarBuilder(){
        return carBuilder = new CarBuilder();
    }

    public DoubleCheckLockingInstanceCreator getInstance(){
            if (instance == null){
                synchronized (this){
                    if (instance == null){
                        instance = new DoubleCheckLockingInstanceCreator();
                    }
                }
            }
        return instance;
    }
}
