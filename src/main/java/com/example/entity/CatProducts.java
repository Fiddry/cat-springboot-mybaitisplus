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
@TableName("CatProducts")
public class CatProducts implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("itemsID")
    private String itemsID;

    @TableField("itemsName")
    private String Name;

    @TableField("itemsPrice")
    private Float itemsPrice;

    @TableField("remindNumber")
    private Integer remindNumber;

    @TableField("brokenNumber")
    private Integer brokenNumber;


}
