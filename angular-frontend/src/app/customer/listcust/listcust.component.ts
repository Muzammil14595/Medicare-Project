import { Component } from '@angular/core';
import { Customer } from 'src/app/Model/customer.model';
import { CustomerService } from 'src/app/Services/customer.service';

@Component({
  selector: 'app-listcust',
  templateUrl: './listcust.component.html',
  styleUrls: ['./listcust.component.css']
})
export class ListcustComponent {

  customers:Customer[];
  constructor(private service:CustomerService){}

  ngOnInit(){
    this.service.getAllCustomers().subscribe(ob=>this.customers=ob)
  }
}
