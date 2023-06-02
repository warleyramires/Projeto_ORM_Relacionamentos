/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Warley Ramires
 * Created: 2 de jun de 2023
 */

CREATE DATABASE atividade3;

USE atividade3;

CREATE TABLE cliente (
    id BIGINT NOT NULL AUTO_INCREMENT,
    cpf BIGINT NOT NULL,
    nome VARCHAR(45) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE contrato (
    id BIGINT NOT NULL AUTO_INCREMENT,
    redacao TEXT NOT NULL,
    ultima_atualizacao DATE NOT NULL,
    cliente_id BIGINT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (cliente_id)
        REFERENCES cliente(id)
);
