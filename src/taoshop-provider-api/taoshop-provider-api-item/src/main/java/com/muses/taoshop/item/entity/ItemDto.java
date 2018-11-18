package com.muses.taoshop.item.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * <pre>
 *  商品信息DTO类
 * </pre>
 *
 * @author nicky
 * @version 1.00.00
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期: 2018.10.28 11:51    修改内容:
 * </pre>
 */
@Data
public class ItemDto implements Serializable{
    /**
     * spu编号
     */
    private String spuCode;
    /**
     * 商品名称
     */
    private String itemName;
    /**
     * 品类id
     */
    private Long categoryId;
    /**
     * 品牌id
     */
    private Long brandId;
    /**
     * 商家id
     */
    private Long shopId;
    /**
     * 品目名称
     */
    private String categoryName;
}
