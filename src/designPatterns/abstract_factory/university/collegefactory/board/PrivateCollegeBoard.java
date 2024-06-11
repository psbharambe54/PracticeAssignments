package designPatterns.abstract_factory.university.collegefactory.board;

public class PrivateCollegeBoard implements Board{
    @Override
    public void getBoard(String board) {
        System.out.println("Private College Board is: "+board);
    }
}
