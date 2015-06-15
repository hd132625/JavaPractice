package org.dimigo.oop;

public class FamilyMember {
	private static int memberCnt;
	private String memberName;
	
	FamilyMember(String memberName){
		this.memberName = memberName;
		FamilyMember.memberCnt++;
	}
	
	public String getMemberName(){
		return this.memberName;
	}
	
	public static void printMemberCnt(){
		System.out.println("가족 총 인원 수 : "+FamilyMember.memberCnt+"명");
	}
}
