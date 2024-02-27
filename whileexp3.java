import java.util.Scanner;

public class whileexp3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.00;
        System.out.println("Welcome to the Banking application");
        System.out.println("Initial Balance is : " + balance);

        while(true){
            System.out.println("Menu");
            System.out.println("1. Deposite");
            System.out.println("2. withdrawal");
            System.out.println("3. Fund Transfer");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit ");
            System.out.println("Choose what do you want ? ");

            int choose = scanner.nextInt();

            switch (choose) {
                case 1:
                System.out.println("Enter your Deposite amount. ");
                double depositeAmount = scanner.nextDouble();
                balance += depositeAmount;
                System.out.println("Successfully Deposited. Updated Balance is : " + balance);
                break;

                    case 2 :
                    System.out.println("Enter withdrawl Amount : ");   
                    double withdrawalAmount = scanner.nextDouble();
                    
                    if(withdrawalAmount > balance){
                        System.out.println("Sorry insufficient Balance withdrawal failed, please try again");
                    } else{
                        balance -= withdrawalAmount;
                        System.out.println("withdrawal successful. Updated Balance : " + balance);
                    }
                    break;

                    case 3:
                    System.out.println("Enter transfered amount ");
                    double transferMoney = scanner.nextDouble();

                    if(transferMoney > balance){
                        System.out.println("Sorry insufficient Balance transfer failed, Please try again");
                    }else{
                        balance -= transferMoney;
                        System.out.println(" Sucessfully fund transfer updated Balance is : " + balance);
                    }
                    break;

                    case 4:
                    System.out.println("Current balance is : " + balance);
                    break;

                    case 5:
                    System.out.println("Thank you for using Application");
                    scanner.close();
                    System.exit(0);
                    break;


            
                default:
                System.out.println("Invalid input");
                    break;
            }
        }
    }
} 