import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AuthModule } from './auth/auth.module';
import { ExpensesModule } from './expenses/expenses.module';
import { DashboardModule } from './dashboard/dashboard.module';

import { HTTP_INTERCEPTORS } from '@angular/common/http';
import { JwtInterceptor } from './core/interceptors/jwt.service';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { LoginComponent } from './auth/login/login.component';
import { HttpClientModule } from '@angular/common/http'; // ✅ ADD THIS

@NgModule({
  declarations: [
    AppComponent,
    // DO NOT declare LoginComponent here again if it's already declared in AuthModule
  ],
  imports: [
    BrowserModule,
    //FormsModule, // Add FormsModule for [(ngModel)]
    ReactiveFormsModule, // 👈 Add this
    HttpClientModule,
    AuthModule, // ✅ Contains LoginComponent
    AppRoutingModule,
    ExpensesModule,
    DashboardModule,
  ],
  providers: [
    { provide: HTTP_INTERCEPTORS, useClass: JwtInterceptor, multi: true },
  ],
  bootstrap: [AppComponent],
})
export class AppModule {}
