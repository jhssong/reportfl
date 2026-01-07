{
  "filepath": "/tmp/Math-29b/src/main/java/org/apache/commons/math3/dfp/Dfp.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Dfp",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.FieldElement\u003corg.apache.commons.math3.dfp.Dfp\u003e"
      ],
      "begin_line": 96,
      "end_line": 2494,
      "comment": "\n *  Decimal floating point library for Java\n *\n *  \u003cp\u003eAnother floating point class.  This one is built using radix 10000\n *  which is 10\u003csup\u003e4\u003c/sup\u003e, so its almost decimal.\u003c/p\u003e\n *\n *  \u003cp\u003eThe design goals here are:\n *  \u003col\u003e\n *    \u003cli\u003eDecimal math, or close to it\u003c/li\u003e\n *    \u003cli\u003eSettable precision (but no mix between numbers using different settings)\u003c/li\u003e\n *    \u003cli\u003ePortability.  Code should be kept as portable as possible.\u003c/li\u003e\n *    \u003cli\u003ePerformance\u003c/li\u003e\n *    \u003cli\u003eAccuracy  - Results should always be +/- 1 ULP for basic\n *         algebraic operation\u003c/li\u003e\n *    \u003cli\u003eComply with IEEE 854-1987 as much as possible.\n *         (See IEEE 854-1987 notes below)\u003c/li\u003e\n *  \u003c/ol\u003e\u003c/p\u003e\n *\n *  \u003cp\u003eTrade offs:\n *  \u003col\u003e\n *    \u003cli\u003eMemory foot print.  I\u0027m using more memory than necessary to\n *         represent numbers to get better performance.\u003c/li\u003e\n *    \u003cli\u003eDigits are bigger, so rounding is a greater loss.  So, if you\n *         really need 12 decimal digits, better use 4 base 10000 digits\n *         there can be one partially filled.\u003c/li\u003e\n *  \u003c/ol\u003e\u003c/p\u003e\n *\n *  \u003cp\u003eNumbers are represented  in the following form:\n *  \u003cpre\u003e\n *  n  \u003d  sign \u0026times; mant \u0026times; (radix)\u003csup\u003eexp\u003c/sup\u003e;\u003c/p\u003e\n *  \u003c/pre\u003e\n *  where sign is \u0026plusmn;1, mantissa represents a fractional number between\n *  zero and one.  mant[0] is the least significant digit.\n *  exp is in the range of -32767 to 32768\u003c/p\u003e\n *\n *  \u003cp\u003eIEEE 854-1987  Notes and differences\u003c/p\u003e\n *\n *  \u003cp\u003eIEEE 854 requires the radix to be either 2 or 10.  The radix here is\n *  10000, so that requirement is not met, but  it is possible that a\n *  subclassed can be made to make it behave as a radix 10\n *  number.  It is my opinion that if it looks and behaves as a radix\n *  10 number then it is one and that requirement would be met.\u003c/p\u003e\n *\n *  \u003cp\u003eThe radix of 10000 was chosen because it should be faster to operate\n *  on 4 decimal digits at once instead of one at a time.  Radix 10 behavior\n *  can be realized by adding an additional rounding step to ensure that\n *  the number of decimal digits represented is constant.\u003c/p\u003e\n *\n *  \u003cp\u003eThe IEEE standard specifically leaves out internal data encoding,\n *  so it is reasonable to conclude that such a subclass of this radix\n *  10000 system is merely an encoding of a radix 10 system.\u003c/p\u003e\n *\n *  \u003cp\u003eIEEE 854 also specifies the existence of \"sub-normal\" numbers.  This\n *  class does not contain any such entities.  The most significant radix\n *  10000 digit is always non-zero.  Instead, we support \"gradual underflow\"\n *  by raising the underflow flag for numbers less with exponent less than\n *  expMin, but don\u0027t flush to zero until the exponent reaches MIN_EXP-digits.\n *  Thus the smallest number we can represent would be:\n *  1E(-(MIN_EXP-digits-1)*4),  eg, for digits\u003d5, MIN_EXP\u003d-32767, that would\n *  be 1e-131092.\u003c/p\u003e\n *\n *  \u003cp\u003eIEEE 854 defines that the implied radix point lies just to the right\n *  of the most significant digit and to the left of the remaining digits.\n *  This implementation puts the implied radix point to the left of all\n *  digits including the most significant one.  The most significant digit\n *  here is the one just to the right of the radix point.  This is a fine\n *  detail and is really only a matter of definition.  Any side effects of\n *  this can be rendered invisible by a subclass.\u003c/p\u003e\n * @see DfpField\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "RADIX"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " The radix, or base of this system.  Set to 10000 "
    },
    {
      "type": "field",
      "varNames": [
        "MIN_EXP"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " The minimum exponent before underflow is signaled.  Flush to zero\n     *  occurs at minExp-DIGITS "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_EXP"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " The maximum exponent before overflow is signaled and results flushed\n     *  to infinity "
    },
    {
      "type": "field",
      "varNames": [
        "ERR_SCALE"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " The amount under/overflows are scaled by before going to trap handler "
    },
    {
      "type": "field",
      "varNames": [
        "FINITE"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " Indicator value for normal finite numbers. "
    },
    {
      "type": "field",
      "varNames": [
        "INFINITE"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " Indicator value for Infinity. "
    },
    {
      "type": "field",
      "varNames": [
        "SNAN"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " Indicator value for signaling NaN. "
    },
    {
      "type": "field",
      "varNames": [
        "QNAN"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " Indicator value for quiet NaN. "
    },
    {
      "type": "field",
      "varNames": [
        "NAN_STRING"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": " String for NaN representation. "
    },
    {
      "type": "field",
      "varNames": [
        "POS_INFINITY_STRING"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " String for positive infinity representation. "
    },
    {
      "type": "field",
      "varNames": [
        "NEG_INFINITY_STRING"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " String for negative infinity representation. "
    },
    {
      "type": "field",
      "varNames": [
        "ADD_TRAP"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " Name for traps triggered by addition. "
    },
    {
      "type": "field",
      "varNames": [
        "MULTIPLY_TRAP"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": " Name for traps triggered by multiplication. "
    },
    {
      "type": "field",
      "varNames": [
        "DIVIDE_TRAP"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " Name for traps triggered by division. "
    },
    {
      "type": "field",
      "varNames": [
        "SQRT_TRAP"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": " Name for traps triggered by square root. "
    },
    {
      "type": "field",
      "varNames": [
        "ALIGN_TRAP"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": " Name for traps triggered by alignment. "
    },
    {
      "type": "field",
      "varNames": [
        "TRUNC_TRAP"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": " Name for traps triggered by truncation. "
    },
    {
      "type": "field",
      "varNames": [
        "NEXT_AFTER_TRAP"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": " Name for traps triggered by nextAfter. "
    },
    {
      "type": "field",
      "varNames": [
        "LESS_THAN_TRAP"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": " Name for traps triggered by lessThan. "
    },
    {
      "type": "field",
      "varNames": [
        "GREATER_THAN_TRAP"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": " Name for traps triggered by greaterThan. "
    },
    {
      "type": "field",
      "varNames": [
        "NEW_INSTANCE_TRAP"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": " Name for traps triggered by newInstance. "
    },
    {
      "type": "field",
      "varNames": [
        "mant"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": " Mantissa. "
    },
    {
      "type": "field",
      "varNames": [
        "sign"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": " Sign bit: 1 for positive, -1 for negative. "
    },
    {
      "type": "field",
      "varNames": [
        "exp"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": " Exponent. "
    },
    {
      "type": "field",
      "varNames": [
        "nans"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": " Indicator for non-finite / non-number values. "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": " Factory building similar Dfp\u0027s. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.dfp.Dfp.Dfp(org.apache.commons.math3.dfp.DfpField)",
      "begin_line": 181,
      "end_line": 187,
      "comment": " Makes an instance with a value of zero.\n     * @param field field to which this instance belongs\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 47)",
        "(line 183,col 9)-(line 183,col 17)",
        "(line 184,col 9)-(line 184,col 16)",
        "(line 185,col 9)-(line 185,col 22)",
        "(line 186,col 9)-(line 186,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.dfp.Dfp.Dfp(org.apache.commons.math3.dfp.DfpField, byte)",
      "begin_line": 193,
      "end_line": 195,
      "comment": " Create an instance from a byte value.\n     * @param field field to which this instance belongs\n     * @param x value to convert to an instance\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.dfp.Dfp.Dfp(org.apache.commons.math3.dfp.DfpField, int)",
      "begin_line": 201,
      "end_line": 203,
      "comment": " Create an instance from an int value.\n     * @param field field to which this instance belongs\n     * @param x value to convert to an instance\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.dfp.Dfp.Dfp(org.apache.commons.math3.dfp.DfpField, long)",
      "begin_line": 209,
      "end_line": 250,
      "comment": " Create an instance from a long value.\n     * @param field field to which this instance belongs\n     * @param x value to convert to an instance\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 47)",
        "(line 213,col 9)-(line 213,col 22)",
        "(line 214,col 9)-(line 214,col 27)",
        "(line 216,col 9)-(line 216,col 34)",
        "(line 217,col 9)-(line 222,col 9)",
        "(line 225,col 9)-(line 230,col 9)",
        "(line 232,col 9)-(line 232,col 16)",
        "(line 233,col 9)-(line 238,col 9)",
        "(line 240,col 9)-(line 249,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.dfp.Dfp.Dfp(org.apache.commons.math3.dfp.DfpField, double)",
      "begin_line": 256,
      "end_line": 317,
      "comment": " Create an instance from a double value.\n     * @param field field to which this instance belongs\n     * @param x value to convert to an instance\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 47)",
        "(line 260,col 9)-(line 260,col 17)",
        "(line 261,col 9)-(line 261,col 16)",
        "(line 262,col 9)-(line 262,col 22)",
        "(line 263,col 9)-(line 263,col 27)",
        "(line 265,col 9)-(line 265,col 47)",
        "(line 266,col 9)-(line 266,col 51)",
        "(line 267,col 9)-(line 267,col 73)",
        "(line 269,col 9)-(line 287,col 9)",
        "(line 289,col 9)-(line 302,col 9)",
        "(line 304,col 9)-(line 304,col 44)",
        "(line 305,col 9)-(line 305,col 82)",
        "(line 306,col 9)-(line 306,col 68)",
        "(line 308,col 9)-(line 310,col 9)",
        "(line 312,col 9)-(line 312,col 61)",
        "(line 313,col 9)-(line 313,col 25)",
        "(line 314,col 9)-(line 314,col 24)",
        "(line 315,col 9)-(line 315,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.dfp.Dfp.Dfp(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 322,
      "end_line": 328,
      "comment": " Copy constructor.\n     * @param d instance to copy\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 31)",
        "(line 324,col 9)-(line 324,col 23)",
        "(line 325,col 9)-(line 325,col 22)",
        "(line 326,col 9)-(line 326,col 23)",
        "(line 327,col 9)-(line 327,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.dfp.Dfp.Dfp(org.apache.commons.math3.dfp.DfpField, java.lang.String)",
      "begin_line": 334,
      "end_line": 533,
      "comment": " Create an instance from a String representation.\n     * @param field field to which this instance belongs\n     * @param s string representation of the instance\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 47)",
        "(line 338,col 9)-(line 338,col 17)",
        "(line 339,col 9)-(line 339,col 16)",
        "(line 340,col 9)-(line 340,col 22)",
        "(line 341,col 9)-(line 341,col 27)",
        "(line 343,col 9)-(line 343,col 37)",
        "(line 344,col 9)-(line 344,col 28)",
        "(line 345,col 9)-(line 345,col 29)",
        "(line 346,col 9)-(line 346,col 79)",
        "(line 349,col 9)-(line 353,col 9)",
        "(line 355,col 9)-(line 359,col 9)",
        "(line 361,col 9)-(line 365,col 9)",
        "(line 368,col 9)-(line 368,col 31)",
        "(line 369,col 9)-(line 371,col 9)",
        "(line 373,col 9)-(line 373,col 31)",
        "(line 374,col 9)-(line 374,col 23)",
        "(line 375,col 9)-(line 399,col 9)",
        "(line 402,col 9)-(line 404,col 9)",
        "(line 407,col 9)-(line 407,col 14)",
        "(line 410,col 9)-(line 410,col 27)",
        "(line 411,col 9)-(line 429,col 9)",
        "(line 432,col 9)-(line 432,col 23)",
        "(line 433,col 9)-(line 433,col 25)",
        "(line 434,col 9)-(line 434,col 25)",
        "(line 435,col 9)-(line 435,col 25)",
        "(line 436,col 9)-(line 436,col 25)",
        "(line 437,col 9)-(line 437,col 32)",
        "(line 438,col 9)-(line 464,col 9)",
        "(line 468,col 9)-(line 480,col 9)",
        "(line 483,col 9)-(line 485,col 9)",
        "(line 488,col 9)-(line 490,col 9)",
        "(line 493,col 9)-(line 493,col 19)",
        "(line 494,col 9)-(line 494,col 39)",
        "(line 496,col 9)-(line 501,col 9)",
        "(line 504,col 9)-(line 504,col 70)",
        "(line 505,col 9)-(line 505,col 15)",
        "(line 506,col 9)-(line 506,col 24)",
        "(line 509,col 9)-(line 513,col 9)",
        "(line 517,col 9)-(line 523,col 9)",
        "(line 526,col 9)-(line 526,col 42)",
        "(line 528,col 9)-(line 531,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.dfp.Dfp.Dfp(org.apache.commons.math3.dfp.DfpField, byte, byte)",
      "begin_line": 541,
      "end_line": 547,
      "comment": " Creates an instance with a non-finite value.\n     * @param field field to which this instance belongs\n     * @param sign sign of the Dfp to create\n     * @param nans code of the value, must be one of {@link #INFINITE},\n     * {@link #SNAN},  {@link #QNAN}\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 27)",
        "(line 543,col 9)-(line 543,col 55)",
        "(line 544,col 9)-(line 544,col 28)",
        "(line 545,col 9)-(line 545,col 25)",
        "(line 546,col 9)-(line 546,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.newInstance()",
      "begin_line": 553,
      "end_line": 555,
      "comment": " Create an instance with a value of 0.\n     * Use this internally in preference to constructors to facilitate subclasses\n     * @return a new instance with a value of 0\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.newInstance(byte)",
      "begin_line": 561,
      "end_line": 563,
      "comment": " Create an instance from a byte value.\n     * @param x value to convert to an instance\n     * @return a new instance with value x\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.newInstance(int)",
      "begin_line": 569,
      "end_line": 571,
      "comment": " Create an instance from an int value.\n     * @param x value to convert to an instance\n     * @return a new instance with value x\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.newInstance(long)",
      "begin_line": 577,
      "end_line": 579,
      "comment": " Create an instance from a long value.\n     * @param x value to convert to an instance\n     * @return a new instance with value x\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.newInstance(double)",
      "begin_line": 585,
      "end_line": 587,
      "comment": " Create an instance from a double value.\n     * @param x value to convert to an instance\n     * @return a new instance with value x\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 586,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.newInstance(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 594,
      "end_line": 606,
      "comment": " Create an instance by copying an existing one.\n     * Use this internally in preference to constructors to facilitate subclasses.\n     * @param d instance to copy\n     * @return a new instance with the same value as d\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 602,col 9)",
        "(line 604,col 9)-(line 604,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.newInstance(java.lang.String)",
      "begin_line": 613,
      "end_line": 615,
      "comment": " Create an instance from a String representation.\n     * Use this internally in preference to constructors to facilitate subclasses.\n     * @param s string representation of the instance\n     * @return a new instance parsed from specified string\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.newInstance(byte, byte)",
      "begin_line": 623,
      "end_line": 625,
      "comment": " Creates an instance with a non-finite value.\n     * @param sig sign of the Dfp to create\n     * @param code code of the value, must be one of {@link #INFINITE},\n     * {@link #SNAN},  {@link #QNAN}\n     * @return a new instance with a non-finite value\n     ",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.getField()",
      "begin_line": 634,
      "end_line": 636,
      "comment": " Get the {@link org.apache.commons.math3.Field Field} (really a {@link DfpField}) to which the instance belongs.\n     * \u003cp\u003e\n     * The field is linked to the number of digits and acts as a factory\n     * for {@link Dfp} instances.\n     * \u003c/p\u003e\n     * @return {@link org.apache.commons.math3.Field Field} (really a {@link DfpField}) to which the instance belongs\n     ",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.getRadixDigits()",
      "begin_line": 641,
      "end_line": 643,
      "comment": " Get the number of radix digits of the instance.\n     * @return number of radix digits\n     ",
      "child_ranges": [
        "(line 642,col 9)-(line 642,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.getZero()",
      "begin_line": 648,
      "end_line": 650,
      "comment": " Get the constant 0.\n     * @return a Dfp with value zero\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.getOne()",
      "begin_line": 655,
      "end_line": 657,
      "comment": " Get the constant 1.\n     * @return a Dfp with value one\n     ",
      "child_ranges": [
        "(line 656,col 9)-(line 656,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.getTwo()",
      "begin_line": 662,
      "end_line": 664,
      "comment": " Get the constant 2.\n     * @return a Dfp with value two\n     ",
      "child_ranges": [
        "(line 663,col 9)-(line 663,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.shiftLeft()",
      "begin_line": 668,
      "end_line": 674,
      "comment": " Shift the mantissa left, and adjust the exponent to compensate.\n     ",
      "child_ranges": [
        "(line 669,col 9)-(line 671,col 9)",
        "(line 672,col 9)-(line 672,col 20)",
        "(line 673,col 9)-(line 673,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.shiftRight()",
      "begin_line": 680,
      "end_line": 686,
      "comment": " Shift the mantissa right, and adjust the exponent to compensate.\n     ",
      "child_ranges": [
        "(line 681,col 9)-(line 683,col 9)",
        "(line 684,col 9)-(line 684,col 34)",
        "(line 685,col 9)-(line 685,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.align(int)",
      "begin_line": 696,
      "end_line": 747,
      "comment": " Make our exp equal to the supplied one, this may cause rounding.\n     *  Also causes de-normalized numbers.  These numbers are generally\n     *  dangerous because most routines assume normalized numbers.\n     *  Align doesn\u0027t round, so it will return the last digit destroyed\n     *  by shifting right.\n     *  @param e desired exponent\n     *  @return last digit destroyed by shifting right\n     ",
      "child_ranges": [
        "(line 697,col 9)-(line 697,col 26)",
        "(line 698,col 9)-(line 698,col 32)",
        "(line 700,col 9)-(line 700,col 27)",
        "(line 702,col 9)-(line 702,col 25)",
        "(line 703,col 9)-(line 705,col 9)",
        "(line 707,col 9)-(line 709,col 9)",
        "(line 711,col 9)-(line 720,col 9)",
        "(line 722,col 9)-(line 738,col 9)",
        "(line 740,col 9)-(line 743,col 9)",
        "(line 745,col 9)-(line 745,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.lessThan(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 753,
      "end_line": 772,
      "comment": " Check if instance is less than x.\n     * @param x number to check instance against\n     * @return true if instance is less than x and neither are NaN, false otherwise\n     ",
      "child_ranges": [
        "(line 756,col 9)-(line 762,col 9)",
        "(line 765,col 9)-(line 769,col 9)",
        "(line 771,col 9)-(line 771,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.greaterThan(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 778,
      "end_line": 797,
      "comment": " Check if instance is greater than x.\n     * @param x number to check instance against\n     * @return true if instance is greater than x and neither are NaN, false otherwise\n     ",
      "child_ranges": [
        "(line 781,col 9)-(line 787,col 9)",
        "(line 790,col 9)-(line 794,col 9)",
        "(line 796,col 9)-(line 796,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.negativeOrNull()",
      "begin_line": 802,
      "end_line": 812,
      "comment": " Check if instance is less than or equal to 0.\n     * @return true if instance is not NaN and less than or equal to 0, false otherwise\n     ",
      "child_ranges": [
        "(line 804,col 9)-(line 808,col 9)",
        "(line 810,col 9)-(line 810,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.strictlyNegative()",
      "begin_line": 817,
      "end_line": 827,
      "comment": " Check if instance is strictly less than 0.\n     * @return true if instance is not NaN and less than or equal to 0, false otherwise\n     ",
      "child_ranges": [
        "(line 819,col 9)-(line 823,col 9)",
        "(line 825,col 9)-(line 825,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.positiveOrNull()",
      "begin_line": 832,
      "end_line": 842,
      "comment": " Check if instance is greater than or equal to 0.\n     * @return true if instance is not NaN and greater than or equal to 0, false otherwise\n     ",
      "child_ranges": [
        "(line 834,col 9)-(line 838,col 9)",
        "(line 840,col 9)-(line 840,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.strictlyPositive()",
      "begin_line": 847,
      "end_line": 857,
      "comment": " Check if instance is strictly greater than 0.\n     * @return true if instance is not NaN and greater than or equal to 0, false otherwise\n     ",
      "child_ranges": [
        "(line 849,col 9)-(line 853,col 9)",
        "(line 855,col 9)-(line 855,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.abs()",
      "begin_line": 862,
      "end_line": 866,
      "comment": " Get the absolute value of instance.\n     * @return absolute value of instance\n     ",
      "child_ranges": [
        "(line 863,col 9)-(line 863,col 39)",
        "(line 864,col 9)-(line 864,col 24)",
        "(line 865,col 9)-(line 865,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.isInfinite()",
      "begin_line": 871,
      "end_line": 873,
      "comment": " Check if instance is infinite.\n     * @return true if instance is infinite\n     ",
      "child_ranges": [
        "(line 872,col 9)-(line 872,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.isNaN()",
      "begin_line": 878,
      "end_line": 880,
      "comment": " Check if instance is not a number.\n     * @return true if instance is not a number\n     ",
      "child_ranges": [
        "(line 879,col 9)-(line 879,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.isZero()",
      "begin_line": 885,
      "end_line": 895,
      "comment": " Check if instance is equal to zero.\n     * @return true if instance is equal to zero\n     ",
      "child_ranges": [
        "(line 887,col 9)-(line 891,col 9)",
        "(line 893,col 9)-(line 893,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.equals(java.lang.Object)",
      "begin_line": 901,
      "end_line": 915,
      "comment": " Check if instance is equal to x.\n     * @param other object to check instance against\n     * @return true if instance is equal to x and neither are NaN, false otherwise\n     ",
      "child_ranges": [
        "(line 904,col 9)-(line 911,col 9)",
        "(line 913,col 9)-(line 913,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.hashCode()",
      "begin_line": 921,
      "end_line": 924,
      "comment": "\n     * Gets a hashCode for the instance.\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 923,col 9)-(line 923,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.unequal(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 930,
      "end_line": 936,
      "comment": " Check if instance is not equal to x.\n     * @param x number to check instance against\n     * @return true if instance is not equal to x and neither are NaN, false otherwise\n     ",
      "child_ranges": [
        "(line 931,col 9)-(line 933,col 9)",
        "(line 935,col 9)-(line 935,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.compare(org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 944,
      "end_line": 996,
      "comment": " Compare two instances.\n     * @param a first instance in comparison\n     * @param b second instance in comparison\n     * @return -1 if a\u003cb, 1 if a\u003eb and 0 if a\u003d\u003db\n     *  Note this method does not properly handle NaNs or numbers with different precision.\n     ",
      "child_ranges": [
        "(line 946,col 9)-(line 949,col 9)",
        "(line 951,col 9)-(line 957,col 9)",
        "(line 960,col 9)-(line 962,col 9)",
        "(line 964,col 9)-(line 966,col 9)",
        "(line 968,col 9)-(line 970,col 9)",
        "(line 973,col 9)-(line 981,col 9)",
        "(line 984,col 9)-(line 992,col 9)",
        "(line 994,col 9)-(line 994,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.rint()",
      "begin_line": 1003,
      "end_line": 1005,
      "comment": " Round to nearest integer using the round-half-even method.\n     *  That is round to nearest integer unless both are equidistant.\n     *  In which case round to the even one.\n     *  @return rounded value\n     ",
      "child_ranges": [
        "(line 1004,col 9)-(line 1004,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.floor()",
      "begin_line": 1011,
      "end_line": 1013,
      "comment": " Round to an integer using the round floor mode.\n     * That is, round toward -Infinity\n     *  @return rounded value\n     ",
      "child_ranges": [
        "(line 1012,col 9)-(line 1012,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.ceil()",
      "begin_line": 1019,
      "end_line": 1021,
      "comment": " Round to an integer using the round ceil mode.\n     * That is, round toward +Infinity\n     *  @return rounded value\n     ",
      "child_ranges": [
        "(line 1020,col 9)-(line 1020,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.remainder(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 1027,
      "end_line": 1038,
      "comment": " Returns the IEEE remainder.\n     * @param d divisor\n     * @return this less n \u0026times; d, where n is the integer closest to this/d\n     ",
      "child_ranges": [
        "(line 1029,col 9)-(line 1029,col 76)",
        "(line 1032,col 9)-(line 1034,col 9)",
        "(line 1036,col 9)-(line 1036,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.trunc(org.apache.commons.math3.dfp.DfpField.RoundingMode)",
      "begin_line": 1044,
      "end_line": 1128,
      "comment": " Does the integer conversions with the specified rounding.\n     * @param rmode rounding mode to use\n     * @return truncated value\n     ",
      "child_ranges": [
        "(line 1045,col 9)-(line 1045,col 32)",
        "(line 1047,col 9)-(line 1049,col 9)",
        "(line 1051,col 9)-(line 1053,col 9)",
        "(line 1055,col 9)-(line 1058,col 9)",
        "(line 1062,col 9)-(line 1067,col 9)",
        "(line 1073,col 9)-(line 1075,col 9)",
        "(line 1080,col 9)-(line 1080,col 39)",
        "(line 1081,col 9)-(line 1084,col 9)",
        "(line 1086,col 9)-(line 1125,col 9)",
        "(line 1127,col 9)-(line 1127,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.intValue()",
      "begin_line": 1134,
      "end_line": 1157,
      "comment": " Convert this to an integer.\n     * If greater than 2147483647, it returns 2147483647. If less than -2147483648 it returns -2147483648.\n     * @return converted number\n     ",
      "child_ranges": [
        "(line 1135,col 9)-(line 1135,col 20)",
        "(line 1136,col 9)-(line 1136,col 23)",
        "(line 1138,col 9)-(line 1138,col 25)",
        "(line 1140,col 9)-(line 1142,col 9)",
        "(line 1144,col 9)-(line 1146,col 9)",
        "(line 1148,col 9)-(line 1150,col 9)",
        "(line 1152,col 9)-(line 1154,col 9)",
        "(line 1156,col 9)-(line 1156,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.log10K()",
      "begin_line": 1164,
      "end_line": 1166,
      "comment": " Get the exponent of the greatest power of 10000 that is\n     *  less than or equal to the absolute value of this.  I.E.  if\n     *  this is 10\u003csup\u003e6\u003c/sup\u003e then log10K would return 1.\n     *  @return integer base 10000 logarithm\n     ",
      "child_ranges": [
        "(line 1165,col 9)-(line 1165,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.power10K(int)",
      "begin_line": 1172,
      "end_line": 1176,
      "comment": " Get the specified  power of 10000.\n     * @param e desired power\n     * @return 10000\u003csup\u003ee\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 1173,col 9)-(line 1173,col 38)",
        "(line 1174,col 9)-(line 1174,col 22)",
        "(line 1175,col 9)-(line 1175,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.log10()",
      "begin_line": 1181,
      "end_line": 1192,
      "comment": " Get the exponent of the greatest power of 10 that is less than or equal to abs(this).\n     *  @return integer base 10 logarithm\n     ",
      "child_ranges": [
        "(line 1182,col 9)-(line 1184,col 9)",
        "(line 1185,col 9)-(line 1187,col 9)",
        "(line 1188,col 9)-(line 1190,col 9)",
        "(line 1191,col 9)-(line 1191,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.power10(int)",
      "begin_line": 1198,
      "end_line": 1221,
      "comment": " Return the specified  power of 10.\n     * @param e desired power\n     * @return 10\u003csup\u003ee\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 1199,col 9)-(line 1199,col 38)",
        "(line 1201,col 9)-(line 1205,col 9)",
        "(line 1207,col 9)-(line 1218,col 9)",
        "(line 1220,col 9)-(line 1220,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.complement(int)",
      "begin_line": 1229,
      "end_line": 1245,
      "comment": " Negate the mantissa of this by computing the complement.\n     *  Leaves the sign bit unchanged, used internally by add.\n     *  Denormalized numbers are handled properly here.\n     *  @param extra ???\n     *  @return ???\n     ",
      "child_ranges": [
        "(line 1231,col 9)-(line 1231,col 28)",
        "(line 1232,col 9)-(line 1234,col 9)",
        "(line 1236,col 9)-(line 1236,col 31)",
        "(line 1237,col 9)-(line 1237,col 35)",
        "(line 1238,col 9)-(line 1242,col 9)",
        "(line 1244,col 9)-(line 1244,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.add(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 1251,
      "end_line": 1394,
      "comment": " Add x to this.\n     * @param x number to add\n     * @return sum of this and x\n     ",
      "child_ranges": [
        "(line 1254,col 9)-(line 1259,col 9)",
        "(line 1262,col 9)-(line 1290,col 9)",
        "(line 1293,col 9)-(line 1293,col 34)",
        "(line 1294,col 9)-(line 1294,col 31)",
        "(line 1297,col 9)-(line 1297,col 44)",
        "(line 1300,col 9)-(line 1300,col 34)",
        "(line 1301,col 9)-(line 1301,col 34)",
        "(line 1303,col 9)-(line 1303,col 19)",
        "(line 1304,col 9)-(line 1304,col 19)",
        "(line 1307,col 9)-(line 1307,col 27)",
        "(line 1308,col 9)-(line 1310,col 9)",
        "(line 1315,col 9)-(line 1317,col 9)",
        "(line 1319,col 9)-(line 1321,col 9)",
        "(line 1324,col 9)-(line 1324,col 28)",
        "(line 1325,col 9)-(line 1325,col 28)",
        "(line 1326,col 9)-(line 1330,col 9)",
        "(line 1333,col 9)-(line 1339,col 9)",
        "(line 1342,col 9)-(line 1342,col 19)",
        "(line 1343,col 9)-(line 1347,col 9)",
        "(line 1348,col 9)-(line 1348,col 27)",
        "(line 1349,col 9)-(line 1349,col 28)",
        "(line 1354,col 9)-(line 1362,col 9)",
        "(line 1365,col 9)-(line 1375,col 9)",
        "(line 1378,col 9)-(line 1385,col 9)",
        "(line 1388,col 9)-(line 1388,col 65)",
        "(line 1389,col 9)-(line 1391,col 9)",
        "(line 1393,col 9)-(line 1393,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.negate()",
      "begin_line": 1399,
      "end_line": 1403,
      "comment": " Returns a number that is this number with the sign bit reversed.\n     * @return the opposite of this\n     ",
      "child_ranges": [
        "(line 1400,col 9)-(line 1400,col 39)",
        "(line 1401,col 9)-(line 1401,col 43)",
        "(line 1402,col 9)-(line 1402,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.subtract(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 1409,
      "end_line": 1411,
      "comment": " Subtract x from this.\n     * @param x number to subtract\n     * @return difference of this and a\n     ",
      "child_ranges": [
        "(line 1410,col 9)-(line 1410,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.round(int)",
      "begin_line": 1417,
      "end_line": 1490,
      "comment": " Round this given the next digit n using the current rounding mode.\n     * @param n ???\n     * @return the IEEE flag if an exception occurred\n     ",
      "child_ranges": [
        "(line 1418,col 9)-(line 1418,col 28)",
        "(line 1419,col 9)-(line 1452,col 9)",
        "(line 1454,col 9)-(line 1467,col 9)",
        "(line 1470,col 9)-(line 1474,col 9)",
        "(line 1476,col 9)-(line 1480,col 9)",
        "(line 1482,col 9)-(line 1486,col 9)",
        "(line 1488,col 9)-(line 1488,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.multiply(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 1496,
      "end_line": 1596,
      "comment": " Multiply this by x.\n     * @param x multiplicand\n     * @return product of this and x\n     ",
      "child_ranges": [
        "(line 1499,col 9)-(line 1504,col 9)",
        "(line 1506,col 9)-(line 1506,col 44)",
        "(line 1509,col 9)-(line 1544,col 9)",
        "(line 1546,col 9)-(line 1546,col 47)",
        "(line 1548,col 9)-(line 1558,col 9)",
        "(line 1561,col 9)-(line 1561,col 37)",
        "(line 1562,col 9)-(line 1567,col 9)",
        "(line 1570,col 9)-(line 1572,col 9)",
        "(line 1575,col 9)-(line 1575,col 60)",
        "(line 1576,col 9)-(line 1576,col 52)",
        "(line 1578,col 9)-(line 1581,col 9)",
        "(line 1583,col 9)-(line 1583,col 23)",
        "(line 1584,col 9)-(line 1588,col 9)",
        "(line 1590,col 9)-(line 1592,col 9)",
        "(line 1594,col 9)-(line 1594,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.multiply(int)",
      "begin_line": 1603,
      "end_line": 1659,
      "comment": " Multiply this by a single digit 0\u0026lt;\u003dx\u0026lt;radix.\n     * There are speed advantages in this special case\n     * @param x multiplicand\n     * @return product of this and x\n     ",
      "child_ranges": [
        "(line 1604,col 9)-(line 1604,col 39)",
        "(line 1607,col 9)-(line 1624,col 9)",
        "(line 1627,col 9)-(line 1633,col 9)",
        "(line 1635,col 9)-(line 1635,col 19)",
        "(line 1636,col 9)-(line 1640,col 9)",
        "(line 1642,col 9)-(line 1642,col 26)",
        "(line 1643,col 9)-(line 1647,col 9)",
        "(line 1649,col 9)-(line 1651,col 9)",
        "(line 1653,col 9)-(line 1653,col 49)",
        "(line 1654,col 9)-(line 1656,col 9)",
        "(line 1658,col 9)-(line 1658,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.divide(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 1665,
      "end_line": 1873,
      "comment": " Divide this by divisor.\n     * @param divisor divisor\n     * @return quotient of this by divisor\n     ",
      "child_ranges": [
        "(line 1666,col 9)-(line 1666,col 23)",
        "(line 1667,col 9)-(line 1667,col 23)",
        "(line 1668,col 9)-(line 1668,col 24)",
        "(line 1669,col 9)-(line 1669,col 15)",
        "(line 1670,col 9)-(line 1670,col 17)",
        "(line 1671,col 9)-(line 1671,col 20)",
        "(line 1672,col 9)-(line 1672,col 19)",
        "(line 1673,col 9)-(line 1673,col 26)",
        "(line 1674,col 9)-(line 1674,col 17)",
        "(line 1675,col 9)-(line 1675,col 17)",
        "(line 1678,col 9)-(line 1683,col 9)",
        "(line 1685,col 9)-(line 1685,col 44)",
        "(line 1688,col 9)-(line 1716,col 9)",
        "(line 1719,col 9)-(line 1726,col 9)",
        "(line 1728,col 9)-(line 1728,col 42)",
        "(line 1729,col 9)-(line 1729,col 42)",
        "(line 1730,col 9)-(line 1730,col 43)",
        "(line 1734,col 9)-(line 1734,col 34)",
        "(line 1735,col 9)-(line 1735,col 34)",
        "(line 1736,col 9)-(line 1736,col 36)",
        "(line 1737,col 9)-(line 1737,col 35)",
        "(line 1742,col 9)-(line 1746,col 9)",
        "(line 1749,col 9)-(line 1749,col 17)",
        "(line 1750,col 9)-(line 1838,col 9)",
        "(line 1841,col 9)-(line 1841,col 25)",
        "(line 1842,col 9)-(line 1847,col 9)",
        "(line 1850,col 9)-(line 1852,col 9)",
        "(line 1855,col 9)-(line 1855,col 58)",
        "(line 1856,col 9)-(line 1856,col 63)",
        "(line 1858,col 9)-(line 1860,col 9)",
        "(line 1862,col 9)-(line 1866,col 9)",
        "(line 1868,col 9)-(line 1870,col 9)",
        "(line 1872,col 9)-(line 1872,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.divide(int)",
      "begin_line": 1880,
      "end_line": 1938,
      "comment": " Divide by a single digit less than radix.\n     *  Special case, so there are speed advantages. 0 \u0026lt;\u003d divisor \u0026lt; radix\n     * @param divisor divisor\n     * @return quotient of this by divisor\n     ",
      "child_ranges": [
        "(line 1883,col 9)-(line 1891,col 9)",
        "(line 1894,col 9)-(line 1901,col 9)",
        "(line 1904,col 9)-(line 1910,col 9)",
        "(line 1912,col 9)-(line 1912,col 39)",
        "(line 1914,col 9)-(line 1914,col 19)",
        "(line 1915,col 9)-(line 1920,col 9)",
        "(line 1922,col 9)-(line 1929,col 9)",
        "(line 1931,col 9)-(line 1931,col 60)",
        "(line 1932,col 9)-(line 1934,col 9)",
        "(line 1936,col 9)-(line 1936,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.reciprocal()",
      "begin_line": 1941,
      "end_line": 1943,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1942,col 9)-(line 1942,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.sqrt()",
      "begin_line": 1948,
      "end_line": 2039,
      "comment": " Compute the square root.\n     * @return square root of the instance\n     ",
      "child_ranges": [
        "(line 1951,col 9)-(line 1954,col 9)",
        "(line 1956,col 9)-(line 1974,col 9)",
        "(line 1976,col 9)-(line 1985,col 9)",
        "(line 1987,col 9)-(line 1987,col 34)",
        "(line 1990,col 9)-(line 1992,col 9)",
        "(line 1995,col 9)-(line 2007,col 9)",
        "(line 2009,col 9)-(line 2009,col 32)",
        "(line 2014,col 9)-(line 2014,col 28)",
        "(line 2015,col 9)-(line 2015,col 28)",
        "(line 2016,col 9)-(line 2035,col 9)",
        "(line 2037,col 9)-(line 2037,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.toString()",
      "begin_line": 2044,
      "end_line": 2061,
      "comment": " Get a string representation of the instance.\n     * @return string representation of the instance\n     ",
      "child_ranges": [
        "(line 2046,col 9)-(line 2053,col 9)",
        "(line 2055,col 9)-(line 2057,col 9)",
        "(line 2059,col 9)-(line 2059,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.dfp2sci()",
      "begin_line": 2066,
      "end_line": 2142,
      "comment": " Convert an instance to a string using scientific notation.\n     * @return string representation of the instance in scientific notation\n     ",
      "child_ranges": [
        "(line 2067,col 9)-(line 2067,col 56)",
        "(line 2068,col 9)-(line 2068,col 61)",
        "(line 2069,col 9)-(line 2069,col 14)",
        "(line 2070,col 9)-(line 2070,col 14)",
        "(line 2071,col 9)-(line 2071,col 14)",
        "(line 2072,col 9)-(line 2072,col 15)",
        "(line 2073,col 9)-(line 2073,col 16)",
        "(line 2076,col 9)-(line 2076,col 14)",
        "(line 2077,col 9)-(line 2082,col 9)",
        "(line 2085,col 9)-(line 2089,col 9)",
        "(line 2090,col 9)-(line 2090,col 16)",
        "(line 2093,col 9)-(line 2093,col 14)",
        "(line 2094,col 9)-(line 2096,col 9)",
        "(line 2098,col 9)-(line 2113,col 9)",
        "(line 2115,col 9)-(line 2115,col 32)",
        "(line 2119,col 9)-(line 2119,col 30)",
        "(line 2120,col 9)-(line 2120,col 15)",
        "(line 2121,col 9)-(line 2123,col 9)",
        "(line 2126,col 9)-(line 2128,col 9)",
        "(line 2130,col 9)-(line 2132,col 9)",
        "(line 2134,col 9)-(line 2138,col 9)",
        "(line 2140,col 9)-(line 2140,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.dfp2string()",
      "begin_line": 2147,
      "end_line": 2215,
      "comment": " Convert an instance to a string using normal notation.\n     * @return string representation of the instance in normal notation\n     ",
      "child_ranges": [
        "(line 2148,col 9)-(line 2148,col 53)",
        "(line 2149,col 9)-(line 2149,col 18)",
        "(line 2150,col 9)-(line 2150,col 14)",
        "(line 2151,col 9)-(line 2151,col 20)",
        "(line 2152,col 9)-(line 2152,col 38)",
        "(line 2154,col 9)-(line 2154,col 24)",
        "(line 2156,col 9)-(line 2160,col 9)",
        "(line 2162,col 9)-(line 2168,col 9)",
        "(line 2170,col 9)-(line 2179,col 9)",
        "(line 2181,col 9)-(line 2187,col 9)",
        "(line 2189,col 9)-(line 2192,col 9)",
        "(line 2195,col 9)-(line 2195,col 14)",
        "(line 2196,col 9)-(line 2198,col 9)",
        "(line 2199,col 9)-(line 2201,col 9)",
        "(line 2204,col 9)-(line 2206,col 9)",
        "(line 2209,col 9)-(line 2211,col 9)",
        "(line 2213,col 9)-(line 2213,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.dotrap(int, java.lang.String, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2224,
      "end_line": 2281,
      "comment": " Raises a trap.  This does not set the corresponding flag however.\n     *  @param type the trap type\n     *  @param what - name of routine trap occurred in\n     *  @param oper - input operator to function\n     *  @param result - the result computed prior to the trap\n     *  @return The suggested return value from the trap handler\n     ",
      "child_ranges": [
        "(line 2225,col 9)-(line 2225,col 25)",
        "(line 2227,col 9)-(line 2277,col 9)",
        "(line 2279,col 9)-(line 2279,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.trap(int, java.lang.String, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2294,
      "end_line": 2296,
      "comment": " Trap handler.  Subclasses may override this to provide trap\n     *  functionality per IEEE 854-1987.\n     *\n     *  @param type  The exception type - e.g. FLAG_OVERFLOW\n     *  @param what  The name of the routine we were in e.g. divide()\n     *  @param oper  An operand to this function if any\n     *  @param def   The default return value if trap not enabled\n     *  @param result    The result that is specified to be delivered per\n     *                   IEEE 854, if any\n     *  @return the value that should be return by the operation triggering the trap\n     ",
      "child_ranges": [
        "(line 2295,col 9)-(line 2295,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.classify()",
      "begin_line": 2301,
      "end_line": 2303,
      "comment": " Returns the type - one of FINITE, INFINITE, SNAN, QNAN.\n     * @return type of the number\n     ",
      "child_ranges": [
        "(line 2302,col 9)-(line 2302,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.copysign(org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2311,
      "end_line": 2315,
      "comment": " Creates an instance that is the same as x except that it has the sign of y.\n     * abs(x) \u003d dfp.copysign(x, dfp.one)\n     * @param x number to get the value from\n     * @param y number to get the sign from\n     * @return a number with the value of x and the sign of y\n     ",
      "child_ranges": [
        "(line 2312,col 9)-(line 2312,col 38)",
        "(line 2313,col 9)-(line 2313,col 29)",
        "(line 2314,col 9)-(line 2314,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.nextAfter(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 2322,
      "end_line": 2388,
      "comment": " Returns the next number greater than this one in the direction of x.\n     * If this\u003d\u003dx then simply returns this.\n     * @param x direction where to look at\n     * @return closest number next to instance in the direction of x\n     ",
      "child_ranges": [
        "(line 2325,col 9)-(line 2330,col 9)",
        "(line 2333,col 9)-(line 2333,col 27)",
        "(line 2334,col 9)-(line 2336,col 9)",
        "(line 2338,col 9)-(line 2340,col 9)",
        "(line 2342,col 9)-(line 2344,col 9)",
        "(line 2346,col 9)-(line 2346,col 22)",
        "(line 2347,col 9)-(line 2347,col 19)",
        "(line 2348,col 9)-(line 2374,col 9)",
        "(line 2376,col 9)-(line 2379,col 9)",
        "(line 2381,col 9)-(line 2384,col 9)",
        "(line 2386,col 9)-(line 2386,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.toDouble()",
      "begin_line": 2394,
      "end_line": 2478,
      "comment": " Convert the instance into a double.\n     * @return a double approximating the instance\n     * @see #toSplitDouble()\n     ",
      "child_ranges": [
        "(line 2396,col 9)-(line 2402,col 9)",
        "(line 2404,col 9)-(line 2406,col 9)",
        "(line 2408,col 9)-(line 2408,col 21)",
        "(line 2409,col 9)-(line 2409,col 31)",
        "(line 2410,col 9)-(line 2410,col 44)",
        "(line 2411,col 9)-(line 2416,col 9)",
        "(line 2420,col 9)-(line 2420,col 47)",
        "(line 2421,col 9)-(line 2423,col 9)",
        "(line 2425,col 9)-(line 2425,col 54)",
        "(line 2426,col 9)-(line 2429,col 9)",
        "(line 2430,col 9)-(line 2430,col 19)",
        "(line 2434,col 9)-(line 2434,col 54)",
        "(line 2435,col 9)-(line 2437,col 9)",
        "(line 2439,col 9)-(line 2441,col 9)",
        "(line 2443,col 9)-(line 2445,col 9)",
        "(line 2448,col 9)-(line 2448,col 62)",
        "(line 2449,col 9)-(line 2449,col 34)",
        "(line 2450,col 9)-(line 2450,col 47)",
        "(line 2451,col 9)-(line 2451,col 44)",
        "(line 2453,col 9)-(line 2457,col 9)",
        "(line 2460,col 9)-(line 2462,col 9)",
        "(line 2464,col 9)-(line 2467,col 9)",
        "(line 2469,col 9)-(line 2469,col 58)",
        "(line 2470,col 9)-(line 2470,col 49)",
        "(line 2472,col 9)-(line 2474,col 9)",
        "(line 2476,col 9)-(line 2476,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.Dfp.toSplitDouble()",
      "begin_line": 2484,
      "end_line": 2492,
      "comment": " Convert the instance into a split double.\n     * @return an array of two doubles which sum represent the instance\n     * @see #toDouble()\n     ",
      "child_ranges": [
        "(line 2485,col 9)-(line 2485,col 39)",
        "(line 2486,col 9)-(line 2486,col 40)",
        "(line 2488,col 9)-(line 2488,col 87)",
        "(line 2489,col 9)-(line 2489,col 62)",
        "(line 2491,col 9)-(line 2491,col 21)"
      ]
    }
  ]
}