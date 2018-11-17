package combit.ListLabel23.DesignerExtensions; public enum BoolDesignerPropertyType{YesNo(0L),TrueFalse(1L),; private long numVal;BoolDesignerPropertyType(long numVal) {
		        this.numVal = numVal;
		    }
		
		    public long getNumVal() {
		        return numVal;
		    }
            }