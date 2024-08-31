package mattmck.mywebapp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequestScope
public class HomeController {
	
	@Autowired
	private HomeBean homeBean;

	public void searchAction() {

		if (homeBean != null) {
			homeBean.setSearchCriteria("X");
		}
		
		log.debug("testAction");
		
	}
}
