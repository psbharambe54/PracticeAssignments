package designPatterns.abstract_factory.university.collegefactory;

import designPatterns.abstract_factory.university.collegefactory.board.Board;
import designPatterns.abstract_factory.university.collegefactory.course.Courses;

public class University {

    private Courses courses;
    private Board board;

    public University(CourseBoardFactory courseBoardFactory){
        courses  = courseBoardFactory.getCoursesInstance();
        board = courseBoardFactory.getBoardInstance();

    }

    public void getCollegeInformation(int noOfCollege, String boardInfo){
        courses.setColleges(noOfCollege);
        board.getBoard(boardInfo);
    }
}
