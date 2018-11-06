package com.singtel.singteltest;

import com.singtel.singteltest.model.animal.Animal;
import com.singtel.singteltest.model.animal.bird.*;
import com.singtel.singteltest.model.animal.bird.parrot.Parrot;
import com.singtel.singteltest.model.animal.fish.Clownfish;
import com.singtel.singteltest.model.animal.fish.Dolphin;
import com.singtel.singteltest.model.animal.fish.Fish;
import com.singtel.singteltest.model.animal.fish.Shark;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingtelexcersiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingtelexcersiceApplication.class, args);

		Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Butterfly(),
                new Dolphin(),
		};

		for (int i =0 ; i<animals.length ; i++){
			try{
				//
			}catch (Exception e){

			}
		}
	}
}
