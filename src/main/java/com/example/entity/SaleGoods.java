package com.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
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
    @TableName("SaleGoods")
public class SaleGoods implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId("goodsID")
      private String goodsID;

    @TableField("Inventory")
    private Integer Inventory;

    @TableField("productionDate")
    private LocalDate productionDate;

    @TableField("buyingPrice")
    private Float buyingPrice;

    @TableField("salePrice")
    private Float salePrice;

    @TableField("goodsName")
    private String itemsName;

    @TableField("expirationDate")
    private Integer expirationDate;


}
