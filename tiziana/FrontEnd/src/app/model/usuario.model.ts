export class usuario{
    id?:number;//ponemos el signo para indicar que el dato no es necesario
    nombre:String;
    apellido:String;
    foto:String;
    constructor(nombre:String, apellido:String, foto:String){
        this.nombre=nombre;
        this.apellido=apellido;
        this.foto=foto;
    }
}