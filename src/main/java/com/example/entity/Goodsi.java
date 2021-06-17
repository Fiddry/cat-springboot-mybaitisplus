package com.example.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

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
public class Goodsi implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("goodsID")
    private String goodsID;

    @TableField("goodsName")
    private String goodsName;

    @TableField("salePrice")
    private Float salePrice;

}
