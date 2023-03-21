import { Component } from '@angular/core';
import { ActivatedRoute, Route, Router } from '@angular/router';
import { Product } from 'src/app/Model/product.model';
import { ProductService } from 'src/app/Services/product.service';

@Component({
  selector: 'app-delprod',
  templateUrl: './delprod.component.html',
  styleUrls: ['./delprod.component.css']
})
export class DelprodComponent {

  product:Product;
  constructor(private service:ProductService,private actRoute:ActivatedRoute, private router:Router){}

  ngOnInit(){
    const id= this.actRoute.snapshot.paramMap.get("id");
    this.service.delProd(Number(id)).subscribe(resp=>{
      this.router.navigate(['allproducts']);
    }, error=>console.log(error));
    alert("Item deleted");
  }
}

