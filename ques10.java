// 10. Design classes having attributes and method(only skeleton) for a coffee shop.
// There are three different actors in our scenario and i have listed the different actions they do also below
// * Customer
//   - Pays the cash to the cashier and places his order, get a token number back
//   - Waits for the intimation that order for his token is ready
//   - Upon intimation/notification he collects the coffee and enjoys his drink
//   ( Assumption:  Customer waits till the coffee is done, he wont timeout and cancel the order.
//      Customer always likes the drink served. Exceptions like he not liking his coffee,
        // he getting wrong coffee are not considered to keep the design simple.)
//
// * Cashier
//   - Takes an order and payment from the customer
//   - Upon payment, creates an order and places it into the order queue
//   - Intimates the customer that he has to wait for his token and gives him his token
//   ( Assumption: Token returned to the customer is the order id. Order queue is unlimited.
//      With a simple modification, we can design for a limited queue size)
//
// * Barista
//  - Gets the next order from the queue
//  - Prepares the coffee
//  - Places the coffee in the completed order queue
//  - Places a notification that order for token is ready

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.order_placed();
        // Customer customer2 = new Customer();
        // customer2.order_placed();
    }
}

class Customer extends Cashier{
    int amt[]={100,150,200};
    int cash;
    int order;
    int token;
    public void order_placed(){
        System.out.println("Please select your drink... \n 1:Espresso \n 2:Cappuccino \n 3:Latte\n");
        System.out.println("Select your order: ");
        order=new Scanner(System.in).nextInt();
        if((order==1)||(order==2)||(order==3)) {
            System.out.println("Please pay cash. Your amount is : "+amt[order-1]);
            cash=new Scanner(System.in).nextInt();
            order(cash,order);
        }
        else
          System.out.println("Please select correct option");
    }

    public void order_delivered(){
        System.out.println("Please collect your order. Enjoy your coffee");
    }
}

class Cashier extends Barista{
    int amt[]={100,150,200};
    int order;
    int token=0;
    Queue<Integer> q = new LinkedList<>();
    public void order(int cash, int order){
        if(cash>=amt[order-1]) {
          token++;
          System.out.println("Your order will be delivered soon. ");
          if(cash>amt[order-1])
            System.out.println("Your remaining cash :"+(cash-amt[order-1]));
          System.out.println("Your token number is:"+token);
          q.add(order);
          deliver(q.peek());
          q.remove();
        }
        else
          System.out.println("Please pay correct amount");

    }
  }

class Barista{
    void deliver(int order){
        System.out.println("Order Delivered, Please Enjoy..");
    }
}
