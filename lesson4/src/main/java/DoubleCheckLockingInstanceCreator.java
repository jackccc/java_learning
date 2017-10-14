public class DoubleCheckLockingInstanceCreator {
    private  volatile CarBuilder instance = null;
    public CarBuilder getInstance(){
            if (instance == null){
                synchronized (this){
                    if (instance == null){
                        instance = new CarBuilder();
                    }
                }
            }
        return instance;
    }
}
