public class App {
    public static void main(String[] args) throws Exception {
        ArrayVariabileInt av = new ArrayVariabileInt();
        av.append(1);
        av.append(2);
        av.append(33);
        av.append(66);
        av.append(66);
        av.append(88);
        av.append(11);


        System.out.println(av);

        av.set(2,99);

        System.out.println(av);



    }
}
