/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lastchallenge;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author MayarYasser
 */
public class LastChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//         Task []ArrayTasks=new Task[100];
//        
//        for (int i=0;i<100;i++)
//        {
//            ArrayTasks[i]=new Task(i);
//            
//        }
        
//        for (int i=0;i<100;i++)
//        {
//            //ArrayTasks[i].start();
//            
//        }
        
        JFrame jf=new JFrame();
        jf.setSize(1000, 1000);
        
        MovingBall mb=new MovingBall();
        mb.Balls.add(new Ball());
        mb.Balls.add(new Ball(100,50,5,Color.BLACK));
        mb.Balls.add(new Ball(160,100,15,Color.red));
        mb.Balls.add(new Ball(180,150,10,Color.PINK));
        
        
        jf.add(mb,BorderLayout.CENTER);
        jf.setBackground(Color.GRAY);
        
 
        mb.setFocusable(true);
        Thread t1=new Thread(mb);
        t1.start();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    
}
