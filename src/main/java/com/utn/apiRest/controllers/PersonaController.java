package com.utn.apiRest.controllers;

import com.utn.apiRest.entities.Persona;
import com.utn.apiRest.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")

public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{


}
