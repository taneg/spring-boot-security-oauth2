package top.kalpana.springboot.oauth2.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.kalpana.springboot.oauth2.entity.Permission;
import top.kalpana.springboot.oauth2.mapper.PermissionMapper;
import top.kalpana.springboot.oauth2.service.IPermissionService;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 权限表 服务实现类
 * </p>
 *
 * @author tanxs
 * @since 2021-07-04
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {

    @Autowired
    private PermissionMapper permissionMapper;
    @Override
    public List<String> getPermissionListByUserId(Long userId) {
        return permissionMapper.getPermissionListByUserId(userId)
                .stream()
                .map(Permission::getEnname)
                .collect(Collectors.toList());
    }
}
