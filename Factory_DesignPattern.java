import java.io.BufferedReader;
import java.io.InputStreamReader;

abstract class Plan{
    protected double rate;
    abstract void getRate();

    public void calculateBills(int units){
        System.out.println(units*rate);
    }
}

class DomesticPlan extends Plan{
    public void getRate(){
        rate = 3.50;
    }
}

class CommercialPlan extends Plan{
    public void getRate(){
        rate = 7.50;
    }
}
class InstitutionPlan extends Plan{
    public void getRate(){
        rate = 5.50;
    }
}

class GetPlanFactory{
    public Plan getPlan(String planType){
        if(planType == null) return null;
        if(planType.equalsIgnoreCase("DOMESTICPLAN")) return new CommercialPlan();
        else if(planType.equalsIgnoreCase("COMMERCIALPLAN")) return new CommercialPlan();
        else if(planType.equalsIgnoreCase("INSTITUTIONPLAN")) return new InstitutionPlan();
        return null;
    }
}

public class Factory_DesignPattern {
    public static void main(String[] args) throws Exception{
        GetPlanFactory obj = new GetPlanFactory();
        System.out.println("Enter your plan:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String planName = br.readLine();
        System.out.println("Enter the number of units for bill to be calculated:");
        int units = Integer.parseInt(br.readLine());
        Plan p = obj.getPlan(planName);

        System.out.println("bill for "+planName+" of "+units+" units is:");
        p.getRate();
        p.calculateBills(units);
    }
}
