package com.springjbehave.sample.spring_jbehave.steps;

import junit.framework.Assert;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class MySteps {
	
	
	@Given("I am a pending step")
	public void given1()
	{
		System.out.println("public void given1()");
	}
	
	@Given("I am still pending step")
	public void given2()
	{
		System.out.println("public void given2()");
	}
	
	@When("a good soul will implement me")
	public void when()
	{
		System.out.println("public void when()");
	}
	
	@Then("I shall be happy")
	public void then()
	{
		Assert.assertTrue(true);
	}
    
}
