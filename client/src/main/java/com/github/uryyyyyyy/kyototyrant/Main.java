package com.github.uryyyyyyy.kyototyrant;

import kt4j.binary.KyotoTycoonBinaryClient;

public class Main {

	public static void main(String[] args){
		KyotoTycoonBinaryClient client = new KyotoTycoonBinaryClient("kyoto_tycoon_host", 1978);
		client.start();

		client.set("KEY", "VALUE");
		String v = client.get("KEY");
		System.out.println(v);  // => "VALUE"

		client.stop();
	}
}
