package com.suresh.factoryMethod;

import java.io.*;

/**
 * Generate Bill by using the PlanFactory to get the object of concrete classes
 * by passing an information such as type of plan DOMESTICPLAN or COMMERCIALPLAN
 * or INSTITUTIONALPLAN.
 */
public class GenerateElectricityBill {
    public static void main(String args[]) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();
        System.out.print("Enter the name of the plan for which the electricity bill will be generated:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String planName = br.readLine();
        System.out.print("Enter the number of units for bill will be calculated: ");
        int units = Integer.parseInt(br.readLine());
        Plan plan = planFactory.getPlan(planName);
        System.out.print("Bill amount for " + planName + " plan of " + units + " units is Rs: ");
        plan.getRate();
        plan.calculateBill(units);
    }

}
