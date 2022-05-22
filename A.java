public class A {
	Order order;
	A(Order order){
		this.order = order
	}
	public void printHi(){
		System.out.println("hi");
	}

}

// Controller Accept HTTP request 
	// OrderController.addOrder() -> OrderService.addOrder() -> OrderDao.addOrder()
// DAO/Repository Connect with Database and perform CRUD
	// Create Read Update Delete
	// orderRepository.addOrder()

