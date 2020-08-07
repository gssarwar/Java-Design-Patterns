package com.gs.creatinal.builder.builder1;

import java.time.LocalDate;

//This is our client which also works as "director"
public class Client {

	public static void main(String[] args) {

		User createUser = createUser();
		UserDTOBuilder builder = new UserWebDTOBuilder();
		UserDTO dto1 = directorBuild(builder, createUser);
		UserDTO dto2 = directorBuild(builder, createUser);
		System.out.println(dto1);
	//	System.out.println(dto1==dto2);
		
	}

	//Director
	private static UserDTO directorBuild(UserDTOBuilder userDTOBuilder ,User user){
		return userDTOBuilder.withFirstName(user.getFirstName())
				.withLastName(user.getLastName())
				.withBirthday(user.getBirthday())
				.withAddress(user.getAddress())
				.build();
	}
	
	/**
	 * Returns a sample user. 
	 */
	public static User createUser() {
		User user = new User();
		user.setBirthday(LocalDate.of(1960, 5, 6));
		user.setFirstName("Gulam");
		user.setLastName("Sarwar");
		Address address = new Address();
		address.setHouseNumber("100");
		address.setStreet("State Street");
		address.setCity("Pawnee");
		address.setState("Indiana");
		address.setZipcode("47998");
		user.setAddress(address);
		return user;
	}
}
