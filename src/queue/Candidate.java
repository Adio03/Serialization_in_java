package queue;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Candidate implements Comparable<Candidate>{
    private String name;
    private String party;




    @Override
    public int compareTo(Candidate o) {
        return 0;
    }
}
