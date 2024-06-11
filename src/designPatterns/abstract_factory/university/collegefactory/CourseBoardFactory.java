package designPatterns.abstract_factory.university.collegefactory;

import designPatterns.abstract_factory.university.collegefactory.board.Board;
import designPatterns.abstract_factory.university.collegefactory.course.Courses;

public interface CourseBoardFactory {

    Courses getCoursesInstance();
    Board getBoardInstance();
}
