/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula46;

/**
 *
 * @author juann
 */
public interface SqlDDL {
    void create(String query);
    void alter(String query);
    void drop(String query);
}
