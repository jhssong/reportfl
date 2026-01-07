{
  "filepath": "/tmp/Lang-41b/src/java/org/apache/commons/lang/math/IntRange.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IntRange",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.math.Range",
        "java.io.Serializable"
      ],
      "begin_line": 28,
      "end_line": 417,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eIntRange\u003c/code\u003e represents an inclusive range of \u003ccode\u003eint\u003c/code\u003es.\u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * The minimum number in this range (inclusive).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * The maximum number in this range (inclusive).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minObject"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Cached output minObject (class is immutable).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxObject"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Cached output maxObject (class is immutable).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hashCode"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Cached output hashCode (class is immutable).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "toString"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Cached output toString (class is immutable).\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.IntRange.IntRange(int)",
      "begin_line": 69,
      "end_line": 73,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eIntRange\u003c/code\u003e using the specified\n     * number as both the minimum and maximum in this range.\u003c/p\u003e\n     *\n     * @param number  the number to use for this range\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 16)",
        "(line 71,col 9)-(line 71,col 26)",
        "(line 72,col 9)-(line 72,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.IntRange.IntRange(java.lang.Number)",
      "begin_line": 82,
      "end_line": 93,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eIntRange\u003c/code\u003e using the specified\n     * number as both the minimum and maximum in this range.\u003c/p\u003e\n     *\n     * @param number  the number to use for this range, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the number is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 16)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 37)",
        "(line 88,col 9)-(line 88,col 37)",
        "(line 89,col 9)-(line 92,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.IntRange.IntRange(int, int)",
      "begin_line": 105,
      "end_line": 114,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eIntRange\u003c/code\u003e with the specified\n     * minimum and maximum numbers (both inclusive).\u003c/p\u003e\n     * \n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     * \n     * @param number1  first number that defines the edge of the range, inclusive\n     * @param number2  second number that defines the edge of the range, inclusive\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 16)",
        "(line 107,col 9)-(line 113,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.IntRange.IntRange(java.lang.Number, java.lang.Number)",
      "begin_line": 127,
      "end_line": 153,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eIntRange\u003c/code\u003e with the specified\n     * minimum and maximum numbers (both inclusive).\u003c/p\u003e\n     * \n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     *\n     * @param number1  first number that defines the edge of the range, inclusive\n     * @param number2  second number that defines the edge of the range, inclusive\n     * @throws IllegalArgumentException if either number is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 16)",
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 44)",
        "(line 133,col 9)-(line 133,col 44)",
        "(line 134,col 9)-(line 152,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMinimumNumber()",
      "begin_line": 163,
      "end_line": 169,
      "comment": "\n     * \u003cp\u003eReturns the minimum number in this range.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMinimumLong()",
      "begin_line": 176,
      "end_line": 179,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003elong\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMinimumInteger()",
      "begin_line": 186,
      "end_line": 189,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMinimumDouble()",
      "begin_line": 196,
      "end_line": 199,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMinimumFloat()",
      "begin_line": 206,
      "end_line": 209,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMaximumNumber()",
      "begin_line": 216,
      "end_line": 222,
      "comment": "\n     * \u003cp\u003eReturns the maximum number in this range.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 221,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMaximumLong()",
      "begin_line": 229,
      "end_line": 232,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003elong\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMaximumInteger()",
      "begin_line": 239,
      "end_line": 242,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMaximumDouble()",
      "begin_line": 249,
      "end_line": 252,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMaximumFloat()",
      "begin_line": 259,
      "end_line": 262,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.containsNumber(java.lang.Number)",
      "begin_line": 276,
      "end_line": 282,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003enumber\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003eint\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param number  the number to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this range\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 281,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.containsInteger(int)",
      "begin_line": 295,
      "end_line": 298,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003eint\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003eint\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation overrides the superclass for performance as it is\n     * the most common case.\u003c/p\u003e\n     * \n     * @param value  the int to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this\n     *  range by \u003ccode\u003eint\u003c/code\u003e comparison\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.containsRange(org.apache.commons.lang.math.Range)",
      "begin_line": 313,
      "end_line": 320,
      "comment": "\n     * \u003cp\u003eTests whether the specified range occurs entirely within this range\n     * using \u003ccode\u003eint\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range occurs entirely within this range\n     * @throws IllegalArgumentException if the range is not of this type\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 319,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.overlapsRange(org.apache.commons.lang.math.Range)",
      "begin_line": 331,
      "end_line": 339,
      "comment": "\n     * \u003cp\u003eTests whether the specified range overlaps with this range\n     * using \u003ccode\u003eint\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range overlaps with this range\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 338,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.equals(java.lang.Object)",
      "begin_line": 352,
      "end_line": 362,
      "comment": "\n     * \u003cp\u003eCompares this range to another object to test if they are equal.\u003c/p\u003e.\n     * \n     * \u003cp\u003eTo be equal, the class, minimum and maximum must be equal.\u003c/p\u003e\n     *\n     * @param obj the reference object with which to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this object is equal\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 360,col 40)",
        "(line 361,col 9)-(line 361,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.hashCode()",
      "begin_line": 369,
      "end_line": 380,
      "comment": "\n     * \u003cp\u003eGets a hashCode for the range.\u003c/p\u003e\n     *\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 28)",
        "(line 372,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 379,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.toString()",
      "begin_line": 389,
      "end_line": 401,
      "comment": "\n     * \u003cp\u003eGets the range as a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format of the String is \u0027Range[\u003ci\u003emin\u003c/i\u003e,\u003ci\u003emax\u003c/i\u003e]\u0027.\u003c/p\u003e\n     *\n     * @return the \u003ccode\u003eString\u003c/code\u003e representation of this range\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 399,col 9)",
        "(line 400,col 9)-(line 400,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.toArray()",
      "begin_line": 409,
      "end_line": 416,
      "comment": "\n     * \u003cp\u003eReturns an array containing all the integer values in the range.\u003c/p\u003e\n     *\n     * @return the \u003ccode\u003eint[]\u003c/code\u003e representation of this range\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 45)",
        "(line 411,col 9)-(line 413,col 9)",
        "(line 415,col 9)-(line 415,col 21)"
      ]
    }
  ]
}