package class1;

public class phone {

		private int ram;
		private String proc;
		public void setproc(String proc) {
			String valid = proc.toLowerCase();
			if(valid.equals("nord")) {
				this.proc = proc;
					
			}else {
				this.proc="unknown";
			}
			
			
		}
		public String getproc() {
			return this.proc;
		}

}

