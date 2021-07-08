package top.kalpana.springboot.oauth2.service.impl;


import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import top.kalpana.springboot.oauth2.entity.User;
import top.kalpana.springboot.oauth2.service.IPermissionService;
import top.kalpana.springboot.oauth2.service.IRoleService;
import top.kalpana.springboot.oauth2.service.IUserService;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserDaetilServiceImpl implements UserDetailsService {
    @Autowired
    private IUserService userService;
    @Autowired
    private IRoleService roleService;
    @Autowired
    private IPermissionService permissionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (StringUtils.isEmpty(username)) {
            return null;
        }
        User user = userService.getOne(Wrappers.query(new User().setUsername(username)));
        if (user == null) {
            return null;
        }
        List<String> roleList = roleService.getRoleListByUserId(user.getId());
        roleList = roleList.stream().map(c -> "ROLE_" + c).collect(Collectors.toList());

        List<String> permissionList = permissionService.getPermissionListByUserId(user.getId());
        permissionList.addAll(roleList);
        String[] authorities = new String[permissionList.size()];
        return new org.springframework.security.core.userdetails
                .User(user.getUsername(), user.getPassword(), AuthorityUtils.createAuthorityList(permissionList.toArray(authorities)));
    }
}
