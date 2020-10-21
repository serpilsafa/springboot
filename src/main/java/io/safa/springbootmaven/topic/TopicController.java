package io.safa.springbootmaven.topic;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return Arrays.asList(
				new Topic("1","Kotlin", "Android programming"),
				new Topic("2","Swift", "IOS programming"),
				new Topic("3","Java","Android programmming")
				);
		
	}

}
