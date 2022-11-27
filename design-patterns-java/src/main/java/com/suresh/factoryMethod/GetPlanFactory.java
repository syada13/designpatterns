package com.suresh.factoryMethod;

public class GetPlanFactory {

    // use getPlan method to get object of type Plan.

    public Plan getPlan(String planType) {
        Plans plan = Plans.valueOf(planType);
        switch (plan) {
            case COMMERCIAL:
                return new CommercialPlan();
            case DOMESTIC:
                return new DomesticPlan();
            case INSTITUTIONAL:
                return new InstitutionalPlan();
            default:
                return null;
        }
    }

}
