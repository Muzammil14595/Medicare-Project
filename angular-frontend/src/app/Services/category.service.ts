import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Category } from '../Model/category.model';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {

  baseUrl:string = "http://localhost:8081/api/category"
  constructor(private http:HttpClient) { }

  addcategory(category:Category){
    return this.http.post(this.baseUrl, category);
  }

  getAllcategories(): Observable<Category[]>{
    return this.http.get<Category[]>(this.baseUrl);
  }

  delCategory(id:number){
    return this.http.delete(this.baseUrl+"/"+id);
  }
}
