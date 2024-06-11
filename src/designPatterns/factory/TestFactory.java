package designPatterns.factory;

public class TestFactory{

public static void main(String[] args) {

    OperatingSystem operatingSystem = ImplementFactory.createInstance("v1", "32-bit","Windows");
    operatingSystem.changedir();
}
}
