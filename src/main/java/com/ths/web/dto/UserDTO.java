package com.ths.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author JiangYu
 * @Description 用户DTO
 * @Date 2022-09-15 15:47
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    int id;
    String password;
}
