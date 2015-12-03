package com.csxh.eshop.test;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.junit.Assert;
import org.junit.Test;

import com.csxh.eshop.model.Cart;
import com.csxh.eshop.model.CartItem;
import com.csxh.eshop.model.Nextorderid;
import com.csxh.eshop.model.Order;
import com.csxh.eshop.model.Orderdetails;
import com.csxh.eshop.util.MysqlUtil;
import com.csxh.eshop.util.ServletSessionUtil;

public class MysqlUtilTest {

	@Test
	public void test() {
		int totalRows = MysqlUtil.queryTotalRows("product", "id","hotDeal=true");
		System.out.println(totalRows);
		boolean b = totalRows>0;
		Assert.assertTrue(b);
	}

}
