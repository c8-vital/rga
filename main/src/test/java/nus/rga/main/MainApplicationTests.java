package nus.rga.main;

import nus.rga.main.entity.UserEntity;
import nus.rga.main.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MainApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        UserEntity user = new UserEntity();
        user.setId(1L);
        user.setUsername("longzhiqin");
//        user.setAge("80");
//        user.setGender("male");
//        user.setMobile("97747512");
//        userService.save(user);
//        System.out.println("successful");
        userService.updateById(user);
    }

}
