package io.sggc.api.dto;

import javax.validation.constraints.NotNull;

public class ProviderRequest {


    @NotNull(message = "cannot be empty.")
    private String razaoSocial;

    @NotNull(message = "cannot be empty.")
    private String nomeFantasia;

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
}
