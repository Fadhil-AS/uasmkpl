/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.biodatadiri;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Lenovo
 */
public class BiodatadiriTest {
    
    @Test
    public void testIsEligibleToVote() {
	
	// Arrange
        Biodatadiri user = new Biodatadiri("Fadhil", 21, "Cianjur");
        int votingAge = 17;
    
	// Act
	boolean eligible = user.isEligibleToVote(votingAge);
	
	// Assert
	assertTrue(eligible);
    }
    
}
