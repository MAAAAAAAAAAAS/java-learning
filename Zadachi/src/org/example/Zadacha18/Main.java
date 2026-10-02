package org.example.Zadacha18;

public class Main {
    static void main(String[] args) {
        TaskManager taskManager = new TaskManager("СУЗ");
        Project project1 = new Project("Отправить ракету в космос");
        Project project2 = new Project("Построить дом");

        project1.addTask(new Task("Построить ракету", "до конца недели", 5, true));
        project1.addTask(new Task("Закупить хавки", "до конца месяца", 1, false));
        project1.addTask(new Task("Найти крутых космонавтов","10 дней", 4, false));

        project2.addTask(new Task("Купить материалы", "20 дней", 3, false));
        project2.addTask(new Task("Нанять строителей", "15 дней", 4, false));
        project2.addTask(new Task("Расчистить территорию", "3 дня", 5, true));

        taskManager.addProject(project1);
        taskManager.addProject(project2);

        System.out.println("Все задачи из всех проектов: " + taskManager.getAllTasks());
        System.out.println("Количество выполненных задач: " + taskManager.getCompletedTasksCount());
        System.out.println("Самые приоритетные задачи: " + taskManager.getMostUrgentTasks());
        System.out.println("Проект с названием <Построить дом>: " + taskManager.getProjectsByName("Построить дом"));
        System.out.println(taskManager.toString());
        System.out.println("Средний приоритет project1: " + project1.getAveragePriority());
        System.out.println("Задачи с приоритетом 5 из project1: " + project1.getTasksByPriority(5));
        System.out.println("Выполненные задачи из project1: " + project1.getCompleteTasks());
        System.out.println("Невыполненные задачи из project1: " + project1.getIncompleteTasks());
        project1.removeTask(project1.getTasks().get(0));
        System.out.println("project1 после изменений: " + project1.toString());
        taskManager.removeProject(project2);
        System.out.println("TaskManager после изменений: " + taskManager.toString());
        project1.getTasks().get(0).setPriority(1);
        project1.getTasks().get(1).setCompleted(true);
        System.out.println(project1.getTasks().get(1).getDeadline());
        System.out.println(project1.getTasks().get(1).getTitle());
        project1.getTasks().get(1).setDeadline("3 дня");
        System.out.println(project1.getTasks().get(1).getDeadline());
    }
}
