package com.robot.reg.dao;

import com.robot.reg.entity.Path;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * <h1>Path Dao</h1>
 * Created by Qinyi.
 */
public interface PathRepository extends JpaRepository<Path, Integer> {

    /**
     * <h2>根据服务名称查找 path 记录</h2>
     * */
    List<Path> findAllByServiceName(String serviceName);

    /**
     * <h2>根据 路径模式 + 请求类型 查找数据记录</h2>
     * */
    Path findByPathPatternAndHttpMethod(String pathPattern, String httpMethod);
}
