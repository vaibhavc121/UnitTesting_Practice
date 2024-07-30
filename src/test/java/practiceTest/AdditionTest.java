package practiceTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import practiceDev.Addition;

public class AdditionTest extends Addition
{
	@Test
	void test()
	{
		int res = add(2, 2);
		int exp = 4;
		Assert.assertEquals(res, exp);

	}

}
