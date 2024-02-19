import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig 
{
	@Bean
	public Samsung samsung()
	{
		return new Samsung();
	}
	@Bean
	public MobileProcessor processor()
	{
		return new Exynos();
	}
}
