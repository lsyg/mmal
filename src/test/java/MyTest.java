import com.company.dao.CartMapper;
import com.company.pojo.Cart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/11/27.
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        CartMapper cm  = app.getBean(CartMapper.class);
        System.out.println(cm.selectByPrimaryKey(126));
    }
}
