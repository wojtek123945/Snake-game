import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame(){
        //GamePanel panel = new GamePanel();
        //this.add(panel);
        //W identyczny sposób jak z GamePanel moge stworzyć coś dużo krótszego
        this.add(new GamePanel());
        this.setTitle("SnakeGame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

}
