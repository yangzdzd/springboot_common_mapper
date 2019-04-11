package com.baizhi.controller;

import com.baizhi.entity.Person;
import com.baizhi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService ps;

    @RequestMapping("/selectAll")
    public String  selectAll(Map map) {
        List<Person> list = ps.selectAll();
        map.put("list",list);
        return "forward:/index.jsp";
    }


}
