package designPatterns.abstract_factory.university.collegefactory.gov;

import designPatterns.abstract_factory.university.collegefactory.CourseBoardFactory;
import designPatterns.abstract_factory.university.collegefactory.board.Board;
import designPatterns.abstract_factory.university.collegefactory.board.GovermentBoard;
import designPatterns.abstract_factory.university.collegefactory.course.Courses;
import designPatterns.abstract_factory.university.collegefactory.course.GovernmentCourses;

public class GovernmentCollegeFactory implements CourseBoardFactory {

    @Override
    public Courses getCoursesInstance() {
        return new GovernmentCourses();
    }

    @Override
    public Board getBoardInstance() {
        return new GovermentBoard();
    }
}
