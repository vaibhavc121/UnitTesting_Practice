package practiceDev;

public class Multi
{
	public int a;
	public int b;

	public void mul()
	{
		System.out.println(a * b);
	}

	public static void main(String args[])
	{
		Multi ob = new Multi();
		ob.a = 2;
		ob.b = 2;
		ob.mul();
	}
}
