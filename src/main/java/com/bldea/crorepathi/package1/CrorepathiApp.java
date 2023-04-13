/**
 * 
 */
package com.bldea.crorepathi.package1;

/**
 * @author hp
 *
 */
import java.util.Scanner;
public class CrorepathiApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("welcome to crorepathi game");// TODO Auto-generated method stub
        System.out.println("Lets welcome our first candidate");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("what is your name?");
        String name = sc.next();
        System.out.println("what is your age?");
        int age = sc.nextInt();
        System.out.println("what is your city?");
        String city = sc.next();
        System.out.println("what is your state?");
        String state = sc.next();
        
        candidate c1 = new candidate(name,age,city,state);
        System.out.println("Congratulations for making it till here Mr/Ms."+c1.getName());
 System.out.println("The rules of the game:");
 System.out.println("1.There will be 10 questions which rewards a specific amountin"+"incremental order");
 System.out.println("2.The game will contain 3 life lines."+"(audience phone,50-50 and skip the question");
 System.out.println("3.You can quit the game at any stage.");
 System.out.println("Please type1 if you wish to see the reward per question."+"else type any key.");
        int type_1 = sc.nextInt();
        if(type_1==1) {
        	System.out.println("Question-1:1000 \n"+
                                "Question-2:2000\n"+ 
        			            "Question-3:3000\n"+
                                 "Question-4-:5000\n"+
                                 "Question-5-:10000\n"+
                                 "Question-6-:20000\n"+
                                 "Question-7-:30000\n"+
                                 "Question-8-:50000\n"+
                                 "Question-9-:80000\n"+
                                 "Question-10:100000\n");
        	System.out.println("Do you wish to continue??(type:YES/NO)");
        }
        else {
        	System.out.println("Do you wish to continue??(type:YES/NO)");
        }
        	String type_2 = sc.next();
        	if(type_2.equalsIgnoreCase("yes")==true) {
        		System.out.println("Lets Begin the Game");
        		System.out.println("Here is the first question.");
        		boolean res1 = Questions.fetchQuestions1(c1.getName());
        		if(res1==true) {
        		System.out.println("Cogratulations!! Your answer is correct.\n"+"You have won Rs."+c1.getAmount());
        			System.out.println("Here is your next Question.");
        			boolean res2 = Questions.fetchQuestions2(c1.getName());
            		if(res2==true) {
            		System.out.println("Cogratulations!! Your answer is correct.\n"+"You have won Rs."+c1.getAmount());
            			System.out.println("Here is your next Question.");
            			boolean res3 = Questions.fetchQuestions3(c1.getName());
                		if(res3==true) {
                		System.out.println("Cogratulations!! Your answer is correct.\n"+"You have won Rs."+c1.getAmount());
                			System.out.println("Here is your next Question.");
                			boolean res4 = Questions.fetchQuestions4(c1.getName());
                    		if(res4==true) {
                    		System.out.println("Cogratulations!! Your answer is correct.\n"+"You have won Rs."+c1.getAmount());
                     			System.out.println("Here is your next Question.");
                    			boolean res5 = Questions.fetchQuestions5(c1.getName());
                        		if(res5==true) {
                        		System.out.println("Cogratulations!! Your answer is correct.\n"+"You have won Rs."+c1.getAmount());
                        			System.out.println("Here is your next Question.");
                        			boolean res6 = Questions.fetchQuestions6(c1.getName());
                            		if(res6==true) {
                            		System.out.println("Cogratulations!! Your answer is correct.\n"+"You have won Rs."+c1.getAmount());
                            			System.out.println("Here is your next Question.");
                            			boolean res7 = Questions.fetchQuestions7(c1.getName());
                                		if(res7==true) {
                                		System.out.println("Cogratulations!! Your answer is correct.\n"+"You have won Rs."+c1.getAmount());
                                			System.out.println("Here is your next Question.");
                                			boolean res8 = Questions.fetchQuestions8(c1.getName());
                                			if(res8==true) {
                                    		System.out.println("Cogratulations!! Your answer is correct.\n"+"You have won Rs."+c1.getAmount());
                                    			System.out.println("Here is your next Question.");
                                    			boolean res9 = Questions.fetchQuestions9(c1.getName());
                                        		if(res9==true) {
                                        		System.out.println("Cogratulations!! Your answer is correct.\n"+"You have won Rs."+c1.getAmount());
                                        			System.out.println("Here is your next Question.");
                                        			boolean res10 = Questions.fetchQuestions10(c1.getName());
                                            		if(res10==true) {
                                            		System.out.println("Cogratulations!! Your answer is correct.\n"+"You have won Rs."+c1.getAmount());
                                           	
                                            		}                		
                                            		else {
                                            			System.out.println("We are sorry!! Your answer is incorrect.\n"+"You have won Rs.\"+c1.getAmount()");
                                            		}
                                        		}
                                                            		
                                                 else {
                                        			System.out.println("We are sorry!! Your answer is incorrect.\n"+"You have won Rs.\"+c1.getAmount()");
                                        		}
                                    		}
                                    		else {
                                    			System.out.println("We are sorry!! Your answer is incorrect.\n"+"You have won Rs.\"+c1.getAmount()");
                                    		}
                                		}
                                		else {
                                			System.out.println("We are sorry!! Your answer is incorrect.\n"+"You have won Rs.\"+c1.getAmount()");
                                		}
                            		}
                            		else {
                            			System.out.println("We are sorry!! Your answer is incorrect.\n"+"You have won Rs.\"+c1.getAmount()");
                            		}
                        		}
                        		else {
                        			System.out.println("We are sorry!! Your answer is incorrect.\n"+"You have won Rs.\"+c1.getAmount()");
                        		}
                    		}
                    		else {
                    			System.out.println("We are sorry!! Your answer is incorrect.\n"+"You have won Rs.\"+c1.getAmount()");
                    		}
                		}
                		else {
                			System.out.println("We are sorry!! Your answer is incorrect.\n"+"You have won Rs.\"+c1.getAmount()");
                		}
            		}
            		else {
            			System.out.println("We are sorry!! Your answer is incorrect.\n"+"You have won Rs.\"+c1.getAmount()");
            		}
        		
        	}
        	else {
    			System.out.println("We are sorry!! Your answer is incorrect.\n"+"You have won Rs.\"+c1.getAmount()");
    		}
			
        }
        
        		
	else {
		System.out.println("Thankyou for coming. All the best!!");
	}
}
}
        	
        		
	