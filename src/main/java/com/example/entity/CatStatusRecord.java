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
@TableName("CatStatusRecord")
public class CatStatusRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("employID")
    private String employID;

    @TableField("catID")
    private String catID;

    @TableField("bowelColor")
    private String bowelColor;

    @TableField("isBom")
    private Boolean isBom;

    @TableField("isObesity")
    private Boolean isObesity;

    @TableField("recordData")
    private LocalDate recordData;


}
