package com.gs.structural.adapter.classobjectadopter;

public class Main {

	public static void main(String[] args) {
		/** Using Class/Two-way adapter **/
		EmployeeClassAdapter classAdapter = new EmployeeClassAdapter();
		populateEmployeeData(classAdapter);
		BusinessCardDesigner cardDesigner =  new BusinessCardDesigner();
		String designCard = cardDesigner.designCard(classAdapter);
		System.out.println(designCard);

		System.out.println("====Object adaptor example======= ");
		/** Using Object Adapter **/
		Employee employee= new Employee();
		populateEmployeeData(employee);
		EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
		BusinessCardDesigner businessCardDesigner = new BusinessCardDesigner();
		String designCard1 = businessCardDesigner.designCard(objectAdapter);
		System.out.println(designCard1);
	}

	private static void populateEmployeeData(Employee employee) {
		employee.setFullName("Elliot Alderson");
		employee.setJobTitle("Security Engineer");
		employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
	}
}
