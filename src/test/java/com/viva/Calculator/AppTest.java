package com.viva.Calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AppTest 
{
	App app;
	@Before
	public void init() {
		app = new App();
	}
	
	@Test
	public void addTrue() {
		assertEquals(25, app.add(12, 13));
	}
	@Test
	public void addFail() {
		assertNotEquals(25, app.add(15, 13));
	
	}
	
	@Test
	public void subTrue() {
		assertEquals(3, app.sub(16, 13));
	}
	@Test
	public void subFail() {
		assertNotEquals(2, app.sub(16, 13));
	}
	
	@Test
	public void mulTrue() {
		assertEquals(25, app.mul(5, 5));
	}
	@Test
	public void mulFail() {
		assertNotEquals(25, app.mul(5, 6));
	}
	
	
	@Test
	public void divTrue() {
		assertEquals(1, app.div(12, 12));
	}
	@Test
	public void divFail() {
		assertNotEquals(1, app.div(24, 12));
	}
	
  
}
