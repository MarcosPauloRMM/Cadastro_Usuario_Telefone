/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cad;

import java.util.ArrayList;

/**
 *
 * @author angelo
 */
public class Bd {
    
        private static ArrayList<Usuario> users;
    
    public static ArrayList<Usuario> getUsers(){
        if(users == null){
            users = new ArrayList<>();
            Usuario admin = new Usuario();
            admin.setNome("Marcos Paulo da Rocha Moura Miudo");
            admin.setEmail("marcospaulomoura1999@empresa.com");
            admin.setTelefone(997662319);
            admin.setSenha("123456");
            users.add(admin);
        }
        return users;
    }  
}
