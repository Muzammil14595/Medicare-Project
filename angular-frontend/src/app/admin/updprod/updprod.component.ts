import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Product } from 'src/app/Model/product.model';
import { Productdto } from 'src/app/Model/productdto.model';
import { ProductService } from 'src/app/Services/product.service';

@Component({
  selector: 'app-updprod',
  templateUrl: './updprod.component.html',
  styleUrls: ['./updprod.component.css']
})
export class UpdprodComponent {
product:Product = new Product();
productdto:Productdto = new Productdto();



constructor(private service:ProductService, private actRoute:ActivatedRoute, private router:Router){}

ngOnInit(){

}

onSubmit(){
  const id = this.actRoute.snapshot.paramMap.get("id");
  this.service.updProd(Number(id),this.productdto).subscribe(x=>console.log(x)); 
  this.router.navigate(['allproducts']);
}



}
