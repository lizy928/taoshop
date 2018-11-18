package com.muses.taoshop.item;

/**
 * <pre>
 *  服务提供者
 * </pre>
 *
 * @author nicky
 * @version 1.00.00
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期: 2018.11.17 23:24    修改内容:
 * </pre>
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;


import java.util.concurrent.CountDownLatch;

@SpringBootApplication
//@ImportResource({"classpath:dubbo-provider.xml"})
public class ItemProviderApplication {
  //  private static final Logger logger = Logger.getLogger(ItemProviderApplication.class);

    @Bean
    public CountDownLatch closeLatch() {
        return new CountDownLatch(1);
    }

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx = SpringApplication.run(ItemProviderApplication.class, args);
//		logger.info("项目启动!");
//		CountDownLatch closeLatch = ctx.getBean(CountDownLatch.class);
//		closeLatch.await();
    }

}
