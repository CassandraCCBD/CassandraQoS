public class Hello {
	public native int HelloWorld();
	static {
		System.loadLibrary("hello");
	}
	int returnThread()
	{
		int id=HelloWorld();
		return id;
	}
}
	
