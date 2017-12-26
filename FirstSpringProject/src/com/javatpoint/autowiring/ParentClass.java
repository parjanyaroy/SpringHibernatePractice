package com.javatpoint.autowiring;

public class ParentClass {
	
	int parentData;
	
	ChildClass childClass;

	public int getParentData() {
		return parentData;
	}

	public void setParentData(int parentData) {
		this.parentData = parentData;
	}

	public ChildClass getChildClass() {
		return childClass;
	}

	public void setChildClass(ChildClass childClass) {
		this.childClass = childClass;
	}

	public ParentClass(int parentData, ChildClass childClass) {
		super();
		this.parentData = parentData;
		this.childClass = childClass;
	}
	
	public ParentClass()
	{
		
	}
	
	void displayInfo()
	{
		System.out.println("Parent Data "+this.parentData+" Child Data "+this.childClass.childData);
	}

}
