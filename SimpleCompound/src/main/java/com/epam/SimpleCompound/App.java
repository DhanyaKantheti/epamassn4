package com.epam.SimpleCompound;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
	double simpleInterest(double amount,int rate,int time) {
		LOGGER.info("Calculation of SimpleInterest");
    	return (amount*rate*time)/100;
    }
    double compoundInterest(double amount,int rate,int time,int numOftimes) {
    	LOGGER.info("Calculation of CompoundInterest");
        double compoundInterest = amount * Math.pow(1 + (rate /numOftimes), numOftimes * time);
        double cinterest = compoundInterest - amount;
        return cinterest;
    }
    public static void main(String args[]) {
    	App ap=new App();
    	LOGGER.info(ap.simpleInterest(1000, 5, 5));
    	LOGGER.info(ap.compoundInterest(1000, 4, 2, 1));
    }
}
 

