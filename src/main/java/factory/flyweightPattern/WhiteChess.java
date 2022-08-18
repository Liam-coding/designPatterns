package factory.flyweightPattern;

/**
 * @Author: Liam
 * @Date: 8/18/2022 3:52 PM
 */
public class WhiteChess implements Chess {
    //内部状态，共享
    private final Color color = Color.WHITE;

    private final String sharp = "圆形";

    public Color getColor() {
        return color;
    }

    public void draw(int x, int y) {
        System.out.println(String.format("%s%s棋子置于（%d，%d）处", sharp, getColor(), x, y));
    }
}
