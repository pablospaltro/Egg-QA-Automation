public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

    Date fechaIngresada;
        int dia, mes, anio;

        System.out.println("Día: ");
        dia = scan.nextInt();
        System.out.println("Mes: ");
        mes = scan.nextInt();
        System.out.println("Año: ");
        anio = scan.nextInt();

        // SimpleDateFormat dateFormat = new SimpleDateFormat("DD/MM/AAAA");
        
        fechaIngresada = new Date(anio-1900, mes-1, dia);
        System.out.println(fechaIngresada);
        System.out.println((new Date().getYear())- (fechaIngresada.getYear()));
        


    }
}
