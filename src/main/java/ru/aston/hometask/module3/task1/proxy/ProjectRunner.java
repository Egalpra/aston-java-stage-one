package ru.aston.hometask.module3.task1.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("link for project");
        project.run();
    }
}