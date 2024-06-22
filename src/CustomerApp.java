public class CustomerApp {
    public static void main(String[] args) throws Exception {

        Customer customer = new Customer ("zahra", 2000, "zahramaulida@gmail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

        Customer customer2 = new Customer ("yusuf", "yusufindra@gmail.com");
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmail());

        System.out.println((customer2.creditLimit==100?"Correct Constructor default creditLimit":"Wrong Constructor default CreditLimit"));

        Customer customer3 = new Customer();
        System.out.println(customer3.getName());
        System.out.println(customer3.getCreditLimit());
        System.out.println(customer3.getEmail());

        System.out.println((customer3.getName()=="zahra_syifaul"?"correct Constructor default Name":"Wrong Constructor default Name"));
        System.out.println((customer3.getEmail()=="zahrasyifaul7@gmail.com"?"correct Constructor default Email":"Wrong Constructor default Email"));



    }
}
