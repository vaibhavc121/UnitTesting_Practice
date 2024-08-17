package practiceTest;

import practiceDev.Multi;

public class MultiTest extends Multi
{

	public static void main(String[] args)
	{
		Multi ob = new Multi();
		ob.a = 2;
		ob.b = 2;

		System.out.println(ob.a * ob.b);
		ob.mul();

	}

}
