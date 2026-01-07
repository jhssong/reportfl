{
  "filepath": "/tmp/Lang-30b/src/main/java/org/apache/commons/lang3/CharSequenceUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharSequenceUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 24,
      "end_line": 61,
      "comment": "\r\n * Null-safe CharSequence utility methods.\r\n * \r\n * @author Gary Gregory\r\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSequenceUtils.length(java.lang.CharSequence)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "\r\n\t * Gets a CharSequence length or \u003ccode\u003e0\u003c/code\u003e if the CharSequence is\r\n\t * \u003ccode\u003enull\u003c/code\u003e.\r\n\t * \r\n\t * @param cs\r\n\t *            a CharSequence or \u003ccode\u003enull\u003c/code\u003e\r\n\t * @return CharSequence length or \u003ccode\u003e0\u003c/code\u003e if the CharSequence is\r\n\t *         \u003ccode\u003enull\u003c/code\u003e.\r\n\t * @since 3.0\r\n\t ",
      "child_ranges": [
        "(line 37,col 3)-(line 37,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSequenceUtils.subSequence(java.lang.CharSequence, int)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\r\n\t * Returns a new \u003ccode\u003eCharSequence\u003c/code\u003e that is a subsequence of this\r\n\t * sequence starting with the \u003ccode\u003echar\u003c/code\u003e value at the specified\r\n\t * index. The length (in \u003ccode\u003echar\u003c/code\u003es) of the returned sequence is\r\n\t * \u003ccode\u003elength() - start\u003c/code\u003e, so if \u003ccode\u003estart \u003d\u003d end\u003c/code\u003e then an\r\n\t * empty sequence is returned. \u003c/p\u003e\r\n\t * \r\n\t * @param cs\r\n\t *            the specified subsequence, may be null\r\n\t * @param start\r\n\t *            the start index, inclusive\r\n\t * @return a new subsequence or null\r\n\t * \r\n\t * @throws IndexOutOfBoundsException\r\n\t *             if \u003ccode\u003estart\u003c/code\u003e is negative or if \u003ccode\u003estart\u003c/code\u003e is\r\n\t *             greater than \u003ccode\u003elength()\u003c/code\u003e\r\n\t * @since 3.0\r\n\t ",
      "child_ranges": [
        "(line 59,col 3)-(line 59,col 64)"
      ]
    }
  ]
}