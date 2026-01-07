{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/CharRange.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharRange",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 32,
      "end_line": 228,
      "comment": "\n * \u003cp\u003eA contiguous range of characters, optionally negated.\u003c/p\u003e\n * \n * \u003cp\u003eInstances are immutable.\u003c/p\u003e\n *\n * @author Henri Yandell\n * @author Stephen Colebourne\n * @author Chris Feldhacker\n * @author Gary Gregory\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serialization lock, Lang version 2.0. "
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The first character, inclusive, in the range. "
    },
    {
      "type": "field",
      "varNames": [
        "end"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The last character, inclusive, in the range. "
    },
    {
      "type": "field",
      "varNames": [
        "negated"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " True if the range is everything except the characters specified. "
    },
    {
      "type": "field",
      "varNames": [
        "iToString"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Cached toString. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.CharRange.CharRange(char)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eCharRange\u003c/code\u003e over a single character.\u003c/p\u003e\n     *\n     * @param ch  only character in this range\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.CharRange.CharRange(char, boolean)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eCharRange\u003c/code\u003e over a single character,\n     * optionally negating the range.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negated range includes everything except the specified char.\u003c/p\u003e\n     *\n     * @param ch  only character in this range\n     * @param negated  true to express everything except the range\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.CharRange.CharRange(char, char)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eCharRange\u003c/code\u003e over a set of characters.\u003c/p\u003e\n     *\n     * @param start  first character, inclusive, in this range\n     * @param end  last character, inclusive, in this range\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.CharRange.CharRange(char, char, boolean)",
      "begin_line": 94,
      "end_line": 105,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eCharRange\u003c/code\u003e over a set of characters,\n     * optionally negating the range.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negated range includes everything except that defined by the\n     * start and end characters.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf start and end are in the wrong order, they are reversed.\n     * Thus \u003ccode\u003ea-e\u003c/code\u003e is the same as \u003ccode\u003ee-a\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param start  first character, inclusive, in this range\n     * @param end  last character, inclusive, in this range\n     * @param negated  true to express everything except the range\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 16)",
        "(line 96,col 9)-(line 100,col 9)",
        "(line 102,col 9)-(line 102,col 27)",
        "(line 103,col 9)-(line 103,col 23)",
        "(line 104,col 9)-(line 104,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharRange.getStart()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * \u003cp\u003eGets the start character for this character range.\u003c/p\u003e\n     * \n     * @return the start char (inclusive)\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharRange.getEnd()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * \u003cp\u003eGets the end character for this character range.\u003c/p\u003e\n     * \n     * @return the end char (inclusive)\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharRange.isNegated()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * \u003cp\u003eIs this \u003ccode\u003eCharRange\u003c/code\u003e negated.\u003c/p\u003e\n     * \n     * \u003cp\u003eA negated range includes everything except that defined by the\n     * start and end characters.\u003c/p\u003e\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e is negated\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharRange.contains(char)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * \u003cp\u003eIs the character specified contained in this range.\u003c/p\u003e\n     *\n     * @param ch  the character to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this range contains the input character\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharRange.contains(org.apache.commons.lang.CharRange)",
      "begin_line": 159,
      "end_line": 176,
      "comment": "\n     * \u003cp\u003eAre all the characters of the passed in range contained in\n     * this range.\u003c/p\u003e\n     *\n     * @param range  the range to check against\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this range entirely contains the input range\n     * @throws IllegalArgumentException if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 175,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharRange.equals(java.lang.Object)",
      "begin_line": 187,
      "end_line": 196,
      "comment": "\n     * \u003cp\u003eCompares two CharRange objects, returning true if they represent\n     * exactly the same range of characters defined in the same way.\u003c/p\u003e\n     * \n     * @param obj  the object to compare to\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 42)",
        "(line 195,col 9)-(line 195,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharRange.hashCode()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     * \u003cp\u003eGets a hashCode compatible with the equals method.\u003c/p\u003e\n     * \n     * @return a suitable hashCode\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharRange.toString()",
      "begin_line": 212,
      "end_line": 226,
      "comment": "\n     * \u003cp\u003eGets a string representation of the character range.\u003c/p\u003e\n     * \n     * @return string representation of this range\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 25)"
      ]
    }
  ]
}