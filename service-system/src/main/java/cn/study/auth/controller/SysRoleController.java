package cn.study.auth.controller;

import cn.study.auth.service.ISysRoleService;
import cn.study.common.result.Result;
import cn.study.model.auth.SysRole;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "角色管理")
@RestController
@RequestMapping("/admin/auth/sysRole")
public class SysRoleController {

    @Autowired
    ISysRoleService sysRoleService;

    @ApiOperation(value = "获取全部角色列表")
    @GetMapping("/getAll")
    public Result<List<SysRole>> selectAll() {
        return Result.ok(sysRoleService.list());
    }
}
