package combit.ListLabel23.Dom; public enum LlDomAccessMode{ReadOnly(0L),ReadWrite(1073741824L),; private long numVal;LlDomAccessMode(long numVal) {
		        this.numVal = numVal;
		    }
		
		    public long getNumVal() {
		        return numVal;
		    }
            }