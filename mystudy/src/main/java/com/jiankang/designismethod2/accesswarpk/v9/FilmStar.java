package com.jiankang.designismethod2.accesswarpk.v9;

/*
 *@create by jiankang
 *@date 2020/1/13 time 11:47
 */

public class FilmStar extends AbsStar {
    public FilmStar() {
        super(new ActFilm());
    }

    public FilmStar(AbsAction absAction) {
        super(absAction);
    }

    public void doJob(){
        System.out.println("====影星的工作======");
        super.doJob();
    }


}
