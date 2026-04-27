package br.com.nttdata.steps;

import io.cucumber.java.PendingException;
import io.cucumber.java.pt.Dado;
import net.bytebuddy.agent.builder.AgentBuilder;

public class StoreVivoSteps {

    String pageProduto = "";

    @Dado("que acesso o site {string}")
    public void queAcessoOSite(String url) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
