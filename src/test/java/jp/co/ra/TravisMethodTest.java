package jp.co.ra;

import java.util.ArrayList;
import java.util.List;

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
	
	@Test
	public void testGreatThan10(){
		List<Integer> test = new ArrayList<>();
		test.add(20);
		test.add(7);
		List<Integer> actual = travisMethod.greatThan10(test);
		Assert.assertEquals(1, actual.size());
	}
}
