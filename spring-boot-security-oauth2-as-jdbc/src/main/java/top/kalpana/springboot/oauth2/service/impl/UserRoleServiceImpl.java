package top.kalpana.springboot.oauth2.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.kalpana.springboot.oauth2.entity.UserRole;
import top.kalpana.springboot.oauth2.mapper.UserRoleMapper;
import top.kalpana.springboot.oauth2.service.IUserRoleService;

/**
 * <p>
 * 用户角色表 服务实现类
 * </p>
 *
 * @author tanxs
 * @since 2021-07-04
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

}
