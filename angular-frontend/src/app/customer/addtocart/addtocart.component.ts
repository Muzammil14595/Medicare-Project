import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { AddToCartDto } from 'src/app/Model/addtocartdto.model';
import { Product } from 'src/app/Model/product.model';
import { CartService } from 'src/app/Services/cart.service';
import { ProductService } from 'src/app/Services/product.service';

@Component({
  selector: 'app-addtocart',
  templateUrl: './addtocart.component.html',
  styleUrls: ['./addtocart.component.css']
})
export class AddtocartComponent {

  addToCartDto:AddToCartDto;
  prod:Product;
  constructor(private service:ProductService, private cartService:CartService, private actRoute:ActivatedRoute){}

  ngOnInit(){
    const id = this.actRoute.snapshot.paramMap.get("id");
    this.service.getById(Number(id)).subscribe(x=>this.prod=x)
  }

  onSubmit(){
    this.cartService.addToCart(this.addToCartDto).subscribe(ob=>console.log(ob));
  }
}
