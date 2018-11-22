package com.muses.taoshop.item.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.muses.taoshop.item.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.rmi.registry.Registry;

/**
 * <pre>
 *  Dubbo配置类
 * </pre>
 *
 * @author nicky
 * @version 1.00.00
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期: 2018.11.21 23:33    修改内容:
 * </pre>
 */
@Configuration
public class ItemDubboConfig {

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("taoshop-provider-item");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("127.0.0.1:2181");
        return registryConfig;
    }

    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20882);
        return protocolConfig;
    }

//    @Bean
//    public ServiceConfig<IItemService> itemServiceServiceConfig(IItemService itemService){
//        ServiceConfig<IItemService> serviceConfig = new ServiceConfig<>();
//        serviceConfig.setInterface(IItemService.class);
//        serviceConfig.setRef(itemService);
//        serviceConfig.setVersion("1.0.0");
//        return serviceConfig;
//    }

}
