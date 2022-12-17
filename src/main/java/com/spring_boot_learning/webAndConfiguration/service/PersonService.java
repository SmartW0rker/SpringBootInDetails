package com.spring_boot_learning.webAndConfiguration.service;

import com.spring_boot_learning.webAndConfiguration.model.Person;
import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@ConfigurationProperties(prefix = "person-configuration")
public class PersonService {

   private String url;
   private String profile;


    public List<Person> getPeople(){
       return List.of(
           new Person("Hristijan","Berovo",23),
           new Person("Nikola","Skopje",20),
           new Person("Bojana","Bitola",21)
       );
   }

    public String getUrl() {
        return url;
    }

    public String getProfile() {
        return profile;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public List<String> getAppData(){
       return List.of(url,profile);
   }


}
