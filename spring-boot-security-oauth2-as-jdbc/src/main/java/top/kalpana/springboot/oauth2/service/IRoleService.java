package top.kalpana.springboot.oauth2.service;


import com.baomidou.mybatisplus.extension.service.IService;
import top.kalpana.springboot.oauth2.entity.Role;

import java.util.List;

/**
 * <p>
 * 角色表 服务类
 * </p>
 *
 * @author tanxs
 * @since 2021-07-04
 */
public interface IRoleService extends IService<Role> {
    List<String> getRoleListByUserId(Long userId);
}
