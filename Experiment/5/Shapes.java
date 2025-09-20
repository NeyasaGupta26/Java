class Shape
{
	void show()
	{
		System.out.println("This is This is shape");
	}
}

class Rectangle extends Shape
{
   void show1()
	{
		System.out.println("This is rectangular shape");
	}	
}

class Circle extends Shape
{
   void show2()
	{
		System.out.println("This is circular shape");
	}	
}

class Square extends Rectangle
{
   void show3()
	{
		System.out.println("Square is a rectangle ");
	}	
}

class Shapes
{
	public static void main(String[] args)
	{
		Square s = new Square();
		s.show();
		s.show1();
		s.show3();
		System.out.println("Neyasa Gupta 24csu280");
	}
}