package tieto.bank.admin

class User {

	String name

	static constraints = {
		name(size:1..1000)
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
}
