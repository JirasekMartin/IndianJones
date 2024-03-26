package org.example;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class IndianJones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.println("Vešel jsi do chrámu a vytoužená koruna leží na podstavci. Rozběhneš se za ní? [A/N]!");
        String volba = scanner.nextLine();
        if (volba.equals("A")) {
            System.out.println("Podivný zvuk pod tvými podrážkami zasignalizoval, že něco není v pořádku.");
            System.out.println("Stiskl jsi past a stěny se začaly posouvat k tobě, východ se zavírá.KONEC HRY");
        } else {
            System.out.println("Všiml sis tlačítka v podlaze, které jsi opatrně obešel. Stojíš přímo před korunou.");
            System.out.println("Sebereš jí? [A/N]!");
            String volba2 = scanner.nextLine();
            if (volba2.equals("A")) {
                System.out.println("Vítězoslavně jsi vyzdvihl korunu! Ale všiml sis, že není to jediné, co máš v ruce.");
                System.out.println("Po rukávu ti putuje obří tarantula, něco tě zabolelo a padl jsi. KONEC HRY");
            }else {
                System.out.println("Rozvážnost se ti znovu vyplatila, z pod koruny něco vylezlo a ztratilo v temnotě.");
                System.out.println("Korunu jsi sebral a rychle utekl ven na boží světlo. VYHRÁL JSI!.");
            }
        }
    }
}