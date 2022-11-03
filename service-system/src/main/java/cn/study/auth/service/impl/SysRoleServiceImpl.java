package cn.study.auth.service.impl;

import cn.study.auth.mapper.SysRoleMapper;
import cn.study.auth.service.ISysRoleService;
import cn.study.model.auth.SysRole;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements ISysRoleService {
}
