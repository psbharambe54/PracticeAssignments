package sampleprpgrams;

public class CloneTest implements Cloneable{
    int i;

    CloneTest(int i){
        this.i = i;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneTest cloneTest = new CloneTest(10);
        System.out.println(cloneTest.i);
       CloneTest cloneTest1 = cloneTest;
       cloneTest.i = 90;
        System.out.println(cloneTest1.i);

        CloneTest cloneTest2 = cloneTest.deepClone();
        System.out.println(cloneTest2.i);

    }

    private CloneTest deepClone() throws CloneNotSupportedException{
        return new CloneTest(this.i);
    }
}
