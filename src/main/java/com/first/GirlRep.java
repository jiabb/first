package com.first;

import org.hibernate.boot.model.source.spi.JpaCallbackSource;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Hoperun on 2018/3/16.
 */
public interface GirlRep extends JpaRepository<Girl, Integer> {
    public List<Girl> findByAge(Integer age);
}
