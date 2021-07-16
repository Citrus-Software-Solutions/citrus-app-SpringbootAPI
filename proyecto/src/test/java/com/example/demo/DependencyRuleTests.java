package com.example.demo;

import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.example.demo.archunit.HexagonalArchitecture;
import org.junit.jupiter.api.Test;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.*;

public class DependencyRuleTests {
	
	@Test
	void validateRegistrationContextArchitecture() {
		HexagonalArchitecture.boundedContext("com.example.demo.JobOffer")

				.withDomainLayer("domain")

				.withAdaptersLayer("adapter")
				.incoming("in.web")
				.outgoing("out.persistence")
				.and()

				.withApplicationLayer("application")
				.services("service")
				.incomingPorts("port.in")
				.outgoingPorts("port.out")
				.and()

				.withConfiguration("configuration")
				.check(new ClassFileImporter()
						.importPackages("com.example.demo.."));
	}

}
