package com.bean;

import java.util.Date;



public class CustomerPojo
{
	private int ssnId,custAge;
	private long custId;

	private String custName, custAddress, status,state,city,message,password;
	private Date lastUpdated;

	public int getSsnId() 
	{
		return ssnId;
	}

	public void setSsnId(int ssnId) 
	{
		this.ssnId = ssnId;
	}

	public int getCustAge() 
	{
		return custAge;
	}

	public void setCustAge(int custAge)
	{
		this.custAge = custAge;
	}

	public long getCustId() 
	{
		return custId;
	}

	public void setCustId(long custId)
	{
		this.custId = custId;
	}

	public String getCustName()
	{
		return custName;
	}

	public void setCustName(String custName)
	{
		this.custName = custName;
	}

	public String getCustAddress()
	{
		return custAddress;
	}

	public void setCustAddress(String custAddress) 
	{
		this.custAddress = custAddress;
	}

	public String getStatus() 
	{
		return status;
	}

	public void setStatus(String status) 
	{
		this.status = status;
	}

	public String getState() 
	{
		return state;
	}

	public void setState(String state) 
	{
		this.state = state;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city) 
	{
		this.city = city;
	}

	public String getMessage() 
	{
		return message;
	}

	public void setMessage(String message) 
	{
		this.message = message;
	}

	

	public Date getLastUpdated()
	{
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) 
	{
		this.lastUpdated = lastUpdated;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}
	


}
