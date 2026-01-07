{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/math/LongRange.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LongRange",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.math.Range",
        "java.io.Serializable"
      ],
      "begin_line": 27,
      "end_line": 391,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eLongRange\u003c/code\u003e represents an inclusive range of \u003ccode\u003elong\u003c/code\u003es.\u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * The minimum number in this range (inclusive).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * The maximum number in this range (inclusive).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minObject"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Cached output minObject (class is immutable).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxObject"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Cached output maxObject (class is immutable).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hashCode"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Cached output hashCode (class is immutable).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "toString"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * Cached output toString (class is immutable).\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.LongRange.LongRange(long)",
      "begin_line": 63,
      "end_line": 67,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eLongRange\u003c/code\u003e using the specified\n     * number as both the minimum and maximum in this range.\u003c/p\u003e\n     *\n     * @param number  the number to use for this range\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 16)",
        "(line 65,col 9)-(line 65,col 26)",
        "(line 66,col 9)-(line 66,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.LongRange.LongRange(java.lang.Number)",
      "begin_line": 77,
      "end_line": 88,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eLongRange\u003c/code\u003e using the specified\n     * number as both the minimum and maximum in this range.\u003c/p\u003e\n     *\n     * @param number  the number to use for this range, must not\n     *  be \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the number is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 16)",
        "(line 79,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 82,col 38)",
        "(line 83,col 9)-(line 83,col 38)",
        "(line 84,col 9)-(line 87,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.LongRange.LongRange(long, long)",
      "begin_line": 100,
      "end_line": 109,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eLongRange\u003c/code\u003e with the specified\n     * minimum and maximum numbers (both inclusive).\u003c/p\u003e\n     * \n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     * \n     * @param number1  first number that defines the edge of the range, inclusive\n     * @param number2  second number that defines the edge of the range, inclusive\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 16)",
        "(line 102,col 9)-(line 108,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.LongRange.LongRange(java.lang.Number, java.lang.Number)",
      "begin_line": 122,
      "end_line": 148,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eLongRange\u003c/code\u003e with the specified\n     * minimum and maximum numbers (both inclusive).\u003c/p\u003e\n     * \n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     *\n     * @param number1  first number that defines the edge of the range, inclusive\n     * @param number2  second number that defines the edge of the range, inclusive\n     * @throws IllegalArgumentException if either number is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 16)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 46)",
        "(line 128,col 9)-(line 128,col 46)",
        "(line 129,col 9)-(line 147,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMinimumNumber()",
      "begin_line": 158,
      "end_line": 163,
      "comment": "\n     * \u003cp\u003eReturns the minimum number in this range.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMinimumLong()",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003elong\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMinimumInteger()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMinimumDouble()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMinimumFloat()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMaximumNumber()",
      "begin_line": 212,
      "end_line": 217,
      "comment": "\n     * \u003cp\u003eReturns the maximum number in this range.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMaximumLong()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003elong\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMaximumInteger()",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range cast to an \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values.\u003c/p\u003e\n     * \n     * @return the maximum number in this range cast to an \u003ccode\u003eint\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMaximumDouble()",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values.\u003c/p\u003e\n     * \n     * @return The maximum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.getMaximumFloat()",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values.\u003c/p\u003e\n     * \n     * @return The maximum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.containsNumber(java.lang.Number)",
      "begin_line": 273,
      "end_line": 278,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003enumber\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003elong\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param number  the number to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this range\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 277,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.containsLong(long)",
      "begin_line": 291,
      "end_line": 293,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003elong\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003elong\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation overrides the superclass for performance as it is\n     * the most common case.\u003c/p\u003e\n     * \n     * @param value  the long to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this\n     *  range by \u003ccode\u003elong\u003c/code\u003e comparison\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.containsRange(org.apache.commons.lang.math.Range)",
      "begin_line": 308,
      "end_line": 314,
      "comment": "\n     * \u003cp\u003eTests whether the specified range occurs entirely within this range\n     * using \u003ccode\u003elong\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range occurs entirely within this range\n     * @throws IllegalArgumentException if the range is not of this type\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 313,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.overlapsRange(org.apache.commons.lang.math.Range)",
      "begin_line": 325,
      "end_line": 332,
      "comment": "\n     * \u003cp\u003eTests whether the specified range overlaps with this range\n     * using \u003ccode\u003elong\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range overlaps with this range\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 331,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.equals(java.lang.Object)",
      "begin_line": 345,
      "end_line": 354,
      "comment": "\n     * \u003cp\u003eCompares this range to another object to test if they are equal.\u003c/p\u003e.\n     * \n     * \u003cp\u003eTo be equal, the class, minimum and maximum must be equal.\u003c/p\u003e\n     *\n     * @param obj the reference object with which to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this object is equal\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 352,col 42)",
        "(line 353,col 9)-(line 353,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.hashCode()",
      "begin_line": 361,
      "end_line": 369,
      "comment": "\n     * \u003cp\u003eGets a hashCode for the range.\u003c/p\u003e\n     *\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 368,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.LongRange.toString()",
      "begin_line": 378,
      "end_line": 389,
      "comment": "\n     * \u003cp\u003eGets the range as a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format of the String is \u0027Range[\u003ci\u003emin\u003c/i\u003e,\u003ci\u003emax\u003c/i\u003e]\u0027.\u003c/p\u003e\n     *\n     * @return the \u003ccode\u003eString\u003c/code\u003e representation of this range\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 387,col 9)",
        "(line 388,col 9)-(line 388,col 24)"
      ]
    }
  ]
}