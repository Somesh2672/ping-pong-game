import java.awt.*;

public class Paddle extends Rectangle {

    Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT)
    {
        super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);
    }

    public void draw(Graphics g)
    {
        g.setColor(Color.red);
        g.fillRect(x,y,width,height);
    }
}
