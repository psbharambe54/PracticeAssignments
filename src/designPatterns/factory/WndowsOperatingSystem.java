package designPatterns.factory;

public class WndowsOperatingSystem extends OperatingSystem{

    WndowsOperatingSystem(String version, String architecture){
        super(version, architecture);
    }

    @Override
    public void changedir() {
        System.out.println("Calling change dir from Windows ");

    }

    @Override
    public void removedir() {
        System.out.println("Calling remove dir from Windows ");

    }
}
