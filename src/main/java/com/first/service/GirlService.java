package com.first.service;

import com.first.Enum.ResEnum;
import com.first.Girl;
import com.first.GirlRep;
import com.first.exception.GirlException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Hoperun on 2018/3/16.
 */
@Service
public class GirlService {
    @Autowired
    private GirlRep girlRep;
@Transactional
    public void TwoGirls(){
        Girl girl1 = new Girl();
        girl1.setAge(40);
        girl1.setCupSize("A");
        girlRep.save(girl1);

        Girl girl2 = new Girl();
        girl2.setAge(50);
        girl2.setCupSize("BBBBB");
        girlRep.save(girl1);
    }

    public void getAge(Integer id) throws Exception {
        Girl girl = girlRep.findById(id).get();
        Integer age = girl.getAge();
        if (age < 10) {
            throw new GirlException(ResEnum.PRIMARY_SCHOOL);
        } else if (age > 10 && age < 16) {
            throw new GirlException(ResEnum.MIDDLE_SCHOOL);
        }
    }
}
