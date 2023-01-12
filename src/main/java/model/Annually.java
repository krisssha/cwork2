package model;

import java.time.LocalDateTime;

public class Annually implements Repeatability{
    @Override
    public LocalDateTime nextTime(LocalDateTime currentDateTime) {
        return currentDateTime.plusYears(1);
    }

    @Override
    public String title() {
        return "ежегодная";
    }
}
