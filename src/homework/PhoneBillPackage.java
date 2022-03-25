package homework;

import java.util.Scanner;

public class PhoneBillPackage {
    double a;

    public PhoneBillPackage(double a) {
        this.a = a;
    }

    public void Voice(double amt){
        System.out.println("လူကြီးမင်း၏မူလလက်ကျန်ငွေမှာ " + a );
        if (a >amt) {
            a -= amt;
            System.out.println(amt + " ကျပ်တန်voice package အားဝယ်ယူပြီးပါပြီ");
            System.out.println("လူကြီးမင်း၏လက်ကျန်ငွေမှာ " + a );

        }else{
            System.out.println(amt + " Voice Pack ဝယ်ယူရန်အတွက်လက်ကျန်ငွေမလုံလောက်ပါ");
        }
    }

    public void Data(double amt){
        System.out.println("လူကြီးမင်း၏မူလလက်ကျန်ငွေမှာ " + a );
        if (a >amt) {
            a -= amt;
            System.out.println(amt + " ကျပ်တန်Data Pack အားဝယ်ယူပြီးပါပြီ");
            System.out.println("လူကြီးမင်း၏လက်ကျန်ငွေမှာ " + a );

        }else{
            System.out.println(amt + " Data Pack ဝယ်ယူရန်အတွက်လက်ကျန်ငွေမလုံလောက်ပါ");
        }
    }

    public void SpecialOffer(double amt){
        System.out.println("လူကြီးမင်း၏မူလလက်ကျန်ငွေမှာ " + a );
        if (a >amt) {
            a -= amt;
            System.out.println(amt + " ကျပ်တန်Special Pack အားဝယ်ယူပြီးပါပြီ");
            System.out.println("လူကြီးမင်း၏လက်ကျန်ငွေမှာ " + a );

        }else{
            System.out.println(amt + " Special Pack ဝယ်ယူရန်အတွက်လက်ကျန်ငွေမလုံလောက်ပါ");
        }
    }

    public void HtawB(double amt){
        System.out.println("လူကြီးမင်း၏မူလလက်ကျန်ငွေမှာ " + a );
        a *= amt;
        System.out.println(amt + " ဆ ထောပြီ package အားဝယ်ယူပြီးပါပြီ");
        System.out.println("လူကြီးမင်း၏လက်ကျန်ငွေမှာ " + a );
    }

    public void Plan(int amt){
        if (amt == 1){
            System.out.println("1.Prepaid Plan");
            System.out.println("2.Postpaid Plan");
            System.out.print("အသုံးပြုလိုသည့်ဝန်ဆောင်မှုကိုရွေးချယ်ပေးပါ ");
            int p = new Scanner(System.in).nextInt();
            if(p == 1){
                System.out.println("Prepaid Plan အစီအစဉ်အားရယူပြီးပါပြီ");
            }else if(p==2){
                System.out.println("Postpaid Plan အစီအစဉ်အားရယူပြီးပါပြီ");
            }else{
                System.out.println("Invalid Number");
            }

        }else if(amt == 2){
            System.out.println("လူကြီးမင်း၏မူလလက်ကျန်ငွေမှာ " + a );
        }else if(amt == 3){
            System.out.println("လူကြီးမင်း၏ဖုန်းနံပါတ်မှာ " + "09123456789");
        }else if(amt == 4){
            System.out.println("1. Sim Register စစ်ရန်");
            System.out.println("2. 4G Check");
            System.out.println("3. Roaming Check");
            System.out.print("အသုံးပြုလိုသည့်ဝန်ဆောင်မှုကိုရွေးချယ်ပေးပါ ");
            int p = new Scanner(System.in).nextInt();
            if (p==1){
                System.out.println("လူကြီးမင်း၏Simမှာ Registerလုပ်ပြီးပါပြီ");
            }else if(p==2){
                System.out.println("4G Check is already done");
            }else if(p==3){
                System.out.println("Roaming Check is done");
            }else{
                System.out.println("Invalid Number!");
            }
        }else{
            System.out.println("Invalid Number!");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter your Operator: ");
        String operator = new Scanner(System.in).nextLine();

        if(operator.equals("mpt")){
            System.out.println("MPT Operator ၏ Service Code #106 ကိုခေါ်ဆိုပြီးပါပြီး။");
            System.out.println("1.Voice");
            System.out.println("2.Data");
            System.out.println("3.အထူးလက်ဆောင်");
            System.out.println("4.Htaw B");
            System.out.println("5.စာရင်း");
            System.out.println("6.Bal");
            System.out.println("7.MPTClub");
            System.out.println("8.VAS");
            System.out.println("9.ဘာသာ");

            System.out.print("အသုံးပြုလိုသည့်ဝန်ဆောင်မှုကိုရွေးချယ်ပေးပါ ");
            int code = new Scanner(System.in).nextInt();
            switch (code) {
                case 1:

                    System.out.println("1. 619min=3900Ks");
                    System.out.println("2. 234min=1500Ks");
                    System.out.println("3. 132min=850Ks");
                    System.out.println("4. 50min=399Ks");
                    System.out.println("5. more");

                    System.out.print("အသုံးပြုလိုသည့်ဝန်ဆောင်မှုကိုရွေးချယ်ပေးပါ ");
                    int code1 = new Scanner(System.in).nextInt();
                    if (code1 == 1) {
                        PhoneBillPackage bill = new PhoneBillPackage(5000);
                        bill.Voice(3900);
                    } else if (code1 == 2) {
                        PhoneBillPackage bill = new PhoneBillPackage(4000);
                        bill.Voice(1500);
                    } else if (code1 == 3) {
                        PhoneBillPackage bill = new PhoneBillPackage(3000);
                        bill.Voice(850);
                    } else if (code1 == 4) {
                        PhoneBillPackage bill = new PhoneBillPackage(2000);
                        bill.Voice(399);
                    } else if (code1 == 5) {
                        System.out.println("1.30 min = 249Ks");
                        System.out.println("2.10min = 99Ks");
                        System.out.println("3. IDD 50Ks/min = 499Ks");

                        System.out.print("အသုံးပြုလိုသည့်ဝန်ဆောင်မှုကိုရွေးချယ်ပေးပါ ");
                        int code2 = new Scanner(System.in).nextInt();
                        if (code2 == 1) {
                            PhoneBillPackage bill = new PhoneBillPackage(2000);
                            bill.Voice(249);
                        } else if (code2 == 2) {
                            PhoneBillPackage bill = new PhoneBillPackage(2000);
                            bill.Voice(99);
                        } else if (code2 == 3) {
                            PhoneBillPackage bill = new PhoneBillPackage(2000);
                            bill.Voice(499);
                        } else {
                            System.out.println("Invalid Number!");
                        }
                    } else {
                        System.out.println("Invalid Number!");
                    }
                break;

                case 2:
                    System.out.println("1. Daily");
                    System.out.println("2. DataCarry+");
                    System.out.println("3. Casual");

                    System.out.print("အသုံးပြုလိုသည့်ဝန်ဆောင်မှုကိုရွေးချယ်ပေးပါ ");
                    int data = new Scanner(System.in).nextInt();

                    if(data == 1) {
                        PhoneBillPackage bill = new PhoneBillPackage(5000);
                        bill.Voice(299);
                    }else if (data == 2) {
                        System.out.println("1. 699ks = 250MB");
                        System.out.println("2. 799ks = 350MB");
                        System.out.println("3. 979ks/999ks = 470MB");
                        System.out.println("4. 1279ks/1299ks = 615MB");
                        System.out.println("5. More");

                        System.out.print("အသုံးပြုလိုသည့်ဝန်ဆောင်မှုကိုရွေးချယ်ပေးပါ ");
                        int data1 = new Scanner(System.in).nextInt();

                        if(data1 == 1) {
                            PhoneBillPackage bill = new PhoneBillPackage(5000);
                            bill.Data(699);
                        }else if(data1 == 2){
                            PhoneBillPackage bill = new PhoneBillPackage(5000);
                            bill.Data(799);
                        }else if(data1 == 3){
                            PhoneBillPackage bill = new PhoneBillPackage(5000);
                            bill.Data(979);
                        }else if(data1 == 4){
                            PhoneBillPackage bill = new PhoneBillPackage(5000);
                            bill.Data(1279);
                        }else if(data1 == 5){
                            System.out.println("1. 1779Ks/1799Ks=860MB");
                            System.out.println("2. 266Ks/2699Ks=1290MB");
                            System.out.println("3. 4499Ks=2160Ks");
                            System.out.println("4. More");

                            System.out.print("အသုံးပြုလိုသည့်ဝန်ဆောင်မှုကိုရွေးချယ်ပေးပါ ");
                            int data2 = new Scanner(System.in).nextInt();
                            if(data2 == 1){
                                PhoneBillPackage bill = new PhoneBillPackage(5000);
                                bill.Data(1779);
                            }else if(data2 == 2){
                                PhoneBillPackage bill = new PhoneBillPackage(5000);
                                bill.Voice(266);
                            }else if(data2 == 3){
                                PhoneBillPackage bill = new PhoneBillPackage(5000);
                                bill.Voice(4499);
                            }else if(data2 == 4){
                                System.out.println("1. 8999Ks = 4330MB");
                                System.out.println("2. 17999Ks = 8660MB");
                                System.out.println("3. 26999Ks = 13030");

                                System.out.print("အသုံးပြုလိုသည့်ဝန်ဆောင်မှုကိုရွေးချယ်ပေးပါ ");
                                int data3 = new Scanner(System.in).nextInt();
                                if(data3 == 1){
                                    PhoneBillPackage bill = new PhoneBillPackage(5000);
                                    bill.Data(8999);
                                }else if(data3 == 2){
                                    PhoneBillPackage bill = new PhoneBillPackage(5000);
                                    bill.Voice(17999);
                                }else if(data3 == 3){
                                    PhoneBillPackage bill = new PhoneBillPackage(5000);
                                    bill.Data(26999);
                                }else{
                                    System.out.println("Invalid Number!");
                                }

                            }else{
                                System.out.println("Invalid Number!");
                            }
                        }else{
                            System.out.println("Invalid Number!");
                        }
                    }else if (data == 3){
                        System.out.println("1. 2Days 75MB(199Ks)");
                        System.out.println("2. 7Days 400MB(949Ks)");
                        System.out.println("3. 30Days 1200MB(2699Ks)");

                        System.out.print("အသုံးပြုလိုသည့်ဝန်ဆောင်မှုကိုရွေးချယ်ပေးပါ ");
                        int data4 = new Scanner(System.in).nextInt();

                        if (data4 == 1){
                            PhoneBillPackage bill = new PhoneBillPackage(5000);
                            bill.Data(199);
                        }else if(data4 == 2){
                            PhoneBillPackage bill = new PhoneBillPackage(5000);
                            bill.Data(949);
                        }else if(data4 == 3){
                            PhoneBillPackage bill = new PhoneBillPackage(5000);
                            bill.Data(2699);
                        }else{
                            System.out.println("Invalid Number!");
                        }
                    }else{
                        System.out.println("Invalid Number!");
                    }
                break;

                case 3:
                    System.out.println("1. 480MB = 999Ks(30D)");
                    System.out.println("2. 280MB = 585Ks(30D)");
                    System.out.println("3. 85Min(MPT)=555Ks(30D)");
                    System.out.println("4. 40Min(Anynet)=55Ks");

                    System.out.print("အသုံးပြုလိုသည့်ဝန်ဆောင်မှုကိုရွေးချယ်ပေးပါ ");
                    int specialoffer = new Scanner(System.in).nextInt();
                    if(specialoffer==1){
                        PhoneBillPackage bill = new PhoneBillPackage(5000);
                        bill.SpecialOffer(999);
                    }else if(specialoffer==2){
                        PhoneBillPackage bill = new PhoneBillPackage(5000);
                        bill.SpecialOffer(585);
                    }else if(specialoffer == 3) {
                        PhoneBillPackage bill = new PhoneBillPackage(5000);
                        bill.SpecialOffer(555);
                    }else if(specialoffer == 4){
                        PhoneBillPackage bill = new PhoneBillPackage(5000);
                        bill.SpecialOffer(55);
                    }else{
                        System.out.println("Invalid Number for SpecialOffer!");
                    }
                break;


                case 4:
                    System.out.println("1. 5X Htaw B");
                    System.out.println("2. 7X Htaw B");
                    System.out.println("3. 10X All in one Htaw B");

                    System.out.print("အသုံးပြုလိုသည့်ဝန်ဆောင်မှုကိုရွေးချယ်ပေးပါ ");
                    int htawb = new Scanner(System.in).nextInt();

                    if(htawb == 1){
                        PhoneBillPackage bill = new PhoneBillPackage(5000);
                        bill.HtawB(5);
                    }else if(htawb == 2){
                        PhoneBillPackage bill = new PhoneBillPackage(5000);
                        bill.HtawB(7);
                    }else if(htawb == 3){
                        PhoneBillPackage bill = new PhoneBillPackage(5000);
                        bill.HtawB(10);
                    }else{
                        System.out.println("Invalid Number for htawb!");
                    }
                break;

                case 5:
                    System.out.println("1.အစီအစဉ်ပြောင်းရန်");
                    System.out.println("2.ဖုန်းငွေစစ်ရန်");
                    System.out.println("3.မိမိနံပါတ်");
                    System.out.println("4.စစ်ဆေးရန်");

                    System.out.print("အသုံးပြုလိုသည့်ဝန်ဆောင်မှုကိုရွေးချယ်ပေးပါ ");
                    int plan = new Scanner(System.in).nextInt();
                    if(plan==1){
                        PhoneBillPackage bill = new PhoneBillPackage(5000);
                        bill.Plan(1);
                    }else if(plan==2){
                        PhoneBillPackage bill = new PhoneBillPackage(5000);
                        bill.Plan(2);
                    }else if(plan == 3){
                        PhoneBillPackage bill = new PhoneBillPackage(5000);
                        bill.Plan(3);
                    }else if(plan == 4){
                        PhoneBillPackage bill = new PhoneBillPackage(5000);
                        bill.Plan(4);
                    }else{
                        System.out.println("Invalid number!");
                    }
                break;

                case 6:
                    System.out.println("No code for Bal");
                break;

                case 7:
                    System.out.println("No code for MPTClub");
                break;

                case 8:
                    System.out.println("No code for VAS");
                break;

                case 9:
                    System.out.println("No code for ဘာသာ");
                break;

                default:
                    System.out.println("Invalid Number!");
              }
        }else if (operator.equals("telenor")){
            System.out.println("Sorry!!!တယ်လီနောလ်အတွက်codeမရေးရသေးပါ");
        }else if (operator.equals("ooredoo")){
            System.out.println("Sorry!!!Ooredooအတွက်codeမရေးရသေးပါ");
        }else{
            System.out.println("Your Operator isn't useful in this Country");
        }
    }
}
