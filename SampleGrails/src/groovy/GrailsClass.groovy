class GrailsClass {
	SampleGroovyClass sample1
	SampleJavaClass sample2
	def showDependencyClasses() {
		sample1 = new SampleGroovyClass()
		sample2 = new SampleJavaClass() 
		sample1.memberAttributeInGroovy = "Hello"
		sample2.memberAttributeInJava = "world"		
		
		return  "${sample1.memberAttributeInGroovy} ${sample2.memberAttributeInJava}"
	}
	
	def  showDependencyAutoReload() {
		sample1 = new SampleGroovyClass()
		sample2 = new SampleJavaClass()
					
		return "This is an autoreload value from Java: ${sample2.showSampleValue()}" + 
				"<br /> And this an autoreload int value with a math operation (the value multiplied by itself) from " +
				" groovy: ${sample1.showGroovyValue() * sample1.showGroovyValue()}"
	}
	
	
}
