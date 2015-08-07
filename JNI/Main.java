import org.apache.cassandra.Native.Hello;
public class Main {
	public static void main(String args[])
	{
		int thread;
		Hello obj = new Hello();
		obj.returnThread();
		while (true);
	}
}
