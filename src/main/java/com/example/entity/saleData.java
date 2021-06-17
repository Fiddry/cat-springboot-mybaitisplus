package com.example.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class saleData implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId("name")
    private String name;
    @TableId("value")
    private Integer value;
}
