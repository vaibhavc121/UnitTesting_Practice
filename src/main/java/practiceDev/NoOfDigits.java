package practiceDev;

public class NoOfDigits
{
	public int digits(int num)
	{
		int cnt = 0;
		while (num > 0)
		{

			num = num / 10;
			cnt++;
		}
		return cnt;

	}

}
