{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/CharSetUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharSetUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 218,
      "comment": "\n * \u003cp\u003eOperations on {@code CharSet} instances.\u003c/p\u003e\n *\n * \u003cp\u003eThis class handles {@code null} input gracefully.\n * An exception will not be thrown for a {@code null} input.\n * Each method documents its behaviour in more detail.\u003c/p\u003e\n * \n * \u003cp\u003e#ThreadSafe#\u003c/p\u003e\n * @see CharSet\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.CharSetUtils.CharSetUtils()",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * \u003cp\u003eCharSetUtils instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as {@code CharSetUtils.evaluateSet(null);}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 41,col 7)-(line 41,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSetUtils.squeeze(java.lang.String, java.lang.String...)",
      "begin_line": 64,
      "end_line": 85,
      "comment": "\n     * \u003cp\u003eSqueezes any repetitions of a character that is mentioned in the\n     * supplied set.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * CharSetUtils.squeeze(null, *)        \u003d null\n     * CharSetUtils.squeeze(\"\", *)          \u003d \"\"\n     * CharSetUtils.squeeze(*, null)        \u003d *\n     * CharSetUtils.squeeze(*, \"\")          \u003d *\n     * CharSetUtils.squeeze(\"hello\", \"k-p\") \u003d \"helo\"\n     * CharSetUtils.squeeze(\"hello\", \"a-e\") \u003d \"hello\"\n     * \u003c/pre\u003e\n     *\n     * @see CharSet#getInstance(java.lang.String...) for set-syntax.\n     * @param str  the string to squeeze, may be null\n     * @param set  the character set to use for manipulation, may be null\n     * @return the modified String, {@code null} if null string input\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 68,col 49)",
        "(line 69,col 9)-(line 69,col 63)",
        "(line 70,col 9)-(line 70,col 40)",
        "(line 71,col 9)-(line 71,col 29)",
        "(line 72,col 9)-(line 72,col 28)",
        "(line 73,col 9)-(line 73,col 22)",
        "(line 74,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSetUtils.count(java.lang.String, java.lang.String...)",
      "begin_line": 107,
      "end_line": 119,
      "comment": "\n     * \u003cp\u003eTakes an argument in set-syntax, see evaluateSet,\n     * and returns the number of characters present in the specified string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * CharSetUtils.count(null, *)        \u003d 0\n     * CharSetUtils.count(\"\", *)          \u003d 0\n     * CharSetUtils.count(*, null)        \u003d 0\n     * CharSetUtils.count(*, \"\")          \u003d 0\n     * CharSetUtils.count(\"hello\", \"k-p\") \u003d 3\n     * CharSetUtils.count(\"hello\", \"a-e\") \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @see CharSet#getInstance(java.lang.String...) for set-syntax.\n     * @param str  String to count characters in, may be null\n     * @param set  String[] set of characters to count, may be null\n     * @return the character count, zero if null string input\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 49)",
        "(line 112,col 9)-(line 112,col 22)",
        "(line 113,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSetUtils.keep(java.lang.String, java.lang.String...)",
      "begin_line": 142,
      "end_line": 150,
      "comment": "\n     * \u003cp\u003eTakes an argument in set-syntax, see evaluateSet,\n     * and keeps any of characters present in the specified string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * CharSetUtils.keep(null, *)        \u003d null\n     * CharSetUtils.keep(\"\", *)          \u003d \"\"\n     * CharSetUtils.keep(*, null)        \u003d \"\"\n     * CharSetUtils.keep(*, \"\")          \u003d \"\"\n     * CharSetUtils.keep(\"hello\", \"hl\")  \u003d \"hll\"\n     * CharSetUtils.keep(\"hello\", \"le\")  \u003d \"ell\"\n     * \u003c/pre\u003e\n     *\n     * @see CharSet#getInstance(java.lang.String...) for set-syntax.\n     * @param str  String to keep characters from, may be null\n     * @param set  String[] set of characters to keep, may be null\n     * @return the modified String, {@code null} if null string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSetUtils.delete(java.lang.String, java.lang.String...)",
      "begin_line": 172,
      "end_line": 177,
      "comment": "\n     * \u003cp\u003eTakes an argument in set-syntax, see evaluateSet,\n     * and deletes any of characters present in the specified string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * CharSetUtils.delete(null, *)        \u003d null\n     * CharSetUtils.delete(\"\", *)          \u003d \"\"\n     * CharSetUtils.delete(*, null)        \u003d *\n     * CharSetUtils.delete(*, \"\")          \u003d *\n     * CharSetUtils.delete(\"hello\", \"hl\")  \u003d \"eo\"\n     * CharSetUtils.delete(\"hello\", \"le\")  \u003d \"ho\"\n     * \u003c/pre\u003e\n     *\n     * @see CharSet#getInstance(java.lang.String...) for set-syntax.\n     * @param str  String to delete characters from, may be null\n     * @param set  String[] set of characters to delete, may be null\n     * @return the modified String, {@code null} if null string input\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSetUtils.modify(java.lang.String, java.lang.String[], boolean)",
      "begin_line": 188,
      "end_line": 199,
      "comment": "\n     * Implementation of delete and keep\n     *\n     * @param str String to modify characters within\n     * @param set String[] set of characters to modify\n     * @param expect whether to evaluate on match, or non-match\n     * @return the modified String, not null\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 49)",
        "(line 190,col 9)-(line 190,col 63)",
        "(line 191,col 9)-(line 191,col 40)",
        "(line 192,col 9)-(line 192,col 29)",
        "(line 193,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSetUtils.deepEmpty(java.lang.String[])",
      "begin_line": 208,
      "end_line": 217,
      "comment": " \n     * Determines whether or not all the Strings in an array are \n     * empty or not.\n     *\n     * @param strings String[] whose elements are being checked for emptiness\n     * @return whether or not the String is empty\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 20)"
      ]
    }
  ]
}