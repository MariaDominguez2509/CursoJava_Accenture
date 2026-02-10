package com.example.demo.infraestructura.persistencia.entidad;

import java.math.BigDecimal;

import java.time.LocalDate;
import java.time.Period;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;

import jakarta.persistence.FetchType;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;

import jakarta.persistence.JoinColumn;

import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;



@Entity

@Table(name = "perros")

public class PerroEntidad {



        @Id

        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Long id;



        @Column(nullable = false, unique = true)

        private String nombre;



        @Column(nullable = false)

        private LocalDate nacimiento;



        @Column(nullable = false)

        private String raza; 



        @Column(nullable = false)

        private Integer numeroDePatas;



        //@ManyToOne(optional = false, fetch = FetchType.LAZY)

        //@JoinColumn(name = "motor_id", nullable = false)

        //private MotorEntity motor;



        public PerroEntidad() {

        }



        public Long getId() {

                return id;

        }



        public String getNombre() {

                return nombre;

        }



        public String getRaza() {

            return raza; 

        }


        public int getEdad() {

            return Period.between(nacimiento, LocalDate.now()).getYears();

        }

        public Integer getNumeroDePatas() {

            return numeroDePatas;

        }


}

