package com.viva.electricity;

import static org.junit.Assert.*;

import org.junit.Test;

public class ElectrictyBillingAppTest {

	@Test
	public void UTC01_01() {
		int previousReading = 7493;
		int presentReading = 7902;
		double expectedBillAmount = 1733.625;
		assertEquals(expectedBillAmount, ElectrictyBillingApp.getBillAmount(
				previousReading, presentReading), 0.5);
	}

	@Test
	public void UTC01_02() {
		int previousReading = 12909;
		int presentReading = 13400;
		double expectedBillAmount = 2102.62;
		assertEquals(expectedBillAmount, ElectrictyBillingApp.getBillAmount(
				previousReading, presentReading), 0.5);
	}

	@Test
	public void UTC01_03() {
		int previousReading = 145;
		int presentReading = 179;
		double expectedBillAmount = 92.25;
		assertEquals(expectedBillAmount, ElectrictyBillingApp.getBillAmount(
				previousReading, presentReading), 0.5);
	}

	@Test
	public void UTC01_04() {
		int previousReading = 8852;
		int presentReading = 8909;
		double expectedBillAmount = 173.81;
		assertEquals(expectedBillAmount, ElectrictyBillingApp.getBillAmount(
				previousReading, presentReading), 0.5);
	}

	@Test(expected = IllegalArgumentException.class)
	public void UTC01_05() {
		int previousReading = 9800;
		int presentReading = 1200;
		ElectrictyBillingApp.getBillAmount(previousReading, presentReading);
		fail("Should not execute this line");
	}

}
