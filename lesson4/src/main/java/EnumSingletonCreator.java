public enum  EnumSingletonCreator {
    INSTANCE;
    private CarBuilder instance = new CarBuilder();

    public CarBuilder getInstance() {
        return instance;
    }
}
