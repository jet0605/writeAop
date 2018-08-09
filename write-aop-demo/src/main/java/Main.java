import com.example.writeaopdemo.ApplicationContext;
import com.example.writeaopdemo.domain.Test;

import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args){
        //模拟容器初始化
        ApplicationContext applicationContext = new ApplicationContext();
        ConcurrentHashMap<String,Object> proxyBeanMap = ApplicationContext.proxyBeanMap;
        //生成代理对象，默认为该类名的小写
        Test test =(Test)proxyBeanMap.get("test");
        test.doSomeThing();
        System.out.println("------------");
        test.doWithNotProxy();
    }
}
