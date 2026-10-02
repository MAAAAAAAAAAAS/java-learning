package org.example.Zadacha18;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    private String name;
    private List<Project> projects = new ArrayList<>();
    public TaskManager(String name) {
        this.name = name;
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public void removeProject(Project project) {
        projects.remove(project);
    }

    public List<Project> getProjectsByName(String name) {
        return projects.stream()
                .filter(project -> project.getName().equals(name))
                .collect(Collectors.toList());
    }

    public List<Task> getAllTasks() {
        List<Task> allTasks = new ArrayList<>();
        for (Project project : projects) {
            // или же вместо цикла for: allTasks.addAll(project.getTasks());
            for (Task task : project.getTasks()) {
                allTasks.add(task);
            }
        }
        return allTasks;
    }

    public int getCompletedTasksCount() {
        int count = 0;
        for (Project project : projects) {
            for (Task task : project.getTasks()) {
                if (task.isCompleted()) {
                    count++;
                }
            }
        }
        return count;
    }

    public List<Task> getMostUrgentTasks() {
        int maxPriority = 0;
        for (Task task : getAllTasks()) {
            if (task.getPriority() > maxPriority) {
                maxPriority = task.getPriority();
            }
        }


        List<Task> result = new ArrayList<>();
        for (Project project : projects) {
            for (Task task : project.getTasks()) {
                if (task.getPriority() == maxPriority) {
                    result.add(task);
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "TaskManager{name = " + name + ", projects = " + projects + "}";
    }
}
