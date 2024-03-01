package abstraction.com.kod;

 class ChemistryStudent implements StudentActivity {
	public void attendingClass() {
		System.out.println("Chemistry student is attending Chemistry class");
	}
	public void study() {
		System.out.println("Chemistry student study Chemistry");
	}
	public void assignement() {
		System.out.println("Chemistry student doing assignement");
	}
	@Override
	public void attendClass() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void assignment() {
		// TODO Auto-generated method stub
		
	}

}
