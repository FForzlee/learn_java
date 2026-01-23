package com.github.fforzlee.test;

import java.util.ArrayList;
import java.util.List;

public class TodoManager {
    private List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Added task: " + task);
    }

    public void showTasks(){
        System.out.println("--- 当前待办事项 ---");
        for (int i = 0; i < tasks.size(); i++){
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public static void main(String[] args){
        TodoManager myTodo = new TodoManager();
        myTodo.addTask("Learn Git Order");
        myTodo.addTask("Upload Java Codes to Github");
        myTodo.showTasks();
    }
}
