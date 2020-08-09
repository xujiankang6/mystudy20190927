package tacos;

/*
 *@create by jiankang
 *@date 2020/8/5 time 18:01
 */

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
//@NoArgsConstructor(access = AccessLevel.PRIVATE,force = true)
//@Entity
public class Ingredient {
//    @Id
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
