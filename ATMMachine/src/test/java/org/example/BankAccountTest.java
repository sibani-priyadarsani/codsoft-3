package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class BankAccountTest {
    @InjectMocks @Spy BankAccount account = new BankAccount(1000.0);

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test_deposit() {
       double newBalance = account.deposit(1000);
        Assert.assertNotNull(newBalance);
        Assert.assertEquals(2000.0,newBalance,0);
    }

    @Test
    public void test_withdraw() {
        double newBalance = account.withdraw(400);
        Assert.assertNotNull(newBalance);
        Assert.assertEquals(600.0,newBalance,0);
    }

    @Test
    public void test_checkBalance() {
        double newBalance = account.getBalance();
        Assert.assertNotNull(newBalance);
        Assert.assertEquals(1000.0,newBalance,0);
    }

}