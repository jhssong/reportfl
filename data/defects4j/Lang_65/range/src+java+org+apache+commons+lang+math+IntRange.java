{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/math/IntRange.java",
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
      "end_line": 378,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eIntRange\u003c/code\u003e represents an inclusive range of \u003ccode\u003eint\u003c/code\u003es.\u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @since 2.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.lang.math.IntRange.IntRange(int)",
      "begin_line": 63,
      "end_line": 67,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eIntRange\u003c/code\u003e using the specified\n     * number as both the minimum and maximum in this range.\u003c/p\u003e\n     *\n     * @param number  the number to use for this range\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 16)",
        "(line 65,col 9)-(line 65,col 26)",
        "(line 66,col 9)-(line 66,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.IntRange.IntRange(java.lang.Number)",
      "begin_line": 76,
      "end_line": 87,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eIntRange\u003c/code\u003e using the specified\n     * number as both the minimum and maximum in this range.\u003c/p\u003e\n     *\n     * @param number  the number to use for this range, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the number is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 16)",
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 37)",
        "(line 82,col 9)-(line 82,col 37)",
        "(line 83,col 9)-(line 86,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.IntRange.IntRange(int, int)",
      "begin_line": 99,
      "end_line": 108,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eIntRange\u003c/code\u003e with the specified\n     * minimum and maximum numbers (both inclusive).\u003c/p\u003e\n     * \n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     * \n     * @param number1  first number that defines the edge of the range, inclusive\n     * @param number2  second number that defines the edge of the range, inclusive\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 16)",
        "(line 101,col 9)-(line 107,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.IntRange.IntRange(java.lang.Number, java.lang.Number)",
      "begin_line": 121,
      "end_line": 147,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eIntRange\u003c/code\u003e with the specified\n     * minimum and maximum numbers (both inclusive).\u003c/p\u003e\n     * \n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     *\n     * @param number1  first number that defines the edge of the range, inclusive\n     * @param number2  second number that defines the edge of the range, inclusive\n     * @throws IllegalArgumentException if either number is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 16)",
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 44)",
        "(line 127,col 9)-(line 127,col 44)",
        "(line 128,col 9)-(line 146,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMinimumNumber()",
      "begin_line": 157,
      "end_line": 162,
      "comment": "\n     * \u003cp\u003eReturns the minimum number in this range.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMinimumLong()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003elong\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMinimumInteger()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMinimumDouble()",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMinimumFloat()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMaximumNumber()",
      "begin_line": 205,
      "end_line": 210,
      "comment": "\n     * \u003cp\u003eReturns the maximum number in this range.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 209,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMaximumLong()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003elong\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMaximumInteger()",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMaximumDouble()",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.getMaximumFloat()",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.containsNumber(java.lang.Number)",
      "begin_line": 260,
      "end_line": 265,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003enumber\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003eint\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param number  the number to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this range\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 264,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.containsInteger(int)",
      "begin_line": 278,
      "end_line": 280,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003eint\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003eint\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation overrides the superclass for performance as it is\n     * the most common case.\u003c/p\u003e\n     * \n     * @param value  the int to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this\n     *  range by \u003ccode\u003eint\u003c/code\u003e comparison\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.containsRange(org.apache.commons.lang.math.Range)",
      "begin_line": 295,
      "end_line": 301,
      "comment": "\n     * \u003cp\u003eTests whether the specified range occurs entirely within this range\n     * using \u003ccode\u003eint\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range occurs entirely within this range\n     * @throws IllegalArgumentException if the range is not of this type\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 300,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.overlapsRange(org.apache.commons.lang.math.Range)",
      "begin_line": 312,
      "end_line": 319,
      "comment": "\n     * \u003cp\u003eTests whether the specified range overlaps with this range\n     * using \u003ccode\u003eint\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range overlaps with this range\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 318,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.equals(java.lang.Object)",
      "begin_line": 332,
      "end_line": 341,
      "comment": "\n     * \u003cp\u003eCompares this range to another object to test if they are equal.\u003c/p\u003e.\n     * \n     * \u003cp\u003eTo be equal, the class, minimum and maximum must be equal.\u003c/p\u003e\n     *\n     * @param obj the reference object with which to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this object is equal\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 339,col 40)",
        "(line 340,col 9)-(line 340,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.hashCode()",
      "begin_line": 348,
      "end_line": 356,
      "comment": "\n     * \u003cp\u003eGets a hashCode for the range.\u003c/p\u003e\n     *\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 355,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.IntRange.toString()",
      "begin_line": 365,
      "end_line": 376,
      "comment": "\n     * \u003cp\u003eGets the range as a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format of the String is \u0027Range[\u003ci\u003emin\u003c/i\u003e,\u003ci\u003emax\u003c/i\u003e]\u0027.\u003c/p\u003e\n     *\n     * @return the \u003ccode\u003eString\u003c/code\u003e representation of this range\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 375,col 24)"
      ]
    }
  ]
}