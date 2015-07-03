package com.cegeka.delayed;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class TrainTest {

    @Test
    public void getHoursDelayed_givenTrainAndHoursDelayed_correctHoursDelayedReturned() {
        Train train = new Train(2);

        assertThat(train.getHoursDelayed()).isEqualTo(2);
    }

    @Test
    public void customerSatisfaction_given0HoursOfDelay_thenNice() {
        Train train = new Train(0);

        assertThat(train.customerSatisfaction()).isEqualTo("Nice...");
    }

    @Test
    public void customerSatisfaction_given1HourOfDelay_thenAhWell() {
        Train train = new Train(1);

        assertThat(train.customerSatisfaction()).isEqualTo("Ah well...");
    }

    @Test
    public void customerSatisfaction_given2HoursOfDelay_thenAnnoying() {
        Train train = new Train(2);

        assertThat(train.customerSatisfaction()).isEqualTo("Annoying...");
    }

    @Test
    public void customerSatisfaction_given3HoursOfDelay_thenBurnIt() {
        Train train = new Train(3);

        assertThat(train.customerSatisfaction()).isEqualTo("Burn it!");
    }

}
