import { Component } from '@angular/core';
import { Category } from 'src/app/Model/category.model';
import { CategoryService } from 'src/app/Services/category.service';

@Component({
  selector: 'app-allcategories',
  templateUrl: './allcategories.component.html',
  styleUrls: ['./allcategories.component.css']
})
export class AllcategoriesComponent {

  categories:Category[];
  constructor(private service:CategoryService){}

  ngOnInit(){
    this.service.getAllcategories().subscribe(ob=>this.categories=ob)
  }
}
