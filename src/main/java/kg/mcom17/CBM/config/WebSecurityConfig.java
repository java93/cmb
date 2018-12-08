package kg.mcom17.CBM.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {



    @Bean
    @Override
    public UserDetailsService userDetailsService(){
        UserDetails user =
                User
                        .withDefaultPasswordEncoder()
                        .username("spring")
                        .password("spring")
                        .roles("USER")
                        .build();
        return new InMemoryUserDetailsManager(user);
    }

}
