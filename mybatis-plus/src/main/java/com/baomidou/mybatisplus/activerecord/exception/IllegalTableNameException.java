package com.baomidou.mybatisplus.activerecord.exception;

/**
 * 表不存在。
 * 
 * @since 1.0
 * @author redraiment
 */
public class IllegalTableNameException extends RuntimeException {
  public IllegalTableNameException(String tableName, Throwable e) {
    super(String.format("illegal table %s", tableName), e);
  }
  public IllegalTableNameException(String tableName) {
    super(String.format("illegal table %s", tableName));
  }
}