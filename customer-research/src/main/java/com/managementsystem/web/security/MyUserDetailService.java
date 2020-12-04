package com.managementsystem.web.security;

import com.managementsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//这是一个配置类
@Configuration
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        用户认证
        System.out.println("用户名：" + username);
        com.managementsystem.model.User dbUser = userService.findByUsername(username);
        System.out.println("dbUser:" + dbUser);
        if(dbUser == null){
            return null;
        }
        String pwd = passwordEncoder.encode(dbUser.getPassword());
        System.out.println("密码加密后：" + pwd);
        return new User(username,
                pwd,
                getCurrentUserAuthorities());
    }

//    获取当前用户拥有的权限
    public Collection<? extends GrantedAuthority> getCurrentUserAuthorities(){

        List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();
        list.add(new SimpleGrantedAuthority("PRODORDER_DELETE"));
        list.add(new SimpleGrantedAuthority("PRODORDER_READ"));
        list.add(new SimpleGrantedAuthority("PRODORDER_ADD"));
        list.add(new SimpleGrantedAuthority("PRODORDER_SAVE"));
        list.add(new SimpleGrantedAuthority("PRODORDER_EDIT"));

        return list;
    }
}
