import java.util.*;


import java.util.Collections;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Scanner;

public class Lista_Contactos {
    public static void main(String[] args) {

        ArrayList<LinkedList> letras = new ArrayList<LinkedList>();


        LinkedList<Persona> A = new LinkedList<Persona>();
        LinkedList<Persona> B = new LinkedList<Persona>();
        LinkedList<Persona> C = new LinkedList<Persona>();
        LinkedList<Persona> D = new LinkedList<Persona>();
        LinkedList<Persona> E = new LinkedList<Persona>();
        LinkedList<Persona> F = new LinkedList<Persona>();
        LinkedList<Persona> G = new LinkedList<Persona>();
        LinkedList<Persona> H = new LinkedList<Persona>();
        LinkedList<Persona> I = new LinkedList<Persona>();
        LinkedList<Persona> J = new LinkedList<Persona>();
        LinkedList<Persona> K = new LinkedList<Persona>();
        LinkedList<Persona> L = new LinkedList<Persona>();
        LinkedList<Persona> M = new LinkedList<Persona>();
        LinkedList<Persona> N = new LinkedList<Persona>();
        LinkedList<Persona> O = new LinkedList<Persona>();
        LinkedList<Persona> P = new LinkedList<Persona>();
        LinkedList<Persona> Q = new LinkedList<Persona>();
        LinkedList<Persona> R = new LinkedList<Persona>();
        LinkedList<Persona> S = new LinkedList<Persona>();
        LinkedList<Persona> T = new LinkedList<Persona>();
        LinkedList<Persona> U = new LinkedList<Persona>();
        LinkedList<Persona> V = new LinkedList<Persona>();
        LinkedList<Persona> W = new LinkedList<Persona>();
        LinkedList<Persona> X = new LinkedList<Persona>();
        LinkedList<Persona> Y = new LinkedList<Persona>();
        LinkedList<Persona> Z = new LinkedList<Persona>();

        //LinkedList que tendra todos los contactos

        LinkedList<Persona> contactos = new LinkedList<>();

        //agrgando las linkedlist de cada letra a la linkedlist de contactos
        contactos.addAll(A);
        contactos.addAll(B);
        contactos.addAll(C);
        contactos.addAll(D);
        contactos.addAll(E);
        contactos.addAll(F);
        contactos.addAll(G);
        contactos.addAll(H);
        contactos.addAll(I);
        contactos.addAll(J);
        contactos.addAll(K);
        contactos.addAll(L);
        contactos.addAll(M);
        contactos.addAll(N);
        contactos.addAll(O);
        contactos.addAll(P);
        contactos.addAll(Q);
        contactos.addAll(R);
        contactos.addAll(S);
        contactos.addAll(T);
        contactos.addAll(U);
        contactos.addAll(V);
        contactos.addAll(W);
        contactos.addAll(X);
        contactos.addAll(Y);
        contactos.addAll(Z);


        /*Persona p1 = new Persona("Emilio","Molina","8744-5450","Barrio Buenos Aires","
        LinkedList<Persona> contactos = new LinkedList<>();
        Persona p1 = new Persona("Emilio","Molina","8744-5450","Barrio Buenos Aires","Emiliomolina266@gmail.com");
        Persona p2 = new Persona("Cristian","Molina","8744-5450","Barrio Buenos Aires","Emiliomolina266@gmail.com");
        Persona p3 = new Persona("Oscar","Almendarez","8744-5450","Barrio Buenos Aires","Emiliomolina266@gmail.com");
        Persona p4 = new Persona("Angie","Nuñez","8744-5450","Barrio Buenos Aires","Emiliomolina266@gmail.com");
        Persona p5 = new Persona("Angie","Morales","8744-5450","Barrio Buenos Aires","Emiliomolina266@gmail.com");
        /**
         *
         * @param lista
         */

        Persona p1 = new Persona("Daniel", "Perez", "819-555-5555", "Santo Domingo", "Email","Familia",true);
        Persona p2 = new Persona("Carlos", "Perez", "889-555-5555", "Santo Domingo", "Email","Familia",false);
        Persona p3 = new Persona("Andres", "Perez", "829-555-5555", "Santo Domingo", "Email","Colega",true);
        Persona p4 = new Persona("Bryan", "Perez", "809-555-5555", "Santo Domingo", "Email","Colega",false);
        Persona p5 = new Persona("Eduardo", "Perez", "899-555-5555", "Santo Domingo", "Email","Colega",false);
        Persona p6 = new Persona("Fernando", "Perez", "849-555-5555", "Santo Domingo", "Email","Familia",true);
        Persona p7 = new Persona("Daniel", "Almendarez", "869-555-5555", "Santo Domingo", "Email","Familia",false);


        contactos.add(p1);
        contactos.add(p2);
        contactos.add(p3);
        contactos.add(p4);
        contactos.add(p5);
        contactos.add(p6);
        contactos.add(p7);


        Ordenar(contactos);

//do while del menu
        int opcion = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Agregar Contacto");
            System.out.println("2. Eliminar Contacto");
            System.out.println("3. Buscar Contacto");
            System.out.println("4. Mostrar Contactos");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    AgregarContacto(contactos);
                    break;
                case 2:
                    EliminarContacto(contactos);
                    break;
                case 3:
                    BuscarContacto(contactos);
                    break;
                case 4:
                    System.out.println("Mostar contactos");
                    Imprimir(contactos);
                    break;
                    case 5:
                        System.out.println("Gracias por usar el programa");
                        break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 5);

    }

    public static void Ordenar(LinkedList<Persona> lista) {
        Collections.sort(lista);
    }
//IMPRIMIR INDICE DE LETRA Y CONTACTOS
    public static void Imprimir(LinkedList<Persona> lista) {
            char letras []= new char['Z'-'A'+1];
            int contador = 0;
            for (int i = 0; i < letras.length; i++) {
                //imprimir indice y contactos
                System.out.println((char)('A'+i));
                for (int j = 0; j < lista.size(); j++) {
                    if (lista.get(j).getNombre().charAt(0) == (char)('A'+i)) {
                        System.out.println(lista.get(j));
                    }
                }

            }
            //funcion de agregar contactos

    }

    public static void AgregarContacto(LinkedList<Persona> lista){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del contacto");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el apellido del contacto");
        String apellido = sc.nextLine();
        System.out.println("Ingrese el telefono del contacto");
        String telefono = sc.nextLine();
        System.out.println("Ingrese la direccion del contacto");
        String direccion = sc.nextLine();
        System.out.println("Ingrese el email del contacto");
        String email = sc.nextLine();
        System.out.println("Ingrese el tipo de contacto"+" "+"(Familia, Colega, Amigo)");
        String tipo = sc.nextLine();
        Boolean favorito = false;
        System.out.println("Desea agregarlo a favoritos? (si/no)");
            if (sc.nextLine().equalsIgnoreCase("si")) {
                    favorito = true;
                }else if (sc.nextLine().equalsIgnoreCase("no")) {
                    favorito = false;}
        Persona p = new Persona(nombre,apellido,telefono,direccion,email,tipo,favorito);
        lista.add(p);
        Ordenar(lista);
    }
    public static void EliminarContacto(LinkedList<Persona> lista){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del contacto a eliminar");
        String nombre = sc.nextLine();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().equalsIgnoreCase(nombre)) {
                lista.remove(i);
            }
        }
        Ordenar(lista);
        Imprimir(lista);
    }

    public static void BuscarContacto(LinkedList<Persona> lista){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del contacto a buscar o imgrese su numero de telefono");
        String nombreonumero = sc.nextLine();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().equalsIgnoreCase(nombreonumero) || lista.get(i).getTelefono().equalsIgnoreCase(nombreonumero)) {
                System.out.println(lista.get(i));
            }
        }
    }



}
