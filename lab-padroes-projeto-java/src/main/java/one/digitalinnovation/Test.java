package one.digitalinnovation;

import one.digitalinnovation.facade.Facade;
import one.digitalinnovation.singleton.SingletonEager;
import one.digitalinnovation.singleton.SingletonLazy;
import one.digitalinnovation.singleton.SingletonLazyHolder;
import one.digitalinnovation.strategy.*;

public class Test {
    public static void main(String[] args) {
        // Singleton

//        SingletonLazy lazy = SingletonLazy.getInstancia();
//        System.out.println(lazy);
//        lazy = SingletonLazy.getInstancia();
//        System.out.println(lazy);
//
//        SingletonEager eager = SingletonEager.getInstancia();
//        System.out.println(eager);
//        eager = SingletonEager.getInstancia();
//        System.out.println(eager);
//
//        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
//        System.out.println(lazyHolder);
//        lazyHolder = SingletonLazyHolder.getInstancia();
//        System.out.println(lazyHolder);

        // Strategy

//        Comportamento normal = new ComportamentoNormal();
//        Comportamento defensivo = new ComportamentoDefensivo();
//        Comportamento ofensivo = new ComportamentoOfensivo();
//
//        Robo robo = new Robo();
//
//        robo.setStrategy(normal);
//        robo.mover();
//        robo.mover();
//        robo.setStrategy(defensivo);
//        robo.mover();
//        robo.setStrategy(ofensivo);
//        robo.mover();

        // Facade

        Facade facade = new Facade();
        facade.migrarCliente("Odeir", "38406540");


    }
}
