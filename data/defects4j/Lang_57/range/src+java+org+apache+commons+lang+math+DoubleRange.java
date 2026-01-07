{
  "filepath": "/tmp/Lang-57b/src/java/org/apache/commons/lang/math/DoubleRange.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DoubleRange",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.math.Range",
        "java.io.Serializable"
      ],
      "begin_line": 28,
      "end_line": 416,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eDoubleRange\u003c/code\u003e represents an inclusive range of \u003ccode\u003edouble\u003c/code\u003es.\u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @since 2.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.lang.math.DoubleRange.DoubleRange(double)",
      "begin_line": 70,
      "end_line": 77,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eDoubleRange\u003c/code\u003e using the specified\n     * number as both the minimum and maximum in this range.\u003c/p\u003e\n     *\n     * @param number  the number to use for this range\n     * @throws IllegalArgumentException if the number is \u003ccode\u003eNaN\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 16)",
        "(line 72,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 26)",
        "(line 76,col 9)-(line 76,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.DoubleRange.DoubleRange(java.lang.Number)",
      "begin_line": 88,
      "end_line": 102,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eDoubleRange\u003c/code\u003e using the specified\n     * number as both the minimum and maximum in this range.\u003c/p\u003e\n     *\n     * @param number  the number to use for this range, must not\n     *  be \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the number is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the number is \u003ccode\u003eNaN\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 16)",
        "(line 90,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 40)",
        "(line 94,col 9)-(line 94,col 40)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 101,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.DoubleRange.DoubleRange(double, double)",
      "begin_line": 115,
      "end_line": 127,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eDoubleRange\u003c/code\u003e with the specified\n     * minimum and maximum numbers (both inclusive).\u003c/p\u003e\n     * \n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     * \n     * @param number1  first number that defines the edge of the range, inclusive\n     * @param number2  second number that defines the edge of the range, inclusive\n     * @throws IllegalArgumentException if either number is \u003ccode\u003eNaN\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 16)",
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 126,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.DoubleRange.DoubleRange(java.lang.Number, java.lang.Number)",
      "begin_line": 141,
      "end_line": 170,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eDoubleRange\u003c/code\u003e with the specified\n     * minimum and maximum numbers (both inclusive).\u003c/p\u003e\n     * \n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     *\n     * @param number1  first number that defines the edge of the range, inclusive\n     * @param number2  second number that defines the edge of the range, inclusive\n     * @throws IllegalArgumentException if either number is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if either number is \u003ccode\u003eNaN\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 16)",
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 50)",
        "(line 147,col 9)-(line 147,col 50)",
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 169,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.getMinimumNumber()",
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
      "signature": "org.apache.commons.lang.math.DoubleRange.getMinimumLong()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003elong\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values or decimals.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.getMinimumInteger()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values or decimals.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.getMinimumDouble()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.getMinimumFloat()",
      "begin_line": 225,
      "end_line": 227,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.getMaximumNumber()",
      "begin_line": 234,
      "end_line": 239,
      "comment": "\n     * \u003cp\u003eReturns the maximum number in this range.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.getMaximumLong()",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003elong\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values or decimals.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.getMaximumInteger()",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values or decimals.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.getMaximumDouble()",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.getMaximumFloat()",
      "begin_line": 279,
      "end_line": 281,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.containsNumber(java.lang.Number)",
      "begin_line": 295,
      "end_line": 300,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003enumber\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003edouble\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param number  the number to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this range\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 299,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.containsDouble(double)",
      "begin_line": 313,
      "end_line": 315,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003edouble\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003edouble\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation overrides the superclass for performance as it is\n     * the most common case.\u003c/p\u003e\n     * \n     * @param value  the double to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this\n     *  range by \u003ccode\u003edouble\u003c/code\u003e comparison\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.containsRange(org.apache.commons.lang.math.Range)",
      "begin_line": 330,
      "end_line": 336,
      "comment": "\n     * \u003cp\u003eTests whether the specified range occurs entirely within this range\n     * using \u003ccode\u003edouble\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range occurs entirely within this range\n     * @throws IllegalArgumentException if the range is not of this type\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 335,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.overlapsRange(org.apache.commons.lang.math.Range)",
      "begin_line": 347,
      "end_line": 354,
      "comment": "\n     * \u003cp\u003eTests whether the specified range overlaps with this range\n     * using \u003ccode\u003edouble\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range overlaps with this range\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 353,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.equals(java.lang.Object)",
      "begin_line": 367,
      "end_line": 377,
      "comment": "\n     * \u003cp\u003eCompares this range to another object to test if they are equal.\u003c/p\u003e.\n     * \n     * \u003cp\u003eTo be equal, the class, minimum and maximum must be equal.\u003c/p\u003e\n     *\n     * @param obj the reference object with which to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this object is equal\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 374,col 46)",
        "(line 375,col 9)-(line 376,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.hashCode()",
      "begin_line": 384,
      "end_line": 394,
      "comment": "\n     * \u003cp\u003eGets a hashCode for the range.\u003c/p\u003e\n     *\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 393,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.toString()",
      "begin_line": 403,
      "end_line": 414,
      "comment": "\n     * \u003cp\u003eGets the range as a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format of the String is \u0027Range[\u003ci\u003emin\u003c/i\u003e,\u003ci\u003emax\u003c/i\u003e]\u0027.\u003c/p\u003e\n     *\n     * @return the \u003ccode\u003eString\u003c/code\u003e representation of this range\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 413,col 24)"
      ]
    }
  ]
}