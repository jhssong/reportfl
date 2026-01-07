{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/CharRange.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharRange",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 32,
      "end_line": 241,
      "comment": "\n * \u003cp\u003eA contiguous range of characters, optionally negated.\u003c/p\u003e\n * \n * \u003cp\u003eInstances are immutable.\u003c/p\u003e\n *\n * @author Apache Software Foundation\n * @author Chris Feldhacker\n * @author Gary Gregory\n * @since 1.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.lang3.CharRange.CharRange(char, char, boolean)",
      "begin_line": 65,
      "end_line": 76,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eCharRange\u003c/code\u003e over a set of characters,\n     * optionally negating the range.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negated range includes everything except that defined by the\n     * start and end characters.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf start and end are in the wrong order, they are reversed.\n     * Thus \u003ccode\u003ea-e\u003c/code\u003e is the same as \u003ccode\u003ee-a\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param start  first character, inclusive, in this range\n     * @param end  last character, inclusive, in this range\n     * @param negated  true to express everything except the range\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 16)",
        "(line 67,col 9)-(line 71,col 9)",
        "(line 73,col 9)-(line 73,col 27)",
        "(line 74,col 9)-(line 74,col 23)",
        "(line 75,col 9)-(line 75,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.is(char)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eCharRange\u003c/code\u003e over a single character.\u003c/p\u003e\n     *\n     * @param ch  only character in this range\n     * @see CharRange#CharRange(char, char, boolean)\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.isNot(char)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * \u003cp\u003eConstructs a negated \u003ccode\u003eCharRange\u003c/code\u003e over a single character.\u003c/p\u003e\n     *\n     * @param ch  only character in this range\n     * @see CharRange#CharRange(char, char, boolean)\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.isIn(char, char)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eCharRange\u003c/code\u003e over a set of characters.\u003c/p\u003e\n     *\n     * @param start  first character, inclusive, in this range\n     * @param end  last character, inclusive, in this range\n     * @see CharRange#CharRange(char, char, boolean)\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.isNotIn(char, char)",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * \u003cp\u003eConstructs a negated \u003ccode\u003eCharRange\u003c/code\u003e over a set of characters.\u003c/p\u003e\n     *\n     * @param start  first character, inclusive, in this range\n     * @param end  last character, inclusive, in this range\n     * @see CharRange#CharRange(char, char, boolean)\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.getStart()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * \u003cp\u003eGets the start character for this character range.\u003c/p\u003e\n     * \n     * @return the start char (inclusive)\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.getEnd()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * \u003cp\u003eGets the end character for this character range.\u003c/p\u003e\n     * \n     * @return the end char (inclusive)\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.isNegated()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * \u003cp\u003eIs this \u003ccode\u003eCharRange\u003c/code\u003e negated.\u003c/p\u003e\n     * \n     * \u003cp\u003eA negated range includes everything except that defined by the\n     * start and end characters.\u003c/p\u003e\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e is negated\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.contains(char)",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * \u003cp\u003eIs the character specified contained in this range.\u003c/p\u003e\n     *\n     * @param ch  the character to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this range contains the input character\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.contains(org.apache.commons.lang3.CharRange)",
      "begin_line": 172,
      "end_line": 186,
      "comment": "\n     * \u003cp\u003eAre all the characters of the passed in range contained in\n     * this range.\u003c/p\u003e\n     *\n     * @param range  the range to check against\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this range entirely contains the input range\n     * @throws IllegalArgumentException if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.equals(java.lang.Object)",
      "begin_line": 197,
      "end_line": 207,
      "comment": "\n     * \u003cp\u003eCompares two CharRange objects, returning true if they represent\n     * exactly the same range of characters defined in the same way.\u003c/p\u003e\n     * \n     * @param obj  the object to compare to\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 42)",
        "(line 206,col 9)-(line 206,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.hashCode()",
      "begin_line": 214,
      "end_line": 217,
      "comment": "\n     * \u003cp\u003eGets a hashCode compatible with the equals method.\u003c/p\u003e\n     * \n     * @return a suitable hashCode\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.toString()",
      "begin_line": 224,
      "end_line": 239,
      "comment": "\n     * \u003cp\u003eGets a string representation of the character range.\u003c/p\u003e\n     * \n     * @return string representation of this range\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 25)"
      ]
    }
  ]
}