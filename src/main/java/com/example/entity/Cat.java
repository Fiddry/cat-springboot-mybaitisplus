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
@TableName("Cat")
public class Cat implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("catID")
    private String catID;

    @TableField("catCategory")
    private String catCategory;

    @TableField("employName")
    private String employName;

    private LocalDateTime birth;

    private String gender;


}

