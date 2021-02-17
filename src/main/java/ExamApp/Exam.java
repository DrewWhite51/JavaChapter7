/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author drewm
 */
public class Exam {
    public static int totalRightAnswers = 0;
    public static int totalWrongAnswers = 0;
    
    static String [] correctAnswers =
    {"B","D","A","A",
    "C","A","B","A",
    "C","D","B","C",
    "D","A","D","C",
    "C","B","D","A",};
    
    static String [] studentAnswers = 
    {"","","","",
    "","","","",
    "","","","",
    "","","","",
    "","","","",};
    
    static List<String> missedQs = new ArrayList<String>();
    
    public static void main(String[] args) {
        System.out.println("To pass you must get at least 80%");
        System.out.println("-----------");
        questionOne();
        System.out.println("-----------");
        questionTwo();
        System.out.println("-----------");
        questionThree();
        System.out.println("-----------");
        questionFour();
        System.out.println("-----------");
        questionFive();
        System.out.println("-----------");
        questionSix();
        System.out.println("-----------");
        questionSeven();
        System.out.println("-----------");
        questionEight();
        System.out.println("-----------");
        questionNine();
        System.out.println("-----------");
        questionTen();
        System.out.println("-----------");
        questionEleven();
        System.out.println("-----------");
        questionTwelve();
        System.out.println("-----------");
        questionThirteen();
        System.out.println("-----------");
        questionFourteen();
        System.out.println("-----------");
        questionFifteen();
        System.out.println("-----------");
        questionSixteen();
        System.out.println("-----------");
        questionSeventeen();
        System.out.println("-----------");
        questionEighteen();
        System.out.println("-----------");
        questionNinteen();
        System.out.println("-----------");
        questionTwenty();
        System.out.println("-----------");

        System.out.println("-----------");
        passed();
        System.out.println("-----------");
        totalCorrect(totalRightAnswers);
        System.out.println("-----------");
        totalIncorrect(totalWrongAnswers);
        System.out.println("-----------");
        questionsMissed();
        System.out.println("-----------");
    }
    
    public static void passed() {
        if (totalRightAnswers >= 15) {
            System.out.println("You passed with a " + totalRightAnswers +
                    "/20");
        } else 
            System.out.println("You failed");
    }
    
    public static void totalCorrect(int totalRightAnswers) {
        System.out.println("You got " + totalRightAnswers + " right.");
    }
    
    public static void totalIncorrect(int totalWrongAnswers) {
        System.out.println("You got "
                + totalWrongAnswers + " wrong.");
    }
    
    public static void questionsMissed() {
        for (int i = 0; i < missedQs.size(); i++) {
            System.out.println(missedQs.get(i));
        }
    }
    
    public static void questionOne() {
        Scanner keyboard = new Scanner(System.in);
        String userAnswer;
        String correctAnswer = correctAnswers[0].strip().toLowerCase();
        System.out.println("1) What is the capital of Kansas");
        System.out.println("A) Pittsburg");
        System.out.println("B) Topeka");
        System.out.println("C) Wichita");
        System.out.println("D) Coffeeville");
        System.out.println("What is your choice?");
        userAnswer = keyboard.nextLine().strip().toLowerCase();
        studentAnswers[0] = userAnswer;
        if (userAnswer.equals(correctAnswer)) {
            totalRightAnswers ++;
            
        } else 
            missedQs.add("Question one");
            totalWrongAnswers ++;
            
    }
    
        public static void questionTwo() {
        Scanner keyboard = new Scanner(System.in);
        String correctAnswer = correctAnswers[1].strip().toLowerCase();
        String userAnswer;
        System.out.println("2) What is the most hunted big game in Kansas?");
        System.out.println("A) Rabbit");
        System.out.println("B) Bear");
        System.out.println("C) Elk");
        System.out.println("D) Whitetail Deer");
        System.out.println("What is your choice?");
        userAnswer = keyboard.nextLine().strip().toLowerCase();
        studentAnswers[1] = userAnswer;
        if (userAnswer.equals(correctAnswer)) {
            totalRightAnswers ++;
            
        } else 
            missedQs.add("Question two");
            totalWrongAnswers ++;
            
    }
        
    public static void questionThree() {
        Scanner keyboard = new Scanner(System.in);
        String correctAnswer = correctAnswers[2].strip().toLowerCase();
        String userAnswer;
        System.out.println("3) Who created bitcoin?");
        System.out.println("A) Satoshi Nakamoto");
        System.out.println("B) Drew White");
        System.out.println("C) Albert Einstein");
        System.out.println("D) Vitalik Buterin");
        System.out.println("What is your choice?");
        userAnswer = keyboard.nextLine().strip().toLowerCase();
        studentAnswers[2] = userAnswer;
        if (userAnswer.equals(correctAnswer)) {
            totalRightAnswers ++;
            
        } else 
            missedQs.add("Question Three");
            totalWrongAnswers ++;
            
    }
    public static void questionFour() {
        Scanner keyboard = new Scanner(System.in);
        String correctAnswer = correctAnswers[3].strip().toLowerCase();
        String userAnswer;
        System.out.println("4) Who created Ethereum?");
        System.out.println("A) Vitalik Buterin");
        System.out.println("B) Satoshi Nakomoto");
        System.out.println("C) Neil Degrasse Tyson");
        System.out.println("D) Donald Trump");
        System.out.println("What is your choice?");
        userAnswer = keyboard.nextLine().strip().toLowerCase();
        studentAnswers[3] = userAnswer;
        if (userAnswer.equals(correctAnswer)) {
            totalRightAnswers ++;
            
        } else 
            missedQs.add("Question four");
            totalWrongAnswers ++;
            
    }
    public static void questionFive() {
        Scanner keyboard = new Scanner(System.in);
        String correctAnswer = correctAnswers[4].strip().toLowerCase();
        String userAnswer;
        System.out.println("5) What is the secon largest cryptocurrency by market cap?");
        System.out.println("A) Bitcoin");
        System.out.println("B) Cardano");
        System.out.println("C) Ethereum");
        System.out.println("D) Loopring");
        System.out.println("What is your choice?");
        userAnswer = keyboard.nextLine().strip().toLowerCase();
        studentAnswers[4] = userAnswer;
        if (userAnswer.equals(correctAnswer)) {
            totalRightAnswers ++;
            
        } else 
            missedQs.add("Question five");
            totalWrongAnswers ++;
            
    }
    
    public static void questionSix() {
        Scanner keyboard = new Scanner(System.in);
        String correctAnswer = correctAnswers[5].strip().toLowerCase();
        String userAnswer;
        System.out.println("6) What is an upward trend referred to in market terms?");
        System.out.println("A) Bull run");
        System.out.println("B) Bear run");
        System.out.println("C) Frog run");
        System.out.println("D) Turtle run");
        System.out.println("What is your choice?");
        userAnswer = keyboard.nextLine().strip().toLowerCase();
        studentAnswers[5] = userAnswer;
        if (userAnswer.equals(correctAnswer)) {
            totalRightAnswers ++;
            
        } else 
            missedQs.add("Question six");
            totalWrongAnswers ++;
            
    }
    
    public static void questionSeven() {
        Scanner keyboard = new Scanner(System.in);
        String correctAnswer = correctAnswers[6].strip().toLowerCase();
        String userAnswer;
        System.out.println("7) What is a downward trend referred to in market terms?");
        System.out.println("A) Bull run");
        System.out.println("B) Bear run");
        System.out.println("C) Frog run");
        System.out.println("D) Turtle run");
        System.out.println("What is your choice?");
        userAnswer = keyboard.nextLine().strip().toLowerCase();
        studentAnswers[6] = userAnswer;
        if (userAnswer.equals(correctAnswer)) {
            totalRightAnswers ++;
            
        } else 
            missedQs.add("Question seven");
            totalWrongAnswers ++;
            
    }
    public static void questionEight() {
        Scanner keyboard = new Scanner(System.in);
        String correctAnswer = correctAnswers[7].strip().toLowerCase();
        String userAnswer;
        System.out.println("8) What was the subreddit that caused the gamestop short squeeze?");
        System.out.println("A) wallstreetbets");
        System.out.println("B) fuckwallstreet");
        System.out.println("C) wallstreettrolls");
        System.out.println("D) redditinvestors");
        System.out.println("What is your choice?");
        userAnswer = keyboard.nextLine().strip().toLowerCase();
        studentAnswers[7] = userAnswer;
        if (userAnswer.equals(correctAnswer)) {
            totalRightAnswers ++;
            
        } else 
            missedQs.add("Question eight");
            totalWrongAnswers ++;
            
    }
    
     public static void questionNine() {
        Scanner keyboard = new Scanner(System.in);
        String correctAnswer = correctAnswers[8].strip().toLowerCase();
        String userAnswer;
        System.out.println("9) Which cryptocurrency allows decentralized applications to be built on top of it?");
        System.out.println("A) Cardano");
        System.out.println("B) Bitcoin");
        System.out.println("C) Ethereum");
        System.out.println("D) Polkadot");
        System.out.println("What is your choice?");
        userAnswer = keyboard.nextLine().strip().toLowerCase();
        studentAnswers[8] = userAnswer;
        if (userAnswer.equals(correctAnswer)) {
            totalRightAnswers ++;
            
        } else 
            missedQs.add("Question nine");
            totalWrongAnswers ++;
            
    }
     
     public static void questionTen() {
        Scanner keyboard = new Scanner(System.in);
        String correctAnswer = correctAnswers[9].strip().toLowerCase();
        String userAnswer;
        System.out.println("10) Which cryptocurrency is a decentralized exchange?");
        System.out.println("A) Ethereum");
        System.out.println("B) Cardano");
        System.out.println("C) Bitcoin");
        System.out.println("D) Uniswap");
        System.out.println("What is your choice?");
        userAnswer = keyboard.nextLine().strip().toLowerCase();
        studentAnswers[9] = userAnswer;
        if (userAnswer.equals(correctAnswer)) {
            totalRightAnswers ++;
            
        } else 
            missedQs.add("Question ten");
            totalWrongAnswers ++;
            
    }
     
     public static void questionEleven() {
        Scanner keyboard = new Scanner(System.in);
        String correctAnswer = correctAnswers[10].strip().toLowerCase();
        String userAnswer;
        System.out.println("11) Which crypto is often referred to as digital gold?");
        System.out.println("A) Loopring");
        System.out.println("B) Bitcoin");
        System.out.println("C) Ethereum");
        System.out.println("D) Uniswap");
        System.out.println("What is your choice?");
        userAnswer = keyboard.nextLine().strip().toLowerCase();
        studentAnswers[10] = userAnswer;
        if (userAnswer.equals(correctAnswer)) {
            totalRightAnswers ++;
            
        } else 
            missedQs.add("Question eleven");
            totalWrongAnswers ++;
            
    }
     
    public static void questionTwelve() {
        Scanner keyboard = new Scanner(System.in);
        String correctAnswer = correctAnswers[11].strip().toLowerCase();
        String userAnswer;
        System.out.println("12) Which cyrpto is often referred to as digital silver?");
        System.out.println("A) Uniswap");
        System.out.println("B) Loopring");
        System.out.println("C) Ethreum");
        System.out.println("D) Chainlink");
        System.out.println("What is your choice?");
        userAnswer = keyboard.nextLine().strip().toLowerCase();
        studentAnswers[11] = userAnswer;
        if (userAnswer.equals(correctAnswer)) {
            totalRightAnswers ++;
            
        } else 
            missedQs.add("Question twelve");
            totalWrongAnswers ++;
            
    }
    public static void questionThirteen() {
        Scanner keyboard = new Scanner(System.in);
        String correctAnswer = correctAnswers[12].strip().toLowerCase();
        String userAnswer;
        System.out.println("13) Which lift activates the shoulders more?");
        System.out.println("A) Squat");
        System.out.println("B) Incline bench press");
        System.out.println("C) Bench press");
        System.out.println("D) Military press");
        System.out.println("What is your choice?");
        userAnswer = keyboard.nextLine().strip().toLowerCase();
        studentAnswers[12] = userAnswer;
        if (userAnswer.equals(correctAnswer)) {
            totalRightAnswers ++;
            
        } else 
            missedQs.add("Question thirteen");
            totalWrongAnswers ++;
            
    }
    public static void questionFourteen() {
        Scanner keyboard = new Scanner(System.in);
        String correctAnswer = correctAnswers[13].strip().toLowerCase();
        String userAnswer;
        System.out.println("14) Which lift activates the hamstrings more?");
        System.out.println("A) Good mornings");
        System.out.println("B) Squat");
        System.out.println("C) Deadlift");
        System.out.println("D) Situps");
        System.out.println("What is your choice?");
        userAnswer = keyboard.nextLine().strip().toLowerCase();
        studentAnswers[13] = userAnswer;
        if (userAnswer.equals(correctAnswer)) {
            totalRightAnswers ++;
            
        } else
            missedQs.add("Question fourteen");
            totalWrongAnswers ++;
            
    }
    public static void questionFifteen() {
        Scanner keyboard = new Scanner(System.in);
        String correctAnswer = correctAnswers[14].strip().toLowerCase();
        String userAnswer;
        System.out.println("15) Which activity works on your cardio more?");
        System.out.println("A) Walking");
        System.out.println("B) HIIT");
        System.out.println("C) Weight lifting");
        System.out.println("D) Running");
        System.out.println("What is your choice?");
        userAnswer = keyboard.nextLine().strip().toLowerCase();
        studentAnswers[14] = userAnswer;
        if (userAnswer.equals(correctAnswer)) {
            totalRightAnswers ++;
            
        } else 
            missedQs.add("Question fifteen");
            totalWrongAnswers ++;
            
    }
    public static void questionSixteen() {
        Scanner keyboard = new Scanner(System.in);
        String correctAnswer = correctAnswers[15].strip().toLowerCase();
        String userAnswer;
        System.out.println("16) Which lift activates the most muscles?");
        System.out.println("A) Curls");
        System.out.println("B) Bench");
        System.out.println("C) Squat");
        System.out.println("D) Sit ups");
        System.out.println("What is your choice?");
        userAnswer = keyboard.nextLine().strip().toLowerCase();
        studentAnswers[15] = userAnswer;
        if (userAnswer.equals(correctAnswer)) {
            totalRightAnswers ++;
            
        } else 
            missedQs.add("Question sixteen");
            totalWrongAnswers ++;
            
    }
    public static void questionSeventeen() {
        Scanner keyboard = new Scanner(System.in);
        String correctAnswer = correctAnswers[16].strip().toLowerCase();
        String userAnswer;
        System.out.println("17) What is the most popular predator that is hunted in Kansas?");
        System.out.println("A) Bear");
        System.out.println("B) Cougar");
        System.out.println("C) Coyote");
        System.out.println("D) Mountain lion");
        System.out.println("What is your choice?");
        userAnswer = keyboard.nextLine().strip().toLowerCase();
        studentAnswers[16] = userAnswer;
        if (userAnswer.equals(correctAnswer)) {
            totalRightAnswers ++;
            
        } else 
            missedQs.add("Question seventeen");
            totalWrongAnswers ++;
            
    }
    
    public static void questionEighteen() {
        Scanner keyboard = new Scanner(System.in);
        String correctAnswer = correctAnswers[17].strip().toLowerCase();
        String userAnswer;
        System.out.println("18) How did Pittsburg get its name?");
        System.out.println("A) It smells like armpit");
        System.out.println("B) The many mining pitts around the area");
        System.out.println("C) It looks like the middle of a peach");
        System.out.println("D) It is referred to as the armput of Kansas");
        System.out.println("What is your choice?");
        userAnswer = keyboard.nextLine().strip().toLowerCase();
        studentAnswers[17] = userAnswer;
        if (userAnswer.equals(correctAnswer)) {
            totalRightAnswers ++;
            
        } else 
            missedQs.add("Question eighteen");
            totalWrongAnswers ++;
            
    }
    
    public static void questionNinteen() {
        Scanner keyboard = new Scanner(System.in);
        String correctAnswer = correctAnswers[18].strip().toLowerCase();
        String userAnswer;
        System.out.println("19) Where was the world record buck shot?");
        System.out.println("A) Wisconsin");
        System.out.println("B) Michigan");
        System.out.println("C) Missouri");
        System.out.println("D) Kansas");
        System.out.println("What is your choice?");
        userAnswer = keyboard.nextLine().strip().toLowerCase();
        studentAnswers[18] = userAnswer;
        if (userAnswer.equals(correctAnswer)) {
            totalRightAnswers ++;
            
        } else 
            missedQs.add("Question nineteen");
            totalWrongAnswers ++;
            
    }
    public static void questionTwenty() {
        Scanner keyboard = new Scanner(System.in);
        String correctAnswer = correctAnswers[19].strip().toLowerCase();
        String userAnswer;
        System.out.println("20) Which type shotgun shell would shoot the largest pellets?");
        System.out.println("A) #00 buckshot");
        System.out.println("B) #8 birdshot");
        System.out.println("C) #4 buckshot");
        System.out.println("D) #2 birdshot");
        System.out.println("What is your choice?");
        userAnswer = keyboard.nextLine().strip().toLowerCase();
        studentAnswers[19] = userAnswer;
        if (userAnswer.equals(correctAnswer)) {
            totalRightAnswers ++;
            
        } else 
            missedQs.add("Question twenty");
            totalWrongAnswers ++;
            
    }
}


