package org.example.Zadacha18;

import java.util.Objects;

public class Task {
    private String title, deadline;
    private int priority;
    private boolean completed;

    public Task(String title, String deadline, int priority, boolean completed) {
        this.title = title;
        this.deadline = deadline;
        this.priority = priority;
        this.completed = completed;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDeadline() { return deadline; }
    public void setDeadline(String deadline) { this.deadline = deadline; }

    public int getPriority() { return priority; }
    public void setPriority(int priority) { this.priority = priority; }

    public boolean isCompleted() { return completed; }
    public void setCompleted(boolean completed) { this.completed = completed; }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return priority == task.priority && completed == task.completed && Objects.equals(title, task.title) && Objects.equals(deadline, task.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, deadline, priority, completed);
    }

    @Override
    public String toString() {
        return "Task{" + "title='" + title + '\'' + ", deadline='" + deadline + '\'' +
                ", priority=" + priority + ", completed=" + completed + '}';
    }
}
