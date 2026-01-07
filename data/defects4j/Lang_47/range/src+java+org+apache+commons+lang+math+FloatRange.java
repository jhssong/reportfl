{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/math/FloatRange.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FloatRange",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.math.Range",
        "java.io.Serializable"
      ],
      "begin_line": 28,
      "end_line": 410,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eFloatRange\u003c/code\u003e represents an inclusive range of \u003ccode\u003efloat\u003c/code\u003es.\u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @since 2.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.lang.math.FloatRange.FloatRange(float)",
      "begin_line": 70,
      "end_line": 77,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eFloatRange\u003c/code\u003e using the specified\n     * number as both the minimum and maximum in this range.\u003c/p\u003e\n     *\n     * @param number  the number to use for this range\n     * @throws IllegalArgumentException if the number is \u003ccode\u003eNaN\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 16)",
        "(line 72,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 26)",
        "(line 76,col 9)-(line 76,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.FloatRange.FloatRange(java.lang.Number)",
      "begin_line": 88,
      "end_line": 102,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eFloatRange\u003c/code\u003e using the specified\n     * number as both the minimum and maximum in this range.\u003c/p\u003e\n     *\n     * @param number  the number to use for this range, must not\n     *  be \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the number is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the number is \u003ccode\u003eNaN\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 16)",
        "(line 90,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 39)",
        "(line 94,col 9)-(line 94,col 39)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 101,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.FloatRange.FloatRange(float, float)",
      "begin_line": 115,
      "end_line": 127,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eFloatRange\u003c/code\u003e with the specified\n     * minimum and maximum numbers (both inclusive).\u003c/p\u003e\n     * \n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     * \n     * @param number1  first number that defines the edge of the range, inclusive\n     * @param number2  second number that defines the edge of the range, inclusive\n     * @throws IllegalArgumentException if either number is \u003ccode\u003eNaN\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 16)",
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 126,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.FloatRange.FloatRange(java.lang.Number, java.lang.Number)",
      "begin_line": 141,
      "end_line": 170,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eFloatRange\u003c/code\u003e with the specified\n     * minimum and maximum numbers (both inclusive).\u003c/p\u003e\n     * \n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     *\n     * @param number1  first number that defines the edge of the range, inclusive\n     * @param number2  second number that defines the edge of the range, inclusive\n     * @throws IllegalArgumentException if either number is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if either number is \u003ccode\u003eNaN\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 16)",
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 48)",
        "(line 147,col 9)-(line 147,col 48)",
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 169,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.getMinimumNumber()",
      "begin_line": 180,
      "end_line": 185,
      "comment": "\n     * \u003cp\u003eReturns the minimum number in this range.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.getMinimumLong()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003elong\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values or decimals.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.getMinimumInteger()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values or decimals.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.getMinimumDouble()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.getMinimumFloat()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.getMaximumNumber()",
      "begin_line": 232,
      "end_line": 237,
      "comment": "\n     * \u003cp\u003eReturns the maximum number in this range.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.getMaximumLong()",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003elong\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values or decimals.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.getMaximumInteger()",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values or decimals.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.getMaximumDouble()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.getMaximumFloat()",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.containsNumber(java.lang.Number)",
      "begin_line": 291,
      "end_line": 296,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003enumber\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003efloat\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param number  the number to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this range\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 295,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.containsFloat(float)",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003efloat\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003efloat\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation overrides the superclass for performance as it is\n     * the most common case.\u003c/p\u003e\n     * \n     * @param value  the float to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this\n     *  range by \u003ccode\u003efloat\u003c/code\u003e comparison\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.containsRange(org.apache.commons.lang.math.Range)",
      "begin_line": 326,
      "end_line": 332,
      "comment": "\n     * \u003cp\u003eTests whether the specified range occurs entirely within this range\n     * using \u003ccode\u003efloat\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range occurs entirely within this range\n     * @throws IllegalArgumentException if the range is not of this type\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 331,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.overlapsRange(org.apache.commons.lang.math.Range)",
      "begin_line": 343,
      "end_line": 350,
      "comment": "\n     * \u003cp\u003eTests whether the specified range overlaps with this range\n     * using \u003ccode\u003efloat\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range overlaps with this range\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 349,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.equals(java.lang.Object)",
      "begin_line": 363,
      "end_line": 373,
      "comment": "\n     * \u003cp\u003eCompares this range to another object to test if they are equal.\u003c/p\u003e.\n     * \n     * \u003cp\u003eTo be equal, the class, minimum and maximum must be equal.\u003c/p\u003e\n     *\n     * @param obj the reference object with which to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this object is equal\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 370,col 44)",
        "(line 371,col 9)-(line 372,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.hashCode()",
      "begin_line": 380,
      "end_line": 388,
      "comment": "\n     * \u003cp\u003eGets a hashCode for the range.\u003c/p\u003e\n     *\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 387,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.FloatRange.toString()",
      "begin_line": 397,
      "end_line": 408,
      "comment": "\n     * \u003cp\u003eGets the range as a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format of the String is \u0027Range[\u003ci\u003emin\u003c/i\u003e,\u003ci\u003emax\u003c/i\u003e]\u0027.\u003c/p\u003e\n     *\n     * @return the \u003ccode\u003eString\u003c/code\u003e representation of this range\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 407,col 24)"
      ]
    }
  ]
}