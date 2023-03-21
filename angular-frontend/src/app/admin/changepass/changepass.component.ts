import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Admin } from 'src/app/Model/admin.model';
import { AdminService } from 'src/app/Services/admin.service';

@Component({
  selector: 'app-changepass',
  templateUrl: './changepass.component.html',
  styleUrls: ['./changepass.component.css']
})
export class ChangepassComponent {

  admin:Admin = new Admin();
  constructor(private service:AdminService,private router:Router){}

  onSubmit(){
    this.service.changePass(this.admin).subscribe(resp=>{
      this.router.navigate(['adminhome']);
    }, error=>console.log(error));
    
    
    
  }
}
