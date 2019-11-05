package com.viva.electricity;


public class ElectrictyBillingApp {

	public static double getBillAmount(int previousMeterReading, int presentMeterReading) throws IllegalArgumentException
	{

		Double totalAmount = 0.00;
		int netMeterReading = 0;

		if(previousMeterReading<presentMeterReading)
		{
			netMeterReading  = presentMeterReading - previousMeterReading;
			Double currentBillAmount = 0.00;
			Double tax = 0.00;
			int remainingUnits = 0;
			Double first20 = 0.00;
			Double next30 = 0.00;
			Double next50 = 0.00;
			Double above100 = 0.00;

			if(netMeterReading>0 && netMeterReading<=20)
			{
				first20 = presentMeterReading * 2.00;
			}
			else
			{
				first20 = 20 * 2.00;
				remainingUnits = netMeterReading - 20;
				if(netMeterReading>=21 && netMeterReading<=50)
				{
					next30 = remainingUnits * 3.00;
				}
				else 
				{
					next30 = 30 * 3.00;
					remainingUnits = remainingUnits - 30;
					if(netMeterReading>=51 && netMeterReading<=100)
					{
						next50 = remainingUnits * 3.50;
					}
					else
					{
						next50 = 50 * 3.50;
						remainingUnits = remainingUnits-50;
						if(netMeterReading>100)
						{
							above100 = remainingUnits * 4.00;
						}
					}
				}
			}
			currentBillAmount = first20 + next30 + next50 + above100;
			tax = ((currentBillAmount)*12.50) / 100;
			totalAmount = currentBillAmount + tax;
		}
		else
		{
			throw new IllegalArgumentException();
		}
		return totalAmount;
	}
}
