package Beans;
	import org.springframework.beans.factory.BeanFactory;
	import org.springframework.beans.factory.xml.XmlBeanFactory;
	import org.springframework.core.io.ClassPathResource;
	import org.springframework.core.io.Resource;

	public class Logic {

		public static void main(String[] args)
		{
			Resource res = new ClassPathResource("Springconfig.xml");
			BeanFactory factory = new XmlBeanFactory(res);

			Object o = factory.getBean("id1");
			WelcomeBean wb = (WelcomeBean)o;

			wb.show();

		}
}
