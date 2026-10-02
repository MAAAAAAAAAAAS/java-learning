package org.example.Zadacha18;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Project {
    private String name;
    private List<Task> tasks = new ArrayList<>();
    public Project(String name) {
        this.name = name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public List<Task> getCompleteTasks() {
        return tasks.stream()
                .filter(Task::isCompleted)
                .collect(Collectors.toList());
    }

    public List<Task> getIncompleteTasks() {
        return tasks.stream()
                .filter(task -> !task.isCompleted())
                .collect(Collectors.toList());
    }

    public List<Task> getTasksByPriority(int priority) {
        return tasks.stream()
                .filter(task -> task.getPriority() == priority)
                .collect(Collectors.toList());
    }

    public double getAveragePriority() {
        int sum = 0, count = 0;
        for (Task task : tasks) {
            sum += task.getPriority();
            count++;
        }
        if (tasks.isEmpty()) {
            return 0;
        } else {
            return (double) sum /count;
        }
    }

    @Override
    public String toString() {
        return "Project{name = " + name + ", tasks = " + tasks + "}";
    }
}
