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
    @TableName("LossItem")
public class LossItem implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId("lossTime")
      private LocalDate lossTime;

    @TableField("itemsID")
    private String itemsID;

    @TableField("customerID")
    private String customerID;

    @TableField("lossAmount")
    private Float lossAmount;

    @TableField("Compensation")
    private Boolean Compensation;


}
