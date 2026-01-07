{
  "filepath": "/tmp/Math-59b/src/main/java/org/apache/commons/math/dfp/Dfp.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Dfp",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.FieldElement\u003corg.apache.commons.math.dfp.Dfp\u003e"
      ],
      "begin_line": 96,
      "end_line": 2399,
      "comment": "\n *  Decimal floating point library for Java\n *\n *  \u003cp\u003eAnother floating point class.  This one is built using radix 10000\n *  which is 10\u003csup\u003e4\u003c/sup\u003e, so its almost decimal.\u003c/p\u003e\n *\n *  \u003cp\u003eThe design goals here are:\n *  \u003col\u003e\n *    \u003cli\u003eDecimal math, or close to it\u003c/li\u003e\n *    \u003cli\u003eSettable precision (but no mix between numbers using different settings)\u003c/li\u003e\n *    \u003cli\u003ePortability.  Code should be keep as portable as possible.\u003c/li\u003e\n *    \u003cli\u003ePerformance\u003c/li\u003e\n *    \u003cli\u003eAccuracy  - Results should always be +/- 1 ULP for basic\n *         algebraic operation\u003c/li\u003e\n *    \u003cli\u003eComply with IEEE 854-1987 as much as possible.\n *         (See IEEE 854-1987 notes below)\u003c/li\u003e\n *  \u003c/ol\u003e\u003c/p\u003e\n *\n *  \u003cp\u003eTrade offs:\n *  \u003col\u003e\n *    \u003cli\u003eMemory foot print.  I\u0027m using more memory than necessary to\n *         represent numbers to get better performance.\u003c/li\u003e\n *    \u003cli\u003eDigits are bigger, so rounding is a greater loss.  So, if you\n *         really need 12 decimal digits, better use 4 base 10000 digits\n *         there can be one partially filled.\u003c/li\u003e\n *  \u003c/ol\u003e\u003c/p\u003e\n *\n *  \u003cp\u003eNumbers are represented  in the following form:\n *  \u003cpre\u003e\n *  n  \u003d  sign \u0026times; mant \u0026times; (radix)\u003csup\u003eexp\u003c/sup\u003e;\u003c/p\u003e\n *  \u003c/pre\u003e\n *  where sign is \u0026plusmn;1, mantissa represents a fractional number between\n *  zero and one.  mant[0] is the least significant digit.\n *  exp is in the range of -32767 to 32768\u003c/p\u003e\n *\n *  \u003cp\u003eIEEE 854-1987  Notes and differences\u003c/p\u003e\n *\n *  \u003cp\u003eIEEE 854 requires the radix to be either 2 or 10.  The radix here is\n *  10000, so that requirement is not met, but  it is possible that a\n *  subclassed can be made to make it behave as a radix 10\n *  number.  It is my opinion that if it looks and behaves as a radix\n *  10 number then it is one and that requirement would be met.\u003c/p\u003e\n *\n *  \u003cp\u003eThe radix of 10000 was chosen because it should be faster to operate\n *  on 4 decimal digits at once instead of one at a time.  Radix 10 behavior\n *  can be realized by add an additional rounding step to ensure that\n *  the number of decimal digits represented is constant.\u003c/p\u003e\n *\n *  \u003cp\u003eThe IEEE standard specifically leaves out internal data encoding,\n *  so it is reasonable to conclude that such a subclass of this radix\n *  10000 system is merely an encoding of a radix 10 system.\u003c/p\u003e\n *\n *  \u003cp\u003eIEEE 854 also specifies the existence of \"sub-normal\" numbers.  This\n *  class does not contain any such entities.  The most significant radix\n *  10000 digit is always non-zero.  Instead, we support \"gradual underflow\"\n *  by raising the underflow flag for numbers less with exponent less than\n *  expMin, but don\u0027t flush to zero until the exponent reaches MIN_EXP-digits.\n *  Thus the smallest number we can represent would be:\n *  1E(-(MIN_EXP-digits-1)*4),  eg, for digits\u003d5, MIN_EXP\u003d-32767, that would\n *  be 1e-131092.\u003c/p\u003e\n *\n *  \u003cp\u003eIEEE 854 defines that the implied radix point lies just to the right\n *  of the most significant digit and to the left of the remaining digits.\n *  This implementation puts the implied radix point to the left of all\n *  digits including the most significant one.  The most significant digit\n *  here is the one just to the right of the radix point.  This is a fine\n *  detail and is really only a matter of definition.  Any side effects of\n *  this can be rendered invisible by a subclass.\u003c/p\u003e\n * @see DfpField\n * @version $Revision$ $Date$\n * @since 2.2\n "
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
      "comment": " Sign bit: \u0026 for positive, -1 for negative. "
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
      "signature": "org.apache.commons.math.dfp.Dfp.Dfp(org.apache.commons.math.dfp.DfpField)",
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
      "signature": "org.apache.commons.math.dfp.Dfp.Dfp(org.apache.commons.math.dfp.DfpField, byte)",
      "begin_line": 193,
      "end_line": 195,
      "comment": " Create an instance from a byte value.\n     * @param field field to which this instance belongs\n     * @param x value to convert to an instance\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.dfp.Dfp.Dfp(org.apache.commons.math.dfp.DfpField, int)",
      "begin_line": 201,
      "end_line": 203,
      "comment": " Create an instance from an int value.\n     * @param field field to which this instance belongs\n     * @param x value to convert to an instance\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.dfp.Dfp.Dfp(org.apache.commons.math.dfp.DfpField, long)",
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
      "signature": "org.apache.commons.math.dfp.Dfp.Dfp(org.apache.commons.math.dfp.DfpField, double)",
      "begin_line": 256,
      "end_line": 313,
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
        "(line 269,col 9)-(line 283,col 9)",
        "(line 285,col 9)-(line 298,col 9)",
        "(line 300,col 9)-(line 300,col 44)",
        "(line 301,col 9)-(line 301,col 82)",
        "(line 302,col 9)-(line 302,col 68)",
        "(line 304,col 9)-(line 306,col 9)",
        "(line 308,col 9)-(line 308,col 61)",
        "(line 309,col 9)-(line 309,col 25)",
        "(line 310,col 9)-(line 310,col 24)",
        "(line 311,col 9)-(line 311,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.dfp.Dfp.Dfp(org.apache.commons.math.dfp.Dfp)",
      "begin_line": 318,
      "end_line": 324,
      "comment": " Copy constructor.\n     * @param d instance to copy\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 31)",
        "(line 320,col 9)-(line 320,col 23)",
        "(line 321,col 9)-(line 321,col 22)",
        "(line 322,col 9)-(line 322,col 23)",
        "(line 323,col 9)-(line 323,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.dfp.Dfp.Dfp(org.apache.commons.math.dfp.DfpField, java.lang.String)",
      "begin_line": 330,
      "end_line": 530,
      "comment": " Create an instance from a String representation.\n     * @param field field to which this instance belongs\n     * @param s string representation of the instance\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 47)",
        "(line 334,col 9)-(line 334,col 17)",
        "(line 335,col 9)-(line 335,col 16)",
        "(line 336,col 9)-(line 336,col 22)",
        "(line 337,col 9)-(line 337,col 27)",
        "(line 339,col 9)-(line 339,col 37)",
        "(line 340,col 9)-(line 340,col 28)",
        "(line 341,col 9)-(line 341,col 29)",
        "(line 342,col 9)-(line 342,col 79)",
        "(line 345,col 9)-(line 349,col 9)",
        "(line 351,col 9)-(line 355,col 9)",
        "(line 357,col 9)-(line 361,col 9)",
        "(line 364,col 9)-(line 364,col 31)",
        "(line 365,col 9)-(line 367,col 9)",
        "(line 369,col 9)-(line 369,col 31)",
        "(line 370,col 9)-(line 370,col 23)",
        "(line 371,col 9)-(line 394,col 9)",
        "(line 397,col 9)-(line 399,col 9)",
        "(line 402,col 9)-(line 402,col 14)",
        "(line 405,col 9)-(line 405,col 27)",
        "(line 406,col 9)-(line 424,col 9)",
        "(line 427,col 9)-(line 427,col 23)",
        "(line 428,col 9)-(line 428,col 25)",
        "(line 429,col 9)-(line 429,col 25)",
        "(line 430,col 9)-(line 430,col 25)",
        "(line 431,col 9)-(line 431,col 25)",
        "(line 432,col 9)-(line 432,col 32)",
        "(line 433,col 9)-(line 459,col 9)",
        "(line 463,col 9)-(line 475,col 9)",
        "(line 478,col 9)-(line 480,col 9)",
        "(line 483,col 9)-(line 485,col 9)",
        "(line 488,col 9)-(line 488,col 19)",
        "(line 489,col 9)-(line 489,col 39)",
        "(line 491,col 9)-(line 491,col 30)",
        "(line 492,col 9)-(line 498,col 9)",
        "(line 501,col 9)-(line 501,col 70)",
        "(line 502,col 9)-(line 502,col 15)",
        "(line 503,col 9)-(line 503,col 24)",
        "(line 506,col 9)-(line 510,col 9)",
        "(line 514,col 9)-(line 520,col 9)",
        "(line 523,col 9)-(line 523,col 42)",
        "(line 525,col 9)-(line 528,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.dfp.Dfp.Dfp(org.apache.commons.math.dfp.DfpField, byte, byte)",
      "begin_line": 538,
      "end_line": 544,
      "comment": " Creates an instance with a non-finite value.\n     * @param field field to which this instance belongs\n     * @param sign sign of the Dfp to create\n     * @param nans code of the value, must be one of {@link #INFINITE},\n     * {@link #SNAN},  {@link #QNAN}\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 27)",
        "(line 540,col 9)-(line 540,col 55)",
        "(line 541,col 9)-(line 541,col 28)",
        "(line 542,col 9)-(line 542,col 25)",
        "(line 543,col 9)-(line 543,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.newInstance()",
      "begin_line": 550,
      "end_line": 552,
      "comment": " Create an instance with a value of 0.\n     * Use this internally in preference to constructors to facilitate subclasses\n     * @return a new instance with a value of 0\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.newInstance(byte)",
      "begin_line": 558,
      "end_line": 560,
      "comment": " Create an instance from a byte value.\n     * @param x value to convert to an instance\n     * @return a new instance with value x\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.newInstance(int)",
      "begin_line": 566,
      "end_line": 568,
      "comment": " Create an instance from an int value.\n     * @param x value to convert to an instance\n     * @return a new instance with value x\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.newInstance(long)",
      "begin_line": 574,
      "end_line": 576,
      "comment": " Create an instance from a long value.\n     * @param x value to convert to an instance\n     * @return a new instance with value x\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.newInstance(double)",
      "begin_line": 582,
      "end_line": 584,
      "comment": " Create an instance from a double value.\n     * @param x value to convert to an instance\n     * @return a new instance with value x\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.newInstance(org.apache.commons.math.dfp.Dfp)",
      "begin_line": 591,
      "end_line": 603,
      "comment": " Create an instance by copying an existing one.\n     * Use this internally in preference to constructors to facilitate subclasses.\n     * @param d instance to copy\n     * @return a new instance with the same value as d\n     ",
      "child_ranges": [
        "(line 594,col 9)-(line 599,col 9)",
        "(line 601,col 9)-(line 601,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.newInstance(java.lang.String)",
      "begin_line": 610,
      "end_line": 612,
      "comment": " Create an instance from a String representation.\n     * Use this internally in preference to constructors to facilitate subclasses.\n     * @param s string representation of the instance\n     * @return a new instance parsed from specified string\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.newInstance(byte, byte)",
      "begin_line": 620,
      "end_line": 622,
      "comment": " Creates an instance with a non-finite value.\n     * @param sig sign of the Dfp to create\n     * @param code code of the value, must be one of {@link #INFINITE},\n     * {@link #SNAN},  {@link #QNAN}\n     * @return a new instance with a non-finite value\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.getField()",
      "begin_line": 631,
      "end_line": 633,
      "comment": " Get the {@link org.apache.commons.math.Field Field} (really a {@link DfpField}) to which the instance belongs.\n     * \u003cp\u003e\n     * The field is linked to the number of digits and acts as a factory\n     * for {@link Dfp} instances.\n     * \u003c/p\u003e\n     * @return {@link org.apache.commons.math.Field Field} (really a {@link DfpField}) to which the instance belongs\n     ",
      "child_ranges": [
        "(line 632,col 9)-(line 632,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.getRadixDigits()",
      "begin_line": 638,
      "end_line": 640,
      "comment": " Get the number of radix digits of the instance.\n     * @return number of radix digits\n     ",
      "child_ranges": [
        "(line 639,col 9)-(line 639,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.getZero()",
      "begin_line": 645,
      "end_line": 647,
      "comment": " Get the constant 0.\n     * @return a Dfp with value zero\n     ",
      "child_ranges": [
        "(line 646,col 9)-(line 646,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.getOne()",
      "begin_line": 652,
      "end_line": 654,
      "comment": " Get the constant 1.\n     * @return a Dfp with value one\n     ",
      "child_ranges": [
        "(line 653,col 9)-(line 653,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.getTwo()",
      "begin_line": 659,
      "end_line": 661,
      "comment": " Get the constant 2.\n     * @return a Dfp with value two\n     ",
      "child_ranges": [
        "(line 660,col 9)-(line 660,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.shiftLeft()",
      "begin_line": 665,
      "end_line": 671,
      "comment": " Shift the mantissa left, and adjust the exponent to compensate.\n     ",
      "child_ranges": [
        "(line 666,col 9)-(line 668,col 9)",
        "(line 669,col 9)-(line 669,col 20)",
        "(line 670,col 9)-(line 670,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.shiftRight()",
      "begin_line": 677,
      "end_line": 683,
      "comment": " Shift the mantissa right, and adjust the exponent to compensate.\n     ",
      "child_ranges": [
        "(line 678,col 9)-(line 680,col 9)",
        "(line 681,col 9)-(line 681,col 34)",
        "(line 682,col 9)-(line 682,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.align(int)",
      "begin_line": 693,
      "end_line": 744,
      "comment": " Make our exp equal to the supplied one, this may cause rounding.\n     *  Also causes de-normalized numbers.  These numbers are generally\n     *  dangerous because most routines assume normalized numbers.\n     *  Align doesn\u0027t round, so it will return the last digit destroyed\n     *  by shifting right.\n     *  @param e desired exponent\n     *  @return last digit destroyed by shifting right\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 694,col 26)",
        "(line 695,col 9)-(line 695,col 32)",
        "(line 697,col 9)-(line 697,col 27)",
        "(line 699,col 9)-(line 699,col 25)",
        "(line 700,col 9)-(line 702,col 9)",
        "(line 704,col 9)-(line 706,col 9)",
        "(line 708,col 9)-(line 717,col 9)",
        "(line 719,col 9)-(line 735,col 9)",
        "(line 737,col 9)-(line 740,col 9)",
        "(line 742,col 9)-(line 742,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.lessThan(org.apache.commons.math.dfp.Dfp)",
      "begin_line": 750,
      "end_line": 769,
      "comment": " Check if instance is less than x.\n     * @param x number to check instance against\n     * @return true if instance is less than x and neither are NaN, false otherwise\n     ",
      "child_ranges": [
        "(line 753,col 9)-(line 759,col 9)",
        "(line 762,col 9)-(line 766,col 9)",
        "(line 768,col 9)-(line 768,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.greaterThan(org.apache.commons.math.dfp.Dfp)",
      "begin_line": 775,
      "end_line": 794,
      "comment": " Check if instance is greater than x.\n     * @param x number to check instance against\n     * @return true if instance is greater than x and neither are NaN, false otherwise\n     ",
      "child_ranges": [
        "(line 778,col 9)-(line 784,col 9)",
        "(line 787,col 9)-(line 791,col 9)",
        "(line 793,col 9)-(line 793,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.isInfinite()",
      "begin_line": 799,
      "end_line": 801,
      "comment": " Check if instance is infinite.\n     * @return true if instance is infinite\n     ",
      "child_ranges": [
        "(line 800,col 9)-(line 800,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.isNaN()",
      "begin_line": 806,
      "end_line": 808,
      "comment": " Check if instance is not a number.\n     * @return true if instance is not a number\n     ",
      "child_ranges": [
        "(line 807,col 9)-(line 807,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.equals(java.lang.Object)",
      "begin_line": 814,
      "end_line": 828,
      "comment": " Check if instance is equal to x.\n     * @param other object to check instance against\n     * @return true if instance is equal to x and neither are NaN, false otherwise\n     ",
      "child_ranges": [
        "(line 817,col 9)-(line 824,col 9)",
        "(line 826,col 9)-(line 826,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.hashCode()",
      "begin_line": 834,
      "end_line": 837,
      "comment": "\n     * Gets a hashCode for the instance.\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 836,col 9)-(line 836,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.unequal(org.apache.commons.math.dfp.Dfp)",
      "begin_line": 843,
      "end_line": 849,
      "comment": " Check if instance is not equal to x.\n     * @param x number to check instance against\n     * @return true if instance is not equal to x and neither are NaN, false otherwise\n     ",
      "child_ranges": [
        "(line 844,col 9)-(line 846,col 9)",
        "(line 848,col 9)-(line 848,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.compare(org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp)",
      "begin_line": 857,
      "end_line": 909,
      "comment": " Compare two instances.\n     * @param a first instance in comparison\n     * @param b second instance in comparison\n     * @return -1 if a\u003cb, 1 if a\u003eb and 0 if a\u003d\u003db\n     *  Note this method does not properly handle NaNs or numbers with different precision.\n     ",
      "child_ranges": [
        "(line 859,col 9)-(line 862,col 9)",
        "(line 864,col 9)-(line 870,col 9)",
        "(line 873,col 9)-(line 875,col 9)",
        "(line 877,col 9)-(line 879,col 9)",
        "(line 881,col 9)-(line 883,col 9)",
        "(line 886,col 9)-(line 894,col 9)",
        "(line 897,col 9)-(line 905,col 9)",
        "(line 907,col 9)-(line 907,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.rint()",
      "begin_line": 916,
      "end_line": 918,
      "comment": " Round to nearest integer using the round-half-even method.\n     *  That is round to nearest integer unless both are equidistant.\n     *  In which case round to the even one.\n     *  @return rounded value\n     ",
      "child_ranges": [
        "(line 917,col 9)-(line 917,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.floor()",
      "begin_line": 924,
      "end_line": 926,
      "comment": " Round to an integer using the round floor mode.\n     * That is, round toward -Infinity\n     *  @return rounded value\n     ",
      "child_ranges": [
        "(line 925,col 9)-(line 925,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.ceil()",
      "begin_line": 932,
      "end_line": 934,
      "comment": " Round to an integer using the round ceil mode.\n     * That is, round toward +Infinity\n     *  @return rounded value\n     ",
      "child_ranges": [
        "(line 933,col 9)-(line 933,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.remainder(org.apache.commons.math.dfp.Dfp)",
      "begin_line": 940,
      "end_line": 951,
      "comment": " Returns the IEEE remainder.\n     * @param d divisor\n     * @return this less n \u0026times; d, where n is the integer closest to this/d\n     ",
      "child_ranges": [
        "(line 942,col 9)-(line 942,col 76)",
        "(line 945,col 9)-(line 947,col 9)",
        "(line 949,col 9)-(line 949,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.trunc(org.apache.commons.math.dfp.DfpField.RoundingMode)",
      "begin_line": 957,
      "end_line": 1041,
      "comment": " Does the integer conversions with the specified rounding.\n     * @param rmode rounding mode to use\n     * @return truncated value\n     ",
      "child_ranges": [
        "(line 958,col 9)-(line 958,col 32)",
        "(line 960,col 9)-(line 962,col 9)",
        "(line 964,col 9)-(line 966,col 9)",
        "(line 968,col 9)-(line 971,col 9)",
        "(line 975,col 9)-(line 980,col 9)",
        "(line 986,col 9)-(line 988,col 9)",
        "(line 993,col 9)-(line 993,col 39)",
        "(line 994,col 9)-(line 997,col 9)",
        "(line 999,col 9)-(line 1038,col 9)",
        "(line 1040,col 9)-(line 1040,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.intValue()",
      "begin_line": 1047,
      "end_line": 1070,
      "comment": " Convert this to an integer.\n     * If greater than 2147483647, it returns 2147483647. If less than -2147483648 it returns -2147483648.\n     * @return converted number\n     ",
      "child_ranges": [
        "(line 1048,col 9)-(line 1048,col 20)",
        "(line 1049,col 9)-(line 1049,col 23)",
        "(line 1051,col 9)-(line 1051,col 25)",
        "(line 1053,col 9)-(line 1055,col 9)",
        "(line 1057,col 9)-(line 1059,col 9)",
        "(line 1061,col 9)-(line 1063,col 9)",
        "(line 1065,col 9)-(line 1067,col 9)",
        "(line 1069,col 9)-(line 1069,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.log10K()",
      "begin_line": 1077,
      "end_line": 1079,
      "comment": " Get the exponent of the greatest power of 10000 that is\n     *  less than or equal to the absolute value of this.  I.E.  if\n     *  this is 10\u003csup\u003e6\u003c/sup\u003e then log10K would return 1.\n     *  @return integer base 10000 logarithm\n     ",
      "child_ranges": [
        "(line 1078,col 9)-(line 1078,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.power10K(int)",
      "begin_line": 1085,
      "end_line": 1089,
      "comment": " Get the specified  power of 10000.\n     * @param e desired power\n     * @return 10000\u003csup\u003ee\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 1086,col 9)-(line 1086,col 38)",
        "(line 1087,col 9)-(line 1087,col 22)",
        "(line 1088,col 9)-(line 1088,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.log10()",
      "begin_line": 1094,
      "end_line": 1105,
      "comment": " Get the exponent of the greatest power of 10 that is less than or equal to abs(this).\n     *  @return integer base 10 logarithm\n     ",
      "child_ranges": [
        "(line 1095,col 9)-(line 1097,col 9)",
        "(line 1098,col 9)-(line 1100,col 9)",
        "(line 1101,col 9)-(line 1103,col 9)",
        "(line 1104,col 9)-(line 1104,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.power10(int)",
      "begin_line": 1111,
      "end_line": 1134,
      "comment": " Return the specified  power of 10.\n     * @param e desired power\n     * @return 10\u003csup\u003ee\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 1112,col 9)-(line 1112,col 38)",
        "(line 1114,col 9)-(line 1118,col 9)",
        "(line 1120,col 9)-(line 1131,col 9)",
        "(line 1133,col 9)-(line 1133,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.complement(int)",
      "begin_line": 1142,
      "end_line": 1158,
      "comment": " Negate the mantissa of this by computing the complement.\n     *  Leaves the sign bit unchanged, used internally by add.\n     *  Denormalized numbers are handled properly here.\n     *  @param extra ???\n     *  @return ???\n     ",
      "child_ranges": [
        "(line 1144,col 9)-(line 1144,col 28)",
        "(line 1145,col 9)-(line 1147,col 9)",
        "(line 1149,col 9)-(line 1149,col 31)",
        "(line 1150,col 9)-(line 1150,col 35)",
        "(line 1151,col 9)-(line 1155,col 9)",
        "(line 1157,col 9)-(line 1157,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.add(org.apache.commons.math.dfp.Dfp)",
      "begin_line": 1164,
      "end_line": 1307,
      "comment": " Add x to this.\n     * @param x number to add\n     * @return sum of this and x\n     ",
      "child_ranges": [
        "(line 1167,col 9)-(line 1172,col 9)",
        "(line 1175,col 9)-(line 1203,col 9)",
        "(line 1206,col 9)-(line 1206,col 34)",
        "(line 1207,col 9)-(line 1207,col 31)",
        "(line 1210,col 9)-(line 1210,col 44)",
        "(line 1213,col 9)-(line 1213,col 34)",
        "(line 1214,col 9)-(line 1214,col 34)",
        "(line 1216,col 9)-(line 1216,col 19)",
        "(line 1217,col 9)-(line 1217,col 19)",
        "(line 1220,col 9)-(line 1220,col 27)",
        "(line 1221,col 9)-(line 1223,col 9)",
        "(line 1228,col 9)-(line 1230,col 9)",
        "(line 1232,col 9)-(line 1234,col 9)",
        "(line 1237,col 9)-(line 1237,col 28)",
        "(line 1238,col 9)-(line 1238,col 28)",
        "(line 1239,col 9)-(line 1243,col 9)",
        "(line 1246,col 9)-(line 1252,col 9)",
        "(line 1255,col 9)-(line 1255,col 19)",
        "(line 1256,col 9)-(line 1260,col 9)",
        "(line 1261,col 9)-(line 1261,col 27)",
        "(line 1262,col 9)-(line 1262,col 28)",
        "(line 1267,col 9)-(line 1275,col 9)",
        "(line 1278,col 9)-(line 1288,col 9)",
        "(line 1291,col 9)-(line 1298,col 9)",
        "(line 1301,col 9)-(line 1301,col 65)",
        "(line 1302,col 9)-(line 1304,col 9)",
        "(line 1306,col 9)-(line 1306,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.negate()",
      "begin_line": 1312,
      "end_line": 1316,
      "comment": " Returns a number that is this number with the sign bit reversed.\n     * @return the opposite of this\n     ",
      "child_ranges": [
        "(line 1313,col 9)-(line 1313,col 39)",
        "(line 1314,col 9)-(line 1314,col 43)",
        "(line 1315,col 9)-(line 1315,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.subtract(org.apache.commons.math.dfp.Dfp)",
      "begin_line": 1322,
      "end_line": 1324,
      "comment": " Subtract x from this.\n     * @param x number to subtract\n     * @return difference of this and a\n     ",
      "child_ranges": [
        "(line 1323,col 9)-(line 1323,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.round(int)",
      "begin_line": 1330,
      "end_line": 1403,
      "comment": " Round this given the next digit n using the current rounding mode.\n     * @param n ???\n     * @return the IEEE flag if an exception occurred\n     ",
      "child_ranges": [
        "(line 1331,col 9)-(line 1331,col 28)",
        "(line 1332,col 9)-(line 1365,col 9)",
        "(line 1367,col 9)-(line 1380,col 9)",
        "(line 1383,col 9)-(line 1387,col 9)",
        "(line 1389,col 9)-(line 1393,col 9)",
        "(line 1395,col 9)-(line 1399,col 9)",
        "(line 1401,col 9)-(line 1401,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.multiply(org.apache.commons.math.dfp.Dfp)",
      "begin_line": 1409,
      "end_line": 1509,
      "comment": " Multiply this by x.\n     * @param x multiplicand\n     * @return product of this and x\n     ",
      "child_ranges": [
        "(line 1412,col 9)-(line 1417,col 9)",
        "(line 1419,col 9)-(line 1419,col 44)",
        "(line 1422,col 9)-(line 1457,col 9)",
        "(line 1459,col 9)-(line 1459,col 47)",
        "(line 1461,col 9)-(line 1471,col 9)",
        "(line 1474,col 9)-(line 1474,col 37)",
        "(line 1475,col 9)-(line 1480,col 9)",
        "(line 1483,col 9)-(line 1485,col 9)",
        "(line 1488,col 9)-(line 1488,col 60)",
        "(line 1489,col 9)-(line 1489,col 52)",
        "(line 1491,col 9)-(line 1494,col 9)",
        "(line 1496,col 9)-(line 1496,col 23)",
        "(line 1497,col 9)-(line 1501,col 9)",
        "(line 1503,col 9)-(line 1505,col 9)",
        "(line 1507,col 9)-(line 1507,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.multiply(int)",
      "begin_line": 1516,
      "end_line": 1572,
      "comment": " Multiply this by a single digit 0\u0026lt;\u003dx\u0026lt;radix.\n     * There are speed advantages in this special case\n     * @param x multiplicand\n     * @return product of this and x\n     ",
      "child_ranges": [
        "(line 1517,col 9)-(line 1517,col 39)",
        "(line 1520,col 9)-(line 1537,col 9)",
        "(line 1540,col 9)-(line 1546,col 9)",
        "(line 1548,col 9)-(line 1548,col 19)",
        "(line 1549,col 9)-(line 1553,col 9)",
        "(line 1555,col 9)-(line 1555,col 26)",
        "(line 1556,col 9)-(line 1560,col 9)",
        "(line 1562,col 9)-(line 1564,col 9)",
        "(line 1566,col 9)-(line 1566,col 49)",
        "(line 1567,col 9)-(line 1569,col 9)",
        "(line 1571,col 9)-(line 1571,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.divide(org.apache.commons.math.dfp.Dfp)",
      "begin_line": 1578,
      "end_line": 1786,
      "comment": " Divide this by divisor.\n     * @param divisor divisor\n     * @return quotient of this by divisor\n     ",
      "child_ranges": [
        "(line 1579,col 9)-(line 1579,col 23)",
        "(line 1580,col 9)-(line 1580,col 23)",
        "(line 1581,col 9)-(line 1581,col 24)",
        "(line 1582,col 9)-(line 1582,col 15)",
        "(line 1583,col 9)-(line 1583,col 17)",
        "(line 1584,col 9)-(line 1584,col 20)",
        "(line 1585,col 9)-(line 1585,col 19)",
        "(line 1586,col 9)-(line 1586,col 26)",
        "(line 1587,col 9)-(line 1587,col 17)",
        "(line 1588,col 9)-(line 1588,col 17)",
        "(line 1591,col 9)-(line 1596,col 9)",
        "(line 1598,col 9)-(line 1598,col 44)",
        "(line 1601,col 9)-(line 1629,col 9)",
        "(line 1632,col 9)-(line 1639,col 9)",
        "(line 1641,col 9)-(line 1641,col 42)",
        "(line 1642,col 9)-(line 1642,col 42)",
        "(line 1643,col 9)-(line 1643,col 43)",
        "(line 1647,col 9)-(line 1647,col 34)",
        "(line 1648,col 9)-(line 1648,col 34)",
        "(line 1649,col 9)-(line 1649,col 36)",
        "(line 1650,col 9)-(line 1650,col 35)",
        "(line 1655,col 9)-(line 1659,col 9)",
        "(line 1662,col 9)-(line 1662,col 17)",
        "(line 1663,col 9)-(line 1751,col 9)",
        "(line 1754,col 9)-(line 1754,col 25)",
        "(line 1755,col 9)-(line 1760,col 9)",
        "(line 1763,col 9)-(line 1765,col 9)",
        "(line 1768,col 9)-(line 1768,col 58)",
        "(line 1769,col 9)-(line 1769,col 63)",
        "(line 1771,col 9)-(line 1773,col 9)",
        "(line 1775,col 9)-(line 1779,col 9)",
        "(line 1781,col 9)-(line 1783,col 9)",
        "(line 1785,col 9)-(line 1785,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.divide(int)",
      "begin_line": 1793,
      "end_line": 1851,
      "comment": " Divide by a single digit less than radix.\n     *  Special case, so there are speed advantages. 0 \u0026lt;\u003d divisor \u0026lt; radix\n     * @param divisor divisor\n     * @return quotient of this by divisor\n     ",
      "child_ranges": [
        "(line 1796,col 9)-(line 1804,col 9)",
        "(line 1807,col 9)-(line 1814,col 9)",
        "(line 1817,col 9)-(line 1823,col 9)",
        "(line 1825,col 9)-(line 1825,col 39)",
        "(line 1827,col 9)-(line 1827,col 19)",
        "(line 1828,col 9)-(line 1833,col 9)",
        "(line 1835,col 9)-(line 1842,col 9)",
        "(line 1844,col 9)-(line 1844,col 60)",
        "(line 1845,col 9)-(line 1847,col 9)",
        "(line 1849,col 9)-(line 1849,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.sqrt()",
      "begin_line": 1856,
      "end_line": 1947,
      "comment": " Compute the square root.\n     * @return square root of the instance\n     ",
      "child_ranges": [
        "(line 1859,col 9)-(line 1862,col 9)",
        "(line 1864,col 9)-(line 1882,col 9)",
        "(line 1884,col 9)-(line 1893,col 9)",
        "(line 1895,col 9)-(line 1895,col 34)",
        "(line 1898,col 9)-(line 1900,col 9)",
        "(line 1903,col 9)-(line 1915,col 9)",
        "(line 1917,col 9)-(line 1917,col 32)",
        "(line 1922,col 9)-(line 1922,col 28)",
        "(line 1923,col 9)-(line 1923,col 28)",
        "(line 1924,col 9)-(line 1943,col 9)",
        "(line 1945,col 9)-(line 1945,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.toString()",
      "begin_line": 1952,
      "end_line": 1969,
      "comment": " Get a string representation of the instance.\n     * @return string representation of the instance\n     ",
      "child_ranges": [
        "(line 1954,col 9)-(line 1961,col 9)",
        "(line 1963,col 9)-(line 1965,col 9)",
        "(line 1967,col 9)-(line 1967,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.dfp2sci()",
      "begin_line": 1974,
      "end_line": 2050,
      "comment": " Convert an instance to a string using scientific notation.\n     * @return string representation of the instance in scientific notation\n     ",
      "child_ranges": [
        "(line 1975,col 9)-(line 1975,col 56)",
        "(line 1976,col 9)-(line 1976,col 61)",
        "(line 1977,col 9)-(line 1977,col 14)",
        "(line 1978,col 9)-(line 1978,col 14)",
        "(line 1979,col 9)-(line 1979,col 14)",
        "(line 1980,col 9)-(line 1980,col 15)",
        "(line 1981,col 9)-(line 1981,col 16)",
        "(line 1984,col 9)-(line 1984,col 14)",
        "(line 1985,col 9)-(line 1990,col 9)",
        "(line 1993,col 9)-(line 1997,col 9)",
        "(line 1998,col 9)-(line 1998,col 16)",
        "(line 2001,col 9)-(line 2001,col 14)",
        "(line 2002,col 9)-(line 2004,col 9)",
        "(line 2006,col 9)-(line 2021,col 9)",
        "(line 2023,col 9)-(line 2023,col 32)",
        "(line 2027,col 9)-(line 2027,col 30)",
        "(line 2028,col 9)-(line 2028,col 15)",
        "(line 2029,col 9)-(line 2031,col 9)",
        "(line 2034,col 9)-(line 2036,col 9)",
        "(line 2038,col 9)-(line 2040,col 9)",
        "(line 2042,col 9)-(line 2046,col 9)",
        "(line 2048,col 9)-(line 2048,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.dfp2string()",
      "begin_line": 2055,
      "end_line": 2123,
      "comment": " Convert an instance to a string using normal notation.\n     * @return string representation of the instance in normal notation\n     ",
      "child_ranges": [
        "(line 2056,col 9)-(line 2056,col 53)",
        "(line 2057,col 9)-(line 2057,col 18)",
        "(line 2058,col 9)-(line 2058,col 14)",
        "(line 2059,col 9)-(line 2059,col 20)",
        "(line 2060,col 9)-(line 2060,col 38)",
        "(line 2062,col 9)-(line 2062,col 24)",
        "(line 2064,col 9)-(line 2068,col 9)",
        "(line 2070,col 9)-(line 2076,col 9)",
        "(line 2078,col 9)-(line 2087,col 9)",
        "(line 2089,col 9)-(line 2095,col 9)",
        "(line 2097,col 9)-(line 2100,col 9)",
        "(line 2103,col 9)-(line 2103,col 14)",
        "(line 2104,col 9)-(line 2106,col 9)",
        "(line 2107,col 9)-(line 2109,col 9)",
        "(line 2112,col 9)-(line 2114,col 9)",
        "(line 2117,col 9)-(line 2119,col 9)",
        "(line 2121,col 9)-(line 2121,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.dotrap(int, java.lang.String, org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp)",
      "begin_line": 2132,
      "end_line": 2189,
      "comment": " Raises a trap.  This does not set the corresponding flag however.\n     *  @param type the trap type\n     *  @param what - name of routine trap occurred in\n     *  @param oper - input operator to function\n     *  @param result - the result computed prior to the trap\n     *  @return The suggested return value from the trap handler\n     ",
      "child_ranges": [
        "(line 2133,col 9)-(line 2133,col 25)",
        "(line 2135,col 9)-(line 2185,col 9)",
        "(line 2187,col 9)-(line 2187,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.trap(int, java.lang.String, org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp)",
      "begin_line": 2202,
      "end_line": 2204,
      "comment": " Trap handler.  Subclasses may override this to provide trap\n     *  functionality per IEEE 854-1987.\n     *\n     *  @param type  The exception type - e.g. FLAG_OVERFLOW\n     *  @param what  The name of the routine we were in e.g. divide()\n     *  @param oper  An operand to this function if any\n     *  @param def   The default return value if trap not enabled\n     *  @param result    The result that is specified to be delivered per\n     *                   IEEE 854, if any\n     *  @return the value that should be return by the operation triggering the trap\n     ",
      "child_ranges": [
        "(line 2203,col 9)-(line 2203,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.classify()",
      "begin_line": 2209,
      "end_line": 2211,
      "comment": " Returns the type - one of FINITE, INFINITE, SNAN, QNAN.\n     * @return type of the number\n     ",
      "child_ranges": [
        "(line 2210,col 9)-(line 2210,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.copysign(org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp)",
      "begin_line": 2219,
      "end_line": 2223,
      "comment": " Creates an instance that is the same as x except that it has the sign of y.\n     * abs(x) \u003d dfp.copysign(x, dfp.one)\n     * @param x number to get the value from\n     * @param y number to get the sign from\n     * @return a number with the value of x and the sign of y\n     ",
      "child_ranges": [
        "(line 2220,col 9)-(line 2220,col 38)",
        "(line 2221,col 9)-(line 2221,col 29)",
        "(line 2222,col 9)-(line 2222,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.nextAfter(org.apache.commons.math.dfp.Dfp)",
      "begin_line": 2230,
      "end_line": 2296,
      "comment": " Returns the next number greater than this one in the direction of x.\n     * If this\u003d\u003dx then simply returns this.\n     * @param x direction where to look at\n     * @return closest number next to instance in the direction of x\n     ",
      "child_ranges": [
        "(line 2233,col 9)-(line 2238,col 9)",
        "(line 2241,col 9)-(line 2241,col 27)",
        "(line 2242,col 9)-(line 2244,col 9)",
        "(line 2246,col 9)-(line 2248,col 9)",
        "(line 2250,col 9)-(line 2252,col 9)",
        "(line 2254,col 9)-(line 2254,col 22)",
        "(line 2255,col 9)-(line 2255,col 19)",
        "(line 2256,col 9)-(line 2282,col 9)",
        "(line 2284,col 9)-(line 2287,col 9)",
        "(line 2289,col 9)-(line 2292,col 9)",
        "(line 2294,col 9)-(line 2294,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.toDouble()",
      "begin_line": 2302,
      "end_line": 2383,
      "comment": " Convert the instance into a double.\n     * @return a double approximating the instance\n     * @see #toSplitDouble()\n     ",
      "child_ranges": [
        "(line 2304,col 9)-(line 2310,col 9)",
        "(line 2312,col 9)-(line 2314,col 9)",
        "(line 2316,col 9)-(line 2316,col 21)",
        "(line 2317,col 9)-(line 2317,col 31)",
        "(line 2318,col 9)-(line 2321,col 9)",
        "(line 2325,col 9)-(line 2325,col 47)",
        "(line 2326,col 9)-(line 2328,col 9)",
        "(line 2330,col 9)-(line 2330,col 54)",
        "(line 2331,col 9)-(line 2334,col 9)",
        "(line 2335,col 9)-(line 2335,col 19)",
        "(line 2339,col 9)-(line 2339,col 54)",
        "(line 2340,col 9)-(line 2342,col 9)",
        "(line 2344,col 9)-(line 2346,col 9)",
        "(line 2348,col 9)-(line 2350,col 9)",
        "(line 2353,col 9)-(line 2353,col 62)",
        "(line 2354,col 9)-(line 2354,col 34)",
        "(line 2355,col 9)-(line 2355,col 47)",
        "(line 2356,col 9)-(line 2356,col 44)",
        "(line 2358,col 9)-(line 2362,col 9)",
        "(line 2365,col 9)-(line 2367,col 9)",
        "(line 2369,col 9)-(line 2372,col 9)",
        "(line 2374,col 9)-(line 2374,col 58)",
        "(line 2375,col 9)-(line 2375,col 49)",
        "(line 2377,col 9)-(line 2379,col 9)",
        "(line 2381,col 9)-(line 2381,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.Dfp.toSplitDouble()",
      "begin_line": 2389,
      "end_line": 2397,
      "comment": " Convert the instance into a split double.\n     * @return an array of two doubles which sum represent the instance\n     * @see #toDouble()\n     ",
      "child_ranges": [
        "(line 2390,col 9)-(line 2390,col 39)",
        "(line 2391,col 9)-(line 2391,col 40)",
        "(line 2393,col 9)-(line 2393,col 87)",
        "(line 2394,col 9)-(line 2394,col 62)",
        "(line 2396,col 9)-(line 2396,col 21)"
      ]
    }
  ]
}