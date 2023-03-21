import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Category } from 'src/app/Model/category.model';
import { CategoryService } from 'src/app/Services/category.service';

@Component({
  selector: 'app-addcategory',
  templateUrl: './addcategory.component.html',
  styleUrls: ['./addcategory.component.css']
})
export class AddcategoryComponent {

  category:Category = new Category();
  constructor(private service:CategoryService, private router:Router){}

  onSubmit(){
    this.service.addcategory(this.category).subscribe(x=>console.log(x));
    alert("Category added successfuly")
    this.router.navigate(['adminhome'])
  }
}
