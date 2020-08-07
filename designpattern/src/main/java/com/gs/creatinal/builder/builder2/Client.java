package com.gs.creatinal.builder.builder2;

import com.gs.creatinal.builder.builder1.Address;
import com.gs.creatinal.builder.builder1.User;

import java.time.LocalDate;


//This is our client which also works as "director"
public class Client {

	public static void main(String[] args) {

		User user = createUser();
		// Client has to provide director with concrete builder
		UserDTO dto = directBuild(UserDTO.getUserDTOBuilder(), user);
		System.out.println(dto);
	//	System.out.println(dto1==dto2);
		
	}

	/**
	 * This method serves the role of director in builder pattern.
	 */
	private static UserDTO directBuild(UserDTO.UserDTOBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
				.withBirthday(user.getBirthday()).withAddress(user.getAddress()).build();
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
