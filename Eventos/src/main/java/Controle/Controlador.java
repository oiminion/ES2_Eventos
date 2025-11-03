package Controle;

import Catalogo.Catalogo;
import Factory.FactoryBebida;
import Factory.FactoryComida;
import Factory.FactoryEvento;
import Factory.FactoryLocalizacao;
import Interface.Menu;
import Modelo.CategoriaCusto;
import Modelo.DespesaAdicional;
import Modelo.Evento;
import Modelo.Funcionario;
import Modelo.ItemBuffet;
import Modelo.Localizacao;
import Modelo.Status;
import Modelo.TipoItem;
import java.time.LocalDateTime;
/**
 *
 * @author Sayu
 */
public class Controlador {
    
    private Catalogo catalogo;
    private Menu menu;
    
    public Controlador (Menu menu) {
        catalogo = new Catalogo();
        this.menu = menu;
    }
    
    public void removerFuncionario(String nomeEvento, String nomeFuncionario)
    {
        Evento evento = catalogo.buscarEvento(nomeEvento);
        if(evento != null)
        {
            Funcionario func = evento.buscarFuncionario(nomeFuncionario);
            if(func != null)
            {
                evento.removerFuncionario(func);
                evento.calcularCustoTotalEvento();
                evento.calcularCustoPorConvidado();
                menu.exibirMensagemDeConfirmacao();
            }
            else
            {
                menu.exibirMensagemDeErro();
            }
        }
        else
        {
            menu.exibirMensagemDeErro();
        }
    }
    
    public void removerItemBuffet(String nomeEvento, String nomeItemBuffet)
    {
        Evento evento = catalogo.buscarEvento(nomeEvento);
        if(evento != null)
        {
            ItemBuffet item = evento.buscarItemBuffet(nomeItemBuffet);
            if(item != null)
            {
                evento.removerItemBuffet(item);
                evento.calcularCustoTotalEvento();
                evento.calcularCustoPorConvidado();
                menu.exibirMensagemDeConfirmacao();
            }
            else
            {
                menu.exibirMensagemDeErro();
            }
        }
        else
        {
            menu.exibirMensagemDeErro();
        }
    }
    
    public void removerDespesaAdicional(String nomeEvento, String nomeDespesaAdicional)
    {
        Evento evento = catalogo.buscarEvento(nomeEvento);
        if(evento != null)
        {
            DespesaAdicional despesa = evento.buscarDespesaAdicional(nomeDespesaAdicional);
            if(despesa != null)
            {
                evento.removerDespesaAdicional(despesa);
                evento.calcularCustoTotalEvento();
                evento.calcularCustoPorConvidado();
                menu.exibirMensagemDeConfirmacao();
            }
            else
            {
                menu.exibirMensagemDeErro();
            }
        }
        else
        {
            menu.exibirMensagemDeErro();
        }
    }
    
    public void validarInputsDeRegistroDoEvento(String nome, String descricao, int quantidadeConvidados, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim)
    {
        FactoryLocalizacao fLoc = new FactoryLocalizacao();
        Localizacao loc = fLoc.criarLocalizacao(nome, quantidadeConvidados, quantidadeConvidados, quantidadeConvidados);
        FactoryEvento fEve = new FactoryEvento();
        Evento eve = fEve.criarEvento(nome, descricao, quantidadeConvidados, dataHoraInicio, dataHoraFim);
        eve.calcularDuracaoEmDias();
        loc.calcularCustoAluguelTotal(quantidadeConvidados, quantidadeConvidados);
        eve.setLocalizacao(loc);
        eve.calcularCustoTotalEvento();
        eve.calcularCustoPorConvidado();
        catalogo.adicionarEvento(eve);
        menu.exibirMensagemDeConfirmacao();
    }
    
    public void validarInputsDeRegistroDeDespesaAdicional(String nomeEvento, String nomeDespesa, CategoriaCusto categoriaCusto, String descricao, double custo)
    {
        Evento eve = catalogo.buscarEvento(nomeEvento);
        DespesaAdicional des = eve.buscarDespesaAdicional(nomeDespesa);
        des.calcularCustoTotalDespesaFixa(custo);
        des.calcularCustoTotalDespesaVariavel(custo, eve.getQuantidadeConvidados());
        eve.adicionarDespesaAdicional(des);
        eve.calcularCustoTotalEvento();
        eve.calcularCustoPorConvidado();
        menu.exibirMensagemDeConfirmacao();
    }
    
    public String exibirelatorioEventos()
    {
        return catalogo.exibirelatorioEventos();
    }
    
    public void cancelarEvento(String nomeEvento)
    {
        Evento eve = catalogo.buscarEvento(nomeEvento);
        catalogo.removerEvento(eve);
        menu.exibirMensagemDeConfirmacao();
    }
    
    public String exibirEvento(String nomeEvento)
    {
        Evento eve = catalogo.buscarEvento(nomeEvento);
        return eve.exibirEvento();
    }
    
    public void alterarStatus(String nomeEvento, Status novoStatus)
    {
        Evento eve = catalogo.buscarEvento(nomeEvento);
        eve.alterarStatus(novoStatus);
        menu.exibirMensagemDeConfirmacao();
    }
    
    public void validarInputsDeAlteracaoDeDespesaAdicional(String nomeEvento, String nomeDespesa, String novoNomeDespesa, CategoriaCusto novaCategoriaCusto, String novaDescricao, double novoCusto)
    {
        Evento eve = catalogo.buscarEvento(nomeEvento);
        DespesaAdicional des = eve.buscarDespesaAdicional(nomeDespesa);
        des.alterarDespesaAdicional(novoNomeDespesa, novaCategoriaCusto.name(), novaDescricao, novoCusto);
        menu.exibirMensagemDeConfirmacao();
    }
    
    public void validarInputsDeRegistroDeItemDoBuffet(String nomeEvento, String nomeItemBuffet, TipoItem tipo, double custo)
    {
        Evento eve = catalogo.buscarEvento(nomeEvento);
        ItemBuffet item = null;
        if(tipo == TipoItem.COMIDA)
        {
            FactoryComida fCom = new FactoryComida();
            item = fCom.criarComida(nomeItemBuffet, custo, tipo);
        }
        else if(tipo == TipoItem.BEBIDA)
        {
            FactoryBebida fCom = new FactoryBebida();
            item = fCom.criarBebida(nomeItemBuffet, custo, tipo);
        }
        eve.adicionarItemBuffet(item);
        eve.calcularCustoTotalBuffet();
        eve.calcularCustoTotalEvento();
        eve.calcularCustoPorConvidado();
        menu.exibirMensagemDeConfirmacao();
    }
}
