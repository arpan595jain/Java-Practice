class Shape 
{
  void draw() 
{ 
  System.out.println("shape is draw"); 
} 
void erase() { 
  
System.out.println("shape is erase");
} 
} 
class Circle extends Shape 
{ 
  void draw() //overriding { 
  
System.out.println("circle is draw");
} 
void erase() //overriding
  {
  System.out.println("circle is erase");
}
} 
class Triangle extends Shape 
{ 
  void draw(int x) //overloading { 
  System.out.println("Triangle is draw"); 
}
 void erase() //overriding 
{ 
  System.out.println("Triangle is erase");
} 
} 
class Square extends Shape 
{ 
  void draw() //overriding { 
System.out.println("square is draw");
} 
void erase() //overriding { 
  
System.out.println("square is erase");
}
} 
public class ShapeMain { 
public static void main(String[] args) { 
// TODO Auto-generated method stub
Circle c= new Circle(); 
c.draw(); 
c.erase(); 
Triangle t = new Triangle(); 
t.draw(); 
t.draw(10); 
t.erase(); 
Square s = new Square(); 
s.draw(); 
s.erase(); 
Shape s1 = new Circle(); 
s1.draw(); 
s1.erase(); 
} 
}
