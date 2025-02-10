class Concatenation
{
	public static void main(String [] args)
	{
		System.out.println("---case01:- Number+Number = add");
		System.out.println(10+50); //60

		System.out.println("---case02:- Number + Char = add");
		System.out.println(10+'A'); //75 bcz ASCIC of A=65 so 10+65=75

		System.out.println("---case03:- Number + String = con");
		System.out.println(10+"A"); //10A 
		System.out.println(30+"JAVA"); //30JAVA 

		System.out.println("---case04:- Char + Number = add");
		System.out.println('1'+60); //109=49+60

		System.out.println("---case05:- Char + Char = add");
		System.out.println('a'+'A'); //97+65=162

		System.out.println("---case06:- Char + String = con");
		System.out.println('9'+"java"); //9java
		System.out.println('A'+"java"); //Ajava
			
		System.out.println("---case07:- String + Number = con");
		System.out.println("java" + 100); //java100

		System.out.println("---case08:- String + Char = con");
		System.out.println("java" + 'Z'); //javaZ

		System.out.println("---case09:- String + String = con");
		System.out.println("java" + "mava"); //javamava
		System.out.println("1"+"2"); //12

		System.out.println("---case10:- Number + Boolean = cte");
		//System.out.println(10 + true); 
		//error

		System.out.println("---case11:- Char + Boolean = cte");
		// System.out.println('a' + false); 
		//error

		System.out.println("---case12:- Boolean + Boolean = cte");
		// System.out.println(true + false); 
		//error

		System.out.println("---case13:- Boolean + String = con");
		System.out.println(true + "false"); //truefalse

		System.out.println("---case14:- Number + Number + String  = ");
		System.out.println(10+50+"java"); //60java

		System.out.println("---case15:- String + Number + Number = ");
		System.out.println("java"+10+50); //java1050

		System.out.println("---case16:- String + (Number + Number) = ");
		System.out.println("java"+(10+50)); //java60

		System.out.println("---case16:- String + (Number + Number) = ");
		System.out.println("java"+' '+"mava"); //java mava
		System.out.println("java"+" mava"); //java mava
		System.out.println("java"+" "+10); //java 10
		
	}
}