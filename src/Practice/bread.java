package Practice;

public class bread {
    public static void main(String[] args) {
        String bread="xxxbreadjambreadert";
        int firstIndex=bread.indexOf("bread");
        int lastIndex=bread.lastIndexOf("bread");
       // System.out.println(firstIndex);
        System.out.println(bread.substring(firstIndex+5,lastIndex));
    }
}
