package factory.ComponentPattern;

/**
 * @Author: Liam
 * @Date: 8/17/2022 4:30 PM
 */
public class GraphicsClient {
//    你被要求开发一个简单的图形库。初始要求是：
//    图形库必须能够处理基础图形，如线和圆。
//    图形库必须允许复合和基础图形的递归复合，以便绘图可以由多种图形组成。
//    需要提供操作以允许添加，移除，显示和图形组件。
//    思路很清晰，图形分为基础图形和组合图形，用组合模式再合适不过了。
    public static void main(String[] args) {
        GraphicsLibrary gl = new GraphicsLibrary();

        //使用基础图形 line
        System.out.println("第一个图形:");
        gl.getGraphicsObjects().get(0).draw();

        //使用组合图形 composite
        System.out.println("第二个图形:");
        gl.getGraphicsObjects().get(3).draw();
    }
}
