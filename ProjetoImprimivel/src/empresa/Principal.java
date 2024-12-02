package empresa;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Imprimivel f = new Funcionario("Juriscleison", "111.222.333-4");
        Imprimivel c = new Carro("Palio","cinza",4);
        Imprimivel q = new Quadrado(10);
        
        ArrayList<Imprimivel> lista = new ArrayList();
        lista.add(q);
        lista.add(c);
        lista.add(f);

        f.imprimir();
        c.imprimir();
        q.imprimir();

}

}
