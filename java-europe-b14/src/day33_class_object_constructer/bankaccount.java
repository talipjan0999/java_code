package day33_class_object_constructer;

public class bankaccount {
double balance;
public bankaccount() {
	balance=0.0;
}
public bankaccount(double startbalance) {
	balance=startbalance;
	
}
//this constructor sets the strating balance to the value in the string agrument
public bankaccount(String str) {
	balance=Double.parseDouble(str);
}
//deposite method makes a deposite into account
public void deposite(String str) {
	balance=balance+Double.parseDouble(str);
}
public double getbalance() {
	return balance;
}
}
