import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddcategoryComponent } from './admin/addcategory/addcategory.component';
import { AddproductComponent } from './admin/addproduct/addproduct.component';
import { AdminhomeComponent } from './admin/adminhome/adminhome.component';
import { AdminloginComponent } from './admin/adminlogin/adminlogin.component';
import { AllcategoriesComponent } from './admin/allcategories/allcategories.component';
import { AllproductsComponent } from './admin/allproducts/allproducts.component';
import { ChangepassComponent } from './admin/changepass/changepass.component';
import { DelcatComponent } from './admin/delcat/delcat.component';
import { DelprodComponent } from './admin/delprod/delprod.component';
import { ProductdetailsComponent } from './admin/productdetails/productdetails.component';
import { UpdprodComponent } from './admin/updprod/updprod.component';
import { AddcustComponent } from './customer/addcust/addcust.component';
import { AddtocartComponent } from './customer/addtocart/addtocart.component';
import { BuyproductComponent } from './customer/buyproduct/buyproduct.component';
import { CustdetailsComponent } from './customer/custdetails/custdetails.component';
import { CusthomeComponent } from './customer/custhome/custhome.component';
import { CustloginComponent } from './customer/custlogin/custlogin.component';
import { HomepageComponent } from './customer/homepage/homepage.component';
import { ListcustComponent } from './customer/listcust/listcust.component';
import { ViewprodComponent } from './customer/viewprod/viewprod.component';

const routes: Routes = [
  {path:"custlist",component:ListcustComponent},
  {path:"addcust",component:AddcustComponent},
  {path:"details/:id",component:CustdetailsComponent},
  {path:"login",component:CustloginComponent},
  {path:"adminlogin", component:AdminloginComponent},
  {path:"adminhome",component:AdminhomeComponent},
  {path:"allproducts",component:AllproductsComponent},
  {path:"productdetails/:id",component:ProductdetailsComponent},
  {path:"updprod/:id",component:UpdprodComponent},
  {path:"delprod/:id",component:DelprodComponent},
  {path:"addproduct",component:AddproductComponent},
  {path:"addcategory",component:AddcategoryComponent},
  {path:"allcategories",component:AllcategoriesComponent},
  {path:"custhome",component:CusthomeComponent},
  {path:"viewprod/:id",component:ViewprodComponent},
  {path:"addtocart/:id",component:AddtocartComponent},
  {path:"buyproduct/:id",component:BuyproductComponent},
  {path:"changepass",component:ChangepassComponent},
  {path:"homepage",component:HomepageComponent},
  {path:"delcat/:id",component:DelcatComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
