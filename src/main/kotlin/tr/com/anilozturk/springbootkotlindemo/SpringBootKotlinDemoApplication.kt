package tr.com.anilozturk.springbootkotlindemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootKotlinDemoApplication

fun main(args: Array<String>) {
	runApplication<SpringBootKotlinDemoApplication>(*args)
}
