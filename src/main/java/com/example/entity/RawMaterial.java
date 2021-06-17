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
    @TableName("RawMaterial")
public class RawMaterial implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId("itemsID")
      private String itemsID;

    @TableField("itemsName")
    private String itemsName;

    @TableField("itemsPrice")
    private Float itemsPrice;

    @TableField("remindNumber")
    private Float remindNumber;

    @TableField("expirationDate")
    private Integer expirationDate;


}
