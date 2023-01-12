package model;

import java.time.LocalDateTime;

public class Single implements Repeatability{
    @Override
    public LocalDateTime nextTime(LocalDateTime currentDateTime) {
        return null;
    }

    @Override
    public String title() {
        return "однократная";
    }
}
