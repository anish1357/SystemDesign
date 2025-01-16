package Structural.Proxy;

public class Client {
    public static void main(String[] args) {

        CompanyDistributionList companyDistributionList = new CompanyDistributionListProxy(new CompanyDistributionListImpl());
        companyDistributionList.addEmployeeEmail("abc@google.com");
        companyDistributionList.addEmployeeEmail("xyz@meta.com");

    }
}
