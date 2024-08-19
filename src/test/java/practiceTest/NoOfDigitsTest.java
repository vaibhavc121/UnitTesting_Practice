package practiceTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import practiceDev.NoOfDigits;

public class NoOfDigitsTest
{
	@Test
	public void verifydigit()
	{
		NoOfDigits ob = new NoOfDigits();
		int act = ob.digits(12345);
		int exp = 5;
		Assert.assertEquals(act, exp);

	}
}
