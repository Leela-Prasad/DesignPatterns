package com.codewithmosh.behavourial.template.novice;

public class MoneyTransferTask {

    private AuditTrail auditTrail;

    public MoneyTransferTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        auditTrail.record();
        System.out.println("Transferring Money");
    }
}
