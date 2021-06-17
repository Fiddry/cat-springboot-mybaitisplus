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
    @TableName("CatIitemDisinfectionRecord")
public class CatIitemDisinfectionRecord implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId("itemsID")
      private String itemsID;

    @TableField("employID")
    private String employID;

    @TableField("disinfectionDate")
    private LocalDate disinfectionDate;

    @TableField("disinfectionTime")
    private Integer disinfectionTime;


}
