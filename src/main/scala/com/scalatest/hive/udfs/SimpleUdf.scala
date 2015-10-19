package com.scalatest.hive.udfs

import org.apache.hadoop.hive.ql.exec.UDF

class SimpleUDF extends UDF {
  def evaluate(str: String): Int = {
    return str.length();
  }
}
