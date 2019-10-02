/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.samples.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * PetClinic Spring Boot Application.
 * 
 * @author Dave Syer
 *
 */
@SpringBootApplication
public class PetClinicApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(PetClinicApplication.class, args);
        
        
        
//    public interface IBaseDAO<T,ID>{
//    	T findOne(Id id);
//    	List<T> findAll();
//    	void create(T entity);   
//    	T update(T entity);
//    	void delete (T entity);
//    	void deleteById(Id entityId);
//    }
        /*
         * Spring busca cuando arranca las anotaciones. tipo @Entity, @Table,etc ---- 
         * beans clases java simples get set publicos, y constructor sin parámetros, los get y set del mismo nombre que el atributo
         * jms modulo de spring para implementar mensajes y colas de mensajes.
         * Transactions bloque de consultas para que todo se ejecute, o nada.
         * IoC ID, IoC container --> el container es la caja negra
         * Spring Data
         * 
         * Inversion de Control -> el control lo tiene Spring, no nosotroso como programadores
         * IoC -> nucleo del framework el cual crea los objectos.
         * 
         * @Component: componente generico
         * @Controller: Componente para la capa de presentacion
         * @Service: Componente especifico para la cpaa de servicio
         * @Repository: componente para la capa de persistencia. Muy parecido al concepto de DAO la idea es la misma
         * Inyección de dependencias -> se aplica para que un objeto no tenga que obtener sus dependencias. El contenedor las inyecta al crearlo
         * 
         * @AutoWired -> declara un constructor un campo un metodo set o un metodo de configuracion para que sea enlazado automaticamente por
         * Spring con un bean del tipo que corresponda. ej:
         * @Controller
         * public class UserController{
         * 	  @AutoWired
         * 	  private UserService service;
         * }
         * 
         * 
         * para el dao
         * public interface UserDao extends JpaRepository<user,id>{}
         * */
    }

}
