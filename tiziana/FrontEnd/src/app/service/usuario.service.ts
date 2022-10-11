import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { usuario } from '../model/usuario.model';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  ruta = 'http://localhost:8080/';

  constructor(private http: HttpClient) {}
    public getUsuario(): Observable<usuario> {
      return this.http.get<usuario>(this.ruta+'usuarios/encontrar');


  }
}

