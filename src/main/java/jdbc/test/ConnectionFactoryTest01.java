package jdbc.test;

import jdbc.dominio.Producer;
import jdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(1).name("madhause").build();
//        ProducerService.save(producer);
//        ProducerService.delete(10);

//        ProducerService.update(producerToUpdate);
//        ProducerService.updatePreparedStatemente(producerToUpdate);

//        List<Producer> producers = ProducerService.findAll();

//        List<Producer> producers = ProducerService.findByName("Mad");
//        log.info("Producers found '{}'", producers);

//        ProducerService.showProducerMetadata();
//        ProducerService.showDriverMetadata();
//        ProducerService.showTypeScrollWorking();

//        List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Deen");
//        log.info("Producers found '{}'", producers);

//        List<Producer> producers = ProducerService.finByNameAndInsertWhenNotFound("A-1 pictures");
//        log.info("Producers found '{}'", producers);

//        ProducerService.finByNameAndDelete("A-1 pictures");

//        List<Producer> producers = ProducerService.finByNamePreparedStatement("Bo");
//        log.info("Producers found '{}'", producers);

        List<Producer> producers = ProducerService.finByNameCallableStatement("Bo");
        log.info("Producer found '{}'", producers);

    }
}
