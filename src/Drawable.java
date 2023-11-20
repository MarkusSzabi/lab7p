import javax.swing.*;
import java.awt.*;

interface Drawable {

        void draw();
    }
    class CircleL implements Drawable{
        public void draw(){

            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.setVisible(true);

            JPanel panel = new JPanel(){
                @Override
                protected void paintComponent(Graphics g){
                    super.paintComponent(g);
                    g.setColor(Color.RED);
                    g.fillRect(100,100,200,200);
                    }
                };

            frame.add(panel);
            }
        }
    class RectangleL implements Drawable{
    public void draw(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);

        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.setColor(Color.MAGENTA);
                g.fillRect(100,100,200,200);
            }
        };
        frame.add (panel);
    }
}
class TriangleL implements Drawable{
    public void draw(){

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);

        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.setColor(Color.GRAY);
                int[] xPoints = {
                        200,
                        100,
                        300,
                };
                int[] yPoints = {
                        100,
                        300,
                        300
                };
                g.fillPolygon(xPoints,yPoints, 3);
            }
        };
        frame.add(panel);
    }
}
class Mainl{
    public static void main(String[] args){
        Drawable circle = new CircleL();
        Drawable rectangle = new RectangleL();
        Drawable triangle = new TriangleL();

        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}