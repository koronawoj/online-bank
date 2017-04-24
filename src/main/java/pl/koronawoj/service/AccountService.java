package pl.koronawoj.service;

import java.security.Principal;

import pl.koronawoj.domain.PrimaryAccount;
import pl.koronawoj.domain.SavingsAccount;

public interface AccountService {
	PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);
    
    
}
