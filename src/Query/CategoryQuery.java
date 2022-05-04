/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Query;

/**
 *
 * @author ASUS
 */
public class CategoryQuery {
    public String showByType = "SELECT * FROM categories WHERE type = ?";
    public String showByName = "SELECT id FROM categories WHERE name = ?";
}
