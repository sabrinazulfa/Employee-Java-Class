
package gaji;

public class Supervisor extends Employee {
    public Supervisor() {
        employeeType = "SPV";
        basicSalary = 10000000;
        transportAllowance = 1000000;
        overtimeRate = 10000;
        wifeAllowance = 300000;
        childAllowance = 100000;
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
            childAllowance = 200000;
        }
        totalSalary += wifeAllowance;
        totalSalary += (presenceHours > 8) ? childAllowance * (presenceHours - 8) : 0;

        return totalSalary;
    }
}