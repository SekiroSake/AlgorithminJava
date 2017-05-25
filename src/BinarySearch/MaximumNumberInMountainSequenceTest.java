package BinarySearch;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaximumNumberInMountainSequenceTest {
	MaximumNumberinMountainSequence test = new MaximumNumberinMountainSequence();
	@Test
	public void test() {
		assertEquals(10,10);
	}
	
	@Test
	public void test10987() {
		int[] num = {10,9,8,7};
		System.out.println(test.mountainSequence(num));
		assertEquals(10,test.mountainSequence(num));
	}
}
