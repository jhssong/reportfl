{
  "filepath": "/tmp/Lang-64b/src/java/org/apache/commons/lang/math/FloatRange.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FloatRange",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.math.Range",
        "java.io.Serializable"
      ],
      "begin_line": 27,
      "end_line": 409,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eFloatRange\u003c/code\u003e represents an inclusive range of \u003ccode\u003efloat\u003c/code\u003es.\u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @since 2.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.lang.math.FloatRange.FloatRange(float)",
      "begin_line": 69,
      "end_line": 76,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eFloatRange\u003c/code\u003e using the specified\n     * number as both the minimum and maximum in this range.\u003c/p\u003e\n     *\n     * @param number  the number to use for this range\n     * @throws IllegalArgumentException if the number is \u003ccode\u003eNaN\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 16)",
        "(line 71,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 74,col 26)",
        "(line 75,col 9)-(line 75,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.FloatRange.FloatRange(java.lang.Number)",
      "begin_line": 87,
      "end_line": 101,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eFloatRange\u003c/code\u003e using the specified\n     * number as both the minimum and maximum in this range.\u003c/p\u003e\n     *\n     * @param number  the number to use for this range, must not\n     *  be \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the number is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the number is \u003ccode\u003eNaN\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 16)",
        "(line 89,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 39)",
        "(line 93,col 9)-(line 93,col 39)",
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 100,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.FloatRange.FloatRange(float, float)",
      "begin_line": 114,
      "end_line": 126,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eFloatRange\u003c/code\u003e with the specified\n     * minimum and maximum numbers (both inclusive).\u003c/p\u003e\n     * \n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     * \n     * @param number1  first number that defines the edge of the range, inclusive\n     * @param number2  second number that defines the edge of the range, inclusive\n     * @throws IllegalArgumentException if either number is \u003ccode\u003eNaN\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 16)",
        "(line 116,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 125,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.FloatRange.FloatRange(java.lang.Number, java.lang.Number)",
      "begin_line": 140,
      "end_line": 169,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eFloatRange\u003c/code\u003e with the specified\n     * minimum and maximum numbers (both inclusive).\u003c/p\u003e\n     * \n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     *\n     * @param number1  first number that defines the edge of the range, inclusive\n     * @param number2  second number that defines the edge of the range, inclusive\n     * @throws IllegalArgumentException if either number is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if either number is \u003ccode\u003eNaN\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 16)",
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 48)",
        "(line 146,col 9)-(line 146,col 48)",
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 168,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.getMinimumNumber()",
      "begin_line": 179,
      "end_line": 184,
      "comment": "\n     * \u003cp\u003eReturns the minimum number in this range.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.getMinimumLong()",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003elong\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values or decimals.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.getMinimumInteger()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values or decimals.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.getMinimumDouble()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.getMinimumFloat()",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.getMaximumNumber()",
      "begin_line": 231,
      "end_line": 236,
      "comment": "\n     * \u003cp\u003eReturns the maximum number in this range.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.getMaximumLong()",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003elong\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values or decimals.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.getMaximumInteger()",
      "begin_line": 256,
      "end_line": 258,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values or decimals.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.getMaximumDouble()",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.getMaximumFloat()",
      "begin_line": 274,
      "end_line": 276,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.containsNumber(java.lang.Number)",
      "begin_line": 290,
      "end_line": 295,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003enumber\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003efloat\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param number  the number to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this range\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 294,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.containsFloat(float)",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003efloat\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003efloat\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation overrides the superclass for performance as it is\n     * the most common case.\u003c/p\u003e\n     * \n     * @param value  the float to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this\n     *  range by \u003ccode\u003efloat\u003c/code\u003e comparison\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.containsRange(org.apache.commons.lang.math.Range)",
      "begin_line": 325,
      "end_line": 331,
      "comment": "\n     * \u003cp\u003eTests whether the specified range occurs entirely within this range\n     * using \u003ccode\u003efloat\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range occurs entirely within this range\n     * @throws IllegalArgumentException if the range is not of this type\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 330,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.overlapsRange(org.apache.commons.lang.math.Range)",
      "begin_line": 342,
      "end_line": 349,
      "comment": "\n     * \u003cp\u003eTests whether the specified range overlaps with this range\n     * using \u003ccode\u003efloat\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range overlaps with this range\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 348,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.equals(java.lang.Object)",
      "begin_line": 362,
      "end_line": 372,
      "comment": "\n     * \u003cp\u003eCompares this range to another object to test if they are equal.\u003c/p\u003e.\n     * \n     * \u003cp\u003eTo be equal, the class, minimum and maximum must be equal.\u003c/p\u003e\n     *\n     * @param obj the reference object with which to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this object is equal\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 369,col 44)",
        "(line 370,col 9)-(line 371,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.hashCode()",
      "begin_line": 379,
      "end_line": 387,
      "comment": "\n     * \u003cp\u003eGets a hashCode for the range.\u003c/p\u003e\n     *\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.toString()",
      "begin_line": 396,
      "end_line": 407,
      "comment": "\n     * \u003cp\u003eGets the range as a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format of the String is \u0027Range[\u003ci\u003emin\u003c/i\u003e,\u003ci\u003emax\u003c/i\u003e]\u0027.\u003c/p\u003e\n     *\n     * @return the \u003ccode\u003eString\u003c/code\u003e representation of this range\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 405,col 9)",
        "(line 406,col 9)-(line 406,col 24)"
      ]
    }
  ]
}