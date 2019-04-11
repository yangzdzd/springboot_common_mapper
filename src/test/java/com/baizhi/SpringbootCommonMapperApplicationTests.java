package com.baizhi;

import com.baizhi.dao.PersonDao;
import com.baizhi.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootCommonMapperApplicationTests {
    @Autowired
    private PersonDao pd;
    @Test
    public void contextLoads() {
        List<Person> list = pd.selectAll();
        for (Person person : list) {
            System.out.println(person);
        }
    }

}
