package rubem.com.cd2tecsigabem.controller.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class StandardError  {

        private Instant timestamp;
        private Integer status;
        private String error;
        private String message;
        private String path;
		public Instant getTimestamp() {
			return timestamp;
		}
		public void setTimestamp(Instant timestamp) {
			this.timestamp = timestamp;
		}
		public Integer getStatus() {
			return status;
		}
		public void setStatus(Integer status) {
			this.status = status;
		}
		public String getError() {
			return error;
		}
		public void setError(String error) {
			this.error = error;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public String getPath() {
			return path;
		}
		public void setPath(String path) {
			this.path = path;
		}
        
        
    }


