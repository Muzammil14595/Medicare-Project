import { Component } from '@angular/core';
import { Product } from 'src/app/Model/product.model';
import { ProductService } from 'src/app/Services/product.service';

@Component({
  selector: 'app-custhome',
  templateUrl: './custhome.component.html',
  styleUrls: ['./custhome.component.css']
})
export class CusthomeComponent {

  term:any;
  products:Product[];
  constructor(private service:ProductService){}

  ngOnInit(){
    this.service.getAllProd().subscribe(ob=>this.products=ob);
  }

}
