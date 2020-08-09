package tacos.data;

/*
 *@create by jiankang
 *@date 2020/8/6 time 18:12
 */

import tacos.Ingredient;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findById(String id);

    Ingredient save(Ingredient ingredient);
}
