import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Product } from 'src/app/Model/product.model';
import { ProductService } from 'src/app/Services/product.service';

@Component({
  selector: 'app-productdetails',
  templateUrl: './productdetails.component.html',
  styleUrls: ['./productdetails.component.css']
})
export class ProductdetailsComponent {

  product:Product;
  constructor(private service:ProductService,private actRoute: ActivatedRoute){}

  ngOnInit(){
    const id = this.actRoute.snapshot.paramMap.get("id");
    this.service.getById(Number(id)).subscribe(x=>this.product=x);
  }
}
