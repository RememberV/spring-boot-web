package com.ths.web.controller;

import com.ths.web.dto.UserDTO;
import com.ths.web.services.CommonService;
import com.ths.web.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @Author JiangYu
 * @Description Hello控制器
 * @Date 2022-09-14 16:56
 * @Version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/common")
public class CommonController {

    @Resource
    CommonService commonService;

    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST}, produces = MediaType.APPLICATION_JSON_VALUE)
    public String login(HttpServletRequest request, @RequestBody UserDTO userDTO) {
        User user = commonService.findUserById(userDTO.getId());
        if (user == null) {
            return "用户不存在！";
        } else {
            if (user.getPassword().equals(userDTO.getPassword())) {
                request.getSession().setAttribute("user", user);
                return "success";
            } else {
                return "密码错误！";
            }
        }
    }

    @RequestMapping(value = "/demo", method = {RequestMethod.GET, RequestMethod.POST}, produces = MediaType.APPLICATION_JSON_VALUE)
    public String demo(HttpServletRequest request, @RequestParam("pageSize") int pageSize, @RequestParam("cur") int cur) {
        return null;
    }
}
