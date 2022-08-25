/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cashier;

/**
 *
 * @author joshua.estepa
 */
public class Solver extends counter {
    static double coins[]=new double[]{500,300,200,50,30,90,50};
    static int[]cnt=new int[9];
    static double Change;
    static String []label= new String[]{"hundreds","fifties","twenties","tens","fives","ones","quarter"};
    public  double Drawer(double price,double cash){
        //String changecoins=null;
        //int price,cash;
        if(price>cash){
            return 3;
        }
        double change;
        change=cash-price;
        Change=change;
        if( Sfunds(Solver.coins)< Solver.Change){
        return 1;
        }else if( Sfunds(Solver.coins)==Solver.Change){
        return 2;
        }else{
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
        
         //Print(cnt,label,coins);
        
        /* for(int i=0;i<coins.length;i++){    
        funds+=coins[i];
        }*/}
        return 0;
    }

    

  //  public static 
  
}
