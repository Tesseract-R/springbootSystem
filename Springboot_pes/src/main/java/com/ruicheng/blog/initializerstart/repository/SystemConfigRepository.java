package com.ruicheng.blog.initializerstart.repository;

import com.ruicheng.blog.initializerstart.domain.SystemConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ：Ruicheng
 * @date ：Created in 2022/1/15 18:33
 */
@Repository
public interface SystemConfigRepository extends JpaRepository<SystemConfig, Integer> {
}
