package Stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	
	@Before
	public void beforevalidation() {
		System.out.println("Before Execution");
	}
	
	@After
	public void aftervalidation() {
		System.out.println("After Execution");
	}
}
