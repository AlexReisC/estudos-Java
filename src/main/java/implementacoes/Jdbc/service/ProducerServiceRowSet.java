package implementacoes.Jdbc.service;

import java.util.List;

import implementacoes.Jdbc.dominio.Producer;
import implementacoes.Jdbc.repository.ProducerRepositoryRowSet;

public class ProducerServiceRowSet {
	public static List<Producer> findByNameJdbcRowSet(String name){
		return ProducerRepositoryRowSet.findByNameJdbcRowSet(name);
	}
	
	public static void updateJdbcRowSet(Producer producer){
		ProducerRepositoryRowSet.updateJdbcRowSet(producer);
	}
}
