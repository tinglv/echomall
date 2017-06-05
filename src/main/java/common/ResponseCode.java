package common;

/**
 * Created by tlv on 6/1/2017.
 */
public enum ResponseCode {
    SUCCESS(0,"SUCCESS"),
    ERROR(1,"ERROR"),
    NEED_LOGIN(10,"NEED_LOGIN"),
    ILLEGAL_ARGUMRNT(2,"ILLEGAL_ATGUMRNT");

    public final int code;
    public final String desc;

    ResponseCode(int code , String desc){
         this.code = code;
         this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
