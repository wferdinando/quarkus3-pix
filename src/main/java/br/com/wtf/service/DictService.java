package br.com.wtf.service;

import java.time.LocalDateTime;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import br.com.wtf.model.Chave;
import br.com.wtf.model.TipoChave;
import br.com.wtf.model.TipoPessoa;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DictService {

    @ConfigProperty(name = "pix.chave")
    private String chave;

    @ConfigProperty(name = "pix.ispb")
    private String isbp;

    @ConfigProperty(name = "pix.cnpj")
    private String cnpj;

    @ConfigProperty(name = "pix.nome")
    private String nome;

    public Chave buscarChave(String chave){
        return new Chave(TipoChave.EMAIL,
            chave,
            isbp,
            TipoPessoa.JURIDICA, 
            cnpj,
            nome,
            LocalDateTime.now());
    }
}
