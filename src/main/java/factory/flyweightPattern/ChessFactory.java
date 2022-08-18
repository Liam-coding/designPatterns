package factory.flyweightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Liam
 * @Date: 8/18/2022 3:53 PM
 */
//第三步，共享对象工厂
//        其负责提供共享对象，客户端不应该直接实例化棋子对象，
//        而应该使用此工厂来获取。因为我们分了黑白两类对象，所以这里使用Color为key的map来存储共享对象。
public class ChessFactory {
    private static final Map<Color, Chess> chessMap = new HashMap<Color, Chess>();

    public static Chess getChess(Color color) {
        Chess chess = chessMap.get(color);
        if (chess == null) {
            chess = color == Color.WHITE ? new WhiteChess() : new BlackChess();
            chessMap.put(color, chess);
        }
        return chess;
    }
}
