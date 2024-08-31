package mattmck.mywebapp.web;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import lombok.extern.slf4j.Slf4j;
import mattmck.mywebapp.service.Adjectives;
import mattmck.mywebapp.service.Animals;

@Slf4j
@Component
@RequestScope
public class HomeController {
	
	@Autowired
	private HomeBean homeBean;

	public void searchSingleAction() {
		log.debug("testAction: {}", homeBean.getSearchCriteria());
	
		if (homeBean.getSearchCriteria() != null) { 
			List<String> alphabet = Collections.nCopies(20, homeBean.getSearchCriteria()); 
			
			homeBean.setSearchResults(alphabet.stream()
					.map(a -> String.format("%s %s", 
							new Adjectives().getRandom(a),
							new Animals().getRandom(a)))
					.collect(Collectors.toList()));
		}
	}
	
	
	public void searchAction() {
		log.debug("testAction: {}", homeBean.getSearchCriteria());
	
		if (homeBean.getSearchCriteria() != null) { 
			List<String> alphabet = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");
			
			homeBean.setSearchResults(alphabet.stream()
					.map(a -> String.format("%s %s", 
							new Adjectives().getRandom(a),
							new Animals().getRandom(a)))
					.collect(Collectors.toList()));
		}
	}
}
