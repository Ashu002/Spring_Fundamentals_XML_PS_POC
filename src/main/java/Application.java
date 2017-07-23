import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.service.CustomerService;

/**
 * Created by ashutosh on 23/7/17.
 */
public class Application {
	public static void main(String... args) {
		//CustomerService service = new CustomerServiceImpl();
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService service = applicationContext.getBean("customerService", CustomerService.class);
		System.out.println(service);
		CustomerService service1 = applicationContext.getBean("customerService", CustomerService.class);
		System.out.println(service1); // will be same address when scope will singleton but will be differ when scope will be prototype
		System.out.println(service.findAll().get(0).getFirstName()  );
	}
}
