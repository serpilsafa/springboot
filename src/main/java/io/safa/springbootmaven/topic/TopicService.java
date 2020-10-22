package io.safa.springbootmaven.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(
			new Topic("1","Kotlin", "Android programming"),
			new Topic("2","Swift", "IOS programming"),
			new Topic("3","Java","Android programmming")
			); 
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

}
