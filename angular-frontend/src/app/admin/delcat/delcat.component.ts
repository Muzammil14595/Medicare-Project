import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Category } from 'src/app/Model/category.model';
import { CategoryService } from 'src/app/Services/category.service';

@Component({
  selector: 'app-delcat',
  templateUrl: './delcat.component.html',
  styleUrls: ['./delcat.component.css']
})
export class DelcatComponent {

  category:Category;
  constructor(private service:CategoryService,private actRoute:ActivatedRoute, private router:Router){}

  ngOnInit(){
    const id= this.actRoute.snapshot.paramMap.get("id");
    this.service.delCategory(Number(id)).subscribe(resp=>{
      this.router.navigate(['allcategories']);
    }, error=>console.log(error));
    alert("Item deleted");
  }
}
