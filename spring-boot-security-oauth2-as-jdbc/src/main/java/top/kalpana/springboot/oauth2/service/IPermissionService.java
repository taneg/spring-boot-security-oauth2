package top.kalpana.springboot.oauth2.service;


import com.baomidou.mybatisplus.extension.service.IService;
import top.kalpana.springboot.oauth2.entity.Permission;

import java.util.List;

/**
 * <p>
 * 权限表 服务类
 * </p>
 *
 * @author tanxs
 * @since 2021-07-04
 */
public interface IPermissionService extends IService<Permission> {
    List<String> getPermissionListByUserId(Long userId);
}
