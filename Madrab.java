///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package lastchallenge;
//
//import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.Point;
//import java.awt.Rectangle;
//
///**
// *
// * @author MayarYasser
// */
//public class Madrab {
//    public Point pos=new Point();
//    private Color MardrabColor=Color.blue;
//    private Color MardrabColor2=Color.red;
//    private int x,y;
//    private int w=100;
//    private int h=50;
//    private int move=15;
//    
//    public Madrab(int framew,int frameh)
//    {
//        MardrabColor.x=(int)(Math.random()*(framew-w));
//        y=frameh-h;
//    }
//    void mover() {
//        this.pos.x+=speed;
//    }
//      void movel() {
//        this.pos.x-=speed;
//    }
//       public Rectangle area()
//    {
//        return new Rectangle(x,y,w,h);
//    }
//    public void paint(Graphics g)
//    {
//        g.setColor(MardrabColor);
//        g.fillRect(x, y, w, h);
//    }
//    public void fireBullet()
//    {
////        Rocket.pos.x=this.pos.x+60;
////        Rocket.pos.y=this.pos.y;
//   //    MovingBall.getDefaultLocale();
//        Thread t1=new Thread ();
//        t1.start();
//    }
//}
