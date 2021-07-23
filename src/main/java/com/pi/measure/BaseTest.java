package com.pi.measure;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * Created by zhuzs on 2017/8/4.
 */
public class BaseTest {

    protected KieSession getKieSession(String agendaGroup){
        KieSession kieSession = getKieSession();
        kieSession.getAgenda().getAgendaGroup(agendaGroup).setFocus();
        return kieSession;
    }

    protected KieSession getKieSession(){
        KieServices kieServices = KieServices.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        KieSession kieSession = kieContainer.newKieSession("all-rules");
        return kieSession;
    }
}
