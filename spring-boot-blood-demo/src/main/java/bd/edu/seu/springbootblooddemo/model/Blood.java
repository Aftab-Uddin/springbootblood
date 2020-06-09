package bd.edu.seu.springbootblooddemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Blood {
    @ToString.Exclude
    private donor don;
    private int bloodId;
    private String bloodGroup;
    private String bloodCells;


    @ToString.Include
    private String getLabel(){
        return don.getDId() + "." + bloodGroup;
    }



}
