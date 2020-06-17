package com.pubble.conpub;

import com.pubble.conpub.repository.BoardRepository;
import com.pubble.conpub.repository.MemberRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.IntStream;

@SpringBootApplication
public class ConpubApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConpubApplication.class, args);
	}

}
