{
  "filepath": "/tmp/Lang-40b/src/java/org/apache/commons/lang/math/LongRange.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LongRange",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.math.Range",
        "java.io.Serializable"
      ],
      "begin_line": 28,
      "end_line": 430,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eLongRange\u003c/code\u003e represents an inclusive range of \u003ccode\u003elong\u003c/code\u003es.\u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @since 2.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.lang.math.LongRange.LongRange(long)",
      "begin_line": 69,
      "end_line": 73,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eLongRange\u003c/code\u003e using the specified\n     * number as both the minimum and maximum in this range.\u003c/p\u003e\n     *\n     * @param number  the number to use for this range\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 16)",
        "(line 71,col 9)-(line 71,col 26)",
        "(line 72,col 9)-(line 72,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.LongRange.LongRange(java.lang.Number)",
      "begin_line": 83,
      "end_line": 94,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eLongRange\u003c/code\u003e using the specified\n     * number as both the minimum and maximum in this range.\u003c/p\u003e\n     *\n     * @param number  the number to use for this range, must not\n     *  be \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the number is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 16)",
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 38)",
        "(line 89,col 9)-(line 89,col 38)",
        "(line 90,col 9)-(line 93,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.LongRange.LongRange(long, long)",
      "begin_line": 106,
      "end_line": 115,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eLongRange\u003c/code\u003e with the specified\n     * minimum and maximum numbers (both inclusive).\u003c/p\u003e\n     * \n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     * \n     * @param number1  first number that defines the edge of the range, inclusive\n     * @param number2  second number that defines the edge of the range, inclusive\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 16)",
        "(line 108,col 9)-(line 114,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.LongRange.LongRange(java.lang.Number, java.lang.Number)",
      "begin_line": 128,
      "end_line": 154,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eLongRange\u003c/code\u003e with the specified\n     * minimum and maximum numbers (both inclusive).\u003c/p\u003e\n     * \n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     *\n     * @param number1  first number that defines the edge of the range, inclusive\n     * @param number2  second number that defines the edge of the range, inclusive\n     * @throws IllegalArgumentException if either number is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 16)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 46)",
        "(line 134,col 9)-(line 134,col 46)",
        "(line 135,col 9)-(line 153,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMinimumNumber()",
      "begin_line": 164,
      "end_line": 170,
      "comment": "\n     * \u003cp\u003eReturns the minimum number in this range.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMinimumLong()",
      "begin_line": 177,
      "end_line": 180,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003elong\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMinimumInteger()",
      "begin_line": 189,
      "end_line": 192,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMinimumDouble()",
      "begin_line": 201,
      "end_line": 204,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMinimumFloat()",
      "begin_line": 213,
      "end_line": 216,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMaximumNumber()",
      "begin_line": 223,
      "end_line": 229,
      "comment": "\n     * \u003cp\u003eReturns the maximum number in this range.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMaximumLong()",
      "begin_line": 236,
      "end_line": 239,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003elong\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMaximumInteger()",
      "begin_line": 248,
      "end_line": 251,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range cast to an \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values.\u003c/p\u003e\n     * \n     * @return the maximum number in this range cast to an \u003ccode\u003eint\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMaximumDouble()",
      "begin_line": 260,
      "end_line": 263,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values.\u003c/p\u003e\n     * \n     * @return The maximum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMaximumFloat()",
      "begin_line": 272,
      "end_line": 275,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values.\u003c/p\u003e\n     * \n     * @return The maximum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.containsNumber(java.lang.Number)",
      "begin_line": 289,
      "end_line": 295,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003enumber\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003elong\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param number  the number to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this range\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 294,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.containsLong(long)",
      "begin_line": 308,
      "end_line": 311,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003elong\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003elong\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation overrides the superclass for performance as it is\n     * the most common case.\u003c/p\u003e\n     * \n     * @param value  the long to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this\n     *  range by \u003ccode\u003elong\u003c/code\u003e comparison\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.containsRange(org.apache.commons.lang.math.Range)",
      "begin_line": 326,
      "end_line": 333,
      "comment": "\n     * \u003cp\u003eTests whether the specified range occurs entirely within this range\n     * using \u003ccode\u003elong\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range occurs entirely within this range\n     * @throws IllegalArgumentException if the range is not of this type\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 332,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.overlapsRange(org.apache.commons.lang.math.Range)",
      "begin_line": 344,
      "end_line": 352,
      "comment": "\n     * \u003cp\u003eTests whether the specified range overlaps with this range\n     * using \u003ccode\u003elong\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range overlaps with this range\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 351,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.equals(java.lang.Object)",
      "begin_line": 365,
      "end_line": 375,
      "comment": "\n     * \u003cp\u003eCompares this range to another object to test if they are equal.\u003c/p\u003e.\n     * \n     * \u003cp\u003eTo be equal, the class, minimum and maximum must be equal.\u003c/p\u003e\n     *\n     * @param obj the reference object with which to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this object is equal\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 373,col 42)",
        "(line 374,col 9)-(line 374,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.hashCode()",
      "begin_line": 382,
      "end_line": 393,
      "comment": "\n     * \u003cp\u003eGets a hashCode for the range.\u003c/p\u003e\n     *\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 28)",
        "(line 385,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 392,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.toString()",
      "begin_line": 402,
      "end_line": 414,
      "comment": "\n     * \u003cp\u003eGets the range as a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format of the String is \u0027Range[\u003ci\u003emin\u003c/i\u003e,\u003ci\u003emax\u003c/i\u003e]\u0027.\u003c/p\u003e\n     *\n     * @return the \u003ccode\u003eString\u003c/code\u003e representation of this range\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 413,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.toArray()",
      "begin_line": 422,
      "end_line": 428,
      "comment": "\n     * \u003cp\u003eReturns an array containing all the long values in the range.\u003c/p\u003e\n     *\n     * @return the \u003ccode\u003elong[]\u003c/code\u003e representation of this range\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 55)",
        "(line 424,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 427,col 21)"
      ]
    }
  ]
}