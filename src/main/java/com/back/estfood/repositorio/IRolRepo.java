package com.back.estfood.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.back.estfood.modelos.Rol;

@Repository
public interface IRolRepo extends JpaRepository<Rol, Long>{

}
