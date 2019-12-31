package com.jiankang.effectivejavasecondedition.chapter2.v1;

/*
 *@create by jiankang
 *@date 2019/12/30 time 19:00
 */

public class NutritionFacts {
    private int servingSize;
    private int servings;
    private int fat;
    private int sodium;


    public static class Builder {
        private int servingSize;
        private int servings;
        private int fat;
        private int sodium;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder fat(int val) {
            this.fat = val;
            return this;
        }

        public Builder sodium(int val) {
            this.sodium = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.fat = builder.fat;
        this.servings = builder.servings;
        this.sodium = builder.sodium;
    }

}
