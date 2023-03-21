import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { AddToCartDto } from '../Model/addtocartdto.model';

@Injectable({
  providedIn: 'root'
})
export class CartService {

  baseUrl:string="http://localhost:8081/api/cart";
  constructor(private http:HttpClient) { }

  addToCart(addToCartDto:AddToCartDto){
    return this.http.post(this.baseUrl,addToCartDto);
  }
}
