package designPatterns.factory;

public class ImplementFactory {


    public static OperatingSystem createInstance(String version, String architecture, String operatingSystem){

        switch (operatingSystem){

            case "Windows": return new WndowsOperatingSystem(version, architecture);

            case "Linux" : return new LinuxOperatingSystem(version, architecture);

            default: throw  new IllegalArgumentException("OS not supported");
        }

    }

}
