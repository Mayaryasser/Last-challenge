/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lastchallenge;

import java.awt.Point;

/**
 *
 * @author MayarYasser
 */
public class Tank {
    public Point pos=new Point();
    public String ImagePath;
    public Bullet Rocket=new Bullet();
    public Bullet Rocket2=new Bullet();
    public int speed;
    public Tank (String ImagePath)
    {
        speed=5;
        this.ImagePath=ImagePath;
        Rocket.imgPath="C:\\Users\\Lenovo\\Pictures\\rocket.gif";
        Rocket2.imgPath="C:\\Users\\Lenovo\\Pictures\\rocket.gif";
    }
    
    void mover() {
        this.pos.x+=speed;
    }
      void movel() {
        this.pos.x-=speed;
    }

    public void fireBullet()
    {
        Rocket.pos.x=this.pos.x+40;
        Rocket.pos.y=this.pos.y;
        Rocket2.pos.x=this.pos.x+40;
        Rocket2.pos.y=this.pos.y;
   //    MovingBall.getDefaultLocale();
        Thread t1=new Thread (Rocket);
        t1.start();
        Thread t2 =new Thread(Rocket2);
        t2.start();
    }
}
