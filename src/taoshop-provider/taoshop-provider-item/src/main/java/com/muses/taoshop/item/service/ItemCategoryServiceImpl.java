package com.muses.taoshop.item.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.muses.taoshop.item.entity.ItemCategory;
import com.muses.taoshop.item.entity.ItemList;
import com.muses.taoshop.item.mapper.ItemCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

/**
 * <pre>
 *  商品品类信息服务实现类
 * </pre>
 *
 * @author nicky
 * @version 1.00.00
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期: 2018.06.17 11:01    修改内容:
 * </pre>
 */
@Service(version = "1.0.0")
public class ItemCategoryServiceImpl implements IItemCategoryService{

    @Autowired
    ItemCategoryMapper itemCategoryMapper;

    /**
     * 查询根级商品品类信息
     *
     * @return
     */
    @Override
    public List<ItemCategory> listRootCategory() {
        return itemCategoryMapper.listRootCategory();
    }

    /**
     * 查询所有的商品品类信息
     * @return
     */
    @Override
    public List<ItemCategory> listCategory() {
        return itemCategoryMapper.listCategory();
    }

    /**
     * 根据品目id获取商品信息
     *
     * @return
     */
    @Override
    public List<ItemList> listItemByCategoryId(int categoryId) {
        return itemCategoryMapper.listItemByCategoryId(categoryId);
    }


}
