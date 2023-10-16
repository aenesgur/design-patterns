package prototype;

import prototype.customer_clonable.Customers;
import prototype.sheep_not_clonable.BlackSheep;
import prototype.sheep_not_clonable.Sheep;
import prototype.sheep_not_clonable.WhiteSheep;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //region Customer

        try {
            Customers customers = new Customers();

            Customers customers1 = (Customers) customers.clone();
            Customers customers2 = (Customers) customers.clone();
            List<String> customersList1 = customers1.getCustomerList();
            customersList1.add("Vivek");
            List<String> customersList2 = customers2.getCustomerList();
            customersList2.remove("Deepika");

            System.out.println("customers List elements: "+customers.getCustomerList());
            System.out.println("customers1 List elements: "+customersList1);
            System.out.println("customers2 List elements: "+customersList2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //endregion

        //region Sheep

        // Create prototype sheep
        Sheep blackPrototype = new BlackSheep("Baa Baa", 4);
        Sheep whitePrototype = new WhiteSheep("Fleecy", 3);

        // Clone sheep as needed
        Sheep clonedBlackSheep = blackPrototype.clone();
        Sheep clonedWhiteSheep = whitePrototype.clone();

        // Customize cloned sheep
        clonedBlackSheep.setName("Midnight");
        clonedWhiteSheep.setName("Snowball");

        // Your sheep farm is thriving!
        System.out.println("Cloned Black sheep: " + clonedBlackSheep.getName() + " " + clonedBlackSheep.getAge());
        System.out.println("Black sheep: " + blackPrototype.getName() + " " + blackPrototype.getAge());
        System.out.println("Cloned White sheep: " + clonedWhiteSheep.getName() + " " + clonedWhiteSheep.getAge());

        //endregion
    }
}