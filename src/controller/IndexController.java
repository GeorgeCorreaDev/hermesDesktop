package controller;

import org.apache.log4j.Logger;

import dao.PessoaDao;
import model.Pessoa;

public class IndexController {
	
	static Logger logger = Logger.getLogger(IndexController.class);


    PessoaDao dao = new PessoaDao();
    
    public void acessarSistema(Pessoa pessoa) {
    	try {
    		if(pessoa != null) {
        		//pessoa.setNome(txtLogin.getText());
        		//pessoa.setNome(txtSenha.getText());
        		dao.salvar(pessoa);
        		
        	}
		} catch (Exception e) {
			logger.info( e.getClass().getName() + ": " + e.getMessage());
		}
    }
}