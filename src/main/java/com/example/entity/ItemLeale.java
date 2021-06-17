package com.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
    @TableName("ItemLeale")
public class ItemLeale implements Serializable {

    private static final long serialVersionUID=1L;

    @TableField("employID")
    private String employID;

    @TableField("customerID")
    private String customerID;

      @TableId("toyID")
      private String toyID;

    @TableField("borrowTime")
    private LocalDateTime borrowTime;

    @TableField("returnTime")
    private LocalDateTime returnTime;


}
