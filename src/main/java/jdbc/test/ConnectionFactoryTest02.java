package jdbc.test;

import jdbc.dominio.Producer;
import jdbc.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        List<Producer> producers = ProducerServiceRowSet.findBynameJdbcRowSet("NHK");
        log.info(producers);
    }
}
