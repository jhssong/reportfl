{
  "filepath": "/tmp/Lang-61b/src/java/org/apache/commons/lang/CharRange.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharRange",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 233,
      "comment": "\n * \u003cp\u003eA contiguous range of characters, optionally negated.\u003c/p\u003e\n * \n * \u003cp\u003eInstances are immutable.\u003c/p\u003e\n *\n * @author Henri Yandell\n * @author Stephen Colebourne\n * @author Chris Feldhacker\n * @author Gary Gregory\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Required for serialization support. Lang version 2.0. \n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The first character, inclusive, in the range. "
    },
    {
      "type": "field",
      "varNames": [
        "end"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The last character, inclusive, in the range. "
    },
    {
      "type": "field",
      "varNames": [
        "negated"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " True if the range is everything except the characters specified. "
    },
    {
      "type": "field",
      "varNames": [
        "iToString"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Cached toString. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.CharRange.CharRange(char)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eCharRange\u003c/code\u003e over a single character.\u003c/p\u003e\n     *\n     * @param ch  only character in this range\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.CharRange.CharRange(char, boolean)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eCharRange\u003c/code\u003e over a single character,\n     * optionally negating the range.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negated range includes everything except the specified char.\u003c/p\u003e\n     *\n     * @param ch  only character in this range\n     * @param negated  true to express everything except the range\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.CharRange.CharRange(char, char)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eCharRange\u003c/code\u003e over a set of characters.\u003c/p\u003e\n     *\n     * @param start  first character, inclusive, in this range\n     * @param end  last character, inclusive, in this range\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.CharRange.CharRange(char, char, boolean)",
      "begin_line": 99,
      "end_line": 110,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eCharRange\u003c/code\u003e over a set of characters,\n     * optionally negating the range.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negated range includes everything except that defined by the\n     * start and end characters.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf start and end are in the wrong order, they are reversed.\n     * Thus \u003ccode\u003ea-e\u003c/code\u003e is the same as \u003ccode\u003ee-a\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param start  first character, inclusive, in this range\n     * @param end  last character, inclusive, in this range\n     * @param negated  true to express everything except the range\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 16)",
        "(line 101,col 9)-(line 105,col 9)",
        "(line 107,col 9)-(line 107,col 27)",
        "(line 108,col 9)-(line 108,col 23)",
        "(line 109,col 9)-(line 109,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharRange.getStart()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * \u003cp\u003eGets the start character for this character range.\u003c/p\u003e\n     * \n     * @return the start char (inclusive)\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharRange.getEnd()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * \u003cp\u003eGets the end character for this character range.\u003c/p\u003e\n     * \n     * @return the end char (inclusive)\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharRange.isNegated()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * \u003cp\u003eIs this \u003ccode\u003eCharRange\u003c/code\u003e negated.\u003c/p\u003e\n     * \n     * \u003cp\u003eA negated range includes everything except that defined by the\n     * start and end characters.\u003c/p\u003e\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e is negated\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharRange.contains(char)",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * \u003cp\u003eIs the character specified contained in this range.\u003c/p\u003e\n     *\n     * @param ch  the character to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this range contains the input character\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharRange.contains(org.apache.commons.lang.CharRange)",
      "begin_line": 164,
      "end_line": 181,
      "comment": "\n     * \u003cp\u003eAre all the characters of the passed in range contained in\n     * this range.\u003c/p\u003e\n     *\n     * @param range  the range to check against\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this range entirely contains the input range\n     * @throws IllegalArgumentException if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 180,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharRange.equals(java.lang.Object)",
      "begin_line": 192,
      "end_line": 201,
      "comment": "\n     * \u003cp\u003eCompares two CharRange objects, returning true if they represent\n     * exactly the same range of characters defined in the same way.\u003c/p\u003e\n     * \n     * @param obj  the object to compare to\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 42)",
        "(line 200,col 9)-(line 200,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharRange.hashCode()",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\n     * \u003cp\u003eGets a hashCode compatible with the equals method.\u003c/p\u003e\n     * \n     * @return a suitable hashCode\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharRange.toString()",
      "begin_line": 217,
      "end_line": 231,
      "comment": "\n     * \u003cp\u003eGets a string representation of the character range.\u003c/p\u003e\n     * \n     * @return string representation of this range\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 230,col 25)"
      ]
    }
  ]
}