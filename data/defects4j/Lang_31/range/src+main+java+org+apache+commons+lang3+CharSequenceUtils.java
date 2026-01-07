{
  "filepath": "/tmp/Lang-31b/src/main/java/org/apache/commons/lang3/CharSequenceUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharSequenceUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 24,
      "end_line": 81,
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
      "signature": "org.apache.commons.lang3.CharSequenceUtils.reverse(java.lang.CharSequence)",
      "begin_line": 54,
      "end_line": 59,
      "comment": "\r\n     * \u003cp\u003eReverses a CharSequence as per {@link StringBuilder#reverse()}.\u003c/p\u003e\r\n     *\r\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e CharSequence returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\r\n     *\r\n     * \u003cpre\u003e\r\n     * CharSequenceUtils.reverse(null) \u003d null\r\n     * CharSequenceUtils.reverse(\"\").toString() \u003d \"\"\r\n     * CharSequenceUtils.reverse(\"bat\").toString() \u003d \"tab\"\r\n     * \u003c/pre\u003e\r\n     *\r\n     * @param str  the String to reverse, may be null\r\n     * @return the reversed String, \u003ccode\u003enull\u003c/code\u003e if null String input\r\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 57,col 9)",
        "(line 58,col 9)-(line 58,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSequenceUtils.subSequence(java.lang.CharSequence, int)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\r\n\t * Returns a new \u003ccode\u003eCharSequence\u003c/code\u003e that is a subsequence of this\r\n\t * sequence starting with the \u003ccode\u003echar\u003c/code\u003e value at the specified\r\n\t * index. The length (in \u003ccode\u003echar\u003c/code\u003es) of the returned sequence is\r\n\t * \u003ccode\u003elength() - start\u003c/code\u003e, so if \u003ccode\u003estart \u003d\u003d end\u003c/code\u003e then an\r\n\t * empty sequence is returned. \u003c/p\u003e\r\n\t * \r\n\t * @param start\r\n\t *            the start index, inclusive\r\n\t * \r\n\t * @return the specified subsequence\r\n\t * \r\n\t * @throws IndexOutOfBoundsException\r\n\t *             if \u003ccode\u003estart\u003c/code\u003e is negative or if \u003ccode\u003estart\u003c/code\u003e is\r\n\t *             greater than \u003ccode\u003elength()\u003c/code\u003e\r\n\t * @since 3.0\r\n\t ",
      "child_ranges": [
        "(line 79,col 3)-(line 79,col 64)"
      ]
    }
  ]
}