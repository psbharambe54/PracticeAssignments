package designPatterns.abstract_factory.university.collegefactory.board;

public class GovermentBoard implements Board{
    @Override
    public void getBoard(String board) {
        System.out.println("Goverment college Board is: "+board);
    }
}
