package kr.PintoK.beer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Beer {
	
	private int beer_seq;
	private String beer_name;
	private String beer_abv;
	private int from_seq;
	private int aroma_seq;
	private String country_cd;
	private int taste_seq;
	private String beer_src;
	private int taste_seq02;
	private int taste_seq03;


}
