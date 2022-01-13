package com.ruicheng.blog.initializerstart.service;

import com.ruicheng.blog.initializerstart.domain.Class;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 课程服务
 *
 * @author ：Ruicheng
 * @date ：Created in 2022/1/13 21:28
 */
public interface ClassService {
    Class saveClass(Class c);

    void removeClass(Class c);

    void removeClass(Long id);

    Class getClassById(Long id);

    List<Class> listClasses();

    Page<Class> listClassesByNameLike(String name, Pageable pageable);
}
