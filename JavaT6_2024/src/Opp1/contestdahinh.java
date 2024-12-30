package Opp1;

import java.util.*;
import java.io.*;

//lop hinh hoc
//abstract class Geometric{   
//    String color;
//    boolean filled;
//
//    public Geometric() {
//    }
//
//    public Geometric(String color, boolean filled) {
//        this.color = color;
//        this.filled = filled;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public boolean isFilled() {
//        return filled;
//    }
//
//    public void setFilled(boolean filled) {
//        this.filled = filled;
//    }
//    public abstract double getArea();
//    public abstract double getPerimeter();
//    
//}
//
//  class Circle extends Geometric{ 
//      double radius;
//
//    public Circle(double radius, String color, boolean filled) {
//        super(color, filled);
//        this.radius = radius;
//    }
//
//    public double getRadius() {
//        return radius;
//    }
//
//    public void setRadius(double radius) {
//        this.radius = radius;
//    }
//
//    @Override
//    public double getArea() {
//        return Math.PI*radius*radius;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 2*Math.PI*radius;
//    }
//    
//      
//  }
//class Rectangle extends Geometric{  
//     double with,height;
//
//    public Rectangle(double with, double height, String color, boolean filled) {
//        super(color, filled);
//        this.with = with;
//        this.height = height;
//    }
//
//    public double getWith() {
//        return with;
//    }
//
//    public void setWith(double with) {
//        this.with = with;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    public void setHeight(double height) {
//        this.height = height;
//    }
//
//    @Override
//    public double getArea() {
//       return with*height;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return (with+height)*2;
//    } 
//    
//}
//public class contestdahinh {
//    public static void dispaly(Geometric o){   
//        System.out.println(String.format("%.2f",o.getArea())+" "+String.format("%.2f",o.getPerimeter()));
//    }
//    public static boolean checkArea(Geometric o1,Geometric o2){    
//        return o1.getArea()==o2.getArea();
//    }
//    
//    public static void main(String[] args) {
//        Geometric t1=new Circle(10,"Red", true);
//        Geometric t2=new Rectangle(10,20,"Blue",true);
//        System.out.println(checkArea(t1, t2));
//        dispaly(t1);
//        dispaly(t2);
//        
//    }
//}
//lop hinh
//abstract class Shape{   
//    String color;
//    boolean filled;
//
//    public Shape(String color, boolean filled) {
//        this.color = color;
//        this.filled = filled;
//    }
//
//    public Shape() {
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public boolean isFilled() {
//        return filled;
//    }
//
//    public void setFilled(boolean filled) {
//        this.filled = filled;
//    }
//    public abstract double getArea();;
//    public abstract double getPremeter();
//}
// 
//  class Circle extends Shape{   
//      protected double radius;
//
//    public Circle() {
//    }
//
//    public Circle(double radius, String color, boolean filled) {
//        super(color, filled);
//        this.radius = radius;
//    }
//
//    public double getRadius() {
//        return radius;
//    }
//
//    public void setRadius(double radius) {
//        this.radius = radius;
//    }
//
//    @Override
//    public double getArea() {
//        return  3.14*radius*radius;
//    }
//
//    @Override
//    public double getPremeter() {
//       return 2*3.14*radius;
//    }
//    @Override
//    public String toString(){   
//        return "----------"+"\n"+"Radius:"+String.format("%.2f",radius)
//                +"\n"+"Color:"+color+"\n"+"Filled:"+filled+"\n"
//                +"Premeter:"+String.format("%.2f",getPremeter())
//                +"\n"+"Area:"+String.format("%.2f",getArea());  
//    }
//    
//  }
//  class Rectangle extends Shape{    
//      protected double with,length;
//
//    public Rectangle() {
//    }
//
//    public Rectangle(double with, double length, String color, boolean filled) {
//        super(color, filled);
//        this.with = with;
//        this.length = length;
//    }
//
//    
//
//    @Override
//    public double getArea() {
//        return with*length;
//    }
//
//    @Override
//    public double getPremeter() {
//        return (with+length)*2.0;
//    }
//    
//    @Override
//    public String toString(){   
//        return "----------"+"\n"+"With:"+String.format("%.2f",with)
//                +"\n"+"Length:"+String.format("%.2f",length)
//                +"\n"+"Color:"+color+"\n"+"Filled:"+filled+"\n"
//                +"Premeter:"+String.format("%.2f",getPremeter())
//                +"\n"+"Area:"+String.format("%.2f",getArea()) 
//                +"\n"+"----------";
//    }
//    
//  }
//
//  class Square extends Rectangle{   
//
//    public Square() {
//    }
//
//    public Square(double with, double length, String color, boolean filled) {
//        super(with, length, color, filled);
//    }
//
//   
//
//    @Override
//    public double getPremeter() {
//        return (with+length)*2;
//    }
//
//    @Override
//    public double getArea() {
//       return with*length;
//    }
//     @Override
//    public String toString() {
//        return "----------"+"\n"+"With:"+String.format("%.2f",with)
//                +"\n"+"Length:"+String.format("%.2f",length)
//                +"\n"+"Color:"+color+"\n"+"Filled:"+filled+"\n"
//                +"Premeter:"+String.format("%.2f",getPremeter())
//                +"\n"+"Area:"+String.format("%.2f",getArea()) 
//                +"\n"+"----------";
//    }
//  }
//  
//  
//  
//public class contestdahinh {
//    public static void main(String[] args) {
//        String input="D:\\HOC JAVA\\file\\shape1.txt";
//        try {
//            Scanner sc=new Scanner(new File(input));
//            int n=Integer.parseInt(sc.nextLine());
//            ArrayList<Shape> arr=new ArrayList<>();
//            for(int i=0;i<n;i++){   
//                String type=sc.next();
//              if(type.equals("C")){ 
//                  double r=Double.parseDouble(sc.next());
//                  String color=sc.next();
//                  boolean kinds=sc.nextBoolean();
//                  Circle c=new Circle(r, color, kinds);
//                  arr.add(c);
//              }
//              else if(type.equals("R")){    
//                  double with=Double.parseDouble(sc.next());
//                  double length=Double.parseDouble(sc.next());
//                  String color1=sc.next();
//                  boolean kinds=sc.nextBoolean();
//                  Rectangle r=new Rectangle(Math.min(with,length),Math.max(with,length), color1, kinds);
//                  arr.add(r);
//              }
//              else{ 
//                  
//                  double length2=Double.parseDouble(sc.next()); 
//                  String color2=sc.next();
//                  boolean kinds2=sc.nextBoolean();
//                  Square s=new Square(length2, length2, color2, kinds2);
//                  arr.add(s);
//                  
//              }
//            }
//            System.out.println("List Circle:");
//            for(Shape t:arr){   
//               if(t instanceof Circle){ 
//                   System.out.println(t);
//               }
//            }
//            System.out.println("List Rectangle");
//            for(Shape t:arr){   
//               if(t instanceof Rectangle&&!(t instanceof Square)){ 
//                   System.out.println(t);
//               }
//            }
//            System.out.println("List Square:");
//            for(Shape t:arr){   
//               if((t instanceof Square)){ 
//                   System.out.println(t);
//               }
//            }
//        } catch (IOException e) {
//            System.out.println("File not found"+input);
//        }
//    }
//}
//interface Lop hinh tron va hinh chu nhat
// interface  Geometric{   
//     abstract double getArea();
//     abstract double getPremeter();
//     
//     
//}
// class Circle implements Geometric{ 
//     double radius;
//
//    public Circle() {
//    }
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//    
//
//    @Override
//    public double getArea() {
//        return 3.14*radius*radius;
//    }
//
//    @Override
//    public double getPremeter() {
//        return 2*3.14*radius;
//    }
//    public String toString(){   
//        return "-----------"+"\n"+"Radius:"+String.format("%.2f",radius)
//                +"\n"+"Premeter:"+String.format("%.2f",getPremeter())
//                +"\n"+"Area:"+String.format("%.2f",getArea());
//                
//               
//    }
//    
// }
//class Ractangcle implements Geometric{  
//     double width,length;
//
//    public Ractangcle() {
//    }
//
//    public Ractangcle(double width, double length) {
//        this.width = width;
//        this.length = length;
//    }
//
//    @Override
//    public double getArea() {
//        return width*length;
//    }
//
//    @Override
//    public double getPremeter() {
//        return (width+length)*2;
//    }
//     public String toString(){   
//        return "-----------"+"\n"+"Length:"+String.format("%.2f",length)+"\n"+"With:"
//                +String.format("%.2f",width)
//                +"\n"+"Premeter:"+String.format("%.2f",getPremeter())
//                +"\n"+"Area:"+String.format("%.2f",getArea());
//               
//    }
//}
//
//  public class contestdahinh {
//      public static void main(String[] args) {
//          String input="D:\\HOC JAVA\\file\\geometric1.txt";
//          try {
//              Scanner sc=new Scanner(new File(input));
//              int n=Integer.parseInt(sc.nextLine());
//              ArrayList<Geometric> arr=new ArrayList<>();
//              for(int i=0;i<n;i++){  
//                  String type=sc.next();
//                  if(type.equals("C")){ 
//                      double r=Double.parseDouble(sc.next());
//                      Circle c=new Circle(r);
//                      arr.add(c);
//                  }
//                  else{ 
//                      double width=Double.parseDouble(sc.next());
//                      double length=Double.parseDouble(sc.next());
//                      Ractangcle r=new Ractangcle(Math.min(width,length),Math.max(width, length));
//                      arr.add(r);
//                  }
//              }
//              System.out.println("List Circle:");
//              for(Geometric t:arr){ 
//                  if(t instanceof Circle){  
//                      System.out.println(t);
//                  }
//              }
//              System.out.println("List Rectangcle:");
//              for(Geometric t:arr){ 
//                  if(t instanceof Ractangcle){  
//                      System.out.println(t);
//                  }
//              }
//          } catch (IOException e) {
//              System.out.println("File not found"+input);
//          }
//      }
//  }  
//bai toan n lan thay doi r hing tron
//interface Geometric {
//
//    abstract double getArea();
//
//    abstract double getPremeter();
//
//}
//
//class Circle implements Geometric {
//
//    double r;
//
//    public Circle() {
//    }
//
//    public Circle(double r) {
//        this.r = r;
//    }
//
//    @Override
//    public double getArea() {
//        return 3.14 * r * r;
//    }
//
//    @Override
//    public double getPremeter() {
//        return 2 * 3.14 * r;
//
//    }
//
//    @Override
//    public String toString() {
//        return String.format("%.2f %.2f %.2f", r, getPremeter(), getArea());
//    }
//}
//
//interface Resizable {
//
//    void resize(int percent);
//}
//
//class ResizableCircle extends Circle implements Resizable {
//
//    public ResizableCircle() {
//    }
//
//    public ResizableCircle(double r) {
//        super(r);
//    }
//
//    @Override
//    public void resize(int percent) {
//        r *= (1 + percent / 100.0);
//    }
//
//}
//
//public class contestdahinh {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n =Integer.parseInt(sc.nextLine());
//
//        for (int i = 0; i < n; i++) {
//            double r = Double.parseDouble(sc.next());
//            int m = Integer.parseInt(sc.next());
//            ResizableCircle c = new ResizableCircle(r);
//            for (int j = 0; j < m; j++) {
//                int change = Integer.parseInt(sc.next());
//                c.resize(change);
//                System.out.println(c);
//            }
//        }
//        sc.close();
//
//    }
//}
//lop toa do 4 diem
interface Movable {

    abstract void moveUp();

    abstract void moveDown();

    abstract void moveLeft();

    abstract void moveRight();

}

class MovablePoint implements Movable {

    int x, y, xSpeed, ySpeed;

    public MovablePoint() {
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    public String toString() {
        return "("+x+","+y+")"+"\n"+"Speed:"+"("+xSpeed+","+ySpeed+")"+"\n"+"-----------";
    }

}

public class contestdahinh {

    public static void main(String[] args) {
        String input = "D:\\HOC JAVA\\file\\point1.txt";
        String outfile="D:\\HOC JAVA\\file\\point1_result.txt";
        try {
            Scanner sc = new Scanner(new File(input));
            int n = Integer.parseInt(sc.next());
            ArrayList<MovablePoint> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(sc.next());
                int y = Integer.parseInt(sc.next());
                int xspeed = Integer.parseInt(sc.next());
                int yspeed = Integer.parseInt(sc.next());
                int m = Integer.parseInt(sc.next());
                MovablePoint point = new MovablePoint(x, y, xspeed, yspeed);
                for (int j = 0; j < m; j++) {
                    String type = sc.next();
                    if (type.equals("Down")) {
                        point.moveDown();
                    } else if (type.equals("Up")) {
                        point.moveUp();
                    } else if (type.equals("Right")) {
                        point.moveRight();
                    } else {
                        point.moveLeft();
                    }
                }
                arr.add(point);
            }
            sc.close();
            
//            for(MovablePoint m:arr){    
////                System.out.println(m);
//            }
           BufferedWriter wr=new BufferedWriter(new FileWriter(outfile,true));
           for(MovablePoint m:arr){    
                wr.write(m.toString());
                wr.newLine();
                
            }
            System.out.println("Ghi thanh cong results");
           wr.close();
           
           
                
        
        } catch (IOException e) {
            System.out.println("File not Found" + input);
            System.out.println("Da xay ra loi"+e.getMessage());
        }
    }
}
