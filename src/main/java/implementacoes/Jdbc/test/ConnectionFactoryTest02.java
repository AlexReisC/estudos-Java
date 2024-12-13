package implementacoes.Jdbc.test;

import java.util.List;

import implementacoes.Jdbc.dominio.Producer;
import implementacoes.Jdbc.service.ProducerServiceRowSet;

public class ConnectionFactoryTest02 {
	public static void main(String[] args) {
		Producer producerToUpdate = Producer.ProducerBuilder.builder().id(1).name("MAD").build();
		ProducerServiceRowSet.updateJdbcRowSet(producerToUpdate);
		List<Producer> producers = ProducerServiceRowSet.findByNameJdbcRowSet("");
		System.out.println(producers);
	}
}
