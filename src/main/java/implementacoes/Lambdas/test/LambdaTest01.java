package implementacoes.Lambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("Gabriel Desgraçadão", "G2 Cabeludo", "Bananilson Farofa");
        List<Integer> integers = List.of(1, 2, 3, 4);
        forEach(strings, (String s) -> System.out.println(s));
        forEach(integers, i -> System.out.println(i));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for(T e: list){
            consumer.accept(e);
        }
    }
}
