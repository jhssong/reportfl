{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/math/DoubleRange.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DoubleRange",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.math.Range",
        "java.io.Serializable"
      ],
      "begin_line": 27,
      "end_line": 410,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eDoubleRange\u003c/code\u003e represents an inclusive range of \u003ccode\u003edouble\u003c/code\u003es.\u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @since 2.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.lang.math.DoubleRange.DoubleRange(double)",
      "begin_line": 64,
      "end_line": 71,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eDoubleRange\u003c/code\u003e using the specified\n     * number as both the minimum and maximum in this range.\u003c/p\u003e\n     *\n     * @param number  the number to use for this range\n     * @throws IllegalArgumentException if the number is \u003ccode\u003eNaN\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 16)",
        "(line 66,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 69,col 26)",
        "(line 70,col 9)-(line 70,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.DoubleRange.DoubleRange(java.lang.Number)",
      "begin_line": 82,
      "end_line": 96,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eDoubleRange\u003c/code\u003e using the specified\n     * number as both the minimum and maximum in this range.\u003c/p\u003e\n     *\n     * @param number  the number to use for this range, must not\n     *  be \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the number is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the number is \u003ccode\u003eNaN\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 16)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 40)",
        "(line 88,col 9)-(line 88,col 40)",
        "(line 89,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 95,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.DoubleRange.DoubleRange(double, double)",
      "begin_line": 109,
      "end_line": 121,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eDoubleRange\u003c/code\u003e with the specified\n     * minimum and maximum numbers (both inclusive).\u003c/p\u003e\n     * \n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     * \n     * @param number1  first number that defines the edge of the range, inclusive\n     * @param number2  second number that defines the edge of the range, inclusive\n     * @throws IllegalArgumentException if either number is \u003ccode\u003eNaN\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 16)",
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 120,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.DoubleRange.DoubleRange(java.lang.Number, java.lang.Number)",
      "begin_line": 135,
      "end_line": 164,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eDoubleRange\u003c/code\u003e with the specified\n     * minimum and maximum numbers (both inclusive).\u003c/p\u003e\n     * \n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     *\n     * @param number1  first number that defines the edge of the range, inclusive\n     * @param number2  second number that defines the edge of the range, inclusive\n     * @throws IllegalArgumentException if either number is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if either number is \u003ccode\u003eNaN\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 16)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 50)",
        "(line 141,col 9)-(line 141,col 50)",
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 163,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.getMinimumNumber()",
      "begin_line": 174,
      "end_line": 179,
      "comment": "\n     * \u003cp\u003eReturns the minimum number in this range.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.getMinimumLong()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003elong\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values or decimals.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.getMinimumInteger()",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values or decimals.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.getMinimumDouble()",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.getMinimumFloat()",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.getMaximumNumber()",
      "begin_line": 228,
      "end_line": 233,
      "comment": "\n     * \u003cp\u003eReturns the maximum number in this range.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.getMaximumLong()",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003elong\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values or decimals.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.getMaximumInteger()",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values or decimals.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.getMaximumDouble()",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.getMaximumFloat()",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis conversion can lose information for large values.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.containsNumber(java.lang.Number)",
      "begin_line": 289,
      "end_line": 294,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003enumber\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003edouble\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param number  the number to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this range\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.containsDouble(double)",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003edouble\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003edouble\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation overrides the superclass for performance as it is\n     * the most common case.\u003c/p\u003e\n     * \n     * @param value  the double to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this\n     *  range by \u003ccode\u003edouble\u003c/code\u003e comparison\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.containsRange(org.apache.commons.lang.math.Range)",
      "begin_line": 324,
      "end_line": 330,
      "comment": "\n     * \u003cp\u003eTests whether the specified range occurs entirely within this range\n     * using \u003ccode\u003edouble\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range occurs entirely within this range\n     * @throws IllegalArgumentException if the range is not of this type\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 329,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.overlapsRange(org.apache.commons.lang.math.Range)",
      "begin_line": 341,
      "end_line": 348,
      "comment": "\n     * \u003cp\u003eTests whether the specified range overlaps with this range\n     * using \u003ccode\u003edouble\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range overlaps with this range\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 347,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.equals(java.lang.Object)",
      "begin_line": 361,
      "end_line": 371,
      "comment": "\n     * \u003cp\u003eCompares this range to another object to test if they are equal.\u003c/p\u003e.\n     * \n     * \u003cp\u003eTo be equal, the class, minimum and maximum must be equal.\u003c/p\u003e\n     *\n     * @param obj the reference object with which to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this object is equal\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 368,col 46)",
        "(line 369,col 9)-(line 370,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.hashCode()",
      "begin_line": 378,
      "end_line": 388,
      "comment": "\n     * \u003cp\u003eGets a hashCode for the range.\u003c/p\u003e\n     *\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 387,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.DoubleRange.toString()",
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