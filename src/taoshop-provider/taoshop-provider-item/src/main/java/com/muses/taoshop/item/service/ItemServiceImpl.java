package com.muses.taoshop.item.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.muses.taoshop.item.entity.ItemDetail;
import com.muses.taoshop.item.entity.ItemPortal;
import com.muses.taoshop.item.entity.ItemSpec;
import com.muses.taoshop.item.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

/**
 * <pre>
 *  商品信息服务实现类
 * </pre>
 *
 * @author nicky
 * @version 1.00.00
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期: 2018.06.24 22:37    修改内容:
 * </pre>
 */
@Service(version = "1.0.0")
public class ItemServiceImpl implements IItemService {

    @Autowired
    ItemMapper itemMapper;

    /**
     * 在门户网站列出商品粗略信息
     *
     * @return
     */
    @Override
    public List<ItemPortal> listItemPortal() {
        return itemMapper.listItemPortal();
    }

    /**
     * 获取商品详情信息
     * @return ItemDetail
     */
    @Override
    public ItemDetail getItemDetailInfo(int spuId){
        ItemDetail itemDetail = itemMapper.getItemDetail(spuId);
        return  itemDetail;
    }


}
