package cn.itcast.web;

import cn.itcast.pojo.User;
import cn.itcast.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;

/**
 *@ClassName HelloController
 *@Description TODO
 *@Author yubinbin
 *@Date 2020/9/16 21:37
 */
@Slf4j
@RestController
@RequestMapping("user")
public class HelloController {

    @Autowired
    private UserService userService;

       @GetMapping("{id}")
        public User hello(@PathVariable("id") Long id){
           return userService.queryById(id);

    }

}
