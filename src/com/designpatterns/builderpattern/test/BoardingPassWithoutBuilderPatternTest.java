package com.designpatterns.builderpattern.test;

import com.designpatterns.builderpattern.BoardingPassWithBuilderPattern;
import com.designpatterns.builderpattern.BoardingPassWithoutBuilderPattern;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoardingPassWithoutBuilderPatternTest {

    //boarding pass object created with fields initialized via args being passed in.

        @Test
        public void createBoardingPass() {

            BoardingPassWithoutBuilderPattern newBoardingPass = new BoardingPassWithoutBuilderPattern(
                    "Bobby Washington",
                    "1234",
                    "14A",
                    "12B",
                    "IND",
                    "02/12/2019",
                    "8:00",
                    "LAX",
                    55454);

            assertEquals(newBoardingPass.getClass().getSimpleName(), "BoardingPassWithoutBuilderPattern");

        }

    @Test
    public void createBoardingPassNoArgConstructor() {

        BoardingPassWithoutBuilderPattern newBoardingPass = new BoardingPassWithoutBuilderPattern();

        //With no arg constructor and individual setters/mutators you have a lot of code that looks very similar.
        newBoardingPass.setNameOfPassenger("Robert Washington");
        newBoardingPass.setFlightNumber("3344");

        assertEquals(newBoardingPass.getNameOfPassenger(), "Robert Washington");

    }

    @Test
    public void createBoardingPassUsingBuilderPatter() {

        BoardingPassWithBuilderPattern newBoardingPass = new BoardingPassWithBuilderPattern.BoardingPassBuilder()
                .setNameofPassenger("Bobby Washington")
                .build();

        assertEquals("Bobby Washington", newBoardingPass.getNameOfPassenger());

    }
}

