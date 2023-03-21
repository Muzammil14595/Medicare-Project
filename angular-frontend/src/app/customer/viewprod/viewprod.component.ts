import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Product } from 'src/app/Model/product.model';
import { ProductService } from 'src/app/Services/product.service';

@Component({
  selector: 'app-viewprod',
  templateUrl: './viewprod.component.html',
  styleUrls: ['./viewprod.component.css']
})
export class ViewprodComponent {

  myimage="./assets/images/medicine1.jpg"
  prod:Product;
  constructor(private service:ProductService, private actRoute:ActivatedRoute){}

  ngOnInit(){
    const id = this.actRoute.snapshot.paramMap.get("id");
    this.service.getById(Number(id)).subscribe(x=>this.prod=x)
  }
}
