import org.apache.naming.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import com.gjy.springdemo.hellow;
import com.gjy.springdemo.helloworld;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class mytest1 {
    public static void main(String[] args) {
        /*
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        hellow a = (hellow) context.getBean("hello");
        a.setName("GJY");
        a.show();
        hellow b = (hellow) context.getBean("hello");
        b.setName("GJYB");
        a.show();
        b.show();
        System.out.println(a == b);
        */


        //init destroy 回调方法
        AbstractApplicationContext context2 = new ClassPathXmlApplicationContext("beans.xml");
        hellow aa = (hellow) context2.getBean("hello");
        aa.show();
        //context2.close();
        context2.registerShutdownHook();



        /*ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");//获取spring上下文对象
        //spring管理我们的对象，无参方法构造对象 默认方法
        hellow hello = (hellow) context.getBean("hello");
        System.out.println(hello.getName());
        hello.show();
        XmlBeanFactory Factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        helloworld obj = (helloworld) Factory.getBean("beanhello");
        obj.getMessage();
        */

    }
}
