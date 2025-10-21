public class App {
    public static void main(String[] args) throws Exception {

int ika = 44;

// Tulostusehdot

//alaikäiset
if (ika > 0 && ika < 18) {
    System.out.println("Olet alaikäinen");
    if (ika >= 15) {
    System.out.println("Saat ajaa mopoa");
    }
    if (ika >= 16 && ika <= 17) {
    System.out.println("Saat ajaa kevaria");
}
}
// täysi-ikäiset
else if (ika == 18) {
System.out.println("Olet juuri tullut täysi-ikäiseksi");
System.out.println("Saat ajaa autoa");
}
else if (ika >= 40 && ika <= 50) {
System.out.println("Nauti keski-iästä!");
}
else if (ika > 57 && ika < 65) {
    System.out.println("Voit jäädä varhaiseläkkeelle");
}
else if (ika >= 65) {
    System.out.println("Olet eläkeläinen");
    if (ika == 65) {
                    System.out.println("Hyviä eläkepäiviä!");
                }
if (ika == 100) {
    System.out.println("Paljon onnea sadasta vuodesta!");
}
}
else {
    System.out.println("Olet aikuinen");
    if (ika >= 18 && ika % 10 == 0) {
    System.out.println("Onnittelut tasavuosikymmenestä!");
}
}



    }
}

