public interface Handler {

	void handleRequest(int num);
	void setSuccessor(Handler next);
	void addCustomer(Customer c);

}
