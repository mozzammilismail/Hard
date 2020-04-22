package com.singtel.ngoft.drools.bre;

import org.kie.api.KieServices;
import org.kie.api.logger.KieRuntimeLogger;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.logger.KnowledgeRuntimeLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BRERuntime {
	@Autowired
	private KieContainer kieContainer;
	KieSession kieSession;
	KieRuntimeLogger auditlogger;
	KieRuntimeLogger consoleLogger;

	public KieSession getDroolsKieSession() {
		KieServices kieServices = KieServices.Factory.get();
		
		kieSession = kieContainer.newKieSession();
		auditlogger = KnowledgeRuntimeLoggerFactory.newFileLogger(kieSession, "logs/mylogfile");
		consoleLogger = KnowledgeRuntimeLoggerFactory.newConsoleLogger(kieSession);
		return kieSession;
	}

	public KieContainer getKieContainer() {
		return kieContainer;
	}

	public void setKieContainer(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}
}
