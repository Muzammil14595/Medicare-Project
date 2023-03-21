import { Component } from '@angular/core';
import { Product } from 'src/app/Model/product.model';
import { ProductService } from 'src/app/Services/product.service';

@Component({
  selector: 'app-allproducts',
  templateUrl: './allproducts.component.html',
  styleUrls: ['./allproducts.component.css']
})
export class AllproductsComponent {
  products:Product[];
  constructor(private service:ProductService){}

  ngOnInit(){
    this.service.getAllProd().subscribe(ob=>this.products=ob);
  }


}
