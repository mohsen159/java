import java.util.Scanner;

class main {
    public static void main(String[] args) {
        System.out.println("Starting\n");
        exo02();
    }

    public static void exo01() {
        String pattern = "\\d+.\\d+.\\d+.\\d+:\\d+";
        // String regex = "^([0-9]{1,3}\\.){3}[0-9]{1,3}:[0-9]{1,4}$";

        Scanner n = new Scanner(System.in);
        String entery = n.nextLine();

        if (entery.matches(pattern)) {
            String[] hoi = entery.split(":");
            System.out.println("  the ip is : " + hoi[0] + " and the port is " + hoi[1]);
        } else {
            System.out.println(" incorrect");
        }

    }

    public static void exo02() {
        String operation = "1+0+9+00+11+12+00+16+9";
        operation = operation.replaceAll("[+][0]+", "");
        System.out.println(operation);
        int r = 0;
        String[] arr = operation.split("[+]");
        for (int i = 0; i < arr.length; i++) {
            r += Integer.parseInt(arr[i]);
        }
        System.out.println(r);
    }
    public static void exo03() {
        String year = "2015";
        String prenom = "ben";
        String data = "mohe,bendib,2019\nmorade,zerniz,2017\nhakim,cherfa,2015";
        String[] people = data.split("\n");
        for (int i = 0; i < people.length; i++) {
            if (people[i].matches("[a-zA-Z]+,[a-zA-Z]+," + year)) {
                System.out.println("nom :" + people[i].split(",")[0] + " prenom " + people[i].split(",")[1] + " year "
                        + people[i].split(",")[2]);
            }

        }
        for (int i = 0; i < people.length; i++) {
            if (people[i].matches("[a-zA-Z]+," + prenom + "[a-zA-Z]+,[0-9]+")) {
                System.out.println("nom :" + people[i].split(",")[0] + " prenom " + people[i].split(",")[1] + " year "
                        + people[i].split(",")[2]);

            }

        }
    }

}