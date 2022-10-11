import { Component, OnInit } from '@angular/core';
import { usuario } from 'src/app/model/usuario.model';
import { UsuarioService } from 'src/app/service/usuario.service';

@Component({
  selector: 'app-acerca-de',
  templateUrl: './acerca-de.component.html',
  styleUrls: ['./acerca-de.component.css']
})
export class AcercaDeComponent implements OnInit {
usuario: usuario= new usuario("","","");// creo un usuario de tipo usuario
//en el constructor debo llamar al servicio que cree
  constructor(public usuarioService: UsuarioService) { }

  ngOnInit(): void {
    
    this.usuarioService.getUsuario().subscribe(datos=>{this.usuario=datos})
    
  }

}
