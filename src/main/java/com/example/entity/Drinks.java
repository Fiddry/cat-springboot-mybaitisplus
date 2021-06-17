package com.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Fiddry
 * @since 2021-06-15
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    @TableName("Drinks")
public class Drinks implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId("goodsID")
      private String goodsID;

    @TableField("itemsID")
    private String itemsID;

    @TableField("buyingPrice")
    private Float buyingPrice;

    private Float dose;

    @TableField("goodsName")
    private String goodsName;


}
