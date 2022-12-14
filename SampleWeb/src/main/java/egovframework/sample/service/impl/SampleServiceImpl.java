package egovframework.sample.service.impl;

public class SampleServiceImpl {
	private String name;
	
	public SampleServiceImpl() throws Exception {
		System.out.println("===> SampleServiceImpl 생성");
	}
	
	public void initMethod() {
		System.out.println("---> initMethod() 호출");
		name = "샘플 서비스 객체";
	}
	
	public void destroyMethod() {
		System.out.println("---> destroyMethod() 호출");
		name = null;
	}
	
	public void insertSample() throws Exception {
		System.out.println(name + "---Sample 등록");
	}
	
	public void updateSample() throws Exception {
		System.out.println("SampleService---Sample 수정");
	}
	
	public void deleteSample() throws Exception {
		System.out.println("SampleService---Sample 삭제");
	}
	
	public void selectSample() throws Exception {
		System.out.println("SampleService---Sample 상세 조회");
	}
	
	public void selectSampleList() throws Exception {
		System.out.println(name + "---Sample 목록 검색");
	}
}
