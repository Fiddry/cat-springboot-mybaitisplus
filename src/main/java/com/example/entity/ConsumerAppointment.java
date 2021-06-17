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
@TableName("ConsumerAppointment")
public class ConsumerAppointment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("employID")
    private String employID;

    @TableField("customerID")
    private String customerID;

    @TableField("appointmentTime")
    private LocalDateTime appointmentTime;

    private Float deposit;

    private String name;

    @TableField("phoneNumber")
    private Double phoneNumber;


}
