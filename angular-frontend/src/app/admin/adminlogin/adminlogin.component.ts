import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Admin } from 'src/app/Model/admin.model';
import { AdminService } from 'src/app/Services/admin.service';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent {

  admin:Admin = new Admin();
  constructor(private service:AdminService, private router:Router){}

  onSubmit(){
    this.service.adminLogin(this.admin).subscribe(
      resp=>{
      this.router.navigate(['adminhome']);
    }, 
    error=>(console.log(error), alert("Admin Not Found")))
  }
}
