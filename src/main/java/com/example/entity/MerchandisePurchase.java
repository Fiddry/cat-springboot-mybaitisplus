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
    @TableName("MerchandisePurchase")
public class MerchandisePurchase implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId("MerchandiseID")
      private String MerchandiseID;

    @TableField("employID")
    private String employID;

    @TableField("itemsID")
    private String itemsID;

    @TableField("goodsID")
    private String goodsID;

    @TableField("purchasingTime")
    private LocalDate purchasingTime;

    private String supplier;

    @TableField("buyingQuantity")
    private Integer buyingQuantity;

    private Float price;

    @TableField("isInte")
    private Boolean isInte;


}
