package ar.gob.gcba.dgisis.mapa360.gateway.cucumber.stepdefs;

import ar.gob.gcba.dgisis.mapa360.gateway.Mapa360GatewayApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = Mapa360GatewayApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
