package ifrn.pi.hotel.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/").permitAll()
				.antMatchers("/cadastro_cliente").hasRole("FUNCIONARIO")
				.antMatchers("/cadastro_funcionario").hasRole("ADMINISTRATIVO")
				.antMatchers("/cadastro_quarto").hasRole("ADMINISTRATIVO")
				.anyRequest().authenticated()
					.and()
						.formLogin().permitAll();
	}
	
	
	
}
