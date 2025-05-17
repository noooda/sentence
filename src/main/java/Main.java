import io.github.noooda.sentence.Sentence;

public class Main {
    public static void main(String[] args) {
        Sentence s1 = new Sentence("Data    science  is    not  only    about  data;  it's    about   asking    the     right     questions     about      the  data.");
        System.out.println(s1.words());
        System.out.println(s1.frequencies());

        Sentence s2 = new Sentence("The   algorithm    was     designed     to    learn     from     data     and     adapt      to    new    data     with    minimal   human    intervention.");
        System.out.println(s2.words());
        System.out.println(s2.frequencies());
    }
}
