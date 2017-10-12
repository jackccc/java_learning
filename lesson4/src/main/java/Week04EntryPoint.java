public class Week04EntryPoint {
    public static void main(String[] args) {
        GetInstanceFromEnumSingleton();
        GetInstanceWithDoubleCheckLocking();
    }

    /**
     * 通过枚举创建一个单例类
     */
    private static void GetInstanceFromEnumSingleton()
    {
        EnumSingletonCreator.INSTANCE.getInstance().GetCars();
    }

    /**
     * 通过Double check locking 创建一个单例对象
     */
    private static void GetInstanceWithDoubleCheckLocking()
    {
        DoubleCheckLockingInstanceCreator.getInstance().GetCars();
    }

}
