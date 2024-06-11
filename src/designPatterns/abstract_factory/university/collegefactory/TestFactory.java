package designPatterns.abstract_factory.university.collegefactory;

import designPatterns.abstract_factory.university.collegefactory.gov.GovernmentCollegeFactory;
import designPatterns.abstract_factory.university.collegefactory.privatecol.PrivateCollegeFactory;

public class TestFactory {

    public static void main(String[] args) {
        University NMuniversity = new University(new GovernmentCollegeFactory());
        NMuniversity.getCollegeInformation(2, "North Maharashtra University");

        University NMuniversity2 = new University(new PrivateCollegeFactory());
        NMuniversity2.getCollegeInformation(10, "North Maharashtra University");

        University Puneuniversity = new University(new GovernmentCollegeFactory());
        Puneuniversity.getCollegeInformation(1, "Pune University");

        University Puneuniversity2 = new University(new PrivateCollegeFactory());
        Puneuniversity.getCollegeInformation(12, "Pune University");
    }
}
