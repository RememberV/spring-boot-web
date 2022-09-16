package com.ths.web.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.io.Serializable;

/**
 * (Account)实体类
 *
 * @author makejava
 * @since 2022-09-15 16:54:49
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Account implements Serializable {
    private static final long serialVersionUID = 110722604713272850L;

    private Integer id;

    private String name;

    private BigDecimal balance;

}

