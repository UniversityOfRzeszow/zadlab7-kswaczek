/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

/**
 *
 * @author Kasia
 */
public class Poduszkowiec implements Ladowe, Wodne {

    @Override
    public String plynie() {
        String p = "Płynie";
        return p;

    }

    @Override
    public String jedzie() {
        String j = "Jedzie";
        return j;
    }

    public static void main(String[] args) {
        Poduszkowiec poduszkowiec = new Poduszkowiec();
        System.out.println("Poduszkowiec " + poduszkowiec.plynie() + " oraz " + poduszkowiec.jedzie());
    }

}
