/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payroll;

/**
 *
 * @author drewm
 */
public class Payroll {
    private int[] employeeID = {01,02,03,04,05,06,07};
    int hours[] = new int [7];
    double payRate[] = new double [7];
    double wages[] = new double [7];
    
    public void calcWages(){
        for (int index=0; index<7; index++) {
            wages[index] = hours[index] * payRate[index];
        }
    }
    public int getEmployeeID(int index) {
        return employeeID[index];
    }
    
    public int[] getHours(){
        return hours;
    }
    
    public int getHours(int index){
        return hours[index];
    }
    
    public double[] getPayRate(){
        return payRate;
    }
    
    public double getPayRate(int index){
        return payRate[index];
    }
    
    public double getWage(int id) {
        for (int index = 0; index < 7; index++){
		if (id == employeeID[index]){
                    return wages[id];
                    }
		}
		
		return -1;
    }
    
    public double[] getWages(){
        return wages;
    }

    public double getWages(int index){
        return wages[index];
    }
	
    public void setEmployeeId(int index, int employeeId){
        this.employeeID[index] = employeeId; 
    }

    public void setHours(int index, int hours){
        this.hours[index] = hours;
    }

    public void setPayRate(int index, double payRate){
        this.payRate[index] = payRate;
    }

    public void setWages(int index, double wages){
        this.wages[index] = wages;
    }
}
