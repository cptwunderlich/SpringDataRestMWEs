package com.example.assocsort.persistence.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Benjamin Maurer (maurer.benjamin@gmail.com)
 * @since 29.08.2018
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class Article {
  
    @Id @GeneratedValue
    private Long articlenumber;
    
    private String description;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Unit unit;
}
