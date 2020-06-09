package bd.edu.seu.springbootblooddemo.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(of = {"dId"})
public class donor {
    private int dId;
    private String dName;
    private String dAddress;
    private String dPhone;
    private List<Blood>bloodList;

    public donor(int dId, String dName, String dAddress, String dPhone) {
        this.dId = dId;
        this.dName = dName;
        this.dAddress = dAddress;
        this.dPhone = dPhone;
    }

    public void addBlood(Blood blood){
        if (bloodList == null)
            bloodList = new ArrayList<>();
        bloodList.add(blood);
    }
}
