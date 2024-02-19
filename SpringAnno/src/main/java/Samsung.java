import org.springframework.beans.factory.annotation.Autowired;

public class Samsung 
{
	@Autowired
	private MobileProcessor processor;
	
	public MobileProcessor getProcessor() {
		return processor;
	}

	public void setProcessor(MobileProcessor processor) {
		this.processor = processor;
	}

	public void config()
	{
		System.out.println("This is Samsung F34  ");
		processor.process();
	}
}
