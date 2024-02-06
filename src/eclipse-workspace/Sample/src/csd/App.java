/*----------------------------------------------------------------------------------------------------------------------
	Çağıran metodun (caller) ait olduğu sınıf ile çağrılan metodun (callee) ait olduğu sınıf aynı paket içerisindeyse 
	çağrı sırasında paket ismi kullanılmasına gerek yoktur. Çağıran metot ile çağrılan metot aynı sınıf içerisindeyse
	ve paket ismi çağrıda kullanılmamışsa sınıf ismi de yazmaya gerek yoktur. Aşağıdaki demo örneği inceleyiniz
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		System.out.println("Hello, World");
		Sample.foo();
		Mample.bar();
		System.out.println("Goodbye, World");
	}
}


class Sample {
	//...
	public static void foo()
	{
		tar();
		System.out.println("foo");
		Mample.bar();
	}
	
	public static void tar()
	{
		System.out.println("tar");
	}
}

class Mample {
	//...
	public static void bar()
	{
		System.out.println("bar");
	}
}