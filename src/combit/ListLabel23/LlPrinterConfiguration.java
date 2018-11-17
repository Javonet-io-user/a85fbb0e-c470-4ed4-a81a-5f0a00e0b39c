package combit.ListLabel23; public enum LlPrinterConfiguration{Save(1L),Restore(2L),; private long numVal;LlPrinterConfiguration(long numVal) {
		        this.numVal = numVal;
		    }
		
		    public long getNumVal() {
		        return numVal;
		    }
            }