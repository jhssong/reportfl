{
  "filepath": "/tmp/Lang-22b/src/main/java/org/apache/commons/lang3/CharSequenceUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharSequenceUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 48,
      "comment": "\n * Null-safe CharSequence utility methods.\n *\n * @author Gary Gregory\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSequenceUtils.subSequence(java.lang.CharSequence, int)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Returns a new \u003ccode\u003eCharSequence\u003c/code\u003e that is a subsequence of this\n     * sequence starting with the \u003ccode\u003echar\u003c/code\u003e value at the specified\n     * index. The length (in \u003ccode\u003echar\u003c/code\u003es) of the returned sequence is\n     * \u003ccode\u003elength() - start\u003c/code\u003e, so if \u003ccode\u003estart \u003d\u003d end\u003c/code\u003e then an\n     * empty sequence is returned. \u003c/p\u003e\n     *\n     * @param cs\n     *            the specified subsequence, may be null\n     * @param start\n     *            the start index, inclusive\n     * @return a new subsequence or null\n     *\n     * @throws IndexOutOfBoundsException\n     *             if \u003ccode\u003estart\u003c/code\u003e is negative or if \u003ccode\u003estart\u003c/code\u003e is\n     *             greater than \u003ccode\u003elength()\u003c/code\u003e\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 70)"
      ]
    }
  ]
}