package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.main.Demo1_Junit;

public class Test1 {
	@Test
	public void max() {
		assertEquals(8, Demo1_Junit.findMax(new int[] { 1, 3, 4, 2, 8 }));
		assertEquals(-1, Demo1_Junit.findMax(new int[] { -12, -1, -3, -4, -2 }));
	}
}
