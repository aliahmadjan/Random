import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SavingsTest {


    private Savings save;
    private Savings save1;
    private Savings save2;
    private Savings save3;
    private Savings save4;
    private Savings save5;
    private Savings save6;
    private Savings save7;

    ArrayList <BankAccounts> account = new ArrayList();

    @Before
    public void setUp() throws Exception {
        save=new Savings(null, null, null, 0, 500, null, 2);
        account.add(save);
        save1=new Savings(null,null,null,0,4500,null,2);
        account.add(save1);
        save2=new Savings(null,null,null,0,0,null,2);
        account.add(save2);
        save3=new Savings("Ali","Ahmad","BahriaTown",561,7000,"123456789",2);
        account.add(save3);
        save4= new Savings(null,null,null,118,4500,null,2);
        account.add(save4);
        save5= new Savings(null,null,null,531,5000,null,2);
        account.add(save5);
        save6=new Savings("Ali","Ahmad","BahriaTown",591,510,"123456789",2);
        account.add(save6);
        save7= new Savings("Momin","Tariq","Soan",38,25000,"1252342552",2);
        account.add(save7);
    }
    @Test public void testDepositPositive() {
        int accno=save1.generateRandNo();
        int c=save1.makeDeposit(500);
        int expect=5000;
        Assert.assertEquals(expect,c);

    }

    @Test public void testDepositNegative()
    {
        save6.DisplayDetails();
        int c1=save6.makeDeposit(50000);

        int expect1=50510;
        Assert.assertEquals(expect1,c1);
    }
    @Test
    public void testWithdrawlPositive()
    {
        int accno=save.generateRandNo();
        int c=save.makeWithdrawl(400);
        int expect=100;
        Assert.assertEquals(expect, c); }

    @Test
    public void testWithrawlNegative()
    {
        save7.DisplayDetails();
        int w1=save7.makeWithdrawl(26000);

        int expect1=-1000;
        Assert.assertEquals(expect1, w1); }



    @Test
    public void testDisplayBalance()
    {
        save3.DisplayBalance();

    }

    @Test
    public void testZakatPositive()
    {
        save7.DisplayDetails();
        int z=save7.calculateZakat(25000);
        int expect=18750;
        Assert.assertEquals(expect, z);
    }
    @Test
    public void testZakatNegative()
    {
        save3.DisplayDetails();
        int z=save3.calculateZakat(4500);
        int expect=7000;
        Assert.assertEquals(expect, z);
    }

    @Test
    public void testInterestRatePositive() {
        save3.DisplayDetails();
        int i=save3.calculateInterest(60);
        int expect=7165;
        Assert.assertEquals(expect, i);
    }

    @Test
    public void testInterestRateNegative() {
        save1.DisplayDetails();
        int i=save1.calculateInterest(80);
        int expect=4500;
        Assert.assertEquals(expect, i);
    }
    @After
    public void tearDown() throws Exception {
        System.out.println("Free Memory!");
    }



}