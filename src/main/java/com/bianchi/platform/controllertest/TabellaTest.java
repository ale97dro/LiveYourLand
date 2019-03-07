package com.bianchi.platform.controllertest;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TabellaTest")
public class TabellaTest {
    @Id
    private String name;
}
