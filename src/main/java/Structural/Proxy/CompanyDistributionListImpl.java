package Structural.Proxy;

public class CompanyDistributionListImpl implements  CompanyDistributionList{
    @Override
    public void addEmployeeEmail(String email) {
        System.out.println(email + " added to the list");
    }

    @Override
    public void removeEmployeeEmail(String email) {
        System.out.println(email + " removed from the list");
    }
}
