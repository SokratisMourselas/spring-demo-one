package com.spring.springdemo.Objects;

import com.spring.springdemo.interfaces.Tables;
import org.springframework.stereotype.Component;

@Component
public class TwinsTables implements Tables {


    @Override
    public int getNumberOfTables() {
        return 25;
    }


}
