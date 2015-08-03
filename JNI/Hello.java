public class Hello {
	public native int HelloWorld();
	static {
		System.loadLibrary("hello");
	}

	public static void main(String args[])
	{
		Hello object = new Hello();
		int id = object.HelloWorld();
		System.out.println("id is " + id);
		while (true);
	}
}

