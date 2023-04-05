package com.Tns.orderservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public abstract class Order
{
	
	    private Integer od_id;
	    private String od_name;
	    private String od_location;
	    private String od_purchaseday;
	    private Integer od_item;
	    private String od_mallname;
	    private String od_phn;
		public Order() 
		{
			super();
			// TODO Auto-generated constructor stub
		}
		public Order(Integer od_id, String od_name, String od_location, String od_purchaseday, Integer od_item,
				String od_mallname, String od_phn) {
			super();
			this.od_id = od_id;
			this.od_name = od_name;
			this.od_location = od_location;
			this.od_purchaseday = od_purchaseday;
			this.od_item = od_item;
			this.od_mallname = od_mallname;
			this.od_phn = od_phn;
		}
		@Id
		@GeneratedValue (strategy=GenerationType.IDENTITY)
		public Integer getOd_id() {
			return od_id;
		}
		public void setOd_id(Integer od_id) {
			this.od_id = od_id;
		}
		public String getOd_name() {
			return od_name;
		}
		public void setOd_name(String od_name) {
			this.od_name = od_name;
		}
		public String getOd_location() {
			return od_location;
		}
		public void setOd_location(String od_location) {
			this.od_location = od_location;
		}
		public String getOd_purchaseday() {
			return od_purchaseday;
		}
		public void setOd_purchaseday(String od_purchaseday) {
			this.od_purchaseday = od_purchaseday;
		}
		public Integer getOd_item() {
			return od_item;
		}
		public void setOd_item(Integer od_item) {
			this.od_item = od_item;
		}
		public String getOd_mallname() {
			return od_mallname;
		}
		public void setOd_mallname(String od_mallname) {
			this.od_mallname = od_mallname;
		}
		public String getOd_phn() {
			return od_phn;
		}
		public void setOd_phn(String od_phn) {
			this.od_phn = od_phn;
		}
		@Override
		public String toString() {
			return "Order [od_id=" + od_id + ", od_name=" + od_name + ", od_location=" + od_location
					+ ", od_purchaseday=" + od_purchaseday + ", od_item=" + od_item + ", od_mallname=" + od_mallname
					+ ", od_phn=" + od_phn + "]";
		}
		
}

