package spring;
import org.springframework.stereotype.Component;

@Component
public class Exynos implements MobileProcessor {

	@Override
	public void process()
	{
		System.out.println("The processor used in the phone is Exynos!!!");
	}
	
}
