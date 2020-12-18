  package com.tcs.fresco;

import java.util.HashMap;
import java.util.Map;

import org.junit.*;

import junit.framework.TestCase;

public class SolutionTest extends TestCase{
    Map<Integer, String> customerTag = null;
	int custId = 0;
	Solution solution = new Solution();
    
    @Before
	public void setUp() throws Exception {
		custId = 10511;
		customerTag = new HashMap<Integer, String>();
	}
    
    //Write your test cases here
    @org.junit.Test
    public void test() {
      solution.saveCustomer(custId, "Rishabh");
    	assertTrue( solution.isCustomerExist("Rishabh") );
    }
    
    
    @After
	public void tearDown() throws Exception {

		customerTag.clear();
	}
}