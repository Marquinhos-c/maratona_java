package jdbc.service;

import jdbc.dominio.Producer;
import jdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {

    public static void save(Producer producer) {
        ProducerRepository.save(producer);
    }

    public static void delete(Integer id) {
        requireValidId(id);
        ProducerRepository.delete(id);
    }

    public static void update(Producer producer) {
        requireValidId(producer.getId());
        ProducerRepository.update(producer);
    }
    public static void updatePreparedStatemente(Producer producer) {
        requireValidId(producer.getId());
        ProducerRepository.updatePreparedStatemente(producer);
    }

    public static List<Producer> findAll() {
        return ProducerRepository.findALL();
    }

    public static List<Producer> findByName(String name) {
        return ProducerRepository.finByName(name);
    }
    public static List<Producer> finByNamePreparedStatement(String name) {
        return ProducerRepository.finByNamePreparedStatement(name);
    }
    public static List<Producer> finByNameCallableStatement(String name) {
        return ProducerRepository.finByNameCallableStatement(name);
    }

    public static void showProducerMetadata() {
        ProducerRepository.showProducerMetaData();
    }

    public static void showDriverMetadata() {
        ProducerRepository.showDriverMetaData();
    }

    public static void showTypeScrollWorking() {
        ProducerRepository.showTypeScrollWorking();
    }

    public static List<Producer> findByNameAndUpdateToUpperCase(String name) {
        return ProducerRepository.finByNameAndUpdateToUpperCase(name);
    }

    public static List<Producer> finByNameAndInsertWhenNotFound(String name) {
        return ProducerRepository.finByNameAndInsertWhenNotFound(name);
    }

    public static void finByNameAndDelete(String name) {
        ProducerRepository.finByNameAndDelete(name);
    }

    private static void requireValidId(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid value for id");
        }
    }

}
