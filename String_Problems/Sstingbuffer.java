package StringQues;

public class Sstingbuffer {
    public static void main(String[] args) {
        
        StringBuffer s1=new StringBuffer();
        s1.append("Joyboy");

        s1.append("Zoro");

        System.out.println(s1);

        s1.insert(2, "Nami");

        System.out.println(s1);
    }
}
