package com.nt.bean;

import lombok.Data;

@Data  //we get setter,getter,toString,Hashcode,Equals and RequiredArgConstructor
public class Employee 
{
	public Integer eno;
	public String ename;
	public String job;
	public Double salary;
	public Integer deptno;
}
