import java.util.*;
import java.io.*;
public class Home_Remedies
{ 
    //initialisation 
    Scanner sc = new Scanner(System.in);
    String[][] a = new String[50][5];
    int[] b = new int[50];
    int n=19;   
     public void main(String[] args)
    {
        Home_Remedies obj = new Home_Remedies();
        System.out.println("ELIXIR AND PANACEA");
        for(int i=0; ;i++)
        {
             System.out.println("Choose an option from the given menu!");
             System.out.println("This is the menu:-");
             System.out.println("1.View a remedy");
             System.out.println("2.Add a remedy");
             System.out.println("3.Exit");
             int choice = sc.nextInt();
             switch(choice)
             {
                 case 1: categories();
                         break;
                 
                 case 2: add();
                         break;
                         
                 case 3: System.exit(0);
                         break;
                 
                 default: System.out.println("Invalid choice!!!");
             }
        }
    }
    public void categories()
    {
        for(int i=0; ;i++)
        {
             System.out.println("Choose a category! ");
             System.out.println("The Categories:-");
             System.out.println("1.Hair");
             System.out.println("2.Headaches");
             System.out.println("3.Eyes");
             System.out.println("4.Nose");
             System.out.println("5.Mouth");
             System.out.println("6.Face");
             System.out.println("7.Throat");
             System.out.println("8.Cold");
             System.out.println("9.Cough");
             System.out.println("10.Periods");
             System.out.println("11.Irritation");
             System.out.println("12.Others");
             System.out.println("13.All");
             System.out.println("14.Exit");
             int choice1 = sc.nextInt();
             switch(choice1)
             {
                 case 1: {
                            System.out.println("Hair Remedies:");                            
                            for(int j=0; j<n; j++)
                            {
                                if(a[j][1].equals("Hair"))
                                {
                                    System.out.println(a[j][0]);                                    
                                    for(int k=2;k<5;k++)
                                    {
                                        if(a[j][k]!=null)
                                        {
                                        System.out.println(a[j][k]);
                                        }
                                    }
                                }
                            }
                            System.out.println("Press any key to go back to the categories!");
                            char ch= sc.next().charAt(0);
                         }
                         break;
                         
                 case 2: {
                            System.out.println("Headaches:");           
                            for(int j=0; j<n; j++)
                            {
                                if(a[j][1].equals("Headaches"))
                                {
                                    System.out.println(a[j][0]);
                                    for(int k=2;k<5;k++)
                                    {
                                        if(a[j][k]!=null)
                                        {
                                        System.out.println(a[j][k]);
                                        }
                                    }
                                }
                            }
                            System.out.println("Press any key to go back to the categories!");
                            char ch= sc.next().charAt(0);
                         }
                         break;
                         
                 case 3: {
                            System.out.println("Eyes:");                            
                            for(int j=0; j<n; j++)
                            {
                                if(a[j][1].equals("Eyes"))
                                {
                                    System.out.println( a[j][0]);
                                    for(int k=2;k<5;k++)
                                    {
                                        if(a[j][k]!=null)
                                        {
                                        System.out.println(a[j][k]);
                                        }
                                    }
                                }
                            }
                            System.out.println("Press any key to go back to the categories!");
                            char ch= sc.next().charAt(0);
                         }
                         break;
                         
                 case 4: {
                            System.out.println("Nose:");                            
                            for(int j=0; j<n; j++)
                            {
                                if(a[j][1].equals("Nose"))
                                {
                                    System.out.println(a[j][0]);
                                    for(int k=2;k<5;k++)
                                    {
                                        if(a[j][k]!=null)
                                        {
                                        System.out.println(a[j][k]);
                                        }
                                    }
                                }
                            }
                            System.out.println("Press any key to go back to the categories!");
                            char ch= sc.next().charAt(0);
                         }
                         break;
                         
                 case 5: {
                            System.out.println("Mouth:");                            
                            for(int j=0; j<n; j++)
                            {
                                if(a[j][1].equals("Mouth"))
                                {
                                    System.out.println(a[j][0]);
                                    for(int k=2;k<5;k++)
                                    {
                                        if(a[j][k]!=null)
                                        {
                                        System.out.println(a[j][k]);
                                        }
                                    }
                                }
                            }
                            System.out.println("Press any key to go back to the categories!");
                            char ch= sc.next().charAt(0);
                         }
                         break;
                         
                 case 6: {
                            System.out.println("Face:");   
                            for(int j=0; j<n; j++)
                            {
                                if(a[j][1].equals("Face"))
                                {
                                    System.out.println(a[j][0]);
                                    for(int k=2;k<5;k++)
                                    {
                                        if(a[j][k]!=null)
                                        {
                                        System.out.println(a[j][k]);
                                        }
                                    }
                                }
                            }
                            System.out.println("Press any key to go back to the categories!");
                            char ch= sc.next().charAt(0);
                         }
                         break;
                         
                 case 7: {
                            System.out.println("Throat:");
                            for(int j=0; j<n; j++)
                            {
                                if(a[j][1].equals("Throat"))
                                {
                                    System.out.println(a[j][0]);
                                    for(int k=2;k<5;k++)
                                     {
                                        if(a[j][k]!=null)
                                        {
                                        System.out.println(a[j][k]);
                                        }
                                     }
                                }
                            }
                            System.out.println("Press any key to go back to the categories!");
                            char ch= sc.next().charAt(0);
                         }
                         break;
                         
                 case 8: {
                            System.out.println("Cold:"); 
                            for(int j=0; j<n; j++)
                            {
                                if(a[j][1].equals("Cold"))
                                {
                                    System.out.println(a[j][0]);
                                    for(int k=2;k<5;k++)
                                    {
                                        if(a[j][k]!=null)
                                        {
                                        System.out.println(a[j][k]);
                                        }
                                    }
                                }
                            }
                            System.out.println("Press any key to go back to the categories!");
                            char ch= sc.next().charAt(0);
                         }
                         break;
                         
                 case 9: {
                            System.out.println("Cough:");                            
                            for(int j=0; j<n; j++)
                            {
                                if(a[j][1].equals("Cough:"))
                                {
                                    System.out.println(a[j][0]);
                                    for(int k=2;k<5;k++)
                                    {
                                        if(a[j][k]!=null)
                                        {
                                        System.out.println(a[j][k]);
                                        }
                                    }
                                }
                            }
                            System.out.println("Press any key to go back to the categories!");
                            char ch= sc.next().charAt(0);
                         }
                         break;
                         
                 case 10:{
                            System.out.println("Periods:");                         
                            for(int j=0; j<n; j++)
                            {
                                if(a[j][1].equals("Periods"))
                                {
                                    System.out.println(a[j][0]);
                                    for(int k=2;k<5;k++)
                                    {
                                        if(a[j][k]!=null)
                                        {
                                        System.out.println(a[j][k]);
                                        }
                                    }
                                }
                            }
                            System.out.println("Press any key to go back to the categories!");
                            char ch= sc.next().charAt(0);
                         }
                         break;
                         
                 case 11:{
                            System.out.println("Irritation:");
                            for(int j=0; j<n; j++)
                            {
                                if(a[j][1].equals("Irritation"))
                                {
                                    System.out.println(a[j][0]);
                                    for(int k=2;k<5;k++)
                                    {
                                        if(a[j][k]!=null)
                                        {
                                        System.out.println(a[j][k]);
                                        }
                                    }
                                }
                            }
                            System.out.println("Press any key to go back to the categories!");
                            char ch= sc.next().charAt(0);
                         }
                         break;
                         
                 case 12:{
                            System.out.println("Others:");
                            for(int j=0; j<n; j++)
                            {
                                if(a[j][1].equals("Others"))
                                {
                                    System.out.println(a[j][0]);
                                    for(int k=2;k<5;k++)
                                    {
                                        if(a[j][k]!=null)
                                        {
                                        System.out.println(a[j][k]);
                                        }
                                    }
                                }
                            }
                            System.out.println("Press any key to go back to the categories!");
                            char ch= sc.next().charAt(0);
                         }
                         break; 
                 
                 case 13:{
                            System.out.println("All:");
                            for(int j=0; j<n; j++)
                            {
                                    System.out.println(a[j][0]);
                                    for(int k=2;k<5;k++)
                                    {
                                        if(a[j][k]!=null)
                                        {
                                        System.out.println(a[j][k]);
                                        }
                                    }
                                    System.out.println();
                            }
                         }
                         System.out.println("Press any key to go back to the categories!");
                         char ch= sc.next().charAt(0);
                         break;
                  
                 case 14: System.exit(0);
                 
                 default: System.out.println("Invalid choice!");
               }  
        }
    }
      void add()
    {
        System.out.println("Enter the health issue:");
        String str=sc.nextLine();
        a[n][0]=sc.nextLine();
        System.out.println("The Categories");
        System.out.println("1.Hair");
        System.out.println("2.Headaches");
        System.out.println("3.Eyes");
        System.out.println("4.Nose");
        System.out.println("5.Mouth");
        System.out.println("6.Face");
        System.out.println("7.Throat");
        System.out.println("8.Cold");
        System.out.println("9.Cough");
        System.out.println("10.Periods");
        System.out.println("11.Irritation");
        System.out.println("12.Others");
        int h=sc.nextInt();
        switch(h)
        {
           case 1:a[n][1]="Hair";
                  break;
                  
           case 2:a[n][1]="Headaches";
                  break;
                  
           case 3:a[n][1]="Eyes";
                  break;
                  
           case 4:a[n][1]="Nose";
                  break;
                  
           case 5:a[n][1]="Mouth";
                  break;
                  
           case 6:a[n][1]="Face";
                  break;
                  
           case 7:a[n][1]="Throat";
                  break;
                  
           case 8:a[n][1]="Cold";
                  break;
                  
           case 9:a[n][1]="Cough";
                  break;
                  
           case 10:a[n][1]="Periods";
                   break;
                   
           case 11:a[n][1]="Irritation";
                   break;
                   
           case 12:a[n][1]="Others";
                   break;
      
           default: System.out.println("Invalid Choice!");
                        
        }
        System.out.println("Enter number of remedies(max =3)");
        int ns=sc.nextInt();
        System.out.println("Enter remedies");
        for(int o=2; o<(ns+2); o++)
        {
           str=sc.nextLine();
           a[n][o]=sc.nextLine();
        }
        n++;
     }
    Home_Remedies()
    {
        a[0][0] = "To make your hair stronger";
        a[1][0] = "Alternative for Shampoo";
        a[2][0] = "To reduce Dandruff";
        a[3][0] = "To reduce Headache";
        a[4][0] = "To reduce Eye Pain";
        a[5][0] = "To remove Blackheads and whiteheads";
        a[6][0] = "To subside an ulcer";
        a[7][0] = "To reduce Pimples";
        a[8][0] = "To take care of uneven skintone";
        a[9][0] = "To reduce wrinkles";
        a[10][0] = "To cure Milia(small, dome-shaped bumps that are usually white or yellow under the eye)";
        a[11][0] = "To take care of damanged skin";
        a[12][0] = "To reduce throat pain";
        a[13][0] = "Cold";
        a[14][0] = "Cough";
        a[15][0] = "Period pain";
        a[16][0] = "To get your periods early";
        a[17][0] = "To get your periods late";
        a[18][0] = "Irritation in your private part";
        for(int i = 0; i<19; i++)
        {
            if(i<3)
            {
                a[i][1] = "Hair";
            }
            if(i==3)
            {
                a[i][1] = "Headaches";
            }
            if(i==4)
            {
                a[i][1] = "Eyes";
            }
            if(i==5)
            {
                a[i][1] = "Nose";
            }
            if(i==6)
            {
                a[i][1] = "Mouth";
            }
            if(i>6 && i<12)
            {
                a[i][1] = "Face";
            }
            if(i==12)
            {
                a[i][1] = "Throat";
            }
            if(i==13)
            {
                a[i][1] = "Cold";
            }
            if(i==14)
            {
                a[i][1] = "Cough";
            }
            if(i>14 && i<18)
            {
                a[i][1] = "Periods";
            }
            if(i==18)
            {
                a[i][1] = "Irritation";
            }
        }
        a[0][2] = "# To strengthen your hair, boil some coconut oil/gingelly oil with some jeera and pepper powder and apply it on your hair before a hairwash";
        a[1][2] = "# Insted of shampoo, we can use a mixture grinded Hibiscus leaves, Mehendi leaves, Curry leaves and some Cheeka powder";
        a[2][2] = "# To reduce dandruff, grind and onion, mix it with curd and apply the paste to you hair for 10 minutes and then wash it off";
        a[3][2] = "# To control headache, mix equal parts of ginger juice and lemon juice. You can consume this once or twice a day. You can also apply a paste of ginger powder and 2 tablespoons water on your forehead for a few minutes to provide quicker relief.";
        a[3][3] = "# You can place a cloth dipped in ice-cold or hot water over your head for 5 minutes. Repeat the process several times.";
        a[3][4] = "# Crush a few cloves gently and put them in a sachet or a clean handkerchief. Inhale the smell of the crushed cloves whenever you have a headache until you get some relief from the pain.";
        a[4][2] = "# Add some Crape Jasmine flowers to some water and wash your face with it 2 to 3 times a day";
        a[4][3] = "# To reduce eye pain apply some Castor oil above eyelids before sleeping";
        a[5][2] = "# To remove Blackheads/Whiteheads apply a mixture of Besan, Aata, Haldi and Rose water/Milk. After it dries, peel it off/ Use water to remove it";
        a[6][2] = "# To reduce ulcers and the pain, drink a mixture of Coconut milk with palm jaggery"; 
        a[7][2] = "# To reduce pimple, apply potato juice regularly on your face";
        a[7][3] = "# A coffee scrub can be helful for spots of after pimple effect";       
        a[8][2] = "# To take care of uneven skintones, you need to apply a little bit of turmeric powder and some orange juice.";
        a[9][2] = "# To reduce wrinkles, make a banana mask. Peel off a ripe banana and mash it with a spoon. Now mix all the ingredients well and apply to cleansed face. Keep it for 25-30 minutes and rinse it off after giving a gentle massage for 2-3 minutes to your skin. Repeat it for 3-4 times a week for good result.";
        a[10][2] = "# To cure Milia, Apply a paste of cinnamon and honey";         
        a[11][2] = "# To take care of damaged skin, mix 1 glass of skim milk and 4 cups of clean water. Then add a few ice cubes to this solution. Using a soft towel apply this on your skin and leave it for about 30 mins";
        a[11][3] = "# Aloevera is always a good remedy for any problems related to skin";
        a[12][2] = "# To reduce throat pain,drink salt water";
        a[12][3] = "# Boil haldi powder, pepper and palm jaggery in milk and drink it.";
        a[12][4] = "# Apply a paste of cented lime and gingelly oil on ur neck. This would get you some relief from the pain";
        a[13][2] = "# Boil Tusli leaf, Betel leaf, Ajwain leaf, Peper, Haldi, Jeera in one big glass of water. Boil this to half. Add honey to sweeten it and drink this mixture";
        a[14][2] = "# Mix 2 teaspoons of honey with warm water or an herbal tea. Drink this mixture once or twice a day." ;
        a[14][3] = "# Brew up a soothing ginger tea by adding 20–40 grams (g) of fresh ginger slices to a cup of hot water. Allow to steep for a few minutes before drinking. Add honey or lemon juice to improve the taste and further soothe a cough.";
        a[15][2] = "# Take Haldi, Jeera and Pudhina leaves, boil it in water and then strain the mixture and drink it . You can even add honey to make it sweet .";
        a[15][3] = "# Take ashoka leave , clove and cardamom . Make a powder and then mix it with honey and palm jaggery. Eat this and this will surely help u with the pain.";
        a[16][2] = "# Eating papaya or pineapple or sesame seeds will help u get ur periods";
        a[17][2] = "# Eat a few bengal grams in the morning";
        a[18][2] = "# Mix some white pumkin juice with honey and lemon juice. This will reduce the irritation.";
        
    }   
}    