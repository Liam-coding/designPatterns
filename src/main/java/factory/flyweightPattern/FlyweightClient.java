package factory.flyweightPattern;

/**
 * @Author: Liam
 * @Date: 8/18/2022 3:55 PM
 */
public class FlyweightClient {
    public static void main(String[] args) {
        playChess();
    }

    public static void playChess() {
        //下黑子
        Chess backChess1 = ChessFactory.getChess(Color.BLACK);
        backChess1.draw(2, 5);

        //下白子
        Chess whiteChess = ChessFactory.getChess(Color.WHITE);
        whiteChess.draw(3, 5);

        //下黑子
        Chess backChess2 = ChessFactory.getChess(Color.BLACK);
        backChess2.draw(2, 6);

        System.out.println(String.format("backChess1:%d | backChess2:%d | whiteChess:%d",
                backChess1.hashCode(), backChess2.hashCode(), whiteChess.hashCode()));

//        从输出可见，backChess1 与 backChess2 是同一个对象，而whiteChess是另一个不同的对象。
//        所以不论棋盘上有多少颗棋子，程序中只会保持最多两个棋子对象，这就极大的节约了内存。
    }
}
