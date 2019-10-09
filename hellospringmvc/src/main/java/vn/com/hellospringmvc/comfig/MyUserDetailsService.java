package vn.com.hellospringmvc.comfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import vn.com.hellospringmvc.dao.UserDAO;
import vn.com.hellospringmvc.model.User;
@Service("userDetailsService")
public class MyUserDetailsService implements UserDetailsService{
	@Autowired
	private UserDAO userDAO;
	
	public UserDetails loadUserByUsername(String username) {
		User user = userDAO.getUserByUsername(username);
		
		UserBuilder builder = null;
		if(user!=null) {
			builder =org.springframework.security.core.userdetails.User.withUsername(username);
			builder.disabled(false);
			builder.password(user.getPassword());
			builder.authorities("ROLE_" +user.getRoles());
		}else {
			throw new UsernameNotFoundException("User not found");
		}
		return builder.build();
		
	}

}
