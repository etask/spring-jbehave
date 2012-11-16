package com.springjbehave.sample.spring_jbehave.steps;

import junit.framework.Assert;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class AlternativeSteps {
	@Given("I am a pending step")
	public void alt_given1()
	{
		System.out.println("public void given1()");
	}
	
	@Given("I am still pending step")
	public void alt_given2()
	{
		System.out.println("public void given2()");
	}
	
	@When("a good soul will implement me")
	public void alt_when()
	{
		System.out.println("public void when()");
	}
	
	@Then("I shall be happy")
	public void alt_then()
	{
		Assert.assertTrue(true);
	}
}
