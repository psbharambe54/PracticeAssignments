package designPatterns.abstract_factory.university.collegefactory.course;

import java.util.Arrays;

public class GovernmentCourses implements Courses {

    private int noOfColleges;

    @Override
    public void setColleges(int number) {
        this.noOfColleges = number;
        System.out.println("Courses offered by college are: "+ Arrays.toString(courses));
        System.out.println("Number of Goverment colleges are: "+number);

    }
}
