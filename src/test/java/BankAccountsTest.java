import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class BankAccountsTest {

    private Checking check;
    private Checking check1;
    private Checking check2;
    private Checking check3;
    private Checking check4;
    private Checking check5;
    private Checking check6;
    private Checking check7;
    private Savings save;
    private BankAccounts BA;
    private BankAccounts BA1;
    ArrayList <BankAccounts> account = new ArrayList();

    @Before
    public void setUp(){
        //Arrange
        check=new Checking(null, null, null, 0, 500, null, 1);
        account.add(check);
        check1=new Checking(null,null,null,0,4500,null,1);
        account.add(check1);
        check2=new Checking(null,null,null,0,0,null,1);
        account.add(check2);
        check3=new Checking("Ali","Ahmad","BahriaTown",561,510,"123456789",1);
        account.add(check3);
        check4= new Checking(null,null,null,56,4500,null,1);
        account.add(check4);
        check5= new Checking(null,null,null,60,5000,null,1);
        account.add(check5);
        check6=new Checking("Ali","Ahmad","BahriaTown",561,510,"123456789",1);
        account.add(check6);
        check7= new Checking("Momin","Tariq","Soan",69,6000,"1252342552",1);
        account.add(check7);
        //save
    }





    @Test
    public void testDepositPositive() {
        int accno=check1.generateRandNo();
        int c=check1.makeDeposit(500);
        int expect=4990;
        Assert.assertEquals(expect,c);

    }





    @Test public void testDepositNegative() {
        check2.DisplayDetails();
        int c1=check2.makeDeposit(50000);

        int expect1=49990;
        Assert.assertEquals(expect1,c1); }




    @Test public void testWithdrawlPositive() {
        int accno=check.generateRandNo();
        int c=check.makeWithdrawl(400);
        int expect=90;
        Assert.assertEquals(expect, c); }



    @Test public void testWithdrawlNegative() {
        check7.DisplayDetails();
        int w1=check7.makeWithdrawl(1000);

        int expect1=4990;
        Assert.assertEquals(expect1, w1); }


    @Test public void testDisplayBalance() {
        check3.DisplayBalance();

    }

/*
    @Test public void testTransferAmount() {

        check4.DisplayDetails(); check5.DisplayDetails(); check4.TransferAmount();
        check4.DisplayBalance(); // check4.AllDeductions();
        //System.out.println("Rem balance: "+c1);


    }
*/
    @After
    public void tearDown()
    {
        System.out.println("Free Memory!");
    }


}