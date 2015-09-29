import java.io.*;
public class genInsert {

	public static void main(String []arg)
	{
		
	    try {
	    	PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("/root/Cassandra_Team/CassandraQoS/cassandra/insertload", true)));
		
		for (int i=0;i<1000;i++)
		{
			out.println("DELETE FROM test.users WHERE age = "+  i+ ";");
		}
		out.close();
	    }catch(IOException e){}
	    //out.close();
	}
}

