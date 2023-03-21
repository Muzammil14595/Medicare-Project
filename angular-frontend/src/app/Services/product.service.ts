import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from '../Model/product.model';
import { Productdto } from '../Model/productdto.model';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  baseUrl:string = "http://localhost:8081/api/product"
  constructor(private http:HttpClient) { }

  getAllProd(): Observable<Product[]>{
    return this.http.get<Product[]>(this.baseUrl);
  }

  addProd(productdto:Productdto){
    return this.http.post(this.baseUrl,productdto);
  }

  getById(id:number): Observable<Product>{
    return this.http.get<Product>(this.baseUrl+"/"+id);
  }

  updProd(id:number,productdto:Productdto){
    return this.http.put(this.baseUrl+"/"+id, productdto);
  }

  delProd(id:number){
    return this.http.delete(this.baseUrl+"/"+id);
  }

  getProdByName(name:string){
    return this.http.get(this.baseUrl+"/getByName/"+name);
  }

}
