package com.codewithmosh.behavourial.template;

import com.codewithmosh.behavourial.template.demo.MoneyTransferTask;
import com.codewithmosh.behavourial.template.demo.Task;

public class Main {
    public static void main(String[] args) {
        Task task = new MoneyTransferTask();
        task.execute();
    }
}
