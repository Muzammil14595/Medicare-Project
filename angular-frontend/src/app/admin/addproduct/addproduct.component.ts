import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Productdto } from 'src/app/Model/productdto.model';
import { ProductService } from 'src/app/Services/product.service';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent {

  prodductdto:Productdto = new Productdto();
  constructor(private service:ProductService, private router:Router){}

  onSubmit(){
    this.service.addProd(this.prodductdto).subscribe(x=>console.log(x));
    alert("Product added successfuly")
    this.router.navigate(['allproducts'])
  }
}
