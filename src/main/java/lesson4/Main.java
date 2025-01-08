package lesson4;

public class Main {
    public static void main(String[] args) {
        Customer customer = getCustomer(getData("Billy", "3809916286"));
        String output = "Customer: " + customer.getName() + ", phone: " + customer.getPhone();
        getOutput(output);
    }
    public static String[] getData(String name, String phone){
        String[] data = new String[2];
        data[0] = name;
        data[1] = phone;
        return data;
    }
    public static Customer getCustomer(String[] data){
        return new Customer(data[0],data[1]);
    }
    public static void getOutput(String output){
        System.out.println(output);
    }
}
