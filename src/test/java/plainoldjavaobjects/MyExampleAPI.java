package plainoldjavaobjects;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class MyExampleAPI {
    private int userId;
    private int id;
    private String title;
    private Boolean completed;
}
