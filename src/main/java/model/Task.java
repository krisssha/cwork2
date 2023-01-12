package model;

import exception.IncorrectTaskParametrException;
import exception.IncorrectTaskParametrException;
import util.Constant;

import java.time.LocalDateTime;

public class Task {
    private static int idGenerator = 1;
    private final int id;
    private String title;
    private String description;
    private Type type;
    private LocalDateTime dateTime;
    private Repeatability repeatability;

    public Task(String title, String description, Type type, LocalDateTime dateTime, Repeatability repeatability)
            throws IncorrectTaskParametrException {
        id = idGenerator++;
        setTitle(title);
        setDescription(description);
        setType(type);
        setDateTime(dateTime);
        setRepeatability(repeatability);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws IncorrectTaskParametrException {
        if (title == null || title.isEmpty()) {
            throw new IncorrectTaskParametrException("заголовок задачи");
        }
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) throws IncorrectTaskParametrException {
        if (description == null || description.isEmpty()) {
            throw new IncorrectTaskParametrException("описание задачи");
        }
        this.description = description;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        if (type == null) {
            type = Type.PERSONAL;
        }
        this.type = type;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) throws IncorrectTaskParametrException {
        if (dateTime==null){
            throw new IncorrectTaskParametrException("дата и время задачи");
        }
        this.dateTime = dateTime;
    }

    public Repeatability getRepeatability() {
        return repeatability;
    }

    public void setRepeatability(Repeatability repeatability) {
        if (repeatability == null) {
            repeatability = new Single();
        }
        this.repeatability = repeatability;

    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", dateTime=" + dateTime.format(Constant.DATE_TIME_FORMATTER) +
                ", repeatability=" + repeatability.title() +
                '}';
    }
}