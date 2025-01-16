package Structural.Proxy;

public class CompanyDistributionListProxy implements  CompanyDistributionList {

    CompanyDistributionListImpl companyDistributionList;

    public CompanyDistributionListProxy(CompanyDistributionListImpl companyDistributionList) {
        this.companyDistributionList = companyDistributionList;
    }

    @Override
    public void addEmployeeEmail(String email) {
        if(email.contains("google.com")){
            companyDistributionList.addEmployeeEmail(email);
        }else {
            System.out.println(email + " does not belong to the organisation");
        }
    }

    @Override
    public void removeEmployeeEmail(String email) {
        //Validations for admin
//        if(user == "ADMIN"){
//           companyDistributionList.removeEmployeeEmail(email);
    }
}
