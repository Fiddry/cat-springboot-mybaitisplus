package com.example.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class CatToysi implements Serializable {
    @TableId("itemsID")
    private String itemsID;
    @TableField("itemsName")
    private String itemsName;

    @TableField("remindNumber")
    private Integer remindNumber;
}
