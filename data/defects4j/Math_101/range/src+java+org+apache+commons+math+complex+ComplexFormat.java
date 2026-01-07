{
  "filepath": "/tmp/Math-101b/src/java/org/apache/commons/math/complex/ComplexFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ComplexFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.Format",
        "java.io.Serializable"
      ],
      "begin_line": 36,
      "end_line": 542,
      "comment": "\n * Formats a Complex number in cartesian format \"Re(c) + Im(c)i\".  \u0027i\u0027 can\n * be replaced with \u0027j\u0027, and the number format for both real and imaginary parts\n * can be configured.\n *\n * @author Apache Software Foundation\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_IMAGINARY_CHARACTER"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The default imaginary character. "
    },
    {
      "type": "field",
      "varNames": [
        "imaginaryCharacter"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The notation used to signify the imaginary part of the complex number. "
    },
    {
      "type": "field",
      "varNames": [
        "imaginaryFormat"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " The format used for the imaginary part. "
    },
    {
      "type": "field",
      "varNames": [
        "realFormat"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " The format used for the real part. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Create an instance with the default imaginary character, \u0027i\u0027, and the\n     * default number format for both real and imaginary parts.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.text.NumberFormat)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Create an instance with a custom number format for both real and\n     * imaginary parts.\n     * @param format the custom format for both real and imaginary parts.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 76,
      "end_line": 79,
      "comment": "\n     * Create an instance with a custom number format for the real part and a\n     * custom number format for the imaginary part.\n     * @param realFormat the custom format for the real part.\n     * @param imaginaryFormat the custom format for the imaginary part.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.lang.String)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Create an instance with a custom imaginary character, and the default\n     * number format for both real and imaginary parts.\n     * @param imaginaryCharacter The custom imaginary character.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.lang.String, java.text.NumberFormat)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Create an instance with a custom imaginary character, and a custom number\n     * format for both real and imaginary parts.\n     * @param imaginaryCharacter The custom imaginary character.\n     * @param format the custom format for both real and imaginary parts.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.lang.String, java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 108,
      "end_line": 114,
      "comment": "\n     * Create an instance with a custom imaginary character, a custom number\n     * format for the real part, and a custom number format for the imaginary\n     * part.\n     * @param imaginaryCharacter The custom imaginary character.\n     * @param realFormat the custom format for the real part.\n     * @param imaginaryFormat the custom format for the imaginary part.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 16)",
        "(line 111,col 9)-(line 111,col 50)",
        "(line 112,col 9)-(line 112,col 44)",
        "(line 113,col 9)-(line 113,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.formatComplex(org.apache.commons.math.complex.Complex)",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * This static method calls formatComplex() on a default instance of\n     * ComplexFormat.\n     *\n     * @param c Complex object to format\n     * @return A formatted number in the form \"Re(c) + Im(c)i\"\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.format(org.apache.commons.math.complex.Complex, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 136,
      "end_line": 159,
      "comment": "\n     * Formats a {@link Complex} object to produce a string.\n     *\n     * @param complex the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 29)",
        "(line 140,col 9)-(line 140,col 27)",
        "(line 143,col 9)-(line 143,col 38)",
        "(line 144,col 9)-(line 144,col 59)",
        "(line 147,col 9)-(line 147,col 43)",
        "(line 148,col 9)-(line 156,col 9)",
        "(line 158,col 9)-(line 158,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 174,
      "end_line": 190,
      "comment": "\n     * Formats a object to produce a string.  \u003ccode\u003eobj\u003c/code\u003e must be either a \n     * {@link Complex} object or a {@link Number} object.  Any other type of\n     * object will result in an {@link IllegalArgumentException} being thrown.\n     *\n     * @param obj the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     * @see java.text.Format#format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)\n     * @throws IllegalArgumentException is \u003ccode\u003eobj\u003c/code\u003e is not a valid type.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 32)",
        "(line 179,col 9)-(line 187,col 9)",
        "(line 189,col 9)-(line 189,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.formatDouble(double, java.text.NumberFormat, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 209,
      "end_line": 219,
      "comment": "\n     * Formats a double value to produce a string.  In general, the value is\n     * formatted using the formatting rules of \u003ccode\u003eformat\u003c/code\u003e.  There are\n     * three exceptions to this:\n     * \u003col\u003e\n     * \u003cli\u003eNaN is formatted as \u0027(NaN)\u0027\u003c/li\u003e\n     * \u003cli\u003ePositive infinity is formatted as \u0027(Infinity)\u0027\u003c/li\u003e\n     * \u003cli\u003eNegative infinity is formatted as \u0027(-Infinity)\u0027\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param value the double to format.\n     * @param format the format used.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getAvailableLocales()",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\n     * Get the set of locales for which complex formats are available.  This\n     * is the same set as the {@link NumberFormat} set. \n     * @return available complex format locales.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getDefaultNumberFormat()",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * Create a default number format.  The default number format is based on\n     * {@link NumberFormat#getInstance()} with the only customizing is the\n     * maximum number of fraction digits, which is set to 2.  \n     * @return the default number format.\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getDefaultNumberFormat(java.util.Locale)",
      "begin_line": 247,
      "end_line": 251,
      "comment": "\n     * Create a default number format.  The default number format is based on\n     * {@link NumberFormat#getInstance(java.util.Locale)} with the only\n     * customizing is the maximum number of fraction digits, which is set to 2.  \n     * @param locale the specific locale used by the format.\n     * @return the default number format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 59)",
        "(line 249,col 9)-(line 249,col 39)",
        "(line 250,col 9)-(line 250,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getImaginaryCharacter()",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\n     * Access the imaginaryCharacter.\n     * @return the imaginaryCharacter.\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getImaginaryFormat()",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\n     * Access the imaginaryFormat.\n     * @return the imaginaryFormat.\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getInstance()",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\n     * Returns the default complex format for the current locale.\n     * @return the default complex format.\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getInstance(java.util.Locale)",
      "begin_line": 282,
      "end_line": 285,
      "comment": "\n     * Returns the default complex format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the complex format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 56)",
        "(line 284,col 9)-(line 284,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getRealFormat()",
      "begin_line": 291,
      "end_line": 293,
      "comment": "\n     * Access the realFormat.\n     * @return the realFormat.\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.parse(java.lang.String)",
      "begin_line": 303,
      "end_line": 311,
      "comment": "\n     * Parses a string to produce a {@link Complex} object.\n     *\n     * @param source the string to parse\n     * @return the parsed {@link Complex} object.\n     * @exception ParseException if the beginning of the specified string\n     *            cannot be parsed.\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 59)",
        "(line 305,col 9)-(line 305,col 54)",
        "(line 306,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 310,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 320,
      "end_line": 389,
      "comment": "\n     * Parses a string to produce a {@link Complex} object.\n     *\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed {@link Complex} object.\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 42)",
        "(line 324,col 9)-(line 324,col 46)",
        "(line 327,col 9)-(line 327,col 62)",
        "(line 328,col 9)-(line 334,col 9)",
        "(line 337,col 9)-(line 337,col 40)",
        "(line 338,col 9)-(line 338,col 49)",
        "(line 339,col 9)-(line 339,col 21)",
        "(line 340,col 9)-(line 358,col 9)",
        "(line 361,col 9)-(line 361,col 46)",
        "(line 364,col 9)-(line 364,col 62)",
        "(line 365,col 9)-(line 371,col 9)",
        "(line 374,col 9)-(line 374,col 49)",
        "(line 375,col 9)-(line 375,col 36)",
        "(line 376,col 9)-(line 376,col 38)",
        "(line 377,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 31)",
        "(line 388,col 9)-(line 388,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.parseAndIgnoreWhitespace(java.lang.String, java.text.ParsePosition)",
      "begin_line": 398,
      "end_line": 401,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e until a non-whitespace character is found.\n     *\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.  On output, \u003ccode\u003epos\u003c/code\u003e\n     *        holds the index of the next non-whitespace character.\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 40)",
        "(line 400,col 9)-(line 400,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.parseNextCharacter(java.lang.String, java.text.ParsePosition)",
      "begin_line": 410,
      "end_line": 428,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e until a non-whitespace character is found.\n     *\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the first non-whitespace character.\n     ",
      "child_ranges": [
        "(line 411,col 10)-(line 411,col 36)",
        "(line 412,col 10)-(line 412,col 33)",
        "(line 413,col 10)-(line 413,col 22)",
        "(line 415,col 10)-(line 425,col 10)",
        "(line 427,col 10)-(line 427,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.parseNumber(java.lang.String, double, java.text.ParsePosition)",
      "begin_line": 439,
      "end_line": 458,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e for a special double values.  These values\n     * include Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY.\n     *\n     * @param source the string to parse\n     * @param value the special value to parse.\n     * @param pos input/ouput parsing parameter.\n     * @return the special number.\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 26)",
        "(line 442,col 9)-(line 442,col 45)",
        "(line 443,col 9)-(line 443,col 23)",
        "(line 444,col 9)-(line 444,col 25)",
        "(line 445,col 9)-(line 445,col 23)",
        "(line 447,col 9)-(line 447,col 28)",
        "(line 448,col 9)-(line 448,col 40)",
        "(line 449,col 9)-(line 449,col 38)",
        "(line 450,col 9)-(line 455,col 9)",
        "(line 457,col 9)-(line 457,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.parseNumber(java.lang.String, java.text.NumberFormat, java.text.ParsePosition)",
      "begin_line": 470,
      "end_line": 488,
      "comment": "\n     * Parses \u003ccode\u003esource\u003c/code\u003e for a number.  This method can parse normal,\n     * numeric values as well as special values.  These special values include\n     * Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY.\n     *\n     * @param source the string to parse\n     * @param format the number format used to parse normal, numeric values.\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed number.\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 40)",
        "(line 472,col 9)-(line 472,col 50)",
        "(line 473,col 9)-(line 473,col 38)",
        "(line 476,col 9)-(line 485,col 9)",
        "(line 487,col 9)-(line 487,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 498,
      "end_line": 500,
      "comment": "\n     * Parses a string to produce a object.\n     *\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed object.\n     * @see java.text.Format#parseObject(java.lang.String, java.text.ParsePosition)\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.setImaginaryCharacter(java.lang.String)",
      "begin_line": 507,
      "end_line": 513,
      "comment": "\n     * Modify the imaginaryCharacter.\n     * @param imaginaryCharacter The new imaginaryCharacter value.\n     * @throws IllegalArgumentException if \u003ccode\u003eimaginaryCharacter\u003c/code\u003e is\n     *         \u003ccode\u003enull\u003c/code\u003e or an empty string.\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 511,col 9)",
        "(line 512,col 9)-(line 512,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.setImaginaryFormat(java.text.NumberFormat)",
      "begin_line": 521,
      "end_line": 527,
      "comment": "\n     * Modify the imaginaryFormat.\n     * @param imaginaryFormat The new imaginaryFormat value.\n     * @throws IllegalArgumentException if \u003ccode\u003eimaginaryFormat\u003c/code\u003e is\n     *         \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 525,col 9)",
        "(line 526,col 9)-(line 526,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.setRealFormat(java.text.NumberFormat)",
      "begin_line": 535,
      "end_line": 541,
      "comment": "\n     * Modify the realFormat.\n     * @param realFormat The new realFormat value.\n     * @throws IllegalArgumentException if \u003ccode\u003erealFormat\u003c/code\u003e is\n     *         \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 536,col 9)-(line 539,col 9)",
        "(line 540,col 9)-(line 540,col 37)"
      ]
    }
  ]
}