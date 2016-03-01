package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	
	//defining some variables for 4 test cases of my code
	static double tuition1, tuition2, tuition3, tuition4;
	static double percentincrease1, percentincrease2, percentincrease3, percentincrease4;
	static double interestrate1, interestrate2, interestrate3, interestrate4;
	static double years1, years2, years3, years4;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


	
	@Test
	public void testloancalc1() {
		tuition1 = 12500;
		percentincrease1 = .07;
		interestrate1 = .05;
		years1 = 10;
		double expected1 = 588.66;
		double actual1 = SchoolLoans.LoanCalc(tuition1, percentincrease1, interestrate1, years1);
		assertEquals(expected1,actual1,1);
	}
	
	public void testloancalc2() {
		tuition2 = 13000;
		percentincrease2 = .07;
		interestrate2 = .08;
		years2 = 15;
		double expected2 = 551.6;
		double actual2 = SchoolLoans.LoanCalc(tuition2, percentincrease2, interestrate2, years2);
		assertEquals(expected2,actual2,1);
	}
	
	public void testloancalc3() {
		tuition3 = 10000;
		percentincrease3 = .07;
		interestrate3 = .05;
		years3 = 5;
		double expected3 = 837.87;
		double actual3 = SchoolLoans.LoanCalc(tuition3, percentincrease3, interestrate3, years3);
		assertEquals(expected3,actual3,1);
	}
	
	public void testloancalc4() {
		tuition4 = 12500;
		percentincrease4 = .07;
		interestrate4 = .08;
		years4 = 12;
		double expected4 = 600.75;
		double actual4 = SchoolLoans.LoanCalc(tuition4, percentincrease4, interestrate4, years4);
		assertEquals(expected4,actual4,1);
	}
}
