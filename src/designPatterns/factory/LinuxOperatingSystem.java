package designPatterns.factory;

public class LinuxOperatingSystem extends OperatingSystem{

    LinuxOperatingSystem(String version, String architecture){
        super(version, architecture);
    }

    @Override
    public void changedir() {
        System.out.println("Calling change dir from Linux ");

    }

    @Override
    public void removedir() {
        System.out.println("Calling remove dir from Linux ");
    }

}
