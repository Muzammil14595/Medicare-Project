import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Product } from 'src/app/Model/product.model';
import { ProductService } from 'src/app/Services/product.service';

@Component({
  selector: 'app-buyproduct',
  templateUrl: './buyproduct.component.html',
  styleUrls: ['./buyproduct.component.css']
})
export class BuyproductComponent {

  prod:Product;
  constructor(private service:ProductService, private actRoute:ActivatedRoute){}

  ngOnInit(){
    const id = this.actRoute.snapshot.paramMap.get("id");
    this.service.getById(Number(id)).subscribe(x=>this.prod=x)
  }
}
