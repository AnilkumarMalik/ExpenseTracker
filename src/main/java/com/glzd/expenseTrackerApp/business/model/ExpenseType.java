package com.glzd.expenseTrackerApp.business.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseType {

	@Id
	@GeneratedValue
	private Long id;

	@Column(unique = true)
	private String expenseCategory;

	public ExpenseType() {

	}

	public ExpenseType( String expenseCategory) {

	}

	public String getExpenseCategory() {
		return expenseCategory;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setExpenseCategory(String expenseCategory) {
		this.expenseCategory = expenseCategory;
	}

}
