/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lastchallenge;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author MayarYasser
 */
public class MovingBall extends JPanel implements Runnable{
    public ArrayList<Ball>Balls=new ArrayList<Ball>(5);
  
   public Tank BlueTank=new Tank("D:\\Year2 Semester 1\\oop\\TankBlueS.jpg");
   public Tank RedTank=new Tank ("D:\\Year2 Semester 1\\TankBlueS+++.jpg");
    public MovingBall()
    {
        setSize(1000,1000);
        setBackground(Color.red);
        BlueTank.pos.x=220;
        BlueTank.pos.y=700;
        RedTank.pos.x=520;
       RedTank.pos.y=700;
         this.addKeyListener(new keylist());
        
    }
    private class keylist implements KeyListener
    {

        @Override
        public void keyTyped(KeyEvent e) {
           
        }

        @Override
        public void keyPressed(KeyEvent e) {
            //System.out.println("Test");
            
            if (e.getKeyCode()==KeyEvent.VK_RIGHT)
            {
                
                BlueTank.mover();
                
            }
            if (e.getKeyCode()==KeyEvent.VK_LEFT)
            {
                
                BlueTank.movel();
                //repaint();
            }
            if (e.getKeyCode()==KeyEvent.VK_SPACE)
            {
                
                BlueTank.fireBullet();
            }
            
            if (e.getKeyCode()==KeyEvent.VK_D)
            {
                
                RedTank.mover();
                
            }
            
            if (e.getKeyCode()==KeyEvent.VK_A)
            {
                
                RedTank.movel();
                //repaint();
            }
            
            if (e.getKeyCode()==KeyEvent.VK_ENTER)
            {
                
                RedTank.fireBullet();
            }
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
           
        }
    }
    public void  paintComponent(Graphics g)
    {
        g.clearRect(0, 0, 1000, 1000);
        
        try
        {
        BufferedImage imgtank = ImageIO.read(new File(BlueTank.ImagePath));
        BufferedImage imgtank2 = ImageIO.read(new File(RedTank.ImagePath));
        BufferedImage imgrocket = ImageIO.read(new File(BlueTank.Rocket.imgPath));
        BufferedImage imgrocket2 = ImageIO.read(new File(RedTank.Rocket2.imgPath));
        g.drawImage(imgtank, BlueTank.pos.x, BlueTank.pos.y,null);
        g.drawImage(imgtank2, RedTank.pos.x, RedTank.pos.y,null);
        g.drawImage(imgrocket, BlueTank.Rocket.pos.x, BlueTank.Rocket.pos.y,null);
        g.drawImage(imgrocket2, RedTank.Rocket2.pos.x, RedTank.Rocket2.pos.y,null);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        
        
         for (Ball OneBall: Balls)
        
        {
            g.setColor(OneBall.CurrentColor);
            g.fillOval(OneBall.x,OneBall.y, 50, 50);
            if (BlueTank.Rocket.pos.distance(OneBall.x, OneBall.y)<=50)
            {
               // System.out.println("Hit Occurs" + OneBall.CurrentColor.toString());
                Balls.remove(OneBall);
                break;
                
            }
            
       
            if (RedTank.Rocket2.pos.distance(OneBall.x, OneBall.y)<=50)
            {
                //System.out.println("Hit Occurs" + OneBall.CurrentColor.toString());
                Balls.remove(OneBall);
                break;
                
            }
            
        }
        
    }
    @Override
    public void run() {
    try
    {
    while(true)
    {
        for (Ball OneBall: Balls)
        {
            OneBall.move(this.getWidth());
        }    
        
        //y+=10;
        Thread.sleep(50);
        repaint();
    }
    }
    catch (InterruptedException e)
    {}
    }
    
}
