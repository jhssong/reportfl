{
  "filepath": "/tmp/Math-5b/src/main/java/org/apache/commons/math3/dfp/Dfp.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Dfp",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.RealFieldElement\u003corg.apache.commons.math3.dfp.Dfp\u003e"
      ],
      "begin_line": 98,
      "end_line": 2876,
      "comment": "\n *  Decimal floating point library for Java\n *\n *  \u003cp\u003eAnother floating point class.  This one is built using radix 10000\n *  which is 10\u003csup\u003e4\u003c/sup\u003e, so its almost decimal.\u003c/p\u003e\n *\n *  \u003cp\u003eThe design goals here are:\n *  \u003col\u003e\n *    \u003cli\u003eDecimal math, or close to it\u003c/li\u003e\n *    \u003cli\u003eSettable precision (but no mix between numbers using different settings)\u003c/li\u003e\n *    \u003cli\u003ePortability.  Code should be kept as portable as possible.\u003c/li\u003e\n *    \u003cli\u003ePerformance\u003c/li\u003e\n *    \u003cli\u003eAccuracy  - Results should always be +/- 1 ULP for basic\n *         algebraic operation\u003c/li\u003e\n *    \u003cli\u003eComply with IEEE 854-1987 as much as possible.\n *         (See IEEE 854-1987 notes below)\u003c/li\u003e\n *  \u003c/ol\u003e\u003c/p\u003e\n *\n *  \u003cp\u003eTrade offs:\n *  \u003col\u003e\n *    \u003cli\u003eMemory foot print.  I\u0027m using more memory than necessary to\n *         represent numbers to get better performance.\u003c/li\u003e\n *    \u003cli\u003eDigits are bigger, so rounding is a greater loss.  So, if you\n *         really need 12 decimal digits, better use 4 base 10000 digits\n *         there can be one partially filled.\u003c/li\u003e\n *  \u003c/ol\u003e\u003c/p\u003e\n *\n *  \u003cp\u003eNumbers are represented  in the following form:\n *  \u003cpre\u003e\n *  n  \u003d  sign \u0026times; mant \u0026times; (radix)\u003csup\u003eexp\u003c/sup\u003e;\u003c/p\u003e\n *  \u003c/pre\u003e\n *  where sign is \u0026plusmn;1, mantissa represents a fractional number between\n *  zero and one.  mant[0] is the least significant digit.\n *  exp is in the range of -32767 to 32768\u003c/p\u003e\n *\n *  \u003cp\u003eIEEE 854-1987  Notes and differences\u003c/p\u003e\n *\n *  \u003cp\u003eIEEE 854 requires the radix to be either 2 or 10.  The radix here is\n *  10000, so that requirement is not met, but  it is possible that a\n *  subclassed can be made to make it behave as a radix 10\n *  number.  It is my opinion that if it looks and behaves as a radix\n *  10 number then it is one and that requirement would be met.\u003c/p\u003e\n *\n *  \u003cp\u003eThe radix of 10000 was chosen because it should be faster to operate\n *  on 4 decimal digits at once instead of one at a time.  Radix 10 behavior\n *  can be realized by adding an additional rounding step to ensure that\n *  the number of decimal digits represented is constant.\u003c/p\u003e\n *\n *  \u003cp\u003eThe IEEE standard specifically leaves out internal data encoding,\n *  so it is reasonable to conclude that such a subclass of this radix\n *  10000 system is merely an encoding of a radix 10 system.\u003c/p\u003e\n *\n *  \u003cp\u003eIEEE 854 also specifies the existence of \"sub-normal\" numbers.  This\n *  class does not contain any such entities.  The most significant radix\n *  10000 digit is always non-zero.  Instead, we support \"gradual underflow\"\n *  by raising the underflow flag for numbers less with exponent less than\n *  expMin, but don\u0027t flush to zero until the exponent reaches MIN_EXP-digits.\n *  Thus the smallest number we can represent would be:\n *  1E(-(MIN_EXP-digits-1)*4),  eg, for digits\u003d5, MIN_EXP\u003d-32767, that would\n *  be 1e-131092.\u003c/p\u003e\n *\n *  \u003cp\u003eIEEE 854 defines that the implied radix point lies just to the right\n *  of the most significant digit and to the left of the remaining digits.\n *  This implementation puts the implied radix point to the left of all\n *  digits including the most significant one.  The most significant digit\n *  here is the one just to the right of the radix point.  This is a fine\n *  detail and is really only a matter of definition.  Any side effects of\n *  this can be rendered invisible by a subclass.\u003c/p\u003e\n * @see DfpField\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "RADIX"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " The radix, or base of this system.  Set to 10000 "
    },
    {
      "type": "field",
      "varNames": [
        "MIN_EXP"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " The minimum exponent before underflow is signaled.  Flush to zero\n     *  occurs at minExp-DIGITS "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_EXP"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " The maximum exponent before overflow is signaled and results flushed\n     *  to infinity "
    },
    {
      "type": "field",
      "varNames": [
        "ERR_SCALE"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " The amount under/overflows are scaled by before going to trap handler "
    },
    {
      "type": "field",
      "varNames": [
        "FINITE"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " Indicator value for normal finite numbers. "
    },
    {
      "type": "field",
      "varNames": [
        "INFINITE"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " Indicator value for Infinity. "
    },
    {
      "type": "field",
      "varNames": [
        "SNAN"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " Indicator value for signaling NaN. "
    },
    {
      "type": "field",
      "varNames": [
        "QNAN"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " Indicator value for quiet NaN. "
    },
    {
      "type": "field",
      "varNames": [
        "NAN_STRING"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " String for NaN representation. "
    },
    {
      "type": "field",
      "varNames": [
        "POS_INFINITY_STRING"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " String for positive infinity representation. "
    },
    {
      "type": "field",
      "varNames": [
        "NEG_INFINITY_STRING"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " String for negative infinity representation. "
    },
    {
      "type": "field",
      "varNames": [
        "ADD_TRAP"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " Name for traps triggered by addition. "
    },
    {
      "type": "field",
      "varNames": [
        "MULTIPLY_TRAP"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " Name for traps triggered by multiplication. "
    },
    {
      "type": "field",
      "varNames": [
        "DIVIDE_TRAP"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " Name for traps triggered by division. "
    },
    {
      "type": "field",
      "varNames": [
        "SQRT_TRAP"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " Name for traps triggered by square root. "
    },
    {
      "type": "field",
      "varNames": [
        "ALIGN_TRAP"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": " Name for traps triggered by alignment. "
    },
    {
      "type": "field",
      "varNames": [
        "TRUNC_TRAP"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": " Name for traps triggered by truncation. "
    },
    {
      "type": "field",
      "varNames": [
        "NEXT_AFTER_TRAP"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " Name for traps triggered by nextAfter. "
    },
    {
      "type": "field",
      "varNames": [
        "LESS_THAN_TRAP"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": " Name for traps triggered by lessThan. "
    },
    {
      "type": "field",
      "varNames": [
        "GREATER_THAN_TRAP"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": " Name for traps triggered by greaterThan. "
    },
    {
      "type": "field",
      "varNames": [
        "NEW_INSTANCE_TRAP"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": " Name for traps triggered by newInstance. "
    },
    {
      "type": "field",
      "varNames": [
        "mant"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": " Mantissa. "
    },
    {
      "type": "field",
      "varNames": [
        "sign"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": " Sign bit: 1 for positive, -1 for negative. "
    },
    {
      "type": "field",
      "varNames": [
        "exp"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": " Exponent. "
    },
    {
      "type": "field",
      "varNames": [
        "nans"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": " Indicator for non-finite / non-number values. "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": " Factory building similar Dfp\u0027s. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.dfp.Dfp.Dfp(org.apache.commons.math3.dfp.DfpField)",
      "begin_line": 183,
      "end_line": 189,
      "comment": " Makes an instance with a value of zero.\n     * @param field field to which this instance belongs\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 47)",
        "(line 185,col 9)-(line 185,col 17)",
        "(line 186,col 9)-(line 186,col 16)",
        "(line 187,col 9)-(line 187,col 22)",
        "(line 188,col 9)-(line 188,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.dfp.Dfp.Dfp(org.apache.commons.math3.dfp.DfpField, byte)",
      "begin_line": 195,
      "end_line": 197,
      "comment": " Create an instance from a byte value.\n     * @param field field to which this instance belongs\n     * @param x value to convert to an instance\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.dfp.Dfp.Dfp(org.apache.commons.math3.dfp.DfpField, int)",
      "begin_line": 203,
      "end_line": 205,
      "comment": " Create an instance from an int value.\n     * @param field field to which this instance belongs\n     * @param x value to convert to an instance\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.dfp.Dfp.Dfp(org.apache.commons.math3.dfp.DfpField, long)",
      "begin_line": 211,
      "end_line": 252,
      "comment": " Create an instance from a long value.\n     * @param field field to which this instance belongs\n     * @param x value to convert to an instance\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 47)",
        "(line 215,col 9)-(line 215,col 22)",
        "(line 216,col 9)-(line 216,col 27)",
        "(line 218,col 9)-(line 218,col 34)",
        "(line 219,col 9)-(line 224,col 9)",
        "(line 227,col 9)-(line 232,col 9)",
        "(line 234,col 9)-(line 234,col 16)",
        "(line 235,col 9)-(line 240,col 9)",
        "(line 242,col 9)-(line 251,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.dfp.Dfp.Dfp(org.apache.commons.math3.dfp.DfpField, double)",
      "begin_line": 258,
      "end_line": 319,
      "comment": " Create an instance from a double value.\n     * @param field field to which this instance belongs\n     * @param x value to convert to an instance\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 47)",
        "(line 262,col 9)-(line 262,col 17)",
        "(line 263,col 9)-(line 263,col 16)",
        "(line 264,col 9)-(line 264,col 22)",
        "(line 265,col 9)-(line 265,col 27)",
        "(line 267,col 9)-(line 267,col 47)",
        "(line 268,col 9)-(line 268,col 51)",
        "(line 269,col 9)-(line 269,col 73)",
        "(line 271,col 9)-(line 289,col 9)",
        "(line 291,col 9)-(line 304,col 9)",
        "(line 306,col 9)-(line 306,col 44)",
        "(line 307,col 9)-(line 307,col 82)",
        "(line 308,col 9)-(line 308,col 68)",
        "(line 310,col 9)-(line 312,col 9)",
        "(line 314,col 9)-(line 314,col 61)",
        "(line 315,col 9)-(line 315,col 25)",
        "(line 316,col 9)-(line 316,col 24)",
        "(line 317,col 9)-(line 317,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.dfp.Dfp.Dfp(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 324,
      "end_line": 330,
      "comment": " Copy constructor.\n     * @param d instance to copy\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 31)",
        "(line 326,col 9)-(line 326,col 23)",
        "(line 327,col 9)-(line 327,col 22)",
        "(line 328,col 9)-(line 328,col 23)",
        "(line 329,col 9)-(line 329,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.dfp.Dfp.Dfp(org.apache.commons.math3.dfp.DfpField, java.lang.String)",
      "begin_line": 336,
      "end_line": 535,
      "comment": " Create an instance from a String representation.\n     * @param field field to which this instance belongs\n     * @param s string representation of the instance\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 47)",
        "(line 340,col 9)-(line 340,col 17)",
        "(line 341,col 9)-(line 341,col 16)",
        "(line 342,col 9)-(line 342,col 22)",
        "(line 343,col 9)-(line 343,col 27)",
        "(line 345,col 9)-(line 345,col 37)",
        "(line 346,col 9)-(line 346,col 28)",
        "(line 347,col 9)-(line 347,col 29)",
        "(line 348,col 9)-(line 348,col 79)",
        "(line 351,col 9)-(line 355,col 9)",
        "(line 357,col 9)-(line 361,col 9)",
        "(line 363,col 9)-(line 367,col 9)",
        "(line 370,col 9)-(line 370,col 31)",
        "(line 371,col 9)-(line 373,col 9)",
        "(line 375,col 9)-(line 375,col 31)",
        "(line 376,col 9)-(line 376,col 23)",
        "(line 377,col 9)-(line 401,col 9)",
        "(line 404,col 9)-(line 406,col 9)",
        "(line 409,col 9)-(line 409,col 14)",
        "(line 412,col 9)-(line 412,col 27)",
        "(line 413,col 9)-(line 431,col 9)",
        "(line 434,col 9)-(line 434,col 23)",
        "(line 435,col 9)-(line 435,col 25)",
        "(line 436,col 9)-(line 436,col 25)",
        "(line 437,col 9)-(line 437,col 25)",
        "(line 438,col 9)-(line 438,col 25)",
        "(line 439,col 9)-(line 439,col 32)",
        "(line 440,col 9)-(line 466,col 9)",
        "(line 470,col 9)-(line 482,col 9)",
        "(line 485,col 9)-(line 487,col 9)",
        "(line 490,col 9)-(line 492,col 9)",
        "(line 495,col 9)-(line 495,col 19)",
        "(line 496,col 9)-(line 496,col 39)",
        "(line 498,col 9)-(line 503,col 9)",
        "(line 506,col 9)-(line 506,col 70)",
        "(line 507,col 9)-(line 507,col 15)",
        "(line 508,col 9)-(line 508,col 24)",
        "(line 511,col 9)-(line 515,col 9)",
        "(line 519,col 9)-(line 525,col 9)",
        "(line 528,col 9)-(line 528,col 42)",
        "(line 530,col 9)-(line 533,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.dfp.Dfp.Dfp(org.apache.commons.math3.dfp.DfpField, byte, byte)",
      "begin_line": 543,
      "end_line": 549,
      "comment": " Creates an instance with a non-finite value.\n     * @param field field to which this instance belongs\n     * @param sign sign of the Dfp to create\n     * @param nans code of the value, must be one of {@link #INFINITE},\n     * {@link #SNAN},  {@link #QNAN}\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 27)",
        "(line 545,col 9)-(line 545,col 55)",
        "(line 546,col 9)-(line 546,col 28)",
        "(line 547,col 9)-(line 547,col 25)",
        "(line 548,col 9)-(line 548,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.newInstance()",
      "begin_line": 555,
      "end_line": 557,
      "comment": " Create an instance with a value of 0.\n     * Use this internally in preference to constructors to facilitate subclasses\n     * @return a new instance with a value of 0\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.newInstance(byte)",
      "begin_line": 563,
      "end_line": 565,
      "comment": " Create an instance from a byte value.\n     * @param x value to convert to an instance\n     * @return a new instance with value x\n     ",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.newInstance(int)",
      "begin_line": 571,
      "end_line": 573,
      "comment": " Create an instance from an int value.\n     * @param x value to convert to an instance\n     * @return a new instance with value x\n     ",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.newInstance(long)",
      "begin_line": 579,
      "end_line": 581,
      "comment": " Create an instance from a long value.\n     * @param x value to convert to an instance\n     * @return a new instance with value x\n     ",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.newInstance(double)",
      "begin_line": 587,
      "end_line": 589,
      "comment": " Create an instance from a double value.\n     * @param x value to convert to an instance\n     * @return a new instance with value x\n     ",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.newInstance(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 596,
      "end_line": 608,
      "comment": " Create an instance by copying an existing one.\n     * Use this internally in preference to constructors to facilitate subclasses.\n     * @param d instance to copy\n     * @return a new instance with the same value as d\n     ",
      "child_ranges": [
        "(line 599,col 9)-(line 604,col 9)",
        "(line 606,col 9)-(line 606,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.newInstance(java.lang.String)",
      "begin_line": 615,
      "end_line": 617,
      "comment": " Create an instance from a String representation.\n     * Use this internally in preference to constructors to facilitate subclasses.\n     * @param s string representation of the instance\n     * @return a new instance parsed from specified string\n     ",
      "child_ranges": [
        "(line 616,col 9)-(line 616,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.newInstance(byte, byte)",
      "begin_line": 625,
      "end_line": 627,
      "comment": " Creates an instance with a non-finite value.\n     * @param sig sign of the Dfp to create\n     * @param code code of the value, must be one of {@link #INFINITE},\n     * {@link #SNAN},  {@link #QNAN}\n     * @return a new instance with a non-finite value\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.getField()",
      "begin_line": 636,
      "end_line": 638,
      "comment": " Get the {@link org.apache.commons.math3.Field Field} (really a {@link DfpField}) to which the instance belongs.\n     * \u003cp\u003e\n     * The field is linked to the number of digits and acts as a factory\n     * for {@link Dfp} instances.\n     * \u003c/p\u003e\n     * @return {@link org.apache.commons.math3.Field Field} (really a {@link DfpField}) to which the instance belongs\n     ",
      "child_ranges": [
        "(line 637,col 9)-(line 637,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.getRadixDigits()",
      "begin_line": 643,
      "end_line": 645,
      "comment": " Get the number of radix digits of the instance.\n     * @return number of radix digits\n     ",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.getZero()",
      "begin_line": 650,
      "end_line": 652,
      "comment": " Get the constant 0.\n     * @return a Dfp with value zero\n     ",
      "child_ranges": [
        "(line 651,col 9)-(line 651,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.getOne()",
      "begin_line": 657,
      "end_line": 659,
      "comment": " Get the constant 1.\n     * @return a Dfp with value one\n     ",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.getTwo()",
      "begin_line": 664,
      "end_line": 666,
      "comment": " Get the constant 2.\n     * @return a Dfp with value two\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.shiftLeft()",
      "begin_line": 670,
      "end_line": 676,
      "comment": " Shift the mantissa left, and adjust the exponent to compensate.\n     ",
      "child_ranges": [
        "(line 671,col 9)-(line 673,col 9)",
        "(line 674,col 9)-(line 674,col 20)",
        "(line 675,col 9)-(line 675,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.shiftRight()",
      "begin_line": 682,
      "end_line": 688,
      "comment": " Shift the mantissa right, and adjust the exponent to compensate.\n     ",
      "child_ranges": [
        "(line 683,col 9)-(line 685,col 9)",
        "(line 686,col 9)-(line 686,col 34)",
        "(line 687,col 9)-(line 687,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.align(int)",
      "begin_line": 698,
      "end_line": 749,
      "comment": " Make our exp equal to the supplied one, this may cause rounding.\n     *  Also causes de-normalized numbers.  These numbers are generally\n     *  dangerous because most routines assume normalized numbers.\n     *  Align doesn\u0027t round, so it will return the last digit destroyed\n     *  by shifting right.\n     *  @param e desired exponent\n     *  @return last digit destroyed by shifting right\n     ",
      "child_ranges": [
        "(line 699,col 9)-(line 699,col 26)",
        "(line 700,col 9)-(line 700,col 32)",
        "(line 702,col 9)-(line 702,col 27)",
        "(line 704,col 9)-(line 704,col 25)",
        "(line 705,col 9)-(line 707,col 9)",
        "(line 709,col 9)-(line 711,col 9)",
        "(line 713,col 9)-(line 722,col 9)",
        "(line 724,col 9)-(line 740,col 9)",
        "(line 742,col 9)-(line 745,col 9)",
        "(line 747,col 9)-(line 747,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.lessThan(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 755,
      "end_line": 774,
      "comment": " Check if instance is less than x.\n     * @param x number to check instance against\n     * @return true if instance is less than x and neither are NaN, false otherwise\n     ",
      "child_ranges": [
        "(line 758,col 9)-(line 764,col 9)",
        "(line 767,col 9)-(line 771,col 9)",
        "(line 773,col 9)-(line 773,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.greaterThan(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 780,
      "end_line": 799,
      "comment": " Check if instance is greater than x.\n     * @param x number to check instance against\n     * @return true if instance is greater than x and neither are NaN, false otherwise\n     ",
      "child_ranges": [
        "(line 783,col 9)-(line 789,col 9)",
        "(line 792,col 9)-(line 796,col 9)",
        "(line 798,col 9)-(line 798,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.negativeOrNull()",
      "begin_line": 804,
      "end_line": 814,
      "comment": " Check if instance is less than or equal to 0.\n     * @return true if instance is not NaN and less than or equal to 0, false otherwise\n     ",
      "child_ranges": [
        "(line 806,col 9)-(line 810,col 9)",
        "(line 812,col 9)-(line 812,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.strictlyNegative()",
      "begin_line": 819,
      "end_line": 829,
      "comment": " Check if instance is strictly less than 0.\n     * @return true if instance is not NaN and less than or equal to 0, false otherwise\n     ",
      "child_ranges": [
        "(line 821,col 9)-(line 825,col 9)",
        "(line 827,col 9)-(line 827,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.positiveOrNull()",
      "begin_line": 834,
      "end_line": 844,
      "comment": " Check if instance is greater than or equal to 0.\n     * @return true if instance is not NaN and greater than or equal to 0, false otherwise\n     ",
      "child_ranges": [
        "(line 836,col 9)-(line 840,col 9)",
        "(line 842,col 9)-(line 842,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.strictlyPositive()",
      "begin_line": 849,
      "end_line": 859,
      "comment": " Check if instance is strictly greater than 0.\n     * @return true if instance is not NaN and greater than or equal to 0, false otherwise\n     ",
      "child_ranges": [
        "(line 851,col 9)-(line 855,col 9)",
        "(line 857,col 9)-(line 857,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.abs()",
      "begin_line": 864,
      "end_line": 868,
      "comment": " Get the absolute value of instance.\n     * @return absolute value of instance\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 865,col 39)",
        "(line 866,col 9)-(line 866,col 24)",
        "(line 867,col 9)-(line 867,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.isInfinite()",
      "begin_line": 873,
      "end_line": 875,
      "comment": " Check if instance is infinite.\n     * @return true if instance is infinite\n     ",
      "child_ranges": [
        "(line 874,col 9)-(line 874,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.isNaN()",
      "begin_line": 880,
      "end_line": 882,
      "comment": " Check if instance is not a number.\n     * @return true if instance is not a number\n     ",
      "child_ranges": [
        "(line 881,col 9)-(line 881,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.isZero()",
      "begin_line": 887,
      "end_line": 897,
      "comment": " Check if instance is equal to zero.\n     * @return true if instance is equal to zero\n     ",
      "child_ranges": [
        "(line 889,col 9)-(line 893,col 9)",
        "(line 895,col 9)-(line 895,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.equals(java.lang.Object)",
      "begin_line": 903,
      "end_line": 917,
      "comment": " Check if instance is equal to x.\n     * @param other object to check instance against\n     * @return true if instance is equal to x and neither are NaN, false otherwise\n     ",
      "child_ranges": [
        "(line 906,col 9)-(line 913,col 9)",
        "(line 915,col 9)-(line 915,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.hashCode()",
      "begin_line": 923,
      "end_line": 926,
      "comment": "\n     * Gets a hashCode for the instance.\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 925,col 9)-(line 925,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.unequal(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 932,
      "end_line": 938,
      "comment": " Check if instance is not equal to x.\n     * @param x number to check instance against\n     * @return true if instance is not equal to x and neither are NaN, false otherwise\n     ",
      "child_ranges": [
        "(line 933,col 9)-(line 935,col 9)",
        "(line 937,col 9)-(line 937,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.compare(org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 946,
      "end_line": 998,
      "comment": " Compare two instances.\n     * @param a first instance in comparison\n     * @param b second instance in comparison\n     * @return -1 if a\u003cb, 1 if a\u003eb and 0 if a\u003d\u003db\n     *  Note this method does not properly handle NaNs or numbers with different precision.\n     ",
      "child_ranges": [
        "(line 948,col 9)-(line 951,col 9)",
        "(line 953,col 9)-(line 959,col 9)",
        "(line 962,col 9)-(line 964,col 9)",
        "(line 966,col 9)-(line 968,col 9)",
        "(line 970,col 9)-(line 972,col 9)",
        "(line 975,col 9)-(line 983,col 9)",
        "(line 986,col 9)-(line 994,col 9)",
        "(line 996,col 9)-(line 996,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.rint()",
      "begin_line": 1005,
      "end_line": 1007,
      "comment": " Round to nearest integer using the round-half-even method.\n     *  That is round to nearest integer unless both are equidistant.\n     *  In which case round to the even one.\n     *  @return rounded value\n     ",
      "child_ranges": [
        "(line 1006,col 9)-(line 1006,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.floor()",
      "begin_line": 1013,
      "end_line": 1015,
      "comment": " Round to an integer using the round floor mode.\n     * That is, round toward -Infinity\n     *  @return rounded value\n     ",
      "child_ranges": [
        "(line 1014,col 9)-(line 1014,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.ceil()",
      "begin_line": 1021,
      "end_line": 1023,
      "comment": " Round to an integer using the round ceil mode.\n     * That is, round toward +Infinity\n     *  @return rounded value\n     ",
      "child_ranges": [
        "(line 1022,col 9)-(line 1022,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.remainder(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 1029,
      "end_line": 1040,
      "comment": " Returns the IEEE remainder.\n     * @param d divisor\n     * @return this less n \u0026times; d, where n is the integer closest to this/d\n     ",
      "child_ranges": [
        "(line 1031,col 9)-(line 1031,col 76)",
        "(line 1034,col 9)-(line 1036,col 9)",
        "(line 1038,col 9)-(line 1038,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.trunc(org.apache.commons.math3.dfp.DfpField.RoundingMode)",
      "begin_line": 1046,
      "end_line": 1130,
      "comment": " Does the integer conversions with the specified rounding.\n     * @param rmode rounding mode to use\n     * @return truncated value\n     ",
      "child_ranges": [
        "(line 1047,col 9)-(line 1047,col 32)",
        "(line 1049,col 9)-(line 1051,col 9)",
        "(line 1053,col 9)-(line 1055,col 9)",
        "(line 1057,col 9)-(line 1060,col 9)",
        "(line 1064,col 9)-(line 1069,col 9)",
        "(line 1075,col 9)-(line 1077,col 9)",
        "(line 1082,col 9)-(line 1082,col 39)",
        "(line 1083,col 9)-(line 1086,col 9)",
        "(line 1088,col 9)-(line 1127,col 9)",
        "(line 1129,col 9)-(line 1129,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.intValue()",
      "begin_line": 1136,
      "end_line": 1159,
      "comment": " Convert this to an integer.\n     * If greater than 2147483647, it returns 2147483647. If less than -2147483648 it returns -2147483648.\n     * @return converted number\n     ",
      "child_ranges": [
        "(line 1137,col 9)-(line 1137,col 20)",
        "(line 1138,col 9)-(line 1138,col 23)",
        "(line 1140,col 9)-(line 1140,col 25)",
        "(line 1142,col 9)-(line 1144,col 9)",
        "(line 1146,col 9)-(line 1148,col 9)",
        "(line 1150,col 9)-(line 1152,col 9)",
        "(line 1154,col 9)-(line 1156,col 9)",
        "(line 1158,col 9)-(line 1158,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.log10K()",
      "begin_line": 1166,
      "end_line": 1168,
      "comment": " Get the exponent of the greatest power of 10000 that is\n     *  less than or equal to the absolute value of this.  I.E.  if\n     *  this is 10\u003csup\u003e6\u003c/sup\u003e then log10K would return 1.\n     *  @return integer base 10000 logarithm\n     ",
      "child_ranges": [
        "(line 1167,col 9)-(line 1167,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.power10K(int)",
      "begin_line": 1174,
      "end_line": 1178,
      "comment": " Get the specified  power of 10000.\n     * @param e desired power\n     * @return 10000\u003csup\u003ee\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 1175,col 9)-(line 1175,col 38)",
        "(line 1176,col 9)-(line 1176,col 22)",
        "(line 1177,col 9)-(line 1177,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.intLog10()",
      "begin_line": 1183,
      "end_line": 1194,
      "comment": " Get the exponent of the greatest power of 10 that is less than or equal to abs(this).\n     *  @return integer base 10 logarithm\n     ",
      "child_ranges": [
        "(line 1184,col 9)-(line 1186,col 9)",
        "(line 1187,col 9)-(line 1189,col 9)",
        "(line 1190,col 9)-(line 1192,col 9)",
        "(line 1193,col 9)-(line 1193,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.power10(int)",
      "begin_line": 1200,
      "end_line": 1223,
      "comment": " Return the specified  power of 10.\n     * @param e desired power\n     * @return 10\u003csup\u003ee\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 1201,col 9)-(line 1201,col 38)",
        "(line 1203,col 9)-(line 1207,col 9)",
        "(line 1209,col 9)-(line 1220,col 9)",
        "(line 1222,col 9)-(line 1222,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.complement(int)",
      "begin_line": 1231,
      "end_line": 1247,
      "comment": " Negate the mantissa of this by computing the complement.\n     *  Leaves the sign bit unchanged, used internally by add.\n     *  Denormalized numbers are handled properly here.\n     *  @param extra ???\n     *  @return ???\n     ",
      "child_ranges": [
        "(line 1233,col 9)-(line 1233,col 28)",
        "(line 1234,col 9)-(line 1236,col 9)",
        "(line 1238,col 9)-(line 1238,col 31)",
        "(line 1239,col 9)-(line 1239,col 35)",
        "(line 1240,col 9)-(line 1244,col 9)",
        "(line 1246,col 9)-(line 1246,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.add(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 1253,
      "end_line": 1396,
      "comment": " Add x to this.\n     * @param x number to add\n     * @return sum of this and x\n     ",
      "child_ranges": [
        "(line 1256,col 9)-(line 1261,col 9)",
        "(line 1264,col 9)-(line 1292,col 9)",
        "(line 1295,col 9)-(line 1295,col 34)",
        "(line 1296,col 9)-(line 1296,col 31)",
        "(line 1299,col 9)-(line 1299,col 44)",
        "(line 1302,col 9)-(line 1302,col 34)",
        "(line 1303,col 9)-(line 1303,col 34)",
        "(line 1305,col 9)-(line 1305,col 19)",
        "(line 1306,col 9)-(line 1306,col 19)",
        "(line 1309,col 9)-(line 1309,col 27)",
        "(line 1310,col 9)-(line 1312,col 9)",
        "(line 1317,col 9)-(line 1319,col 9)",
        "(line 1321,col 9)-(line 1323,col 9)",
        "(line 1326,col 9)-(line 1326,col 28)",
        "(line 1327,col 9)-(line 1327,col 28)",
        "(line 1328,col 9)-(line 1332,col 9)",
        "(line 1335,col 9)-(line 1341,col 9)",
        "(line 1344,col 9)-(line 1344,col 19)",
        "(line 1345,col 9)-(line 1349,col 9)",
        "(line 1350,col 9)-(line 1350,col 27)",
        "(line 1351,col 9)-(line 1351,col 28)",
        "(line 1356,col 9)-(line 1364,col 9)",
        "(line 1367,col 9)-(line 1377,col 9)",
        "(line 1380,col 9)-(line 1387,col 9)",
        "(line 1390,col 9)-(line 1390,col 65)",
        "(line 1391,col 9)-(line 1393,col 9)",
        "(line 1395,col 9)-(line 1395,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.negate()",
      "begin_line": 1401,
      "end_line": 1405,
      "comment": " Returns a number that is this number with the sign bit reversed.\n     * @return the opposite of this\n     ",
      "child_ranges": [
        "(line 1402,col 9)-(line 1402,col 39)",
        "(line 1403,col 9)-(line 1403,col 43)",
        "(line 1404,col 9)-(line 1404,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.subtract(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 1411,
      "end_line": 1413,
      "comment": " Subtract x from this.\n     * @param x number to subtract\n     * @return difference of this and a\n     ",
      "child_ranges": [
        "(line 1412,col 9)-(line 1412,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.round(int)",
      "begin_line": 1419,
      "end_line": 1492,
      "comment": " Round this given the next digit n using the current rounding mode.\n     * @param n ???\n     * @return the IEEE flag if an exception occurred\n     ",
      "child_ranges": [
        "(line 1420,col 9)-(line 1420,col 28)",
        "(line 1421,col 9)-(line 1454,col 9)",
        "(line 1456,col 9)-(line 1469,col 9)",
        "(line 1472,col 9)-(line 1476,col 9)",
        "(line 1478,col 9)-(line 1482,col 9)",
        "(line 1484,col 9)-(line 1488,col 9)",
        "(line 1490,col 9)-(line 1490,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.multiply(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 1498,
      "end_line": 1598,
      "comment": " Multiply this by x.\n     * @param x multiplicand\n     * @return product of this and x\n     ",
      "child_ranges": [
        "(line 1501,col 9)-(line 1506,col 9)",
        "(line 1508,col 9)-(line 1508,col 44)",
        "(line 1511,col 9)-(line 1546,col 9)",
        "(line 1548,col 9)-(line 1548,col 47)",
        "(line 1550,col 9)-(line 1560,col 9)",
        "(line 1563,col 9)-(line 1563,col 37)",
        "(line 1564,col 9)-(line 1569,col 9)",
        "(line 1572,col 9)-(line 1574,col 9)",
        "(line 1577,col 9)-(line 1577,col 60)",
        "(line 1578,col 9)-(line 1578,col 52)",
        "(line 1580,col 9)-(line 1583,col 9)",
        "(line 1585,col 9)-(line 1585,col 23)",
        "(line 1586,col 9)-(line 1590,col 9)",
        "(line 1592,col 9)-(line 1594,col 9)",
        "(line 1596,col 9)-(line 1596,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.multiply(int)",
      "begin_line": 1604,
      "end_line": 1610,
      "comment": " Multiply this by a single digit x.\n     * @param x multiplicand\n     * @return product of this and x\n     ",
      "child_ranges": [
        "(line 1605,col 9)-(line 1609,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.multiplyFast(int)",
      "begin_line": 1617,
      "end_line": 1673,
      "comment": " Multiply this by a single digit 0\u0026lt;\u003dx\u0026lt;radix.\n     * There are speed advantages in this special case.\n     * @param x multiplicand\n     * @return product of this and x\n     ",
      "child_ranges": [
        "(line 1618,col 9)-(line 1618,col 39)",
        "(line 1621,col 9)-(line 1638,col 9)",
        "(line 1641,col 9)-(line 1647,col 9)",
        "(line 1649,col 9)-(line 1649,col 19)",
        "(line 1650,col 9)-(line 1654,col 9)",
        "(line 1656,col 9)-(line 1656,col 26)",
        "(line 1657,col 9)-(line 1661,col 9)",
        "(line 1663,col 9)-(line 1665,col 9)",
        "(line 1667,col 9)-(line 1667,col 49)",
        "(line 1668,col 9)-(line 1670,col 9)",
        "(line 1672,col 9)-(line 1672,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.divide(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 1679,
      "end_line": 1887,
      "comment": " Divide this by divisor.\n     * @param divisor divisor\n     * @return quotient of this by divisor\n     ",
      "child_ranges": [
        "(line 1680,col 9)-(line 1680,col 23)",
        "(line 1681,col 9)-(line 1681,col 23)",
        "(line 1682,col 9)-(line 1682,col 24)",
        "(line 1683,col 9)-(line 1683,col 15)",
        "(line 1684,col 9)-(line 1684,col 17)",
        "(line 1685,col 9)-(line 1685,col 20)",
        "(line 1686,col 9)-(line 1686,col 19)",
        "(line 1687,col 9)-(line 1687,col 26)",
        "(line 1688,col 9)-(line 1688,col 17)",
        "(line 1689,col 9)-(line 1689,col 17)",
        "(line 1692,col 9)-(line 1697,col 9)",
        "(line 1699,col 9)-(line 1699,col 44)",
        "(line 1702,col 9)-(line 1730,col 9)",
        "(line 1733,col 9)-(line 1740,col 9)",
        "(line 1742,col 9)-(line 1742,col 42)",
        "(line 1743,col 9)-(line 1743,col 42)",
        "(line 1744,col 9)-(line 1744,col 43)",
        "(line 1748,col 9)-(line 1748,col 34)",
        "(line 1749,col 9)-(line 1749,col 34)",
        "(line 1750,col 9)-(line 1750,col 36)",
        "(line 1751,col 9)-(line 1751,col 35)",
        "(line 1756,col 9)-(line 1760,col 9)",
        "(line 1763,col 9)-(line 1763,col 17)",
        "(line 1764,col 9)-(line 1852,col 9)",
        "(line 1855,col 9)-(line 1855,col 25)",
        "(line 1856,col 9)-(line 1861,col 9)",
        "(line 1864,col 9)-(line 1866,col 9)",
        "(line 1869,col 9)-(line 1869,col 58)",
        "(line 1870,col 9)-(line 1870,col 63)",
        "(line 1872,col 9)-(line 1874,col 9)",
        "(line 1876,col 9)-(line 1880,col 9)",
        "(line 1882,col 9)-(line 1884,col 9)",
        "(line 1886,col 9)-(line 1886,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.divide(int)",
      "begin_line": 1894,
      "end_line": 1952,
      "comment": " Divide by a single digit less than radix.\n     *  Special case, so there are speed advantages. 0 \u0026lt;\u003d divisor \u0026lt; radix\n     * @param divisor divisor\n     * @return quotient of this by divisor\n     ",
      "child_ranges": [
        "(line 1897,col 9)-(line 1905,col 9)",
        "(line 1908,col 9)-(line 1915,col 9)",
        "(line 1918,col 9)-(line 1924,col 9)",
        "(line 1926,col 9)-(line 1926,col 39)",
        "(line 1928,col 9)-(line 1928,col 19)",
        "(line 1929,col 9)-(line 1934,col 9)",
        "(line 1936,col 9)-(line 1943,col 9)",
        "(line 1945,col 9)-(line 1945,col 60)",
        "(line 1946,col 9)-(line 1948,col 9)",
        "(line 1950,col 9)-(line 1950,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.reciprocal()",
      "begin_line": 1955,
      "end_line": 1957,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1956,col 9)-(line 1956,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.sqrt()",
      "begin_line": 1962,
      "end_line": 2053,
      "comment": " Compute the square root.\n     * @return square root of the instance\n     ",
      "child_ranges": [
        "(line 1965,col 9)-(line 1968,col 9)",
        "(line 1970,col 9)-(line 1988,col 9)",
        "(line 1990,col 9)-(line 1999,col 9)",
        "(line 2001,col 9)-(line 2001,col 34)",
        "(line 2004,col 9)-(line 2006,col 9)",
        "(line 2009,col 9)-(line 2021,col 9)",
        "(line 2023,col 9)-(line 2023,col 32)",
        "(line 2028,col 9)-(line 2028,col 28)",
        "(line 2029,col 9)-(line 2029,col 28)",
        "(line 2030,col 9)-(line 2049,col 9)",
        "(line 2051,col 9)-(line 2051,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.toString()",
      "begin_line": 2058,
      "end_line": 2075,
      "comment": " Get a string representation of the instance.\n     * @return string representation of the instance\n     ",
      "child_ranges": [
        "(line 2060,col 9)-(line 2067,col 9)",
        "(line 2069,col 9)-(line 2071,col 9)",
        "(line 2073,col 9)-(line 2073,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.dfp2sci()",
      "begin_line": 2080,
      "end_line": 2156,
      "comment": " Convert an instance to a string using scientific notation.\n     * @return string representation of the instance in scientific notation\n     ",
      "child_ranges": [
        "(line 2081,col 9)-(line 2081,col 56)",
        "(line 2082,col 9)-(line 2082,col 61)",
        "(line 2083,col 9)-(line 2083,col 14)",
        "(line 2084,col 9)-(line 2084,col 14)",
        "(line 2085,col 9)-(line 2085,col 14)",
        "(line 2086,col 9)-(line 2086,col 15)",
        "(line 2087,col 9)-(line 2087,col 16)",
        "(line 2090,col 9)-(line 2090,col 14)",
        "(line 2091,col 9)-(line 2096,col 9)",
        "(line 2099,col 9)-(line 2103,col 9)",
        "(line 2104,col 9)-(line 2104,col 16)",
        "(line 2107,col 9)-(line 2107,col 14)",
        "(line 2108,col 9)-(line 2110,col 9)",
        "(line 2112,col 9)-(line 2127,col 9)",
        "(line 2129,col 9)-(line 2129,col 32)",
        "(line 2133,col 9)-(line 2133,col 30)",
        "(line 2134,col 9)-(line 2134,col 15)",
        "(line 2135,col 9)-(line 2137,col 9)",
        "(line 2140,col 9)-(line 2142,col 9)",
        "(line 2144,col 9)-(line 2146,col 9)",
        "(line 2148,col 9)-(line 2152,col 9)",
        "(line 2154,col 9)-(line 2154,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.dfp2string()",
      "begin_line": 2161,
      "end_line": 2229,
      "comment": " Convert an instance to a string using normal notation.\n     * @return string representation of the instance in normal notation\n     ",
      "child_ranges": [
        "(line 2162,col 9)-(line 2162,col 53)",
        "(line 2163,col 9)-(line 2163,col 18)",
        "(line 2164,col 9)-(line 2164,col 14)",
        "(line 2165,col 9)-(line 2165,col 20)",
        "(line 2166,col 9)-(line 2166,col 38)",
        "(line 2168,col 9)-(line 2168,col 24)",
        "(line 2170,col 9)-(line 2174,col 9)",
        "(line 2176,col 9)-(line 2182,col 9)",
        "(line 2184,col 9)-(line 2193,col 9)",
        "(line 2195,col 9)-(line 2201,col 9)",
        "(line 2203,col 9)-(line 2206,col 9)",
        "(line 2209,col 9)-(line 2209,col 14)",
        "(line 2210,col 9)-(line 2212,col 9)",
        "(line 2213,col 9)-(line 2215,col 9)",
        "(line 2218,col 9)-(line 2220,col 9)",
        "(line 2223,col 9)-(line 2225,col 9)",
        "(line 2227,col 9)-(line 2227,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.dotrap(int, java.lang.String, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2238,
      "end_line": 2295,
      "comment": " Raises a trap.  This does not set the corresponding flag however.\n     *  @param type the trap type\n     *  @param what - name of routine trap occurred in\n     *  @param oper - input operator to function\n     *  @param result - the result computed prior to the trap\n     *  @return The suggested return value from the trap handler\n     ",
      "child_ranges": [
        "(line 2239,col 9)-(line 2239,col 25)",
        "(line 2241,col 9)-(line 2291,col 9)",
        "(line 2293,col 9)-(line 2293,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.trap(int, java.lang.String, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2308,
      "end_line": 2310,
      "comment": " Trap handler.  Subclasses may override this to provide trap\n     *  functionality per IEEE 854-1987.\n     *\n     *  @param type  The exception type - e.g. FLAG_OVERFLOW\n     *  @param what  The name of the routine we were in e.g. divide()\n     *  @param oper  An operand to this function if any\n     *  @param def   The default return value if trap not enabled\n     *  @param result    The result that is specified to be delivered per\n     *                   IEEE 854, if any\n     *  @return the value that should be return by the operation triggering the trap\n     ",
      "child_ranges": [
        "(line 2309,col 9)-(line 2309,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.classify()",
      "begin_line": 2315,
      "end_line": 2317,
      "comment": " Returns the type - one of FINITE, INFINITE, SNAN, QNAN.\n     * @return type of the number\n     ",
      "child_ranges": [
        "(line 2316,col 9)-(line 2316,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.copysign(org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2325,
      "end_line": 2329,
      "comment": " Creates an instance that is the same as x except that it has the sign of y.\n     * abs(x) \u003d dfp.copysign(x, dfp.one)\n     * @param x number to get the value from\n     * @param y number to get the sign from\n     * @return a number with the value of x and the sign of y\n     ",
      "child_ranges": [
        "(line 2326,col 9)-(line 2326,col 38)",
        "(line 2327,col 9)-(line 2327,col 29)",
        "(line 2328,col 9)-(line 2328,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.nextAfter(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2336,
      "end_line": 2402,
      "comment": " Returns the next number greater than this one in the direction of x.\n     * If this\u003d\u003dx then simply returns this.\n     * @param x direction where to look at\n     * @return closest number next to instance in the direction of x\n     ",
      "child_ranges": [
        "(line 2339,col 9)-(line 2344,col 9)",
        "(line 2347,col 9)-(line 2347,col 27)",
        "(line 2348,col 9)-(line 2350,col 9)",
        "(line 2352,col 9)-(line 2354,col 9)",
        "(line 2356,col 9)-(line 2358,col 9)",
        "(line 2360,col 9)-(line 2360,col 22)",
        "(line 2361,col 9)-(line 2361,col 19)",
        "(line 2362,col 9)-(line 2388,col 9)",
        "(line 2390,col 9)-(line 2393,col 9)",
        "(line 2395,col 9)-(line 2398,col 9)",
        "(line 2400,col 9)-(line 2400,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.toDouble()",
      "begin_line": 2408,
      "end_line": 2492,
      "comment": " Convert the instance into a double.\n     * @return a double approximating the instance\n     * @see #toSplitDouble()\n     ",
      "child_ranges": [
        "(line 2410,col 9)-(line 2416,col 9)",
        "(line 2418,col 9)-(line 2420,col 9)",
        "(line 2422,col 9)-(line 2422,col 21)",
        "(line 2423,col 9)-(line 2423,col 31)",
        "(line 2424,col 9)-(line 2424,col 44)",
        "(line 2425,col 9)-(line 2430,col 9)",
        "(line 2434,col 9)-(line 2434,col 50)",
        "(line 2435,col 9)-(line 2437,col 9)",
        "(line 2439,col 9)-(line 2439,col 54)",
        "(line 2440,col 9)-(line 2443,col 9)",
        "(line 2444,col 9)-(line 2444,col 19)",
        "(line 2448,col 9)-(line 2448,col 54)",
        "(line 2449,col 9)-(line 2451,col 9)",
        "(line 2453,col 9)-(line 2455,col 9)",
        "(line 2457,col 9)-(line 2459,col 9)",
        "(line 2462,col 9)-(line 2462,col 62)",
        "(line 2463,col 9)-(line 2463,col 34)",
        "(line 2464,col 9)-(line 2464,col 47)",
        "(line 2465,col 9)-(line 2465,col 44)",
        "(line 2467,col 9)-(line 2471,col 9)",
        "(line 2474,col 9)-(line 2476,col 9)",
        "(line 2478,col 9)-(line 2481,col 9)",
        "(line 2483,col 9)-(line 2483,col 58)",
        "(line 2484,col 9)-(line 2484,col 49)",
        "(line 2486,col 9)-(line 2488,col 9)",
        "(line 2490,col 9)-(line 2490,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.toSplitDouble()",
      "begin_line": 2498,
      "end_line": 2506,
      "comment": " Convert the instance into a split double.\n     * @return an array of two doubles which sum represent the instance\n     * @see #toDouble()\n     ",
      "child_ranges": [
        "(line 2499,col 9)-(line 2499,col 39)",
        "(line 2500,col 9)-(line 2500,col 40)",
        "(line 2502,col 9)-(line 2502,col 87)",
        "(line 2503,col 9)-(line 2503,col 62)",
        "(line 2505,col 9)-(line 2505,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.getReal()",
      "begin_line": 2511,
      "end_line": 2513,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2512,col 9)-(line 2512,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.add(double)",
      "begin_line": 2518,
      "end_line": 2520,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2519,col 9)-(line 2519,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.subtract(double)",
      "begin_line": 2525,
      "end_line": 2527,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2526,col 9)-(line 2526,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.multiply(double)",
      "begin_line": 2532,
      "end_line": 2534,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2533,col 9)-(line 2533,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.divide(double)",
      "begin_line": 2539,
      "end_line": 2541,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2540,col 9)-(line 2540,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.remainder(double)",
      "begin_line": 2546,
      "end_line": 2548,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2547,col 9)-(line 2547,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.round()",
      "begin_line": 2553,
      "end_line": 2555,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2554,col 9)-(line 2554,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.signum()",
      "begin_line": 2560,
      "end_line": 2566,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2561,col 9)-(line 2565,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.copySign(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2571,
      "end_line": 2576,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2572,col 9)-(line 2574,col 9)",
        "(line 2575,col 9)-(line 2575,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.copySign(double)",
      "begin_line": 2581,
      "end_line": 2587,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2582,col 9)-(line 2582,col 45)",
        "(line 2583,col 9)-(line 2585,col 9)",
        "(line 2586,col 9)-(line 2586,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.scalb(int)",
      "begin_line": 2592,
      "end_line": 2594,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2593,col 9)-(line 2593,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.hypot(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2599,
      "end_line": 2601,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2600,col 9)-(line 2600,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.cbrt()",
      "begin_line": 2606,
      "end_line": 2608,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2607,col 9)-(line 2607,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.rootN(int)",
      "begin_line": 2613,
      "end_line": 2617,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2614,col 9)-(line 2616,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.pow(double)",
      "begin_line": 2622,
      "end_line": 2624,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2623,col 9)-(line 2623,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.pow(int)",
      "begin_line": 2629,
      "end_line": 2631,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2630,col 9)-(line 2630,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.pow(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2636,
      "end_line": 2638,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2637,col 9)-(line 2637,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.exp()",
      "begin_line": 2643,
      "end_line": 2645,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2644,col 9)-(line 2644,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.expm1()",
      "begin_line": 2650,
      "end_line": 2652,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2651,col 9)-(line 2651,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.log()",
      "begin_line": 2657,
      "end_line": 2659,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2658,col 9)-(line 2658,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.log1p()",
      "begin_line": 2664,
      "end_line": 2666,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2665,col 9)-(line 2665,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.log10()",
      "begin_line": 2674,
      "end_line": 2677,
      "comment": " Get the exponent of the greatest power of 10 that is less than or equal to abs(this).\n     *  @return integer base 10 logarithm\n     *  @deprecated as of 3.2, replaced by {@link #intLog10()}, in 4.0 the return type\n     *  will be changed to Dfp\n     ",
      "child_ranges": [
        "(line 2676,col 9)-(line 2676,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.cos()",
      "begin_line": 2690,
      "end_line": 2692,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2691,col 9)-(line 2691,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.sin()",
      "begin_line": 2697,
      "end_line": 2699,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2698,col 9)-(line 2698,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.tan()",
      "begin_line": 2704,
      "end_line": 2706,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2705,col 9)-(line 2705,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.acos()",
      "begin_line": 2711,
      "end_line": 2713,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2712,col 9)-(line 2712,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.asin()",
      "begin_line": 2718,
      "end_line": 2720,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2719,col 9)-(line 2719,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.atan()",
      "begin_line": 2725,
      "end_line": 2727,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2726,col 9)-(line 2726,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.atan2(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2732,
      "end_line": 2752,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2736,col 9)-(line 2736,col 63)",
        "(line 2738,col 9)-(line 2750,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.cosh()",
      "begin_line": 2757,
      "end_line": 2759,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2758,col 9)-(line 2758,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.sinh()",
      "begin_line": 2764,
      "end_line": 2766,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2765,col 9)-(line 2765,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.tanh()",
      "begin_line": 2771,
      "end_line": 2775,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2772,col 9)-(line 2772,col 45)",
        "(line 2773,col 9)-(line 2773,col 49)",
        "(line 2774,col 9)-(line 2774,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.acosh()",
      "begin_line": 2780,
      "end_line": 2782,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2781,col 9)-(line 2781,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.asinh()",
      "begin_line": 2787,
      "end_line": 2789,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2788,col 9)-(line 2788,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.atanh()",
      "begin_line": 2794,
      "end_line": 2796,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2795,col 9)-(line 2795,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.linearCombination(org.apache.commons.math3.dfp.Dfp[], org.apache.commons.math3.dfp.Dfp[])",
      "begin_line": 2801,
      "end_line": 2811,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2803,col 9)-(line 2805,col 9)",
        "(line 2806,col 9)-(line 2806,col 26)",
        "(line 2807,col 9)-(line 2809,col 9)",
        "(line 2810,col 9)-(line 2810,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.linearCombination(double[], org.apache.commons.math3.dfp.Dfp[])",
      "begin_line": 2816,
      "end_line": 2826,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2818,col 9)-(line 2820,col 9)",
        "(line 2821,col 9)-(line 2821,col 26)",
        "(line 2822,col 9)-(line 2824,col 9)",
        "(line 2825,col 9)-(line 2825,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.linearCombination(org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2831,
      "end_line": 2833,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2832,col 9)-(line 2832,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.linearCombination(double, org.apache.commons.math3.dfp.Dfp, double, org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2838,
      "end_line": 2840,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2839,col 9)-(line 2839,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.linearCombination(org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2845,
      "end_line": 2849,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2848,col 9)-(line 2848,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.linearCombination(double, org.apache.commons.math3.dfp.Dfp, double, org.apache.commons.math3.dfp.Dfp, double, org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2854,
      "end_line": 2858,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2857,col 9)-(line 2857,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.linearCombination(org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2863,
      "end_line": 2866,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2865,col 9)-(line 2865,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.linearCombination(double, org.apache.commons.math3.dfp.Dfp, double, org.apache.commons.math3.dfp.Dfp, double, org.apache.commons.math3.dfp.Dfp, double, org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2871,
      "end_line": 2874,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2873,col 9)-(line 2873,col 94)"
      ]
    }
  ]
}