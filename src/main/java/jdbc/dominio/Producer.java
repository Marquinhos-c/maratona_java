package jdbc.dominio;

import lombok.Builder;
import lombok.Data;
import lombok.Value;



@Value
@Builder
@Data

public class Producer {
    Integer id;
    String name;
}
