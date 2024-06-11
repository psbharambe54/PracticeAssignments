package designPatterns.abstract_factory.university.collegefactory.privatecol;

import designPatterns.abstract_factory.university.collegefactory.CourseBoardFactory;
import designPatterns.abstract_factory.university.collegefactory.board.Board;
import designPatterns.abstract_factory.university.collegefactory.board.PrivateCollegeBoard;
import designPatterns.abstract_factory.university.collegefactory.course.Courses;
import designPatterns.abstract_factory.university.collegefactory.course.PrivateCollegeCourses;

public class PrivateCollegeFactory implements CourseBoardFactory {
    @Override
    public Courses getCoursesInstance() {
        return new PrivateCollegeCourses();
    }

    @Override
    public Board getBoardInstance() {
        return new PrivateCollegeBoard();
    }
}
