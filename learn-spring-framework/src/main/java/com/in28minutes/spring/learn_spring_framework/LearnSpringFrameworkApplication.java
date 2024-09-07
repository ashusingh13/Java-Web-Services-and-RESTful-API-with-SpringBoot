package com.in28minutes.spring.learn_spring_framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.spring.learn_spring_framework.enterprise.example.web.MyWebController;
import com.in28minutes.spring.learn_spring_framework.game.GameRunner;
//import com.in28minutes.spring.learn_spring_framework.game.MarioGame;
//import com.in28minutes.spring.learn_spring_framework.game.SuperContraGame;
//import com.in28minutes.spring.learn_spring_framework.game.PacManGame;
//import com.in28minutes.spring.learn_spring_framework.game.GamingConsole;

@SpringBootApplication
//@ComponentScan("com.in28minutes.spring.learn_spring_framework") --> When we write SpringBootApplication, this line will be there but in hidden..
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		
		//MarioGame game = new MarioGame();
		//SuperContraGame game = new SuperContraGame();
		
		//GamingConsole game = new MarioGame();
		//GameRunner runner = new GameRunner(game);
		
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		
		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
	}

}
