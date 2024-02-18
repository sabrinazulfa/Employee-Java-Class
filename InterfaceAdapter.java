/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaji;

public abstract class InterfaceAdapter implements InputOutput {
    // Provide default implementation for displayOutput
    @Override
    public void displaySalaryDetails() {
        System.out.println("Default display output implementation");
    }
}
