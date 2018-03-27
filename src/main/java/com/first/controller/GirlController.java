package com.first.controller;

import com.first.Girl;
import com.first.GirlRep;
import com.first.service.GirlService;
import com.first.Result;
import com.first.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Hoperun on 2018/3/16.
 */
@RestController
public class GirlController {
    @Autowired
    private GirlRep girlRep;
    @Autowired
    private GirlService girlSv;

    @GetMapping(value = "/getsGirls")
    public List<Girl> getsGirls() {
        return girlRep.findAll();
    }

    @GetMapping(value = "/getGirl/{id}")
    public Girl getGirl(@PathVariable("id") Integer id) {
        return girlRep.findById(id).get();
    }

    @GetMapping(value = "/age/{age}")
    public List<Girl> findByAge(@PathVariable("age") Integer age) {
        return girlRep.findByAge(age);
    }

    @PostMapping(value = "/girls")
    public Result<Girl> girlAdd(@Valid Girl girl, BindingResult br) {
        Result r = new Result();
        if (br.hasErrors()) {
            return ResultUtil.fail(1,br.getFieldError().getDefaultMessage());
        }
        return ResultUtil.success(girlRep.save(girl));
    }
    @GetMapping(value = "/getAge/{id}")
    public void getAge(@PathVariable("id") Integer id) throws Exception {
        girlSv.getAge(id);
    }
}