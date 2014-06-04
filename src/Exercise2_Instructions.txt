/* @author [Carmina Villaflores]
 * 
 * In this file we're going to make a bank application. The user will interact
 * with the bank in the output console below. You will scan for the user's input
 * and the program will continue in certain ways depending on what the user
 * asks for. This project doesn't have a JUNIT test. You will have to inspect
 * if it works correctly by running and using it. 
 * 
 * THE RULES FOR BANK OF CARMERICA (Read carefully):
 * 
 * At first, the user will be have these choices:
 * 1) Withdraw money
 * 2) Deposit
 * 3) Inquire about balance
 * 4) exit
 * 5) Rob the bank
 * 
 * 
 * CHOICE 1: Withdraw
 * Once user enters "1" for choice 1, user will be directed to enter an amount
 * to withdraw. You must subtract this amount from their account. If the user
 * tries to deposit more than there is in his/her account, just make their
 * account 0. 
 * 
 * CHOICE 2: DEPOSIT
 * Once user enters "2" for choice 2, user will be directed to enter an amount
 * to deposit. You  must add this amount to their account. BUT, 
 * the bank of CARMERICA only allows amounts of up to 5000 to be deposited 
 * at a time. If the amount is greater than 5000, you have to add it to the
 * user's account in smaller batches less than or equal to 5000 until the total 
 * amount is added. This rule is set in place because anyone depositing more
 * that 5000 at once is probably a drug dealer. 
 * 
 * CHOICE 3: INQUIRE ABOUT BALANCE
 * Once user enters "3" for choice 3, just print out the user's balance. 
 * 
 * CHOICE 4: EXIT
 * Once user enters "4" for choice 4, tell the user to "Have a nice day" and then
 * end the program. 
 * 
 * CHOICE 5: ROB THE BANK
 * This will be a secret choice. The user will not be asked if they want to 
 * rob the bank obviously. In order to rob the bank, the user must type any
 * other number other than 1,2, 3, or 4.
 * 
 * Now here comes the interesting part that determines
 * whether the user will succeed in robbing the bank and go home with the money, 
 * or if the user fails and goes to jail. 
 * 
 * ~~Robbing bank of CARMERICA 101~~
 * 1)After the user declares they want to be a scumbag robber, they will have to
 *   input an amount they are planning to steal. Before any robbing goes on, they
 *   must decide this amount. 
 * 2)Rule: The first $10,000 robbed will take 1 minute, next $10,000 will take
 *   3 minutes, next $10,000 will take 5 minutes...etc. Do you catch the pattern?
 *   Minutes increase by 2. 
 *   
 *    Ex: $12,000 will take 4 minutes total. 
 *        $20,000 will also take 4 minutes total. 
 *        $46,000 will take 25 minutes total. 
 *        $800 will take 1 minute total. 
 *        
 *   If the robber takes too long and the cops come before they finish, then
 *   they go to jail. The robber will never know when the police are coming. 
 *   The police will come at some random time between 1 minute and 60 minutes
 *   depending on how busy the police are that day. (The bank of CARMERICA
 *   is located in a really crappy place where crime rates are super high). 
 *   
 *        
 *        
 *FLOW OF PROGRAM:
 * You will need to use a do-while loop. After the user inputs choice 1, 2, 3,
 * your program will present the 3 choices to the user again. This will happen
 * either until the user types "4" for exit OR the user chooses the rob the bank. 
 * If the user robs the  bank, the program will end either after the user succeeds
 * or fails to rob the bank. 
 * 
 *       
 *       
 * NEW FEATURES:
 * In this project it is necessary to use the Scanner class to get the user's
 * input and the Math.random() function to generate random numbers. The random
 * number generator is necessary to compute how long the cops will take to get
 * to the bank in case of robbery. It is random, so the user will not know
 * how long they will take. 
 * 
 * Here's a useful resource explaining how to use Math.random()
 * http://stackoverflow.com/questions/7961788/math-random-explained
 * 
 */