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
    @TableName("CatCategory")
public class CatCategory implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId("catCategory")
      private String catCategory;

    @TableField("catCategoryName")
    private String catCategoryName;

    @TableField("bowelColor")
    private String bowelColor;

    @TableField("obesityStandard")
    private String obesityStandard;


}
