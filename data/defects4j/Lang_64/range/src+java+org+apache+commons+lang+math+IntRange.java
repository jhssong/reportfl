{
  "filepath": "/tmp/Lang-64b/src/java/org/apache/commons/lang/math/IntRange.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IntRange",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.math.Range",
        "java.io.Serializable"
      ],
      "begin_line": 27,
      "end_line": 383,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eIntRange\u003c/code\u003e represents an inclusive range of \u003ccode\u003eint\u003c/code\u003es.\u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * The minimum number in this range (inclusive).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * The maximum number in this range (inclusive).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minObject"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Cached output minObject (class is immutable).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxObject"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Cached output maxObject (class is immutable).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hashCode"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Cached output hashCode (class is immutable).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "toString"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Cached output toString (class is immutable).\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.IntRange.IntRange(int)",
      "begin_line": 68,
      "end_line": 72,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eIntRange\u003c/code\u003e using the specified\n     * number as both the minimum and maximum in this range.\u003c/p\u003e\n     *\n     * @param number  the number to use for this range\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 16)",
        "(line 70,col 9)-(line 70,col 26)",
        "(line 71,col 9)-(line 71,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.IntRange.IntRange(java.lang.Number)",
      "begin_line": 81,
      "end_line": 92,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eIntRange\u003c/code\u003e using the specified\n     * number as both the minimum and maximum in this range.\u003c/p\u003e\n     *\n     * @param number  the number to use for this range, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the number is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 16)",
        "(line 83,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 37)",
        "(line 87,col 9)-(line 87,col 37)",
        "(line 88,col 9)-(line 91,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.IntRange.IntRange(int, int)",
      "begin_line": 104,
      "end_line": 113,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eIntRange\u003c/code\u003e with the specified\n     * minimum and maximum numbers (both inclusive).\u003c/p\u003e\n     * \n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     * \n     * @param number1  first number that defines the edge of the range, inclusive\n     * @param number2  second number that defines the edge of the range, inclusive\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 16)",
        "(line 106,col 9)-(line 112,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.IntRange.IntRange(java.lang.Number, java.lang.Number)",
      "begin_line": 126,
      "end_line": 152,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eIntRange\u003c/code\u003e with the specified\n     * minimum and maximum numbers (both inclusive).\u003c/p\u003e\n     * \n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     *\n     * @param number1  first number that defines the edge of the range, inclusive\n     * @param number2  second number that defines the edge of the range, inclusive\n     * @throws IllegalArgumentException if either number is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 16)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 44)",
        "(line 132,col 9)-(line 132,col 44)",
        "(line 133,col 9)-(line 151,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMinimumNumber()",
      "begin_line": 162,
      "end_line": 167,
      "comment": "\n     * \u003cp\u003eReturns the minimum number in this range.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMinimumLong()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003elong\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMinimumInteger()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMinimumDouble()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMinimumFloat()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMaximumNumber()",
      "begin_line": 210,
      "end_line": 215,
      "comment": "\n     * \u003cp\u003eReturns the maximum number in this range.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMaximumLong()",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003elong\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMaximumInteger()",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMaximumDouble()",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMaximumFloat()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.containsNumber(java.lang.Number)",
      "begin_line": 265,
      "end_line": 270,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003enumber\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003eint\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param number  the number to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this range\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 269,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.containsInteger(int)",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003eint\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003eint\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation overrides the superclass for performance as it is\n     * the most common case.\u003c/p\u003e\n     * \n     * @param value  the int to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this\n     *  range by \u003ccode\u003eint\u003c/code\u003e comparison\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.containsRange(org.apache.commons.lang.math.Range)",
      "begin_line": 300,
      "end_line": 306,
      "comment": "\n     * \u003cp\u003eTests whether the specified range occurs entirely within this range\n     * using \u003ccode\u003eint\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range occurs entirely within this range\n     * @throws IllegalArgumentException if the range is not of this type\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 305,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.overlapsRange(org.apache.commons.lang.math.Range)",
      "begin_line": 317,
      "end_line": 324,
      "comment": "\n     * \u003cp\u003eTests whether the specified range overlaps with this range\n     * using \u003ccode\u003eint\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range overlaps with this range\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 323,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.equals(java.lang.Object)",
      "begin_line": 337,
      "end_line": 346,
      "comment": "\n     * \u003cp\u003eCompares this range to another object to test if they are equal.\u003c/p\u003e.\n     * \n     * \u003cp\u003eTo be equal, the class, minimum and maximum must be equal.\u003c/p\u003e\n     *\n     * @param obj the reference object with which to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this object is equal\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 340,col 9)",
        "(line 341,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 344,col 40)",
        "(line 345,col 9)-(line 345,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.hashCode()",
      "begin_line": 353,
      "end_line": 361,
      "comment": "\n     * \u003cp\u003eGets a hashCode for the range.\u003c/p\u003e\n     *\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 360,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.toString()",
      "begin_line": 370,
      "end_line": 381,
      "comment": "\n     * \u003cp\u003eGets the range as a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format of the String is \u0027Range[\u003ci\u003emin\u003c/i\u003e,\u003ci\u003emax\u003c/i\u003e]\u0027.\u003c/p\u003e\n     *\n     * @return the \u003ccode\u003eString\u003c/code\u003e representation of this range\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 380,col 24)"
      ]
    }
  ]
}