package inherit19;

class A {
	String name;
	A(String name){
		this.name=name;
		
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name==((A)obj).name) {
			return true;
		}else
			return false;
	}
	@Override
	public String toString() {
		return name;
	}

}
