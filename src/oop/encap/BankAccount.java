package oop.encap;

public class BankAccount {
//    은행 계좌를 관리하는 BankAccount 클래스를 만드세요.
//    계좌 잔액(balance), 계좌 번호(accountNumber), 계좌 주인의 이름(accountHolder) 필드를 private로 선언하세요.
//    잔액 조회, 입금, 출금 메소드를 public으로 만들어 외부에서 접근할 수 있게 하세요.
//    출금 메소드는 잔액이 출금하려는 금액보다 클 때만 돈을 출금할 수 있도록 하세요.
    private int balance;
    private String accountNumber;
    private String accountHolder;

    BankAccount(String accountNumber, String accountHolder, int balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        if(this.balance < amount){
            System.out.println("잔액이 모자릅니다.");
            return;
        }
        this.balance -= amount;
    }
}
