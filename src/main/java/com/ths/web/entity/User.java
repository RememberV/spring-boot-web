package com.ths.web.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2022-09-15 16:52:53
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User implements Serializable {
    private static final long serialVersionUID = -76284366025814147L;

    private Integer id;

    private String name;

    private String password;

}

