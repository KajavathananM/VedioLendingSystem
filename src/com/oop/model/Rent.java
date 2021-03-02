package com.oop.model;

public class Rent {


		private String rentCustomerId;
		private String rentId;
		private String rentDvdCode;
		private String rentDate;
		private String deadLine;

		/*@return the rentCodeId*/
		public String getRentCustomerId() {
			return rentCustomerId;
		}

		/*@param rentCodeI the rentCodeId to set */
		public void setRentCustomerId(String rentCustomerId) {
			this.rentCustomerId = rentCustomerId;
		}

		/*@return the rentDvdId*/
		public String getRentId() {
			return rentId;
		}

		/* @param rentDvdId the rentDvdId to set*/
		public void setRentId(String rentId) {
			this.rentId = rentId;
		}

		/* @return the rentDvdCode*/
		public String getRentDvdCode() {
			return rentDvdCode;
		}

		/*@param rentDvdCode the rentDvdCode to set*/
		public void setRentDvdCode(String rentDvdCode) {
			this.rentDvdCode = rentDvdCode;
		}

		/* @return the rentDate*/
		public String getRentDate() {
			return rentDate;
		}

		/* @param rentDate the rentDate to set*/
		public void setRentDate(String string) {
			this.rentDate = string;
		}

		/*@return the deadLine*/
		public String getRentDeadLine() {
			return deadLine;
		}

		/* @param deadLine the deadLine to set*/
		public void setRentDeadLine(String string) {
			this.deadLine = string;
		}

}

