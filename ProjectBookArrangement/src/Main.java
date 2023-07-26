import java.io.PrintStream;
import java.util.Iterator;
import java.util.TreeSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TreeSet<Books> bookTreeSet = new TreeSet();
        bookTreeSet.add(new Books("Sefiller", 1213, "Victor Hugo", "01.10.1943"));
        bookTreeSet.add(new Books("Tutunamayanlar", 983, "Oğuz Atay", "01.10.1954"));
        bookTreeSet.add(new Books("Bülbülü Öldürmek", 342, "Harper Lee", "01.10.2003"));
        bookTreeSet.add(new Books("Gün Olur Asra Bedel", 453, "Cengiz Aytmatov", "01.10.1989"));
        bookTreeSet.add(new Books("İçimizdeki Şeytan", 398, "Sabahattin Ali", "01.10.1947"));
        Iterator var2 = bookTreeSet.iterator();

        while(var2.hasNext()){
            Books b = (Books) var2.next();
            PrintStream var3 = System.out;
            String var1 = b.getName();
            var3.println(var1 + ", " + b.getTotalPage());
        }
    }
}