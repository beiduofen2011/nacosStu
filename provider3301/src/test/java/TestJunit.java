import com.fen.dou.Application;
import com.fen.dou.service.IProductService;
import com.fen.dou.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
public class TestJunit {

    @Autowired
    private IUserService userService;

    @Autowired
    private IProductService productService;

    @Test
    public void testSay() throws Exception {
        userService.findUser();
    }
}