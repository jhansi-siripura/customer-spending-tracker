import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddExpenseComponent } from './add-expense/add-expense.component';
import { ViewExpenseComponent } from './view-expense/view-expense.component';



@NgModule({
  declarations: [
    AddExpenseComponent,
    ViewExpenseComponent
  ],
  imports: [
    CommonModule
  ]
})
export class ExpensesModule { }
