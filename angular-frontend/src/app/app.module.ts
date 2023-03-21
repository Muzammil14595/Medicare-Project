import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { FormsModule } from '@angular/forms';
import { ListcustComponent } from './customer/listcust/listcust.component';
import { AddcustComponent } from './customer/addcust/addcust.component';
import { CustdetailsComponent } from './customer/custdetails/custdetails.component';
import { CustloginComponent } from './customer/custlogin/custlogin.component';
import { AdminloginComponent } from './admin/adminlogin/adminlogin.component';
import { AdminhomeComponent } from './admin/adminhome/adminhome.component';
import { AllproductsComponent } from './admin/allproducts/allproducts.component';
import { ProductdetailsComponent } from './admin/productdetails/productdetails.component';
import { UpdprodComponent } from './admin/updprod/updprod.component';
import { DelprodComponent } from './admin/delprod/delprod.component';
import { AddproductComponent } from './admin/addproduct/addproduct.component';
import { AddcategoryComponent } from './admin/addcategory/addcategory.component';
import { AllcategoriesComponent } from './admin/allcategories/allcategories.component';
import { CusthomeComponent } from './customer/custhome/custhome.component';

import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { ViewprodComponent } from './customer/viewprod/viewprod.component';
import { BuyproductComponent } from './customer/buyproduct/buyproduct.component';
import { AddtocartComponent } from './customer/addtocart/addtocart.component';
import { ChangepassComponent } from './admin/changepass/changepass.component';
import { HomepageComponent } from './customer/homepage/homepage.component';
import { DelcatComponent } from './admin/delcat/delcat.component';

@NgModule({
  declarations: [
    AppComponent,
    ListcustComponent,
    AddcustComponent,
    CustdetailsComponent,
    CustloginComponent,
    AdminloginComponent,
    AdminhomeComponent,
    AllproductsComponent,
    ProductdetailsComponent,
    UpdprodComponent,
    DelprodComponent,
    AddproductComponent,
    AddcategoryComponent,
    AllcategoriesComponent,
    CusthomeComponent,
    ViewprodComponent,
    BuyproductComponent,
    AddtocartComponent,
    ChangepassComponent,
    HomepageComponent,
    DelcatComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    Ng2SearchPipeModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
