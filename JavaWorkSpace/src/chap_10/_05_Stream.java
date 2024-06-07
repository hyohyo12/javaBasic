package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        //스트림
        int[] scores = {100,95,90,85,100};
        IntStream scoreStream = Arrays.stream(scores);
        String[] langs = {"python","java","c","c++","c#"};
        Stream<String> langStream = Arrays.stream(langs);

        List<String> langList = new ArrayList<>();
        langList = Arrays.asList(langs);
        System.out.println(langList.size());
        Stream<String> langListStream = langList.stream();

        Stream<String> langListOfString = Stream.of("python", "java", "c", "c++", "c#");

        List<temp> tmp = new ArrayList<>();
        tmp.add(new temp(1,2,"김"));
        tmp.add(new temp(2,3,"김"));
        tmp.add(new temp(3,4,"한"));
        tmp.add(new temp(7,7,"한"));
        tmp.add(new temp(3,2,"드"));
        int result = tmp.stream().filter(x->x.getName().contains("한"))
                .mapToInt(x->x.getNum1()* x.getNum2())
                .sum();
        System.out.println(result);
    }
}
 class temp{
    public int num1;
    public int num2;
    public String name;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public String getName() {
        return name;
    }

    public temp(int num1, int num2, String name) {
        this.num1 = num1;
        this.num2 = num2;
        this.name = name;
    }
}