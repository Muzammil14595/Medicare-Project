import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Customer } from 'src/app/Model/customer.model';
import { CustomerService } from 'src/app/Services/customer.service';

@Component({
  selector: 'app-addcust',
  templateUrl: './addcust.component.html',
  styleUrls: ['./addcust.component.css']
})
export class AddcustComponent {

  customer:Customer= new Customer();

  constructor(private service:CustomerService,private router:Router){}

  onSubmit(){
    this.service.saveCustomer(this.customer).subscribe(x=>console.log(x));
    alert("Registeration successful!")
    this.router.navigate(['login'])
  }
}
