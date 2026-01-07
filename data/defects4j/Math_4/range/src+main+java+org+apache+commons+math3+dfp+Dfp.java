{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/dfp/Dfp.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Dfp",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.RealFieldElement\u003corg.apache.commons.math3.dfp.Dfp\u003e"
      ],
      "begin_line": 98,
      "end_line": 2883,
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
      "begin_line": 865,
      "end_line": 869,
      "comment": " Get the absolute value of instance.\n     * @return absolute value of instance\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 866,col 9)-(line 866,col 39)",
        "(line 867,col 9)-(line 867,col 24)",
        "(line 868,col 9)-(line 868,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.isInfinite()",
      "begin_line": 874,
      "end_line": 876,
      "comment": " Check if instance is infinite.\n     * @return true if instance is infinite\n     ",
      "child_ranges": [
        "(line 875,col 9)-(line 875,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.isNaN()",
      "begin_line": 881,
      "end_line": 883,
      "comment": " Check if instance is not a number.\n     * @return true if instance is not a number\n     ",
      "child_ranges": [
        "(line 882,col 9)-(line 882,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.isZero()",
      "begin_line": 888,
      "end_line": 898,
      "comment": " Check if instance is equal to zero.\n     * @return true if instance is equal to zero\n     ",
      "child_ranges": [
        "(line 890,col 9)-(line 894,col 9)",
        "(line 896,col 9)-(line 896,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.equals(java.lang.Object)",
      "begin_line": 904,
      "end_line": 918,
      "comment": " Check if instance is equal to x.\n     * @param other object to check instance against\n     * @return true if instance is equal to x and neither are NaN, false otherwise\n     ",
      "child_ranges": [
        "(line 907,col 9)-(line 914,col 9)",
        "(line 916,col 9)-(line 916,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.hashCode()",
      "begin_line": 924,
      "end_line": 927,
      "comment": "\n     * Gets a hashCode for the instance.\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 926,col 9)-(line 926,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.unequal(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 933,
      "end_line": 939,
      "comment": " Check if instance is not equal to x.\n     * @param x number to check instance against\n     * @return true if instance is not equal to x and neither are NaN, false otherwise\n     ",
      "child_ranges": [
        "(line 934,col 9)-(line 936,col 9)",
        "(line 938,col 9)-(line 938,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.compare(org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 947,
      "end_line": 999,
      "comment": " Compare two instances.\n     * @param a first instance in comparison\n     * @param b second instance in comparison\n     * @return -1 if a\u003cb, 1 if a\u003eb and 0 if a\u003d\u003db\n     *  Note this method does not properly handle NaNs or numbers with different precision.\n     ",
      "child_ranges": [
        "(line 949,col 9)-(line 952,col 9)",
        "(line 954,col 9)-(line 960,col 9)",
        "(line 963,col 9)-(line 965,col 9)",
        "(line 967,col 9)-(line 969,col 9)",
        "(line 971,col 9)-(line 973,col 9)",
        "(line 976,col 9)-(line 984,col 9)",
        "(line 987,col 9)-(line 995,col 9)",
        "(line 997,col 9)-(line 997,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.rint()",
      "begin_line": 1007,
      "end_line": 1009,
      "comment": " Round to nearest integer using the round-half-even method.\n     *  That is round to nearest integer unless both are equidistant.\n     *  In which case round to the even one.\n     *  @return rounded value\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1008,col 9)-(line 1008,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.floor()",
      "begin_line": 1016,
      "end_line": 1018,
      "comment": " Round to an integer using the round floor mode.\n     * That is, round toward -Infinity\n     *  @return rounded value\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1017,col 9)-(line 1017,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.ceil()",
      "begin_line": 1025,
      "end_line": 1027,
      "comment": " Round to an integer using the round ceil mode.\n     * That is, round toward +Infinity\n     *  @return rounded value\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1026,col 9)-(line 1026,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.remainder(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 1034,
      "end_line": 1045,
      "comment": " Returns the IEEE remainder.\n     * @param d divisor\n     * @return this less n \u0026times; d, where n is the integer closest to this/d\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1036,col 9)-(line 1036,col 76)",
        "(line 1039,col 9)-(line 1041,col 9)",
        "(line 1043,col 9)-(line 1043,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.trunc(org.apache.commons.math3.dfp.DfpField.RoundingMode)",
      "begin_line": 1051,
      "end_line": 1135,
      "comment": " Does the integer conversions with the specified rounding.\n     * @param rmode rounding mode to use\n     * @return truncated value\n     ",
      "child_ranges": [
        "(line 1052,col 9)-(line 1052,col 32)",
        "(line 1054,col 9)-(line 1056,col 9)",
        "(line 1058,col 9)-(line 1060,col 9)",
        "(line 1062,col 9)-(line 1065,col 9)",
        "(line 1069,col 9)-(line 1074,col 9)",
        "(line 1080,col 9)-(line 1082,col 9)",
        "(line 1087,col 9)-(line 1087,col 39)",
        "(line 1088,col 9)-(line 1091,col 9)",
        "(line 1093,col 9)-(line 1132,col 9)",
        "(line 1134,col 9)-(line 1134,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.intValue()",
      "begin_line": 1141,
      "end_line": 1164,
      "comment": " Convert this to an integer.\n     * If greater than 2147483647, it returns 2147483647. If less than -2147483648 it returns -2147483648.\n     * @return converted number\n     ",
      "child_ranges": [
        "(line 1142,col 9)-(line 1142,col 20)",
        "(line 1143,col 9)-(line 1143,col 23)",
        "(line 1145,col 9)-(line 1145,col 25)",
        "(line 1147,col 9)-(line 1149,col 9)",
        "(line 1151,col 9)-(line 1153,col 9)",
        "(line 1155,col 9)-(line 1157,col 9)",
        "(line 1159,col 9)-(line 1161,col 9)",
        "(line 1163,col 9)-(line 1163,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.log10K()",
      "begin_line": 1171,
      "end_line": 1173,
      "comment": " Get the exponent of the greatest power of 10000 that is\n     *  less than or equal to the absolute value of this.  I.E.  if\n     *  this is 10\u003csup\u003e6\u003c/sup\u003e then log10K would return 1.\n     *  @return integer base 10000 logarithm\n     ",
      "child_ranges": [
        "(line 1172,col 9)-(line 1172,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.power10K(int)",
      "begin_line": 1179,
      "end_line": 1183,
      "comment": " Get the specified  power of 10000.\n     * @param e desired power\n     * @return 10000\u003csup\u003ee\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 1180,col 9)-(line 1180,col 38)",
        "(line 1181,col 9)-(line 1181,col 22)",
        "(line 1182,col 9)-(line 1182,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.intLog10()",
      "begin_line": 1189,
      "end_line": 1200,
      "comment": " Get the exponent of the greatest power of 10 that is less than or equal to abs(this).\n     *  @return integer base 10 logarithm\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1190,col 9)-(line 1192,col 9)",
        "(line 1193,col 9)-(line 1195,col 9)",
        "(line 1196,col 9)-(line 1198,col 9)",
        "(line 1199,col 9)-(line 1199,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.power10(int)",
      "begin_line": 1206,
      "end_line": 1229,
      "comment": " Return the specified  power of 10.\n     * @param e desired power\n     * @return 10\u003csup\u003ee\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 1207,col 9)-(line 1207,col 38)",
        "(line 1209,col 9)-(line 1213,col 9)",
        "(line 1215,col 9)-(line 1226,col 9)",
        "(line 1228,col 9)-(line 1228,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.complement(int)",
      "begin_line": 1237,
      "end_line": 1253,
      "comment": " Negate the mantissa of this by computing the complement.\n     *  Leaves the sign bit unchanged, used internally by add.\n     *  Denormalized numbers are handled properly here.\n     *  @param extra ???\n     *  @return ???\n     ",
      "child_ranges": [
        "(line 1239,col 9)-(line 1239,col 28)",
        "(line 1240,col 9)-(line 1242,col 9)",
        "(line 1244,col 9)-(line 1244,col 31)",
        "(line 1245,col 9)-(line 1245,col 35)",
        "(line 1246,col 9)-(line 1250,col 9)",
        "(line 1252,col 9)-(line 1252,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.add(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 1259,
      "end_line": 1402,
      "comment": " Add x to this.\n     * @param x number to add\n     * @return sum of this and x\n     ",
      "child_ranges": [
        "(line 1262,col 9)-(line 1267,col 9)",
        "(line 1270,col 9)-(line 1298,col 9)",
        "(line 1301,col 9)-(line 1301,col 34)",
        "(line 1302,col 9)-(line 1302,col 31)",
        "(line 1305,col 9)-(line 1305,col 44)",
        "(line 1308,col 9)-(line 1308,col 34)",
        "(line 1309,col 9)-(line 1309,col 34)",
        "(line 1311,col 9)-(line 1311,col 19)",
        "(line 1312,col 9)-(line 1312,col 19)",
        "(line 1315,col 9)-(line 1315,col 27)",
        "(line 1316,col 9)-(line 1318,col 9)",
        "(line 1323,col 9)-(line 1325,col 9)",
        "(line 1327,col 9)-(line 1329,col 9)",
        "(line 1332,col 9)-(line 1332,col 28)",
        "(line 1333,col 9)-(line 1333,col 28)",
        "(line 1334,col 9)-(line 1338,col 9)",
        "(line 1341,col 9)-(line 1347,col 9)",
        "(line 1350,col 9)-(line 1350,col 19)",
        "(line 1351,col 9)-(line 1355,col 9)",
        "(line 1356,col 9)-(line 1356,col 27)",
        "(line 1357,col 9)-(line 1357,col 28)",
        "(line 1362,col 9)-(line 1370,col 9)",
        "(line 1373,col 9)-(line 1383,col 9)",
        "(line 1386,col 9)-(line 1393,col 9)",
        "(line 1396,col 9)-(line 1396,col 65)",
        "(line 1397,col 9)-(line 1399,col 9)",
        "(line 1401,col 9)-(line 1401,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.negate()",
      "begin_line": 1407,
      "end_line": 1411,
      "comment": " Returns a number that is this number with the sign bit reversed.\n     * @return the opposite of this\n     ",
      "child_ranges": [
        "(line 1408,col 9)-(line 1408,col 39)",
        "(line 1409,col 9)-(line 1409,col 43)",
        "(line 1410,col 9)-(line 1410,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.subtract(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 1417,
      "end_line": 1419,
      "comment": " Subtract x from this.\n     * @param x number to subtract\n     * @return difference of this and a\n     ",
      "child_ranges": [
        "(line 1418,col 9)-(line 1418,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.round(int)",
      "begin_line": 1425,
      "end_line": 1498,
      "comment": " Round this given the next digit n using the current rounding mode.\n     * @param n ???\n     * @return the IEEE flag if an exception occurred\n     ",
      "child_ranges": [
        "(line 1426,col 9)-(line 1426,col 28)",
        "(line 1427,col 9)-(line 1460,col 9)",
        "(line 1462,col 9)-(line 1475,col 9)",
        "(line 1478,col 9)-(line 1482,col 9)",
        "(line 1484,col 9)-(line 1488,col 9)",
        "(line 1490,col 9)-(line 1494,col 9)",
        "(line 1496,col 9)-(line 1496,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.multiply(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 1504,
      "end_line": 1604,
      "comment": " Multiply this by x.\n     * @param x multiplicand\n     * @return product of this and x\n     ",
      "child_ranges": [
        "(line 1507,col 9)-(line 1512,col 9)",
        "(line 1514,col 9)-(line 1514,col 44)",
        "(line 1517,col 9)-(line 1552,col 9)",
        "(line 1554,col 9)-(line 1554,col 47)",
        "(line 1556,col 9)-(line 1566,col 9)",
        "(line 1569,col 9)-(line 1569,col 37)",
        "(line 1570,col 9)-(line 1575,col 9)",
        "(line 1578,col 9)-(line 1580,col 9)",
        "(line 1583,col 9)-(line 1583,col 60)",
        "(line 1584,col 9)-(line 1584,col 52)",
        "(line 1586,col 9)-(line 1589,col 9)",
        "(line 1591,col 9)-(line 1591,col 23)",
        "(line 1592,col 9)-(line 1596,col 9)",
        "(line 1598,col 9)-(line 1600,col 9)",
        "(line 1602,col 9)-(line 1602,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.multiply(int)",
      "begin_line": 1610,
      "end_line": 1616,
      "comment": " Multiply this by a single digit x.\n     * @param x multiplicand\n     * @return product of this and x\n     ",
      "child_ranges": [
        "(line 1611,col 9)-(line 1615,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.multiplyFast(int)",
      "begin_line": 1623,
      "end_line": 1679,
      "comment": " Multiply this by a single digit 0\u0026lt;\u003dx\u0026lt;radix.\n     * There are speed advantages in this special case.\n     * @param x multiplicand\n     * @return product of this and x\n     ",
      "child_ranges": [
        "(line 1624,col 9)-(line 1624,col 39)",
        "(line 1627,col 9)-(line 1644,col 9)",
        "(line 1647,col 9)-(line 1653,col 9)",
        "(line 1655,col 9)-(line 1655,col 19)",
        "(line 1656,col 9)-(line 1660,col 9)",
        "(line 1662,col 9)-(line 1662,col 26)",
        "(line 1663,col 9)-(line 1667,col 9)",
        "(line 1669,col 9)-(line 1671,col 9)",
        "(line 1673,col 9)-(line 1673,col 49)",
        "(line 1674,col 9)-(line 1676,col 9)",
        "(line 1678,col 9)-(line 1678,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.divide(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 1685,
      "end_line": 1893,
      "comment": " Divide this by divisor.\n     * @param divisor divisor\n     * @return quotient of this by divisor\n     ",
      "child_ranges": [
        "(line 1686,col 9)-(line 1686,col 23)",
        "(line 1687,col 9)-(line 1687,col 23)",
        "(line 1688,col 9)-(line 1688,col 24)",
        "(line 1689,col 9)-(line 1689,col 15)",
        "(line 1690,col 9)-(line 1690,col 17)",
        "(line 1691,col 9)-(line 1691,col 20)",
        "(line 1692,col 9)-(line 1692,col 19)",
        "(line 1693,col 9)-(line 1693,col 26)",
        "(line 1694,col 9)-(line 1694,col 17)",
        "(line 1695,col 9)-(line 1695,col 17)",
        "(line 1698,col 9)-(line 1703,col 9)",
        "(line 1705,col 9)-(line 1705,col 44)",
        "(line 1708,col 9)-(line 1736,col 9)",
        "(line 1739,col 9)-(line 1746,col 9)",
        "(line 1748,col 9)-(line 1748,col 42)",
        "(line 1749,col 9)-(line 1749,col 42)",
        "(line 1750,col 9)-(line 1750,col 43)",
        "(line 1754,col 9)-(line 1754,col 34)",
        "(line 1755,col 9)-(line 1755,col 34)",
        "(line 1756,col 9)-(line 1756,col 36)",
        "(line 1757,col 9)-(line 1757,col 35)",
        "(line 1762,col 9)-(line 1766,col 9)",
        "(line 1769,col 9)-(line 1769,col 17)",
        "(line 1770,col 9)-(line 1858,col 9)",
        "(line 1861,col 9)-(line 1861,col 25)",
        "(line 1862,col 9)-(line 1867,col 9)",
        "(line 1870,col 9)-(line 1872,col 9)",
        "(line 1875,col 9)-(line 1875,col 58)",
        "(line 1876,col 9)-(line 1876,col 63)",
        "(line 1878,col 9)-(line 1880,col 9)",
        "(line 1882,col 9)-(line 1886,col 9)",
        "(line 1888,col 9)-(line 1890,col 9)",
        "(line 1892,col 9)-(line 1892,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.divide(int)",
      "begin_line": 1900,
      "end_line": 1958,
      "comment": " Divide by a single digit less than radix.\n     *  Special case, so there are speed advantages. 0 \u0026lt;\u003d divisor \u0026lt; radix\n     * @param divisor divisor\n     * @return quotient of this by divisor\n     ",
      "child_ranges": [
        "(line 1903,col 9)-(line 1911,col 9)",
        "(line 1914,col 9)-(line 1921,col 9)",
        "(line 1924,col 9)-(line 1930,col 9)",
        "(line 1932,col 9)-(line 1932,col 39)",
        "(line 1934,col 9)-(line 1934,col 19)",
        "(line 1935,col 9)-(line 1940,col 9)",
        "(line 1942,col 9)-(line 1949,col 9)",
        "(line 1951,col 9)-(line 1951,col 60)",
        "(line 1952,col 9)-(line 1954,col 9)",
        "(line 1956,col 9)-(line 1956,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.reciprocal()",
      "begin_line": 1961,
      "end_line": 1963,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1962,col 9)-(line 1962,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.sqrt()",
      "begin_line": 1969,
      "end_line": 2060,
      "comment": " Compute the square root.\n     * @return square root of the instance\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1972,col 9)-(line 1975,col 9)",
        "(line 1977,col 9)-(line 1995,col 9)",
        "(line 1997,col 9)-(line 2006,col 9)",
        "(line 2008,col 9)-(line 2008,col 34)",
        "(line 2011,col 9)-(line 2013,col 9)",
        "(line 2016,col 9)-(line 2028,col 9)",
        "(line 2030,col 9)-(line 2030,col 32)",
        "(line 2035,col 9)-(line 2035,col 28)",
        "(line 2036,col 9)-(line 2036,col 28)",
        "(line 2037,col 9)-(line 2056,col 9)",
        "(line 2058,col 9)-(line 2058,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.toString()",
      "begin_line": 2065,
      "end_line": 2082,
      "comment": " Get a string representation of the instance.\n     * @return string representation of the instance\n     ",
      "child_ranges": [
        "(line 2067,col 9)-(line 2074,col 9)",
        "(line 2076,col 9)-(line 2078,col 9)",
        "(line 2080,col 9)-(line 2080,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.dfp2sci()",
      "begin_line": 2087,
      "end_line": 2163,
      "comment": " Convert an instance to a string using scientific notation.\n     * @return string representation of the instance in scientific notation\n     ",
      "child_ranges": [
        "(line 2088,col 9)-(line 2088,col 56)",
        "(line 2089,col 9)-(line 2089,col 61)",
        "(line 2090,col 9)-(line 2090,col 14)",
        "(line 2091,col 9)-(line 2091,col 14)",
        "(line 2092,col 9)-(line 2092,col 14)",
        "(line 2093,col 9)-(line 2093,col 15)",
        "(line 2094,col 9)-(line 2094,col 16)",
        "(line 2097,col 9)-(line 2097,col 14)",
        "(line 2098,col 9)-(line 2103,col 9)",
        "(line 2106,col 9)-(line 2110,col 9)",
        "(line 2111,col 9)-(line 2111,col 16)",
        "(line 2114,col 9)-(line 2114,col 14)",
        "(line 2115,col 9)-(line 2117,col 9)",
        "(line 2119,col 9)-(line 2134,col 9)",
        "(line 2136,col 9)-(line 2136,col 32)",
        "(line 2140,col 9)-(line 2140,col 30)",
        "(line 2141,col 9)-(line 2141,col 15)",
        "(line 2142,col 9)-(line 2144,col 9)",
        "(line 2147,col 9)-(line 2149,col 9)",
        "(line 2151,col 9)-(line 2153,col 9)",
        "(line 2155,col 9)-(line 2159,col 9)",
        "(line 2161,col 9)-(line 2161,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.dfp2string()",
      "begin_line": 2168,
      "end_line": 2236,
      "comment": " Convert an instance to a string using normal notation.\n     * @return string representation of the instance in normal notation\n     ",
      "child_ranges": [
        "(line 2169,col 9)-(line 2169,col 53)",
        "(line 2170,col 9)-(line 2170,col 18)",
        "(line 2171,col 9)-(line 2171,col 14)",
        "(line 2172,col 9)-(line 2172,col 20)",
        "(line 2173,col 9)-(line 2173,col 38)",
        "(line 2175,col 9)-(line 2175,col 24)",
        "(line 2177,col 9)-(line 2181,col 9)",
        "(line 2183,col 9)-(line 2189,col 9)",
        "(line 2191,col 9)-(line 2200,col 9)",
        "(line 2202,col 9)-(line 2208,col 9)",
        "(line 2210,col 9)-(line 2213,col 9)",
        "(line 2216,col 9)-(line 2216,col 14)",
        "(line 2217,col 9)-(line 2219,col 9)",
        "(line 2220,col 9)-(line 2222,col 9)",
        "(line 2225,col 9)-(line 2227,col 9)",
        "(line 2230,col 9)-(line 2232,col 9)",
        "(line 2234,col 9)-(line 2234,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.dotrap(int, java.lang.String, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2245,
      "end_line": 2302,
      "comment": " Raises a trap.  This does not set the corresponding flag however.\n     *  @param type the trap type\n     *  @param what - name of routine trap occurred in\n     *  @param oper - input operator to function\n     *  @param result - the result computed prior to the trap\n     *  @return The suggested return value from the trap handler\n     ",
      "child_ranges": [
        "(line 2246,col 9)-(line 2246,col 25)",
        "(line 2248,col 9)-(line 2298,col 9)",
        "(line 2300,col 9)-(line 2300,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.trap(int, java.lang.String, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2315,
      "end_line": 2317,
      "comment": " Trap handler.  Subclasses may override this to provide trap\n     *  functionality per IEEE 854-1987.\n     *\n     *  @param type  The exception type - e.g. FLAG_OVERFLOW\n     *  @param what  The name of the routine we were in e.g. divide()\n     *  @param oper  An operand to this function if any\n     *  @param def   The default return value if trap not enabled\n     *  @param result    The result that is specified to be delivered per\n     *                   IEEE 854, if any\n     *  @return the value that should be return by the operation triggering the trap\n     ",
      "child_ranges": [
        "(line 2316,col 9)-(line 2316,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.classify()",
      "begin_line": 2322,
      "end_line": 2324,
      "comment": " Returns the type - one of FINITE, INFINITE, SNAN, QNAN.\n     * @return type of the number\n     ",
      "child_ranges": [
        "(line 2323,col 9)-(line 2323,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.copysign(org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2332,
      "end_line": 2336,
      "comment": " Creates an instance that is the same as x except that it has the sign of y.\n     * abs(x) \u003d dfp.copysign(x, dfp.one)\n     * @param x number to get the value from\n     * @param y number to get the sign from\n     * @return a number with the value of x and the sign of y\n     ",
      "child_ranges": [
        "(line 2333,col 9)-(line 2333,col 38)",
        "(line 2334,col 9)-(line 2334,col 29)",
        "(line 2335,col 9)-(line 2335,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.nextAfter(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2343,
      "end_line": 2409,
      "comment": " Returns the next number greater than this one in the direction of x.\n     * If this\u003d\u003dx then simply returns this.\n     * @param x direction where to look at\n     * @return closest number next to instance in the direction of x\n     ",
      "child_ranges": [
        "(line 2346,col 9)-(line 2351,col 9)",
        "(line 2354,col 9)-(line 2354,col 27)",
        "(line 2355,col 9)-(line 2357,col 9)",
        "(line 2359,col 9)-(line 2361,col 9)",
        "(line 2363,col 9)-(line 2365,col 9)",
        "(line 2367,col 9)-(line 2367,col 22)",
        "(line 2368,col 9)-(line 2368,col 19)",
        "(line 2369,col 9)-(line 2395,col 9)",
        "(line 2397,col 9)-(line 2400,col 9)",
        "(line 2402,col 9)-(line 2405,col 9)",
        "(line 2407,col 9)-(line 2407,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.toDouble()",
      "begin_line": 2415,
      "end_line": 2499,
      "comment": " Convert the instance into a double.\n     * @return a double approximating the instance\n     * @see #toSplitDouble()\n     ",
      "child_ranges": [
        "(line 2417,col 9)-(line 2423,col 9)",
        "(line 2425,col 9)-(line 2427,col 9)",
        "(line 2429,col 9)-(line 2429,col 21)",
        "(line 2430,col 9)-(line 2430,col 31)",
        "(line 2431,col 9)-(line 2431,col 44)",
        "(line 2432,col 9)-(line 2437,col 9)",
        "(line 2441,col 9)-(line 2441,col 50)",
        "(line 2442,col 9)-(line 2444,col 9)",
        "(line 2446,col 9)-(line 2446,col 54)",
        "(line 2447,col 9)-(line 2450,col 9)",
        "(line 2451,col 9)-(line 2451,col 19)",
        "(line 2455,col 9)-(line 2455,col 54)",
        "(line 2456,col 9)-(line 2458,col 9)",
        "(line 2460,col 9)-(line 2462,col 9)",
        "(line 2464,col 9)-(line 2466,col 9)",
        "(line 2469,col 9)-(line 2469,col 62)",
        "(line 2470,col 9)-(line 2470,col 34)",
        "(line 2471,col 9)-(line 2471,col 47)",
        "(line 2472,col 9)-(line 2472,col 44)",
        "(line 2474,col 9)-(line 2478,col 9)",
        "(line 2481,col 9)-(line 2483,col 9)",
        "(line 2485,col 9)-(line 2488,col 9)",
        "(line 2490,col 9)-(line 2490,col 58)",
        "(line 2491,col 9)-(line 2491,col 49)",
        "(line 2493,col 9)-(line 2495,col 9)",
        "(line 2497,col 9)-(line 2497,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.toSplitDouble()",
      "begin_line": 2505,
      "end_line": 2513,
      "comment": " Convert the instance into a split double.\n     * @return an array of two doubles which sum represent the instance\n     * @see #toDouble()\n     ",
      "child_ranges": [
        "(line 2506,col 9)-(line 2506,col 39)",
        "(line 2507,col 9)-(line 2507,col 40)",
        "(line 2509,col 9)-(line 2509,col 87)",
        "(line 2510,col 9)-(line 2510,col 62)",
        "(line 2512,col 9)-(line 2512,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.getReal()",
      "begin_line": 2518,
      "end_line": 2520,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2519,col 9)-(line 2519,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.add(double)",
      "begin_line": 2525,
      "end_line": 2527,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2526,col 9)-(line 2526,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.subtract(double)",
      "begin_line": 2532,
      "end_line": 2534,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2533,col 9)-(line 2533,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.multiply(double)",
      "begin_line": 2539,
      "end_line": 2541,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2540,col 9)-(line 2540,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.divide(double)",
      "begin_line": 2546,
      "end_line": 2548,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2547,col 9)-(line 2547,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.remainder(double)",
      "begin_line": 2553,
      "end_line": 2555,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2554,col 9)-(line 2554,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.round()",
      "begin_line": 2560,
      "end_line": 2562,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2561,col 9)-(line 2561,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.signum()",
      "begin_line": 2567,
      "end_line": 2573,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2568,col 9)-(line 2572,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.copySign(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2578,
      "end_line": 2583,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2579,col 9)-(line 2581,col 9)",
        "(line 2582,col 9)-(line 2582,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.copySign(double)",
      "begin_line": 2588,
      "end_line": 2594,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2589,col 9)-(line 2589,col 45)",
        "(line 2590,col 9)-(line 2592,col 9)",
        "(line 2593,col 9)-(line 2593,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.scalb(int)",
      "begin_line": 2599,
      "end_line": 2601,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2600,col 9)-(line 2600,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.hypot(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2606,
      "end_line": 2608,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2607,col 9)-(line 2607,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.cbrt()",
      "begin_line": 2613,
      "end_line": 2615,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2614,col 9)-(line 2614,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.rootN(int)",
      "begin_line": 2620,
      "end_line": 2624,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2621,col 9)-(line 2623,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.pow(double)",
      "begin_line": 2629,
      "end_line": 2631,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2630,col 9)-(line 2630,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.pow(int)",
      "begin_line": 2636,
      "end_line": 2638,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2637,col 9)-(line 2637,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.pow(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2643,
      "end_line": 2645,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2644,col 9)-(line 2644,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.exp()",
      "begin_line": 2650,
      "end_line": 2652,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2651,col 9)-(line 2651,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.expm1()",
      "begin_line": 2657,
      "end_line": 2659,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2658,col 9)-(line 2658,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.log()",
      "begin_line": 2664,
      "end_line": 2666,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2665,col 9)-(line 2665,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.log1p()",
      "begin_line": 2671,
      "end_line": 2673,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2672,col 9)-(line 2672,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.log10()",
      "begin_line": 2681,
      "end_line": 2684,
      "comment": " Get the exponent of the greatest power of 10 that is less than or equal to abs(this).\n     *  @return integer base 10 logarithm\n     *  @deprecated as of 3.2, replaced by {@link #intLog10()}, in 4.0 the return type\n     *  will be changed to Dfp\n     ",
      "child_ranges": [
        "(line 2683,col 9)-(line 2683,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.cos()",
      "begin_line": 2697,
      "end_line": 2699,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2698,col 9)-(line 2698,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.sin()",
      "begin_line": 2704,
      "end_line": 2706,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2705,col 9)-(line 2705,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.tan()",
      "begin_line": 2711,
      "end_line": 2713,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2712,col 9)-(line 2712,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.acos()",
      "begin_line": 2718,
      "end_line": 2720,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2719,col 9)-(line 2719,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.asin()",
      "begin_line": 2725,
      "end_line": 2727,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2726,col 9)-(line 2726,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.atan()",
      "begin_line": 2732,
      "end_line": 2734,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2733,col 9)-(line 2733,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.atan2(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2739,
      "end_line": 2759,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2743,col 9)-(line 2743,col 63)",
        "(line 2745,col 9)-(line 2757,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.cosh()",
      "begin_line": 2764,
      "end_line": 2766,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2765,col 9)-(line 2765,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.sinh()",
      "begin_line": 2771,
      "end_line": 2773,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2772,col 9)-(line 2772,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.tanh()",
      "begin_line": 2778,
      "end_line": 2782,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2779,col 9)-(line 2779,col 45)",
        "(line 2780,col 9)-(line 2780,col 49)",
        "(line 2781,col 9)-(line 2781,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.acosh()",
      "begin_line": 2787,
      "end_line": 2789,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2788,col 9)-(line 2788,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.asinh()",
      "begin_line": 2794,
      "end_line": 2796,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2795,col 9)-(line 2795,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.atanh()",
      "begin_line": 2801,
      "end_line": 2803,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2802,col 9)-(line 2802,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.linearCombination(org.apache.commons.math3.dfp.Dfp[], org.apache.commons.math3.dfp.Dfp[])",
      "begin_line": 2808,
      "end_line": 2818,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2810,col 9)-(line 2812,col 9)",
        "(line 2813,col 9)-(line 2813,col 26)",
        "(line 2814,col 9)-(line 2816,col 9)",
        "(line 2817,col 9)-(line 2817,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.linearCombination(double[], org.apache.commons.math3.dfp.Dfp[])",
      "begin_line": 2823,
      "end_line": 2833,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2825,col 9)-(line 2827,col 9)",
        "(line 2828,col 9)-(line 2828,col 26)",
        "(line 2829,col 9)-(line 2831,col 9)",
        "(line 2832,col 9)-(line 2832,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.linearCombination(org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2838,
      "end_line": 2840,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2839,col 9)-(line 2839,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.linearCombination(double, org.apache.commons.math3.dfp.Dfp, double, org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2845,
      "end_line": 2847,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2846,col 9)-(line 2846,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.linearCombination(org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2852,
      "end_line": 2856,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2855,col 9)-(line 2855,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.linearCombination(double, org.apache.commons.math3.dfp.Dfp, double, org.apache.commons.math3.dfp.Dfp, double, org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2861,
      "end_line": 2865,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2864,col 9)-(line 2864,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.linearCombination(org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2870,
      "end_line": 2873,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2872,col 9)-(line 2872,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.linearCombination(double, org.apache.commons.math3.dfp.Dfp, double, org.apache.commons.math3.dfp.Dfp, double, org.apache.commons.math3.dfp.Dfp, double, org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2878,
      "end_line": 2881,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 2880,col 9)-(line 2880,col 94)"
      ]
    }
  ]
}