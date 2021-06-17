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
    @TableName("Admin")
public class Admin implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId("userID")
      private String userID;

    @TableField("userName")
    private String userName;

    @TableField("passKey")
    private String passKey;


}
