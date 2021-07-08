package top.kalpana.springboot.oauth2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.kalpana.springboot.oauth2.entity.RolePermission;
import top.kalpana.springboot.oauth2.mapper.RolePermissionMapper;
import top.kalpana.springboot.oauth2.service.IRolePermissionService;

/**
 * <p>
 * 角色权限表 服务实现类
 * </p>
 *
 * @author tanxs
 * @since 2021-07-04
 */
@Service
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionMapper, RolePermission> implements IRolePermissionService {

}
