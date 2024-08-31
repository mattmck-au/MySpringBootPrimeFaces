package mattmck.mywebapp.web;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@Component
@SessionScope
public class HomeBean {
	
	private String searchCriteria;
	private List<String> searchResults;
	
}
