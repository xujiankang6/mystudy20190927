package com.jiankang.java8book;

/*
 *@create by jiankang
 *@date 2019/10/9 time 17:11
 */


import com.jiankang.java8book.bean.Trader;
import com.jiankang.java8book.bean.Transaction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaTest {
    public static void main(String[] args) {


        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        /*
        5.6.3 数值流应用：勾股数
         */
/*     Stream<int[]> gougushu = IntStream.rangeClosed(1, 100).boxed().flatMap(a ->
                IntStream.rangeClosed(a, 100).filter(b -> Math.sqrt(a * a + b * b) % 1 == 0).boxed().map(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)})
        );
//        Math.sqrt(a*a + b*b) % 1 == 0) 测试返回的结果是否是整数
        Stream<double[]> stream = IntStream.rangeClosed(1, 100).boxed().flatMap(
                a -> IntStream.rangeClosed(a, 100).mapToObj(b -> new double[]{a, b,  Math.sqrt(a * a + b * b)}).filter(t -> t[2] % 1 == 0)
        );
        stream.limit(10).forEach(t-> System.out.println(t[0]+":"+t[1]+":"+t[2]));
        gougushu.limit(10).forEach(t-> System.out.println(t[0]+":"+t[1]+":"+t[2]));*/



        /*
        5.6
         */
/*
        int sum = transactions.stream().mapToInt(Transaction::getValue).sum();
        //将stream流转换为数值流
        IntStream intStream = transactions.stream().mapToInt(Transaction::getValue);
        //将数值流转换为Stream
        Stream<Integer> stream = intStream.boxed();
        //找到inStream的最大元素
//        OptionalInt max = intStream.max();
        //没有最大值，显式定义一个
//        int nomax = max.orElse(1);
        IntStream evenNumbers = IntStream.rangeClosed(1, 100).filter(n->n%2 ==0);
        System.out.println(evenNumbers.count());*/









        /*
        5.5.1 test
         */
      /*  Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        List<Transaction> result2011 = transactions.stream().filter(it -> it.getYear() == 2011).sorted(Comparator.comparing(Transaction::getValue)).collect(toList());

        Set<String> citys = transactions.stream().map(transaction -> transaction.getTrader().getCity()).collect(toSet());

        List<Transaction> jianqiao = transactions.stream().filter(it -> "Cambridge".equals(it.getTrader().getCity())).sorted(Comparator.comparing(it -> it.getTrader().getName())).collect(toList());

        List<Trader> traders = transactions.stream().map(Transaction::getTrader).filter(trader ->
                trader.getCity().equals("Cambridge")
        ).distinct().sorted(Comparator.comparing(Trader::getName)).collect(toList());

        String reduce = transactions.stream().map(transaction -> transaction.getTrader().getName()).distinct().sorted().reduce("", (n1, n2) -> n1 + n2);
        String reduce2 = transactions.stream().map(it -> it.getTrader().getName()).distinct().sorted().collect(Collectors.joining());

        boolean b = transactions.stream().anyMatch(it -> "Milan".equals(it.getTrader().getCity()));
        transactions.stream().filter(it -> "Cambridge".equals(it.getTrader().getCity())).map(Transaction::getValue).forEach(System.out::println);

        Optional<Integer> max = transactions.stream().map(it -> it.getValue()).reduce(Integer::max);

        Optional<Transaction> minreduce = transactions.stream().reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
        transactions.stream().min(Comparator.comparing(Transaction::getValue));
*/


        /*+8
        5、4 归约
         */
/*        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = numbers.stream().reduce(0, (a, b) -> a + b);
        int sum2 = numbers.stream().reduce(0,Integer::sum);
        System.out.println(sum==sum2);
        System.out.println(sum);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> min= numbers.stream().reduce((a,b)->a<b?a:b);
        System.out.println("min"+min);
        System.out.println("max"+max);
        Integer num = numbers.stream().map(it -> 1).reduce(0, (a, b) -> a + b);
        System.out.println("一共有几个："+num);*/












        /*
        5.3 查找和匹配,这个在写触发器时，可以使用，判断是否有空值，迅速开发
         */
  /*      List<String> arrayOfWords = Arrays.asList("aaA","","ccc");
        if(arrayOfWords.stream().anyMatch(it->it.length()==2)){
            System.out.println("aa");
        }

        Boolean is = arrayOfWords.stream().allMatch(it -> it.length()==3);
        System.out.println(is);

        Boolean a = arrayOfWords.stream().noneMatch(it -> it==null||"".equals(it));
        System.out.println(a);

        //找到符合条件的，并打印
        arrayOfWords.stream().filter(it -> it.length()==3).findAny().ifPresent(d-> System.out.println(d));

        Optional<String> firstIsTrue = arrayOfWords.stream().filter(it -> it.length() == 3).findFirst();
        System.out.println(firstIsTrue.get());*/


        //5、2映射流，很新鲜
/*        List<Integer> number1 = Arrays.asList(1, 2, 3);
        List<Integer> numnber2 = Arrays.asList(3, 4);
        List<int[]> pairs = number1.stream().flatMap(i -> numnber2.stream().filter(j -> (i + j) % 3 == 0).map(j -> new int[]{i, j})).collect(toList());*/








       /* String[] arrayOfWords = {"Goodbye", "World"};
        Stream<String> streamOfWords = Arrays.stream(arrayOfWords);*/
        //扁平化流
        //flatmap 方法让你把一个流中的每个值都换成另一个流，然后把所有的流连接
        //起来成为一个流。
    /*    List<String> words = Arrays.asList("Java 8", "Lambdas", "In", "Action");
        List<String> uniqueCharacters = words.stream().map(it -> it.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        for (String w : uniqueCharacters) {
            System.out.println(w);
        }
*/

/*    List<Integer> numbers = Arrays.asList(1,2,3,4);
    numbers.stream().map(n -> n * n).collect(Collectors.toList());*/






        /*
        List<String[]> aaa = words.stream().map(it -> it.split("")).distinct().collect(toList());
        aaa.stream().forEach(System.out::println);*/




       /* List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,3,2,2);
        numbers.stream().filter(it -> it % 2 ==0).distinct().forEach(System.out::println);*/



       /* List<String> title = Arrays.asList("Java8", "In", "Action");
        Stream<String> s = title.stream();
        s.forEach(System.out::println);
        s.forEach(System.out::println);*/

    }
}