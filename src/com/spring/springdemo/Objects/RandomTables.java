package com.spring.springdemo.Objects;

import com.spring.springdemo.interfaces.Tables;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomTables implements Tables {

    private int[] randomTablesNumbers = {1, 13, 34, 43};

    private Random random = new Random();

    @Override
    public int getNumberOfTables() {

        int index = random.nextInt(randomTablesNumbers.length);

        int randomTablesNumber = randomTablesNumbers[index];

        return randomTablesNumber;
    }
}
