package com.geode.demo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.annotation.Region;

@Data
@Region("demo")
public class Demo {

    @Id
    public String id;

    public String name;

    public Integer age;

}
