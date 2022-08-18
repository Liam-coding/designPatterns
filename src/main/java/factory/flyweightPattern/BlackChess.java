package factory.flyweightPattern;

/**
 * @Author: Liam
 * @Date: 8/18/2022 3:51 PM
 */


//我们的棋子对象分为黑白两类，所以此处我们将颜色设计为对象的内部状态来共享，
//而不是外部状态，所以就需要黑白两个对象类。如果你把颜色作为外部状态，那么只需要一个对象类即可。
public class BlackChess implements Chess {
    //内部状态，共享
    private final Color color = Color.BLACK;

    private final String sharp = "圆形";

    public Color getColor() {
        return color;
    }

    public void draw(int x, int y) {
        System.out.println(String.format("%s%s棋子置于（%d，%d）处", sharp, getColor(), x, y));
    }
}
