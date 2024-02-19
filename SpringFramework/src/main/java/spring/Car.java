package spring;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle
{
	@Override
	public void drive() 
	{
		System.out.println("I am going in Car...");
	}
}
