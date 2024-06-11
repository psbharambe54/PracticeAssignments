package designPatterns.factory;

public abstract class OperatingSystem {

    private String version;
    private String architecture;

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public OperatingSystem(String version, String architecture)
    {
        this.version = version;
        this.architecture = architecture;
    }

    @Override
    public String toString() {
        return "OperatingSystem{" +
                "version='" + version + '\'' +
                ", architecture='" + architecture + '\'' +
                '}';
    }

    public abstract void changedir();
    public abstract void removedir();

}
