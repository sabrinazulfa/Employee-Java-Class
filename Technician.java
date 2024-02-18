/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaji;

public class Technician extends Employee {
    public Technician() {
        employeeType = "TKN";
        basicSalary = 3000000;
        transportAllowance = 500000;
        overtimeRate = 5000;
        wifeAllowance = 200000;
        childAllowance = 75000;
    }

    @Override
    public int calculateSalary(int entryHour, int exitHour, int numberOfChildren) {
        int presenceHours = exitHour - entryHour;
        int totalSalary = basicSalary + transportAllowance;

        if (entryHour > 7) {
            totalSalary -= (entryHour - 7) * 100000;
        }

        if (exitHour < 16) {
            totalSalary -= (16 - exitHour) * 100000;
        }

        if (presenceHours > 8) {
            totalSalary += (presenceHours - 8) * overtimeRate;
        }

        if (numberOfChildren > 1) {
            childAllowance = 150000;
        }
        totalSalary += wifeAllowance;
        totalSalary += (presenceHours > 8) ? childAllowance * (presenceHours - 8) : 0;

        return totalSalary;
    }
}
