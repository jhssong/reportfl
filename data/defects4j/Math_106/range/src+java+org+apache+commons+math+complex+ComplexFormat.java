{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/complex/ComplexFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ComplexFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.Format",
        "java.io.Serializable"
      ],
      "begin_line": 35,
      "end_line": 540,
      "comment": "\n * Formats a Complex number in cartesian format \"Re(c) + Im(c)i\".  \u0027i\u0027 can\n * be replaced with \u0027j\u0027, and the number format for both real and imaginary parts\n * can be configured.\n *\n * @author Apache Software Foundation\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_IMAGINARY_CHARACTER"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The default imaginary character. "
    },
    {
      "type": "field",
      "varNames": [
        "imaginaryCharacter"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The notation used to signify the imaginary part of the complex number. "
    },
    {
      "type": "field",
      "varNames": [
        "imaginaryFormat"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " The format used for the imaginary part. "
    },
    {
      "type": "field",
      "varNames": [
        "realFormat"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " The format used for the real part. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Create an instance with the default imaginary character, \u0027i\u0027, and the\n     * default number format for both real and imaginary parts.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.text.NumberFormat)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Create an instance with a custom number format for both real and\n     * imaginary parts.\n     * @param format the custom format for both real and imaginary parts.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * Create an instance with a custom number format for the real part and a\n     * custom number format for the imaginary part.\n     * @param realFormat the custom format for the real part.\n     * @param imaginaryFormat the custom format for the imaginary part.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.lang.String)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Create an instance with a custom imaginary character, and the default\n     * number format for both real and imaginary parts.\n     * @param imaginaryCharacter The custom imaginary character.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.lang.String, java.text.NumberFormat)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Create an instance with a custom imaginary character, and a custom number\n     * format for both real and imaginary parts.\n     * @param imaginaryCharacter The custom imaginary character.\n     * @param format the custom format for both real and imaginary parts.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.lang.String, java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 107,
      "end_line": 113,
      "comment": "\n     * Create an instance with a custom imaginary character, a custom number\n     * format for the real part, and a custom number format for the imaginary\n     * part.\n     * @param imaginaryCharacter The custom imaginary character.\n     * @param realFormat the custom format for the real part.\n     * @param imaginaryFormat the custom format for the imaginary part.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 16)",
        "(line 110,col 9)-(line 110,col 50)",
        "(line 111,col 9)-(line 111,col 44)",
        "(line 112,col 9)-(line 112,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.formatComplex(org.apache.commons.math.complex.Complex)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * This static method calls formatComplex() on a default instance of\n     * ComplexFormat.\n     *\n     * @param c Complex object to format\n     * @return A formatted number in the form \"Re(c) + Im(c)i\"\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.format(org.apache.commons.math.complex.Complex, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 135,
      "end_line": 158,
      "comment": "\n     * Formats a {@link Complex} object to produce a string.\n     *\n     * @param complex the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 29)",
        "(line 139,col 9)-(line 139,col 27)",
        "(line 142,col 9)-(line 142,col 38)",
        "(line 143,col 9)-(line 143,col 59)",
        "(line 146,col 9)-(line 146,col 43)",
        "(line 147,col 9)-(line 155,col 9)",
        "(line 157,col 9)-(line 157,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 173,
      "end_line": 189,
      "comment": "\n     * Formats a object to produce a string.  \u003ccode\u003eobj\u003c/code\u003e must be either a \n     * {@link Complex} object or a {@link Number} object.  Any other type of\n     * object will result in an {@link IllegalArgumentException} being thrown.\n     *\n     * @param obj the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     * @see java.text.Format#format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)\n     * @throws IllegalArgumentException is \u003ccode\u003eobj\u003c/code\u003e is not a valid type.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 32)",
        "(line 178,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 188,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.formatDouble(double, java.text.NumberFormat, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 208,
      "end_line": 218,
      "comment": "\n     * Formats a double value to produce a string.  In general, the value is\n     * formatted using the formatting rules of \u003ccode\u003eformat\u003c/code\u003e.  There are\n     * three exceptions to this:\n     * \u003col\u003e\n     * \u003cli\u003eNaN is formatted as \u0027(NaN)\u0027\u003c/li\u003e\n     * \u003cli\u003ePositive infinity is formatted as \u0027(Infinity)\u0027\u003c/li\u003e\n     * \u003cli\u003eNegative infinity is formatted as \u0027(-Infinity)\u0027\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param value the double to format.\n     * @param format the format used.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getAvailableLocales()",
      "begin_line": 225,
      "end_line": 227,
      "comment": "\n     * Get the set of locales for which complex formats are available.  This\n     * is the same set as the {@link NumberFormat} set. \n     * @return available complex format locales.\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getDefaultNumberFormat()",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\n     * Create a default number format.  The default number format is based on\n     * {@link NumberFormat#getInstance()} with the only customizing is the\n     * maximum number of fraction digits, which is set to 2.  \n     * @return the default number format.\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getDefaultNumberFormat(java.util.Locale)",
      "begin_line": 246,
      "end_line": 250,
      "comment": "\n     * Create a default number format.  The default number format is based on\n     * {@link NumberFormat#getInstance(java.util.Locale)} with the only\n     * customizing is the maximum number of fraction digits, which is set to 2.  \n     * @param locale the specific locale used by the format.\n     * @return the default number format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 59)",
        "(line 248,col 9)-(line 248,col 39)",
        "(line 249,col 9)-(line 249,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getImaginaryCharacter()",
      "begin_line": 256,
      "end_line": 258,
      "comment": "\n     * Access the imaginaryCharacter.\n     * @return the imaginaryCharacter.\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getImaginaryFormat()",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\n     * Access the imaginaryFormat.\n     * @return the imaginaryFormat.\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getInstance()",
      "begin_line": 272,
      "end_line": 274,
      "comment": "\n     * Returns the default complex format for the current locale.\n     * @return the default complex format.\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getInstance(java.util.Locale)",
      "begin_line": 281,
      "end_line": 284,
      "comment": "\n     * Returns the default complex format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the complex format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 56)",
        "(line 283,col 9)-(line 283,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getRealFormat()",
      "begin_line": 290,
      "end_line": 292,
      "comment": "\n     * Access the realFormat.\n     * @return the realFormat.\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.parse(java.lang.String)",
      "begin_line": 302,
      "end_line": 310,
      "comment": "\n     * Parses a string to produce a {@link Complex} object.\n     *\n     * @param source the string to parse\n     * @return the parsed {@link Complex} object.\n     * @exception ParseException if the beginning of the specified string\n     *            cannot be parsed.\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 59)",
        "(line 304,col 9)-(line 304,col 54)",
        "(line 305,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 309,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 319,
      "end_line": 387,
      "comment": "\n     * Parses a string to produce a {@link Complex} object.\n     *\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed {@link Complex} object.\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 42)",
        "(line 323,col 9)-(line 323,col 46)",
        "(line 326,col 9)-(line 326,col 62)",
        "(line 327,col 9)-(line 333,col 9)",
        "(line 336,col 9)-(line 336,col 40)",
        "(line 337,col 9)-(line 337,col 49)",
        "(line 338,col 9)-(line 338,col 21)",
        "(line 339,col 9)-(line 357,col 9)",
        "(line 360,col 9)-(line 360,col 46)",
        "(line 363,col 9)-(line 363,col 62)",
        "(line 364,col 9)-(line 370,col 9)",
        "(line 373,col 9)-(line 373,col 49)",
        "(line 374,col 9)-(line 374,col 36)",
        "(line 375,col 9)-(line 375,col 38)",
        "(line 376,col 9)-(line 383,col 9)",
        "(line 384,col 9)-(line 384,col 31)",
        "(line 386,col 9)-(line 386,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.parseAndIgnoreWhitespace(java.lang.String, java.text.ParsePosition)",
      "begin_line": 396,
      "end_line": 399,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e until a non-whitespace character is found.\n     *\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.  On output, \u003ccode\u003epos\u003c/code\u003e\n     *        holds the index of the next non-whitespace character.\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 40)",
        "(line 398,col 9)-(line 398,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.parseNextCharacter(java.lang.String, java.text.ParsePosition)",
      "begin_line": 408,
      "end_line": 426,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e until a non-whitespace character is found.\n     *\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the first non-whitespace character.\n     ",
      "child_ranges": [
        "(line 409,col 10)-(line 409,col 36)",
        "(line 410,col 10)-(line 410,col 33)",
        "(line 411,col 10)-(line 411,col 22)",
        "(line 413,col 10)-(line 423,col 10)",
        "(line 425,col 10)-(line 425,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.parseNumber(java.lang.String, double, java.text.ParsePosition)",
      "begin_line": 437,
      "end_line": 456,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e for a special double values.  These values\n     * include Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY.\n     *\n     * @param source the string to parse\n     * @param value the special value to parse.\n     * @param pos input/ouput parsing parameter.\n     * @return the special number.\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 26)",
        "(line 440,col 9)-(line 440,col 45)",
        "(line 441,col 9)-(line 441,col 23)",
        "(line 442,col 9)-(line 442,col 25)",
        "(line 443,col 9)-(line 443,col 23)",
        "(line 445,col 9)-(line 445,col 28)",
        "(line 446,col 9)-(line 446,col 40)",
        "(line 447,col 9)-(line 447,col 38)",
        "(line 448,col 9)-(line 453,col 9)",
        "(line 455,col 9)-(line 455,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.parseNumber(java.lang.String, java.text.NumberFormat, java.text.ParsePosition)",
      "begin_line": 468,
      "end_line": 486,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e for a number.  This method can parse normal,\n     * numeric values as well as special values.  These special values include\n     * Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY.\n     *\n     * @param source the string to parse\n     * @param format the number format used to parse normal, numeric values.\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed number.\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 40)",
        "(line 470,col 9)-(line 470,col 50)",
        "(line 471,col 9)-(line 471,col 38)",
        "(line 474,col 9)-(line 483,col 9)",
        "(line 485,col 9)-(line 485,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 496,
      "end_line": 498,
      "comment": "\n     * Parses a string to produce a object.\n     *\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed object.\n     * @see java.text.Format#parseObject(java.lang.String, java.text.ParsePosition)\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.setImaginaryCharacter(java.lang.String)",
      "begin_line": 505,
      "end_line": 511,
      "comment": "\n     * Modify the imaginaryCharacter.\n     * @param imaginaryCharacter The new imaginaryCharacter value.\n     * @throws IllegalArgumentException if \u003ccode\u003eimaginaryCharacter\u003c/code\u003e is\n     *         \u003ccode\u003enull\u003c/code\u003e or an empty string.\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 509,col 9)",
        "(line 510,col 9)-(line 510,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.setImaginaryFormat(java.text.NumberFormat)",
      "begin_line": 519,
      "end_line": 525,
      "comment": "\n     * Modify the imaginaryFormat.\n     * @param imaginaryFormat The new imaginaryFormat value.\n     * @throws IllegalArgumentException if \u003ccode\u003eimaginaryFormat\u003c/code\u003e is\n     *         \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 523,col 9)",
        "(line 524,col 9)-(line 524,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.setRealFormat(java.text.NumberFormat)",
      "begin_line": 533,
      "end_line": 539,
      "comment": "\n     * Modify the realFormat.\n     * @param realFormat The new realFormat value.\n     * @throws IllegalArgumentException if \u003ccode\u003erealFormat\u003c/code\u003e is\n     *         \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 537,col 9)",
        "(line 538,col 9)-(line 538,col 37)"
      ]
    }
  ]
}