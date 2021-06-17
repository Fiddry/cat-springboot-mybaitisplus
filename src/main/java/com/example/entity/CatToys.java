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
    @TableName("CatToys")
public class CatToys implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId("toyID")
      private String toyID;

    @TableField("itemsID")
    private String itemsID;

    @TableField("itemsName")
    private String itemsName;

    @TableField("remindNumber")
    private Integer remindNumber;

    @TableField("isBoolean")
    private Boolean isBoolean;

    @TableField("leaseState")
    private Boolean leaseState;

    @TableField("damageDegree")
    private Float damageDegree;


}
