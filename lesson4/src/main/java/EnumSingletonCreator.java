public enum  EnumSingletonCreator {
    INSTANCE;
    private CarService instance;
    EnumSingletonCreator(){
        instance = new CarService();
    }

    public CarService getInstance() {
        return instance;
    }
}
