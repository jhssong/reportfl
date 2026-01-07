{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/CharRange.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharRange",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 32,
      "end_line": 232,
      "comment": "\n * \u003cp\u003eA contiguous range of characters, optionally negated.\u003c/p\u003e\n * \n * \u003cp\u003eInstances are immutable.\u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @author Chris Feldhacker\n * @author Gary Gregory\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Required for serialization support. Lang version 2.0. \n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The first character, inclusive, in the range. "
    },
    {
      "type": "field",
      "varNames": [
        "end"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The last character, inclusive, in the range. "
    },
    {
      "type": "field",
      "varNames": [
        "negated"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " True if the range is everything except the characters specified. "
    },
    {
      "type": "field",
      "varNames": [
        "iToString"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Cached toString. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.CharRange.CharRange(char)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eCharRange\u003c/code\u003e over a single character.\u003c/p\u003e\n     *\n     * @param ch  only character in this range\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.CharRange.CharRange(char, boolean)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eCharRange\u003c/code\u003e over a single character,\n     * optionally negating the range.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negated range includes everything except the specified char.\u003c/p\u003e\n     *\n     * @param ch  only character in this range\n     * @param negated  true to express everything except the range\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.CharRange.CharRange(char, char)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eCharRange\u003c/code\u003e over a set of characters.\u003c/p\u003e\n     *\n     * @param start  first character, inclusive, in this range\n     * @param end  last character, inclusive, in this range\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.CharRange.CharRange(char, char, boolean)",
      "begin_line": 98,
      "end_line": 109,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eCharRange\u003c/code\u003e over a set of characters,\n     * optionally negating the range.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negated range includes everything except that defined by the\n     * start and end characters.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf start and end are in the wrong order, they are reversed.\n     * Thus \u003ccode\u003ea-e\u003c/code\u003e is the same as \u003ccode\u003ee-a\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param start  first character, inclusive, in this range\n     * @param end  last character, inclusive, in this range\n     * @param negated  true to express everything except the range\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 16)",
        "(line 100,col 9)-(line 104,col 9)",
        "(line 106,col 9)-(line 106,col 27)",
        "(line 107,col 9)-(line 107,col 23)",
        "(line 108,col 9)-(line 108,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharRange.getStart()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * \u003cp\u003eGets the start character for this character range.\u003c/p\u003e\n     * \n     * @return the start char (inclusive)\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharRange.getEnd()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * \u003cp\u003eGets the end character for this character range.\u003c/p\u003e\n     * \n     * @return the end char (inclusive)\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharRange.isNegated()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * \u003cp\u003eIs this \u003ccode\u003eCharRange\u003c/code\u003e negated.\u003c/p\u003e\n     * \n     * \u003cp\u003eA negated range includes everything except that defined by the\n     * start and end characters.\u003c/p\u003e\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e is negated\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharRange.contains(char)",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * \u003cp\u003eIs the character specified contained in this range.\u003c/p\u003e\n     *\n     * @param ch  the character to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this range contains the input character\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharRange.contains(org.apache.commons.lang.CharRange)",
      "begin_line": 163,
      "end_line": 180,
      "comment": "\n     * \u003cp\u003eAre all the characters of the passed in range contained in\n     * this range.\u003c/p\u003e\n     *\n     * @param range  the range to check against\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this range entirely contains the input range\n     * @throws IllegalArgumentException if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 179,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharRange.equals(java.lang.Object)",
      "begin_line": 191,
      "end_line": 200,
      "comment": "\n     * \u003cp\u003eCompares two CharRange objects, returning true if they represent\n     * exactly the same range of characters defined in the same way.\u003c/p\u003e\n     * \n     * @param obj  the object to compare to\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 42)",
        "(line 199,col 9)-(line 199,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharRange.hashCode()",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\n     * \u003cp\u003eGets a hashCode compatible with the equals method.\u003c/p\u003e\n     * \n     * @return a suitable hashCode\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharRange.toString()",
      "begin_line": 216,
      "end_line": 230,
      "comment": "\n     * \u003cp\u003eGets a string representation of the character range.\u003c/p\u003e\n     * \n     * @return string representation of this range\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 25)"
      ]
    }
  ]
}