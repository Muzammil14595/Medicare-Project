import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Customer } from 'src/app/Model/customer.model';
import { CustomerService } from 'src/app/Services/customer.service';

@Component({
  selector: 'app-custlogin',
  templateUrl: './custlogin.component.html',
  styleUrls: ['./custlogin.component.css']
})
export class CustloginComponent {

  customer:Customer= new Customer();

  constructor(private service:CustomerService,private router:Router){}

  onSubmit(){
    this.service.login(this.customer).subscribe(resp=>{
      this.router.navigate(['custhome']);
    }, error=>(console.log(error), alert("Customer Not Found")));
  }
}
