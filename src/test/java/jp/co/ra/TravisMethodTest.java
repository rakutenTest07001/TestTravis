package jp.co.ra;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class TravisMethodTest {
	
	@Spy
	TravisMethod travisMethod;
	
	@Test
	public void testAdd(){
		int actual = travisMethod.add(1, 2);
		Assert.assertEquals(3, actual);
	}
}
