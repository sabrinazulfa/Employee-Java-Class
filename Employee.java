package gaji;

public abstract class Employee {
    protected String employeeType;
    protected int basicSalary;
    protected int transportAllowance;
    protected int overtimeRate;
    protected int wifeAllowance;
    protected int childAllowance;

    public int calculateSalary (int entryHour, int exitHour, int numberOfChildren) {
        if (entryHour < 1 || entryHour > 24 || exitHour < 1 || exitHour < 24) {
            throw new IllegalArgumentException("Invalid entryHour or exitHour. Please enter values between 1 and 24.");
        }
        // Calculate Basic salary
        int presenceHours = exitHour - entryHour;
        int totalSalary = basicSalary + transportAllowance;

        // Calculate Precency Hour
        if (entryHour > 7) {
            totalSalary -= (entryHour - 7) * 100000;
        }

        if (exitHour < 16) {
            totalSalary -= (16 - exitHour) * 100000;
        }

        // Calculate Overtime 
        if (presenceHours > 8) {
            totalSalary += (presenceHours - 8) * overtimeRate;
        }
        if (numberOfChildren > 1) {
            childAllowance = numberOfChildren * childAllowance;
        }
        totalSalary += wifeAllowance;
        totalSalary += (presenceHours > 8) ? childAllowance * (presenceHours - 8) : 0;

        return totalSalary;
    }
    public String getemployeeType(){
        return employeeType;
    }
    public int getbasicSalary(){
        return basicSalary;
    }
    public int gettransportAllowance(){
        return transportAllowance;
    }
    public int getovertimeRate(){
        return overtimeRate;
    }
    public int getwifeAllowance(){
        return wifeAllowance;
    }
    public int getchildAllowance(){
        return childAllowance;
    }
    
//    @Override
    public void displaySalaryDetails(){
        System.out.println("Perincian komponen dan Perhitungan Gaji :");
        System.out.println("Kode Pegawai    :" + getemployeeType());
        System.out.println("Gaji Pokok      :" + getbasicSalary());
        System.out.println("Transport       :" + gettransportAllowance());
        System.out.println("Lembur          :" + getovertimeRate());
        System.out.println("Tunjangan Istri :" + getwifeAllowance());
        System.out.println("Tunjangan Anak  :" + getchildAllowance());
    }
}
