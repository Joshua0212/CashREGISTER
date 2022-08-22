/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cashier;

/**
 *
 * @author joshua.estepa
 */
public class Solver {
    static double coins[]=new double[]{500,300,200,50,30,90,50};
    public  double Drawer(double price,double cash){
        double change;
        //String changecoins=null;
        //int price,cash;
        change=cash-price;
        double funds=0;
        int[]cnt=new int[9];
        double sfunds= Solver.Sfunds(coins);
        String []label= new String[]{"hundreds","fifties","twenties","tens","fives","ones","quarter"};
        if(sfunds< change){
        insufficientfunds(); 
        return 0;
        } 
        if(sfunds==change){
        closedD();
        return 0;    
        }
        //computation
        if(change>=100){
            do{
               
                change-=100;
                cnt[0]++;
                coins[0]= coins[0]-100;
            }while(change >=100&&coins[0]>0);
            
        } if(change>=50){
            do{
                change-=50;
                cnt[1]++;
             coins[1]= coins[1]-50;
            }while(change >=50&&coins[1]>0);
            
        } if(change>=20){
            do{
                change-=20;
                cnt[2]++;
              coins[2]= coins[2]-20;
            }while(change >=20&&coins[2]>0);
            
        } if(change>=10){
            do{
                change-=10;
                cnt[3]++;
             coins[3]= coins[3]-10;
            }while(change >=10&&coins[3]>0);
            
        } if(change>=5){
            do{
                change-=5;
                cnt[4]++;
             coins[4]= coins[4]-5;
            }while(change >=5&&coins[4]>0);
           
        }  if(change>=1){
            do{
                change-=1;
                cnt[5]++;
             coins[5]= coins[5]-1;
            }while(change >=1&&coins[5]>0);
           
        }  if(change>=.25){
            do{
                change-=.25;
                cnt[6]++;
                coins[6]= coins[6]-.25;
            }while(change >=.25&&coins[6]>0);
            
        }
         for(int i=0;i<coins.length;i++){    
        System.out.println(cnt[i]+" "+label[i]);
        }
        for(int i=0;i<coins.length;i++){    
        System.out.println(label[i]+"="+coins[i]);
        }
        Sfunds(coins);
        /* for(int i=0;i<coins.length;i++){    
        funds+=coins[i];
        }*/
        return funds;
    }
    public static void closedD(){
        System.out.println("CLOSED!!!!!!!");
    }
    
    public static void insufficientfunds(){
        System.out.println("walang yelo");
        System.out.println("HANAP KA NALANG SA IBA!!!");  
    }
    
    public static double Sfunds(double coins[]){
        double funds=0.0;
         for(int i=0;i<coins.length;i++){    
        funds+=coins[i];
        }
         System.out.println(funds);
         return funds;
    }
  
}
