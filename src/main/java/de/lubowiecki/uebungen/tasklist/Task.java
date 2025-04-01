package de.lubowiecki.uebungen.tasklist;

import java.time.LocalDateTime;

public class Task {

    // Lokale Variablen bekommen KEINE Standardwerte
    // Instanz- und Klassenvariablen bekommen Standardwerte!!!!

    private String title;
    private String description;
    private LocalDateTime createdAt;
    private boolean done;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void toggleDone() {
        this.done = !done;
    }

    /*
    @Override
    public String toString() {
//        return "Task{" +
//                "title='" + title + '\'' +
//                ", description='" + description + '\'' +
//                ", createdAt=" + createdAt +
//                ", done=" + done +
//                '}';

        StringBuilder sb = new StringBuilder();
        sb.append("Task{ title='").append(title)
                .append("' , description='").append(description)
                .append("', createdAt=").append(createdAt)
                .append(",  done=").append(done)
                .append("}");

        return sb.toString();
    }
    */

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Task{");
        sb.append("title='").append(title).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", createdAt=").append(createdAt);
        sb.append(", done=").append(done);
        sb.append('}');
        return sb.toString();
    }
}
