package top.kalpana.springboot.oauth2.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.kalpana.springboot.oauth2.entity.Role;
import top.kalpana.springboot.oauth2.mapper.RoleMapper;
import top.kalpana.springboot.oauth2.service.IRoleService;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author tanxs
 * @since 2021-07-04
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<String> getRoleListByUserId(Long userId) {
        return roleMapper.getRoleListByUserId(userId)
                .stream()
                .map(Role::getEnname).collect(Collectors.toList());
    }
}
