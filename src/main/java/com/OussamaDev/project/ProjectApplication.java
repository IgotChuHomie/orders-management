package com.OussamaDev.project;
import com.OussamaDev.project.dao.BuyerDAO;
import com.OussamaDev.project.dao.CategoryDAO;
import com.OussamaDev.project.dao.OrderDAO;
import com.OussamaDev.project.dao.ProductDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(BuyerDAO buyerDAO , CategoryDAO categoryDAO , ProductDAO productDAO , OrderDAO orderDAO) {
		return runner->{

		} ;
	}

}
