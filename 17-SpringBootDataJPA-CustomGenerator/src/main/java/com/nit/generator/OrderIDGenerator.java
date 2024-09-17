package com.nit.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class OrderIDGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) {
		String prefix = "OD";

		// String suffix=""; //this will not work in case of lambda exp
		StringBuffer bf = new StringBuffer();

		// final String[] str={""};

		try {

			session.doWork(connection -> {
				Statement statement = connection.createStatement();
				String sql = "select order_id_seq.nextval from dual";
				ResultSet rs = statement.executeQuery(sql);
				if (rs.next()) {
					int seqValue = rs.getInt(1);
					bf.append(String.valueOf(seqValue));
					// suffix=String.valueOf(seqValue);  //
					// str[0]=String.valueOf(seqValue);
				}

			});

		} catch (Exception e) {
			e.printStackTrace();
		}
		// return prefix+suffix;
		// return prefix+str[0];
		return prefix + bf.toString();

	}
}


/**
 * @GenericGenerator(name = "order_id_gen", strategy = "com.nit.generator.OrderIDGenerator")
 * @GeneratedValue(generator = "order_id_gen")
 * @Id
 * private String orderId;
 * */
