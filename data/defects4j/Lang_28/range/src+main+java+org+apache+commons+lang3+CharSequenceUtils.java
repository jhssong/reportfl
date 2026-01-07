{
  "filepath": "/tmp/Lang-28b/src/main/java/org/apache/commons/lang3/CharSequenceUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharSequenceUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 24,
      "end_line": 61,
      "comment": "\r\n * Null-safe CharSequence utility methods.\r\n *\r\n * @author Gary Gregory\r\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSequenceUtils.length(java.lang.CharSequence)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "\r\n     * Gets a CharSequence length or \u003ccode\u003e0\u003c/code\u003e if the CharSequence is\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param cs\r\n     *            a CharSequence or \u003ccode\u003enull\u003c/code\u003e\r\n     * @return CharSequence length or \u003ccode\u003e0\u003c/code\u003e if the CharSequence is\r\n     *         \u003ccode\u003enull\u003c/code\u003e.\r\n     * @since 3.0\r\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSequenceUtils.subSequence(java.lang.CharSequence, int)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\r\n     * Returns a new \u003ccode\u003eCharSequence\u003c/code\u003e that is a subsequence of this\r\n     * sequence starting with the \u003ccode\u003echar\u003c/code\u003e value at the specified\r\n     * index. The length (in \u003ccode\u003echar\u003c/code\u003es) of the returned sequence is\r\n     * \u003ccode\u003elength() - start\u003c/code\u003e, so if \u003ccode\u003estart \u003d\u003d end\u003c/code\u003e then an\r\n     * empty sequence is returned. \u003c/p\u003e\r\n     *\r\n     * @param cs\r\n     *            the specified subsequence, may be null\r\n     * @param start\r\n     *            the start index, inclusive\r\n     * @return a new subsequence or null\r\n     *\r\n     * @throws IndexOutOfBoundsException\r\n     *             if \u003ccode\u003estart\u003c/code\u003e is negative or if \u003ccode\u003estart\u003c/code\u003e is\r\n     *             greater than \u003ccode\u003elength()\u003c/code\u003e\r\n     * @since 3.0\r\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 70)"
      ]
    }
  ]
}