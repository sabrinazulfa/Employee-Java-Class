// Package declaration
package gaji;

public class Main {
    public static void main(String[] args) {
        Employee supervisor = new Supervisor();
        int supervisorSalary = supervisor.calculateSalary(7, 16, 3); // Assuming Masuk jam 7, Keluar jam 16, dan punya anak 3
        supervisor.displaySalaryDetails();
        System.out.println("Total Gaji SPV  :" + supervisorSalary); // Assuming Masuk jam 7, Keluar jam 16
        
        Employee technician = new Technician();
        int technicianSalary = technician.calculateSalary(6, 16, 1);
        technician.displaySalaryDetails();
        System.out.println("Total Gaji TKN  :" + technicianSalary); //  Assuming Masuk jam 6, Keluar jam 16, dan punya anak 1
        
        Employee worker = new Worker();
        int workerSalary = worker.calculateSalary(8, 17, 2);
        worker.displaySalaryDetails();
        System.out.println("Total Gaji KRY  :" + workerSalary); //  Assuming Masuk jam 8, Keluar jam 17, dan punya anak 2       
        
        Employee hrd = new HRD();
        int hrdSalary = technician.calculateSalary(8, 16, 1);
        hrd.displaySalaryDetails();
        System.out.println("Total Gaji HRD  :" + hrdSalary); //  Assuming Masuk jam 8, Keluar jam 16, dan punya anak 1
         
    }
}