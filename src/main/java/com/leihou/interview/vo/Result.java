package com.leihou.interview.vo;

public class Result {
	    //返回状态
	    private int code;
	    //返回描述
	    private String msg;
	    //返回信息
	    private Object obj;

	    public Result(int code, String msg, Object obj) {
	        this.code = code;
	        this.msg = msg;
	        this.obj = obj;
	    }

	    public Result(int code) {
			super();
			this.code = code;
		}

		public Result(int code, String msg) {
			super();
			this.code = code;
			this.msg = msg;
		}

		public Result(Object obj) {
			super();
			this.obj = obj;
		}

		public static Result build(int code, String msg) {
			return new Result(code,msg);
		}
		public static Result ok() {
			return new Result(200);
		}
		public static Result okObj(Object obj) {
			return new Result(obj);
		}
		
		public int getCode() {
	        return code;
	    }

	    public void setCode(int code) {
	        this.code = code;
	    }

	    public String getMsg() {
	        return msg;
	    }

	    public void setMsg(String msg) {
	        this.msg = msg;
	    }

	    public Object getObj() {
	        return obj;
	    }

	    public void setObj(Object obj) {
	        this.obj = obj;
	    }
}
