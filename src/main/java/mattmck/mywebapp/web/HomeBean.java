package mattmck.mywebapp.web;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import lombok.Data;

@Data
@Component
@SessionScope
public class HomeBean {
	
	private String searchCriteria = "A";
	
}
