import { Customer } from "./customer.model";
import { Product } from "./product.model";

export class Cart{
    id:number;
    quantity:number;
    totalCost:number;
    product:Product;
    customer:Customer;
}