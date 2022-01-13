package com.ruicheng.blog.initializerstart.service;

import com.ruicheng.blog.initializerstart.domain.Class;
import com.ruicheng.blog.initializerstart.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author ：Ruicheng
 * @date ：Created in 2022/1/13 21:34
 */
@Service
public class ClassServiceImpl implements ClassService {
    @Autowired
    private ClassRepository classRepository;

    @Transactional
    @Override
    public Class saveClass(Class c) {
        return classRepository.save(c);
    }

    @Transactional
    @Override
    public void removeClass(Class c) {
        classRepository.delete(c);
    }

    @Transactional
    @Override
    public void removeClass(Long id) {
        classRepository.delete(classRepository.findOneById(id));
    }

    @Transactional
    @Override
    public Class getClassById(Long id) {
        return classRepository.findOneById(id);
    }

    @Transactional
    @Override
    public List<Class> listClasses() {
        return classRepository.findAll();
    }

    @Transactional
    @Override
    public Page<Class> listClassesByNameLike(String name, Pageable pageable) {
        // 模糊查询
        name = "%" + name + "%";
        Page<Class> classes = classRepository.findByClassnameLike(name, pageable);
        return classes;
    }
}
