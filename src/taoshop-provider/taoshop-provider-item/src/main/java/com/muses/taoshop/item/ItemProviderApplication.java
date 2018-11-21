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
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableDubbo(scanBasePackages="com.muses.taoshop")
@SpringBootApplication
public class ItemProviderApplication {
  //  private static final Logger logger = Logger.getLogger(ItemProviderApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ItemProviderApplication.class, args);
//		logger.info("项目启动!");
//		CountDownLatch closeLatch = ctx.getBean(CountDownLatch.class);
//		closeLatch.await();
    }

}
