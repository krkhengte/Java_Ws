package jfs.backend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("Spring_Beans.xml");// it is used to start the IOC
																						// container

		BillCollector bc = ac.getBean("billCollector", BillCollector.class);// by using we can get the bean object form
																			// IOC
		bc.collectPayment(14000.0);

	}

}
