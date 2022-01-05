package ifrn.pi.hotel.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import ifrn.pi.hotel.security.service.CustomUserDetailService;

@Configuration
public class SecurityConfig {
	
	@Autowired
	private CustomUserDetailService detailservice;
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception {
		builder.userDetailsService(detailservice).passwordEncoder(new BCryptPasswordEncoder());
	}
	
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
}
